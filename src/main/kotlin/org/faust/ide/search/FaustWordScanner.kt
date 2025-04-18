package org.faust.ide.search

import org.faust.lang.parser.FaustLexer
import org.faust.lang.psi.FaustElementTypes
import org.faust.lang.psi.FaustTokenSets
import com.intellij.lang.cacheBuilder.DefaultWordsScanner
import com.intellij.psi.tree.TokenSet


class FaustWordScanner : DefaultWordsScanner(
    FaustLexer(),
    TokenSet.create(FaustElementTypes.IDENTIFIER),
    FaustTokenSets.FAUST_COMMENTS,
    TokenSet.create(FaustElementTypes.STRING_LITERAL)
) {
//    init {
//        setMayHaveFileRefsInLiterals(true)
//    }
}
