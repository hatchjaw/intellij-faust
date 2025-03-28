package com.github.hatchjaw.faust

import com.github.hatchjaw.faust.psi.FaustDecName
import com.github.hatchjaw.faust.psi.FaustDefName
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors as DefaultColors
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.psi.PsiElement

class FaustAnnotator : Annotator {

    companion object {
        val DEFINITION = createTextAttributesKey("FAUST.DEFINITION", DefaultColors.FUNCTION_DECLARATION)
    }

    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        when (element) {
            is FaustDefName -> holder.newAnnotation(HighlightSeverity.INFORMATION, "")
                .range(element)
                .textAttributes(DEFINITION)
                .create()
        }
    }
}
