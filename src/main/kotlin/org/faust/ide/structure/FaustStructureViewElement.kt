package org.faust.ide.structure

import org.faust.lang.psi.FaustFile
import org.faust.lang.psi.FaustFunctionDefinition
import org.faust.lang.psi.FaustSimpleDefinition
import org.faust.lang.psi.impl.FaustFunctionDefinitionImpl
import org.faust.lang.psi.impl.FaustSimpleDefinitionImpl
import com.intellij.ide.projectView.PresentationData
import com.intellij.ide.structureView.StructureViewTreeElement
import com.intellij.ide.util.treeView.TreeAnchorizer
import com.intellij.ide.util.treeView.smartTree.SortableTreeElement
import com.intellij.ide.util.treeView.smartTree.TreeElement
import com.intellij.navigation.ItemPresentation
import com.intellij.pom.Navigatable
import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.PsiElement
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.util.containers.map2Array

class FaustStructureViewElement(private val element: NavigatablePsiElement) : StructureViewTreeElement,
    SortableTreeElement {

    private val psiAnchor = TreeAnchorizer.getService().createAnchor(element)
    private val psi: PsiElement? get() = TreeAnchorizer.getService().retrieveElement(psiAnchor) as? PsiElement

    override fun getPresentation(): ItemPresentation = element.presentation ?: PresentationData("", null, null, null)

    override fun getChildren(): Array<TreeElement> {
        if (element is FaustFile) {
            val simpleDefs: MutableList<FaustSimpleDefinition> =
                PsiTreeUtil.getChildrenOfTypeAsList(element, FaustSimpleDefinition::class.java)
            val treeElements: MutableList<TreeElement> = ArrayList()
            for (sd in simpleDefs) {
                treeElements.add(FaustStructureViewElement(sd as FaustSimpleDefinitionImpl))
            }
            val functionDefs: MutableList<FaustFunctionDefinition> =
                PsiTreeUtil.getChildrenOfTypeAsList(element, FaustFunctionDefinition::class.java)
            for (fd in functionDefs) {
                treeElements.add(FaustStructureViewElement(fd as FaustFunctionDefinitionImpl))
            }
            return treeElements.toTypedArray<TreeElement>()
        }
        return emptyArray()
//        return childElements.map2Array { FaustStructureViewElement(it as NavigatablePsiElement) }
    }

//    private val childElements: List<PsiElement>
//        get() = when (val psi = psi) {
//            is FaustSimpleDefinition -> listOf(psi.defName.ident)
//            is FaustFunctionDefinition -> listOf(psi.defName.ident)
//
//            else -> emptyList()
//        }

    override fun getValue(): PsiElement? {
//        return when (element) {
//            is FaustSimpleDefinition -> element.defName.ident
//            is FaustFunctionDefinition -> element.defName.ident
//
//            else -> element
//        }
        return psi
    }

    override fun getAlphaSortKey(): String = element.name ?: ""

    override fun navigate(requestFocus: Boolean) {
        (psi as? Navigatable)?.navigate(requestFocus)
    }

    override fun canNavigate(): Boolean = (psi as? Navigatable)?.canNavigate() == true

    override fun canNavigateToSource(): Boolean = (psi as? Navigatable)?.canNavigateToSource() == true
}
