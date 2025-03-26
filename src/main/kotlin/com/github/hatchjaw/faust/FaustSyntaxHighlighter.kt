package com.github.hatchjaw.faust

import com.github.hatchjaw.faust.lexer.FaustHighlightingLexer
import com.github.hatchjaw.faust.psi.FaustTypes
import com.github.hatchjaw.faust.psi.FaustTypes.*
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors.INVALID_STRING_ESCAPE
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors.VALID_STRING_ESCAPE
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.StringEscapesTokenTypes
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType


class FaustSyntaxHighlighter : SyntaxHighlighterBase() {
    companion object {
        private val LINE_COMMENT = createTextAttributesKey("LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        private val BLOCK_COMMENT = createTextAttributesKey("BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT)
        private val BAD_CHARACTER = createTextAttributesKey("SIMPLE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)
        private val STRING = createTextAttributesKey("STRING", DefaultLanguageHighlighterColors.STRING)
        private val SEMICOLON = createTextAttributesKey("SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON)
        private val ID = createTextAttributesKey("ID", DefaultLanguageHighlighterColors.LOCAL_VARIABLE)
        private val KEYWORD = createTextAttributesKey("KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)

        private val BAD_CHAR_KEYS: Array<TextAttributesKey> = arrayOf(BAD_CHARACTER)
        private val VALID_STRING_ESCAPE_KEYS: Array<TextAttributesKey> = arrayOf(VALID_STRING_ESCAPE)
        private val INVALID_STRING_ESCAPE_KEYS: Array<TextAttributesKey> = arrayOf(INVALID_STRING_ESCAPE)
        private val COMMENT_KEYS: Array<TextAttributesKey> = arrayOf(LINE_COMMENT, BLOCK_COMMENT)
        private val STRING_KEYS: Array<TextAttributesKey> = arrayOf(STRING)
        private val SEMICOLON_KEYS: Array<TextAttributesKey> = arrayOf(SEMICOLON)
        private val KEYWORD_KEYS: Array<TextAttributesKey> = arrayOf(KEYWORD)
        private val ID_KEYS: Array<TextAttributesKey> = arrayOf(ID)
        private val NUMBER_KEYS: Array<TextAttributesKey> = arrayOf(DefaultLanguageHighlighterColors.NUMBER)
        private val EMPTY_KEYS = arrayOf<TextAttributesKey>()
    }

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> {
        if (tokenType == null) {
            return EMPTY_KEYS
        }
        return when (tokenType) {
            FaustTypes.LINE_COMMENT,FaustTypes.BLOCK_COMMENT -> COMMENT_KEYS

            FaustTypes.UQ_STRING, FaustTypes.STRING -> STRING_KEYS

            StringEscapesTokenTypes.VALID_STRING_ESCAPE_TOKEN -> VALID_STRING_ESCAPE_KEYS
            StringEscapesTokenTypes.INVALID_CHARACTER_ESCAPE_TOKEN -> INVALID_STRING_ESCAPE_KEYS

            FaustTypes.ENDDEF -> SEMICOLON_KEYS
            FaustTypes.IDENT -> ID_KEYS

            in FaustParserUtil.KEYWORDS -> KEYWORD_KEYS

            FaustTypes.NUMBER -> NUMBER_KEYS

            TokenType.BAD_CHARACTER -> BAD_CHAR_KEYS

            else -> EMPTY_KEYS
        }
    }

    override fun getHighlightingLexer(): Lexer = FaustHighlightingLexer()
}
