package org.faust.lang.parser

import org.faust.lang.parser._FaustLexer
import com.intellij.lexer.FlexAdapter

class FaustLexer : FlexAdapter(_FaustLexer())
