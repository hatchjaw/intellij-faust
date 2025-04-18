package org.faust.lang.psi

import org.faust.lang.FaustLanguage
import org.faust.lang.psi.FaustElementTypes.*
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet

class FaustTokenType(debugName: String) : IElementType(debugName, FaustLanguage)
