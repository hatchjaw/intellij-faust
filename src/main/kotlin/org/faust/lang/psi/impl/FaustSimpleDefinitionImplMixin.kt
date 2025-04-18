package org.faust.lang.psi.impl

import org.faust.lang.psi.FaustSimpleDefinition
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.icons.AllIcons
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import javax.swing.Icon

abstract class FaustSimpleDefinitionImplMixin(node: ASTNode) : ASTWrapperPsiElement(node),
    FaustSimpleDefinition {

    override fun getName(): String? = defName.text
    
    override fun getPresentation(): ItemPresentation = object : ItemPresentation {
        override fun getPresentableText(): String? = defName.text

        // Consult https://intellij-icons.jetbrains.design/
        override fun getIcon(unused: Boolean): Icon = when (defName.text) {
            "process" -> AllIcons.Actions.Execute
            else -> AllIcons.Nodes.ClassInitializer
        }

        override fun getLocationString(): String? = null
    }
}
