package org.faust.ide.folding

import org.faust.lang.psi.FaustTokenSets
import org.faust.lang.psi.FaustFile
import org.faust.lang.psi.*
import org.faust.lang.psi.FaustElementTypes.*
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

class FaustFoldingBuilder : CustomFoldingBuilder(), DumbAware {

    override fun getLanguagePlaceholderText(node: ASTNode, range: TextRange): String {
        return when (node.psi) {
            is FaustInfixExpression,
            is FaustMergeComposition,
            is FaustSequentialComposition,
            is FaustSplitComposition,
            is FaustRecursiveComposition,
            is FaustParallelComposition -> "..."

            is PsiComment -> when (node.psi.elementType) {
                LIB_DOC_COMMENT -> "//## ${Regex("#+ (.*?) #+").find(node.text)?.groupValues?.get(1) ?: "..."} ##"
                DEF_DOC_COMMENT -> "//-- ${Regex("-+(`.*?`)-+").find(node.text)?.groupValues?.get(1) ?: "..."} --"
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

        override fun visitWithExpression(o: FaustWithExpression) {
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

        override fun visitLetrecExpression(o: FaustLetrecExpression) {
            val start = o.expression.nextSibling.nextSibling.endOffset // Also suspect
            val end = o.lastChild.endOffset
            descriptors += FoldingDescriptor(o.node, TextRange(start, end))
        }

        override fun visitWaveformPrimitive(o: FaustWaveformPrimitive) {
            val start = o.firstChild.endOffset
            val end = o.lastChild.endOffset
            descriptors += FoldingDescriptor(o.node, TextRange(start, end))
        }

        override fun visitIterationParallel(o: FaustIterationParallel) {
            o.expression?.let { fold(it) }
        }

        override fun visitIterationSequential(o: FaustIterationSequential) {
            o.expression?.let { fold(it) }
        }

        override fun visitIterationSum(o: FaustIterationSum) {
            o.expression?.let { fold(it) }
        }

        override fun visitIterationProduct(o: FaustIterationProduct) {
            o.expression?.let { fold(it) }
        }

        override fun visitComment(comment: PsiComment) {
            when (comment.tokenType) {
                BLOCK_COMMENT -> fold(comment)
                in FaustTokenSets.FAUST_DOC_COMMENTS -> descriptors += FoldingDescriptor(
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
