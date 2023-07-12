package com.github.hatchjaw.intellijfaust

import com.intellij.lang.Language

class FaustLanguage private constructor() : Language("Faust") {
    companion object {
        val INSTANCE = FaustLanguage()
    }

    override fun isCaseSensitive(): Boolean = true
}
