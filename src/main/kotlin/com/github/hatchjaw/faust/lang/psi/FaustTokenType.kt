package com.github.hatchjaw.faust.lang.psi

import com.github.hatchjaw.faust.lang.FaustLanguage
import com.github.hatchjaw.faust.lang.psi.FaustElementTypes.*
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet

class FaustTokenType(debugName: String) : IElementType(debugName, FaustLanguage) {

    override fun toString(): String = "FaustTokenType." + super.toString()
}
