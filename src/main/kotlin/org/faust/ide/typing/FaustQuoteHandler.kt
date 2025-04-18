package org.faust.ide.typing

import org.faust.lang.psi.FaustElementTypes.STRING_LITERAL
import com.intellij.codeInsight.editorActions.SimpleTokenSetQuoteHandler

class FaustQuoteHandler : SimpleTokenSetQuoteHandler(STRING_LITERAL)
