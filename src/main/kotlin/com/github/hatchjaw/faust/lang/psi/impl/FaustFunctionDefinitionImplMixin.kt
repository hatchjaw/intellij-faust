package com.github.hatchjaw.faust.lang.psi.impl

import com.github.hatchjaw.faust.ide.icons.FaustIcons
import com.github.hatchjaw.faust.lang.psi.FaustFunctionDefinition
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import javax.swing.Icon

abstract class FaustFunctionDefinitionImplMixin(node: ASTNode) : ASTWrapperPsiElement(node), FaustFunctionDefinition {
    override fun getName(): String? = defName.text

    override fun getPresentation(): ItemPresentation = object : ItemPresentation {
        override fun getPresentableText(): String? = defName.text

        override fun getIcon(unused: Boolean): Icon = FaustIcons.FaustDSP

        override fun getLocationString(): String? = null
    }
}
