package com.github.hatchjaw.faust

import com.github.hatchjaw.faust.psi.*
import com.intellij.lang.PsiBuilder
import com.intellij.lang.parser.GeneratedParserUtilBase

object FaustParserUtil : GeneratedParserUtilBase() {

    @JvmStatic
    fun parseDocFreeText(builder: PsiBuilder, level: Int): Boolean {
        val tokenType = builder.tokenType
        val result = when (tokenType) {
            in FAUST_DOCUMENTATION_TAGS -> false

            else -> true
        }

        if (result) {
            consumeToken(builder, tokenType)
        }

        return result
    }
}
