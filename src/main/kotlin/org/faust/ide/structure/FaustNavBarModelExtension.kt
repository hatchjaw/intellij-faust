package org.faust.ide.structure

import org.faust.lang.FaustLanguage
import org.faust.lang.psi.FaustFile
import org.faust.lang.psi.impl.FaustFunctionDefinitionImpl
import org.faust.lang.psi.impl.FaustSimpleDefinitionImpl
import com.intellij.ide.navigationToolbar.StructureAwareNavBarModelExtension
import com.intellij.lang.Language
import javax.swing.Icon

class FaustNavBarModelExtension : StructureAwareNavBarModelExtension() {
    override val language: Language = FaustLanguage

    override fun getPresentableText(item: Any?): String? {
        return when (item) {
            is FaustFile -> item.name
            is FaustSimpleDefinitionImpl -> item.presentation.presentableText
            is FaustFunctionDefinitionImpl -> item.presentation.presentableText

            else -> null
        }
    }

    override fun getIcon(item: Any?): Icon? = when (item) {
        is FaustFile -> item.fileType.icon
        is FaustSimpleDefinitionImpl -> item.presentation.getIcon(false)
        is FaustFunctionDefinitionImpl -> item.presentation.getIcon(false)

        else -> null
    }
}
