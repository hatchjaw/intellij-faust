package com.github.hatchjaw.faust.ide.highlighter

import com.github.hatchjaw.faust.lang.lexer.FaustHighlightingLexer
import com.github.hatchjaw.faust.lang.psi.*
import com.github.hatchjaw.faust.psi.FaustTypes.*
import com.github.hatchjaw.faust.psi.*
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors as DefaultColor


class FaustSyntaxHighlighter : SyntaxHighlighterBase() {

    override fun getHighlightingLexer(): Lexer = FaustHighlightingLexer()

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> =
        pack(map(tokenType))

    companion object {
        fun map(tokenType: IElementType?): TextAttributesKey? =
            when (tokenType) {
                LINE_COMMENT -> DefaultColor.LINE_COMMENT
                BLOCK_COMMENT -> DefaultColor.BLOCK_COMMENT
                in FAUST_DOC_COMMENTS -> DefaultColor.DOC_COMMENT

                in FAUST_STRINGS -> DefaultColor.STRING

                ENDDEF -> DefaultColor.SEMICOLON
                NUMBER -> DefaultColor.NUMBER

                IDENTIFIER -> DefaultColor.IDENTIFIER

                LPAREN, RPAREN -> DefaultColor.PARENTHESES
                LBRACE, RBRACE -> DefaultColor.BRACES
                LBRACK, RBRACK -> DefaultColor.BRACKETS

                in FAUST_KEYWORDS -> DefaultColor.KEYWORD

                in FAUST_FOREIGN_EXPRESSIONS,
                in FAUST_MISC_PRIMITIVES,
                in FAUST_MATH_PRIMITIVES,
                in FAUST_TIME_PRIMITIVES,
                in FAUST_UI_PRIMITIVES,
                in FAUST_ITERATIONS,
                in FAUST_SELECTORS,
                in FAUST_TABLES -> DefaultColor.PREDEFINED_SYMBOL

                in FAUST_COMPOSITIONS,
                in FAUST_OPERATORS -> DefaultColor.OPERATION_SIGN

                LAMBDA -> DefaultColor.LABEL

                in FAUST_METADATA -> DefaultColor.METADATA

                in FAUST_TYPECASTS,
                in FAUST_VARIANTS -> DefaultColor.INTERFACE_NAME

                TokenType.BAD_CHARACTER -> HighlighterColors.BAD_CHARACTER

                else -> null
            }
    }
}
