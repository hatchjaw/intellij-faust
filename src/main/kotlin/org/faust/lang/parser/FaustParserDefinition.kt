package org.faust.lang.parser

import org.faust.lang.FaustLanguage
import org.faust.lang.psi.FaustFile
import org.faust.lang.psi.*
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.stubs.PsiFileStub
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.IStubFileElementType
import com.intellij.psi.tree.TokenSet


class FaustParserDefinition : ParserDefinition {
    companion object {
        val FILE = IStubFileElementType<PsiFileStub<FaustFile>>(FaustLanguage)
    }

    override fun createLexer(project: Project?): Lexer = FlexAdapter(_FaustLexer())

    override fun createParser(project: Project?): PsiParser = FaustParser()

    override fun getFileNodeType(): IFileElementType = FILE

    override fun createElement(node: ASTNode?): PsiElement {
        return FaustElementTypes.Factory.createElement(node)
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return FaustFile(viewProvider)
    }

    override fun getCommentTokens(): TokenSet = FaustTokenSets.FAUST_COMMENTS

    override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY
}
