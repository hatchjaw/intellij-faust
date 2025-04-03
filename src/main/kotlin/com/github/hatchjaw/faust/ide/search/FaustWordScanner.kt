package com.github.hatchjaw.faust.ide.search

import com.github.hatchjaw.faust.lang.parser.FaustLexer
import com.github.hatchjaw.faust.lang.psi.FaustElementTypes
import com.github.hatchjaw.faust.lang.psi.FaustTokenSets
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
