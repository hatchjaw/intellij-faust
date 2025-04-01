package com.github.hatchjaw.faust.ide.typing

import com.github.hatchjaw.faust.lang.psi.FaustElementTypes.STRING_LITERAL
import com.intellij.codeInsight.editorActions.SimpleTokenSetQuoteHandler

class FaustQuoteHandler : SimpleTokenSetQuoteHandler(STRING_LITERAL)
