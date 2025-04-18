package org.faust.ide.linemarkers

import org.faust.lang.psi.FaustElementTypes.IDENTIFIER
import org.faust.lang.psi.FaustFunctionDefinition
import org.faust.lang.psi.FaustSimpleDefinition
import com.intellij.execution.lineMarker.ExecutorAction
import com.intellij.execution.lineMarker.RunLineMarkerContributor
import com.intellij.icons.AllIcons
import com.intellij.psi.PsiElement
import com.intellij.psi.util.elementType

class FaustProcessLineMarkerContributor : RunLineMarkerContributor() {

    override fun getInfo(element: PsiElement): Info? {
        if (element.elementType != IDENTIFIER || element.text != "process") return null

        return when (element.parent.parent.parent) { // Hmm...
            is FaustFunctionDefinition,
            is FaustSimpleDefinition -> {
                val actions = ExecutorAction.getActions(0)
                Info(
                    AllIcons.Actions.Execute,
                    { el -> actions.mapNotNull { getText(it, createActionEvent(el)) }.joinToString { "\n" } },
                    *actions
                )
            }

            else -> null
        }
    }
}
