package com.github.hatchjaw.faust.lang.resolve

import com.github.hatchjaw.faust.lang.FaustDSPFileType
import com.github.hatchjaw.faust.lang.psi.FaustFile
import com.github.hatchjaw.faust.lang.psi.FaustIdent
import com.intellij.openapi.project.Project
import com.intellij.psi.*
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import kotlin.reflect.KClass


class FaustReference(element: PsiElement) : PsiPolyVariantReferenceBase<PsiElement>(element) {

    private class FaustIdentPsiVisitor(private val elementType: KClass<FaustIdent>) :
        PsiRecursiveElementWalkingVisitor() {
        fun getFound() = found
        private val found = mutableListOf<PsiElement>()

        override fun visitElement(element: PsiElement) {
            super.visitElement(element)
            if (elementType.isInstance(element)) {
                found.add(element)
            }
        }
    }

    override fun multiResolve(incompleteCode: Boolean): Array<ResolveResult> {
        val idents: List<FaustIdent> = findIdents(element.project, element.text)
        val results: MutableList<ResolveResult> = ArrayList()
        for (id in idents) {
            results.add(PsiElementResolveResult(id))
        }
        return results.toTypedArray<ResolveResult>()
    }

    // Maybe put this in FaustUtil... or use stub index instead
    private fun findIdents(project: Project, name: String): List<FaustIdent> {
        var result: MutableList<FaustIdent> = ArrayList()
        val virtualFiles = FileTypeIndex.getFiles(FaustDSPFileType, GlobalSearchScope.allScope(project))
        for (virtualFile in virtualFiles) {
            val faustFile: FaustFile? = PsiManager.getInstance(project).findFile(virtualFile) as FaustFile?
            if (faustFile != null) {
                val v = FaustIdentPsiVisitor(FaustIdent::class)
                v.visitElement(faustFile)
                for (id in v.getFound()) {
                    if (name == id.text) {
                        result.add(id as FaustIdent)
                    }
                }
            }
        }
        return result
    }
}
