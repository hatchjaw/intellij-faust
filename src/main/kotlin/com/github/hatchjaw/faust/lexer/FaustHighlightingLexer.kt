package com.github.hatchjaw.faust.lexer

import com.github.hatchjaw.faust._FaustLexer
import com.intellij.lexer.FlexAdapter

class FaustHighlightingLexer : FlexAdapter(_FaustLexer())
