package com.github.hatchjaw.faust.lang.psi.impl

import com.github.hatchjaw.faust.ide.icons.FaustIcons
import com.github.hatchjaw.faust.lang.psi.FaustSimpleDefinition
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import javax.swing.Icon

abstract class FaustSimpleDefinitionImplMixin(node: ASTNode) : ASTWrapperPsiElement(node), FaustSimpleDefinition {
    override fun getName(): String? = defName.text
    
    override fun getPresentation(): ItemPresentation = object : ItemPresentation {
        override fun getPresentableText(): String? = defName.text

        override fun getIcon(unused: Boolean): Icon = FaustIcons.FaustLib

        override fun getLocationString(): String? = null
    }
}
