package com.github.hatchjaw.faust.ide.highlighter

import com.github.hatchjaw.faust.lang.parser.FaustHighlightingLexer
import com.github.hatchjaw.faust.lang.psi.*
import com.github.hatchjaw.faust.lang.psi.FaustElementTypes.*
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
                in FaustTokenSets.FAUST_DOC_COMMENTS -> DefaultColor.DOC_COMMENT

                in FaustTokenSets.FAUST_STRINGS -> DefaultColor.STRING

                ENDDEF -> DefaultColor.SEMICOLON
                NUMBER -> DefaultColor.NUMBER

                IDENTIFIER -> DefaultColor.IDENTIFIER

                LPAREN, RPAREN -> DefaultColor.PARENTHESES
                LBRACE, RBRACE -> DefaultColor.BRACES
                LBRACK, RBRACK -> DefaultColor.BRACKETS

                in FaustTokenSets.FAUST_KEYWORDS -> DefaultColor.KEYWORD

                in FaustTokenSets.FAUST_FOREIGN_EXPRESSIONS,
                in FaustTokenSets.FAUST_MISC_PRIMITIVES,
                in FaustTokenSets.FAUST_MATH_PRIMITIVES,
                in FaustTokenSets.FAUST_TIME_PRIMITIVES,
                in FaustTokenSets.FAUST_UI_PRIMITIVES,
                in FaustTokenSets.FAUST_ITERATIONS,
                in FaustTokenSets.FAUST_SELECTORS,
                in FaustTokenSets.FAUST_TABLES -> DefaultColor.PREDEFINED_SYMBOL

                in FaustTokenSets.FAUST_COMPOSITIONS,
                in FaustTokenSets.FAUST_OPERATORS -> DefaultColor.OPERATION_SIGN

                LAMBDA -> DefaultColor.LABEL

                in FaustTokenSets.FAUST_METADATA -> DefaultColor.METADATA

                in FaustTokenSets.FAUST_TYPECASTS,
                in FaustTokenSets.FAUST_VARIANTS -> DefaultColor.INTERFACE_NAME

                TokenType.BAD_CHARACTER -> HighlighterColors.BAD_CHARACTER

                else -> null
            }
    }
}
