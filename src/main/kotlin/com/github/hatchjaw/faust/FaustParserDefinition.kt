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
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import com.github.hatchjaw.faust.lexer._FaustLexer as FaustLexer


class FaustParserDefinition : ParserDefinition {
    companion object {
        val WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE)
        val COMMENTS = TokenSet.create(FaustTypes.LINE_COMMENT)
    }

    override fun createLexer(project: Project?): Lexer = FlexAdapter(FaustLexer())

    override fun createParser(project: Project?): PsiParser {
        TODO("Not yet implemented")
    }

    override fun getFileNodeType(): IFileElementType {
        TODO("Not yet implemented")
    }

    override fun getCommentTokens(): TokenSet {
        TODO("Not yet implemented")
    }

    override fun createElement(node: ASTNode?): PsiElement {
        return FaustTypes.Factory.createElement(node)
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return FaustFile(viewProvider)
    }

    override fun getWhitespaceTokens(): TokenSet = WHITE_SPACES

    override fun getStringLiteralElements(): TokenSet = COMMENTS
}
