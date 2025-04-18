package org.faust.lang.completion

import org.faust.lang.psi.FaustDeclaration
import com.intellij.codeInsight.completion.CompletionContributor
import com.intellij.codeInsight.completion.CompletionType
import com.intellij.openapi.project.DumbAware
import com.intellij.patterns.PlatformPatterns.psiElement
import com.intellij.patterns.PsiElementPattern
import com.intellij.psi.PsiElement

class FaustDeclarationCompletionContributor : CompletionContributor(), DumbAware {
    companion object {
        val DECLARATION_KEYWORDS : Array<String> = arrayOf("name", "author", "copyright", "version", "description", "license")
    }

    init {
        extend(
            CompletionType.BASIC,
            inDeclaration().andNot(afterDecName()),
            FaustKeywordCompletionProvider(*DECLARATION_KEYWORDS)
        )
    }

    private fun inDeclaration(): PsiElementPattern.Capture<PsiElement> = psiElement()
        .withSuperParent(3, FaustDeclaration::class.java)

    private fun afterDecName(): PsiElementPattern.Capture<PsiElement> = psiElement()
        .afterLeaf(*DECLARATION_KEYWORDS)
}
