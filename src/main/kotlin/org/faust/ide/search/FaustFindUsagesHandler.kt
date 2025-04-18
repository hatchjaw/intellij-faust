package org.faust.ide.search

import com.intellij.find.findUsages.FindUsagesHandler
import com.intellij.psi.PsiElement

class FaustFindUsagesHandler(element: PsiElement, forHighlightUsages: Boolean) : FindUsagesHandler(element)
