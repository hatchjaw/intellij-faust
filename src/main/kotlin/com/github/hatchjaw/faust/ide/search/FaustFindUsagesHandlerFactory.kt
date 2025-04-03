package com.github.hatchjaw.faust.ide.search

import com.github.hatchjaw.faust.lang.psi.FaustNamedElement
import com.intellij.find.findUsages.FindUsagesHandler
import com.intellij.find.findUsages.FindUsagesHandlerFactory
import com.intellij.psi.PsiElement

class FaustFindUsagesHandlerFactory : FindUsagesHandlerFactory() {
    override fun canFindUsages(element: PsiElement): Boolean = element is FaustNamedElement

    override fun createFindUsagesHandler(element: PsiElement, forHighlightUsages: Boolean): FindUsagesHandler? = FaustFindUsagesHandler(element, forHighlightUsages)
}
