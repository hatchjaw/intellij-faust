package com.github.hatchjaw.faust.lang

import com.intellij.lang.Language

object FaustLanguage : Language("Faust") {

    private fun readResolve(): Any = FaustLanguage

    override fun isCaseSensitive() = true
}
