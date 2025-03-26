package com.github.hatchjaw.faust.lexer

import com.github.hatchjaw.faust._FaustLexer
import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.LayeredLexer

class FaustHighlightingLexer : LayeredLexer(FlexAdapter(_FaustLexer())) {
//    init {
//        registerSelfStoppingLayer(DoubleQuoteStringLiteralLexer(),
//                arrayOf(FaustTypes.STRING), IElementType.EMPTY_ARRAY)
//    }
}
