package com.github.hatchjaw.faust

import com.github.hatchjaw.faust.psi.FaustFile
import com.github.hatchjaw.faust.psi.FaustTypes
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
        val COMMENTS = TokenSet.create(FaustTypes.LINE_COMMENT, FaustTypes.BLOCK_COMMENT)
        val FILE = IStubFileElementType<PsiFileStub<FaustFile>>(FaustLanguage.INSTANCE)
    }

    override fun createLexer(project: Project?): Lexer = FlexAdapter(_FaustLexer())

    override fun createParser(project: Project?): PsiParser = FaustParser()

    override fun getFileNodeType(): IFileElementType = FILE

    override fun createElement(node: ASTNode?): PsiElement {
        return FaustTypes.Factory.createElement(node)
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return FaustFile(viewProvider)
    }

    override fun getCommentTokens(): TokenSet = COMMENTS

//    override fun getWhitespaceTokens(): TokenSet = WHITE_SPACES

    override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY
}
