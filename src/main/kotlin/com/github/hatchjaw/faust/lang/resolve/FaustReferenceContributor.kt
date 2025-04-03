package com.github.hatchjaw.faust.lang.resolve

import com.github.hatchjaw.faust.lang.psi.FaustIdent
import com.intellij.patterns.PlatformPatterns.psiElement
import com.intellij.psi.*
import com.intellij.util.ProcessingContext


class FaustReferenceContributor : PsiReferenceContributor() {

    override fun registerReferenceProviders(registrar: PsiReferenceRegistrar) {
        registrar.registerReferenceProvider(psiElement(FaustIdent::class.java), FaustIdentReferenceProvider())
    }

    private class FaustIdentReferenceProvider : PsiReferenceProvider() {
        override fun getReferencesByElement(element: PsiElement, context: ProcessingContext): Array<PsiReference> {
            val ident = element as? FaustIdent ?: return emptyArray()
            return arrayOf(FaustReference(ident.identifier))

//            val literalExpression: PsiLiteralExpression = element as PsiLiteralExpression
//            val value = if (literalExpression.getValue() is String) literalExpression.getValue() else null
//            if ((value != null && value.startsWith(SIMPLE_PREFIX_STR + SIMPLE_SEPARATOR_STR))) {
//                val property: TextRange = TextRange(
//                    SIMPLE_PREFIX_STR.length() + SIMPLE_SEPARATOR_STR.length() + 1,
//                    value.length + 1
//                )
//                return arrayOf(FaustReference(element, property))
//            }
//            return PsiReference.EMPTY_ARRAY
        }
    }
}
