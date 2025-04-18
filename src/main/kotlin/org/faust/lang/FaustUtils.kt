package org.faust.lang

import org.faust.lang.psi.FaustIdent
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiManager
import com.intellij.psi.PsiRecursiveElementWalkingVisitor
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import kotlin.reflect.KClass

/**
 * This is painfully slow. Ugh.
 * Well, not so bad when not debugging. Still, oof.
 * TODO: switch to StubIndex ffs.
 */
object FaustUtils {

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

    private fun findVirtualFiles(project: Project): List<VirtualFile> =
        FileTypeIndex.getFiles(FaustDSPFileType, GlobalSearchScope.allScope(project)) +
                FileTypeIndex.getFiles(FaustLibFileType, GlobalSearchScope.allScope(project))

    fun findIdents(project: Project): List<FaustIdent> {
        val result: MutableList<FaustIdent> = ArrayList()
        for (virtualFile in findVirtualFiles(project)) {
            PsiManager.getInstance(project).findFile(virtualFile)?.let { faustFile ->
                val v = FaustIdentPsiVisitor(FaustIdent::class)
                v.visitElement(faustFile)
                for (id in v.getFound()) {
                    result.add(id as FaustIdent)
                }
            }
        }
        return result
    }

    fun findIdents(project: Project, name: String): List<FaustIdent> = findIdents(project).filter { it.text == name }
}
