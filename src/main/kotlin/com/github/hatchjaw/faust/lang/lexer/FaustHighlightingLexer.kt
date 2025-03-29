package com.github.hatchjaw.faust.lang.lexer

import com.github.hatchjaw.faust._FaustLexer
import com.intellij.lexer.FlexAdapter

class FaustHighlightingLexer : FlexAdapter(_FaustLexer())
