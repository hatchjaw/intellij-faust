package com.github.hatchjaw.faust.lang.psi.impl

import com.github.hatchjaw.faust.ide.icons.FaustIcons
import com.github.hatchjaw.faust.lang.psi.FaustElementFactory
import com.github.hatchjaw.faust.lang.psi.FaustIdent
import com.github.hatchjaw.faust.lang.resolve.FaustReference
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.navigation.ItemPresentationProviders
import com.intellij.psi.PsiElement
import javax.swing.Icon

abstract class FaustIdentImplMixin(node: ASTNode) : ASTWrapperPsiElement(node), FaustIdent {
    override fun getReference(): FaustReference = FaustReference(this)

    override fun getName(): String? = identifier.text

    override fun setName(name: String): PsiElement? = identifier.replace(
        FaustElementFactory.createFile(project, text)
    )

    override fun getNameIdentifier(): PsiElement = identifier

    override fun getPresentation(): ItemPresentation = object : ItemPresentation {
        override fun getPresentableText(): String? = name

        override fun getIcon(unused: Boolean): Icon = FaustIcons.FaustLib

        override fun getLocationString(): String? = containingFile?.name
    }
}
