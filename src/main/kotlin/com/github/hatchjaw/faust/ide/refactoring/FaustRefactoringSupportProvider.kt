package com.github.hatchjaw.faust.ide.refactoring

import com.github.hatchjaw.faust.lang.psi.FaustNamedElement
import com.intellij.lang.refactoring.RefactoringSupportProvider
import com.intellij.psi.PsiElement

class FaustRefactoringSupportProvider : RefactoringSupportProvider() {
    override fun isMemberInplaceRenameAvailable(element: PsiElement, context: PsiElement?): Boolean = element is FaustNamedElement
}
