package org.faust.lang.resolve

import org.faust.lang.FaustUtils.findIdents
import org.faust.lang.psi.FaustIdent
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiElementResolveResult
import com.intellij.psi.PsiPolyVariantReferenceBase
import com.intellij.psi.ResolveResult


class FaustReference(element: PsiElement) : PsiPolyVariantReferenceBase<PsiElement>(element) {

    override fun multiResolve(incompleteCode: Boolean): Array<ResolveResult> {
        val idents: List<FaustIdent> = findIdents(element.project, element.text)
        val results: MutableList<ResolveResult> = ArrayList()
        for (id in idents) {
            results.add(PsiElementResolveResult(id))
        }
        return results.toTypedArray<ResolveResult>()
    }
}
