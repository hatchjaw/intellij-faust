package com.github.hatchjaw.faust

import com.github.hatchjaw.faust.lexer.FaustHighlightingLexer
import com.github.hatchjaw.faust.psi.FaustTypes.*
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
                in FaustParserUtil.FAUST_DOC_COMMENTS -> DefaultColor.DOC_COMMENT

                in FaustParserUtil.FAUST_STRINGS -> DefaultColor.STRING

                ENDDEF -> DefaultColor.SEMICOLON
                NUMBER -> DefaultColor.NUMBER

                LPAREN, RPAREN -> DefaultColor.PARENTHESES
                LBRACE, RBRACE -> DefaultColor.BRACES
                LBRACK, RBRACK -> DefaultColor.BRACKETS

                in FaustParserUtil.FAUST_KEYWORDS -> DefaultColor.KEYWORD

                in FaustParserUtil.FAUST_FOREIGN_EXPRESSIONS,
                in FaustParserUtil.FAUST_MATH_PRIMITIVES,
                in FaustParserUtil.FAUST_TIME_PRIMITIVES,
                in FaustParserUtil.FAUST_UI_PRIMITIVES,
                in FaustParserUtil.FAUST_ITERATIONS,
                in FaustParserUtil.FAUST_SELECTORS,
                in FaustParserUtil.FAUST_TABLES,
                WAVEFORM, SOUNDFILE -> DefaultColor.PREDEFINED_SYMBOL

                in FaustParserUtil.FAUST_COMPOSITIONS,
                in FaustParserUtil.FAUST_OPERATORS -> DefaultColor.OPERATION_SIGN

                LAMBDA -> DefaultColor.LABEL

                TokenType.BAD_CHARACTER -> HighlighterColors.BAD_CHARACTER

                else -> null
            }
    }
}
