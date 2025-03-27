package com.github.hatchjaw.faust

import com.github.hatchjaw.faust.psi.*
import com.github.hatchjaw.faust.psi.FaustTypes.*
import com.github.hatchjaw.faust.psi.impl.FaustInfixExprImpl
import com.github.hatchjaw.faust.psi.impl.FaustInfixImpl
import com.intellij.lang.ASTNode
import com.intellij.lang.folding.CustomFoldingBuilder
import com.intellij.lang.folding.FoldingDescriptor
import com.intellij.openapi.editor.Document
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiComment
import com.intellij.psi.PsiElement
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.psi.util.elementType
import com.intellij.refactoring.suggested.endOffset
import com.intellij.refactoring.suggested.startOffset
import org.mozilla.javascript.ast.InfixExpression

class FaustFoldingBuilder : CustomFoldingBuilder(), DumbAware {

//    override fun getLanguagePlaceholderText(node: ASTNode, range: TextRange): String = "..."

    override fun getLanguagePlaceholderText(node: ASTNode, range: TextRange): String {
        return when (node.psi) {
            is FaustInfixExprImpl,
            is FaustMergeComp,
            is FaustSequentialComp,
            is FaustSplitComp,
            is FaustRecursiveComp,
            is FaustParallelComp -> "..." // This is a bit broken

            is PsiComment -> when (node.psi.elementType) {
                DOC_COMMENT -> "//-- ... --"
                else -> "/* ... */"
            }

            else -> "{...}"
        }
    }

    override fun isRegionCollapsedByDefault(node: ASTNode): Boolean = false

    override fun buildLanguageFoldRegions(
        descriptors: MutableList<FoldingDescriptor>,
        root: PsiElement,
        document: Document,
        quick: Boolean
    ) {
        if (root !is FaustFile) return

        val visitor = FoldingVisitor(descriptors)
        PsiTreeUtil.processElements(root) { it.accept(visitor); true }
    }

    private class FoldingVisitor(
        private val descriptors: MutableList<FoldingDescriptor>
    ) : FaustVisitor() {

        override fun visitWithExpr(o: FaustWithExpr) {
            val start = o.expression.nextSibling.nextSibling.endOffset // Suspect
            val end = o.lastChild.endOffset
            descriptors += FoldingDescriptor(o.node, TextRange(start, end))
        }

        override fun visitPatternAbstraction(o: FaustPatternAbstraction) {
            val start = o.firstChild.endOffset
            val end = o.lastChild.endOffset
            descriptors += FoldingDescriptor(o.node, TextRange(start, end))
        }

        override fun visitEnvironmentConstruction(o: FaustEnvironmentConstruction) {
            val start = o.firstChild.endOffset
            val end = o.lastChild.endOffset
            descriptors += FoldingDescriptor(o.node, TextRange(start, end))
        }

        override fun visitLetrecExpr(o: FaustLetrecExpr) {
            val start = o.expression.nextSibling.nextSibling.endOffset // Also suspect
            val end = o.lastChild.endOffset
            descriptors += FoldingDescriptor(o.node, TextRange(start, end))
        }

        override fun visitIterSeq(o: FaustIterSeq) {
            fold(o.expression)
        }

        override fun visitIterPar(o: FaustIterPar) {
            fold(o.expression)
        }

        override fun visitIterSum(o: FaustIterSum) {
            fold(o.expression)
        }

        override fun visitIterProd(o: FaustIterProd) {
            fold(o.expression)
        }

        override fun visitComment(comment: PsiComment) {
            when (comment.tokenType) {
                BLOCK_COMMENT -> fold(comment)
                DOC_COMMENT -> descriptors += FoldingDescriptor(
                    comment.node,
                    TextRange(comment.startOffset, comment.endOffset - 1)
                )
            }
        }

        private fun fold(element: PsiElement) {
            descriptors += FoldingDescriptor(element.node, element.textRange)
        }
    }
}