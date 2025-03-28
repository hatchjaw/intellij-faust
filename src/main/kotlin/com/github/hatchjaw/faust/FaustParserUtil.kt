package com.github.hatchjaw.faust

import com.github.hatchjaw.faust.psi.FaustTypes.*
import com.intellij.lang.parser.GeneratedParserUtilBase
import com.intellij.psi.tree.TokenSet

class FaustParserUtil : GeneratedParserUtilBase() {
    companion object {
        val FAUST_KEYWORDS: TokenSet = TokenSet.create(
            CASE,
            ENVIRONMENT,
            LETREC,
            WITH,
            WHERE,
            LIBRARY,
            IMPORT,
            DECLARE,
            COMPONENT,
        )

        val FAUST_STRINGS: TokenSet = TokenSet.create(
            STRING_LITERAL
        )

        val FAUST_REGULAR_COMMENTS: TokenSet = TokenSet.create(
            LINE_COMMENT,
            BLOCK_COMMENT,
        )

        val FAUST_DOC_COMMENTS: TokenSet = TokenSet.create(
            LIB_DOC_COMMENT,
            DEF_DOC_COMMENT,
        )

        val FAUST_COMMENTS: TokenSet = TokenSet.orSet(
            FAUST_REGULAR_COMMENTS,
            FAUST_DOC_COMMENTS,
        )
    }
}
