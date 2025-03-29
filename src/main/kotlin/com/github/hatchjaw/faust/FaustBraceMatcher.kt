package com.github.hatchjaw.faust

import com.github.hatchjaw.faust.psi.*
import com.github.hatchjaw.faust.psi.FaustTypes.*
import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType.WHITE_SPACE
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet

class FaustBraceMatcher : PairedBraceMatcher {
    override fun getPairs(): Array<BracePair> = arrayOf(
        BracePair(LPAREN, RPAREN, false),
        BracePair(LBRACK, RBRACK, false),
        BracePair(LBRACE, RBRACE, true)
    )

    override fun isPairedBracesAllowedBeforeType(lBraceType: IElementType, next: IElementType?): Boolean = next in TokenSet.orSet(
        FAUST_COMMENTS,
        TokenSet.create(
            WHITE_SPACE,
            ENDDEF,
            PAR,
            RPAREN,
            RBRACK,
            RBRACE,
            LBRACE
        )
    )

    override fun getCodeConstructStart(file: PsiFile?, openingBraceOffset: Int): Int = openingBraceOffset
}
