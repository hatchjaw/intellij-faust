package com.github.hatchjaw.faust.ide.typing

import com.github.hatchjaw.faust.psi.FaustTypes.STRING_LITERAL
import com.intellij.codeInsight.editorActions.SimpleTokenSetQuoteHandler

class FaustQuoteHandler : SimpleTokenSetQuoteHandler(STRING_LITERAL)
