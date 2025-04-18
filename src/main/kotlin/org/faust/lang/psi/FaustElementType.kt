package org.faust.lang.psi

import org.faust.lang.FaustLanguage
import com.intellij.psi.tree.IElementType

class FaustElementType(debugName: String) : IElementType(debugName, FaustLanguage)
