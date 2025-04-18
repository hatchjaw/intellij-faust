package org.faust.lang.parser

import com.intellij.lexer.LayeredLexer

class FaustHighlightingLexer : LayeredLexer(FaustLexer()) {
//    init { // Might help with quote handling? Compare with intellij-rust.
//        registerLayer(FaustEscapesLexer.of(STRING_LITERAL), STRING_LITERAL)
//    }
}
