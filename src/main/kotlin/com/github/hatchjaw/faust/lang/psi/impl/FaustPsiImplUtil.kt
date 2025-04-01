package com.github.hatchjaw.faust.lang.psi.impl

import com.github.hatchjaw.faust.lang.psi.FaustDefName
import com.github.hatchjaw.faust.lang.psi.FaustElementFactory
import com.github.hatchjaw.faust.lang.psi.FaustElementTypes
import com.github.hatchjaw.faust.lang.psi.FaustNamedElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement


object FaustPsiImplUtil {

    @JvmStatic
    fun getName(element: FaustNamedElement): String? = element.node.findChildByType(FaustElementTypes.IDENTIFIER)?.text

    @JvmStatic
    fun setName(element: FaustNamedElement, newName: String): PsiElement {
        val keyNode: ASTNode? = element.node.findChildByType(FaustElementTypes.IDENTIFIER)
        val namedElement: FaustDefName = FaustElementFactory.createDefName(element.project, newName)
        val newKeyNode: ASTNode = namedElement.firstChild.node
        if (keyNode != null) {
            element.node.replaceChild(keyNode, newKeyNode)
        }
        return element
    }

    @JvmStatic
    fun getNameIdentifier(element: FaustNamedElement): PsiElement? {
        val keyNode: ASTNode? = element.node.findChildByType(FaustElementTypes.IDENTIFIER)
        return keyNode?.psi
    }
}
