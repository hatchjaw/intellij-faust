package org.faust.ide.search

import org.faust.lang.psi.FaustNamedElement
import com.intellij.lang.cacheBuilder.WordsScanner
import com.intellij.lang.findUsages.FindUsagesProvider
import com.intellij.psi.PsiElement

class FaustFindUsagesProvider : FindUsagesProvider {
    override fun getWordsScanner(): WordsScanner = FaustWordScanner()

    override fun canFindUsagesFor(element: PsiElement): Boolean = element is FaustNamedElement

    override fun getHelpId(element: PsiElement): String? = null

    override fun getType(element: PsiElement): String = ""

    override fun getDescriptiveName(element: PsiElement): String = (element as? FaustNamedElement)?.name.orEmpty()

    override fun getNodeText(element: PsiElement, useFullName: Boolean): String = ""
}
