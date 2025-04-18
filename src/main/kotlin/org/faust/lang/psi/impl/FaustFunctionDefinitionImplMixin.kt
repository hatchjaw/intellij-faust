package org.faust.lang.psi.impl

import org.faust.lang.psi.FaustFunctionDefinition
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.icons.AllIcons
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import javax.swing.Icon

abstract class FaustFunctionDefinitionImplMixin(node: ASTNode) : ASTWrapperPsiElement(node),
    FaustFunctionDefinition {
    override fun getName(): String? = defName.text

    override fun getPresentation(): ItemPresentation = object : ItemPresentation {
        override fun getPresentableText(): String = "${defName.text}(...)"
//                CharArray(
//                    argList?.children?.size ?: 0
//                ) { '_' }.joinToString(",", "(", ")")

        override fun getIcon(unused: Boolean): Icon = when (defName.text) {
            "process" -> AllIcons.Actions.Execute
            else -> AllIcons.Nodes.Function
        }

        override fun getLocationString(): String? = null
    }
}
