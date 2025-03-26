package com.github.hatchjaw.faust

import com.github.hatchjaw.faust.psi.FaustTypes.*
import com.intellij.lang.parser.GeneratedParserUtilBase
import com.intellij.psi.tree.TokenSet

class FaustParserUtil : GeneratedParserUtilBase() {
    companion object {
        val KEYWORDS: TokenSet = TokenSet.create(
            CASE,
            ENVIRONMENT,
            LETREC,
            WITH,
            WHERE,
            LIBRARY,
            IMPORT,
            DECLARE,
            COMPONENT,
//            IPAR,
//            ISEQ,
//            ISUM,
//            IPROD,
        )
    }
}