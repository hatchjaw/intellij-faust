package com.github.hatchjaw.faust.lang.psi

import com.github.hatchjaw.faust.lang.psi.impl.FaustIdentImpl
import com.intellij.openapi.util.TextRange
import com.intellij.psi.AbstractElementManipulator

class FaustElementManipulator : AbstractElementManipulator<FaustIdentImpl>() {
    override fun handleContentChange(element: FaustIdentImpl, range: TextRange, newContent: String?): FaustIdentImpl {
        val oldText = element.text
        val newText = oldText.substring(0, range.startOffset) + newContent + oldText.substring(range.endOffset)
        element.identifier.replace(FaustElementFactory.createIdent(element.project, newText).identifier)
        return element
    }
}
