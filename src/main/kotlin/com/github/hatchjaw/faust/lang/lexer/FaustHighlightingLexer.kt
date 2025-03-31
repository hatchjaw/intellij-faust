package com.github.hatchjaw.faust.lang.lexer

import com.github.hatchjaw.faust.psi.FaustTypes.STRING_LITERAL
import com.intellij.lexer.LayeredLexer

class FaustHighlightingLexer : LayeredLexer(FaustLexer()) {
//    init { // Might help with quote handling? Compare with intellij-rust.
//        registerLayer(FaustEscapesLexer.of(STRING_LITERAL), STRING_LITERAL)
//    }
}
