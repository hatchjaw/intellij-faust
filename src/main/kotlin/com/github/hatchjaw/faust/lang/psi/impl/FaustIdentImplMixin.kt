package com.github.hatchjaw.faust.lang.psi.impl

import com.github.hatchjaw.faust.lang.psi.FaustElementFactory
import com.github.hatchjaw.faust.lang.psi.FaustIdent
import com.github.hatchjaw.faust.lang.resolve.FaustReference
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement

abstract class FaustIdentImplMixin(node: ASTNode) : ASTWrapperPsiElement(node), FaustIdent {
    override fun getReference(): FaustReference = FaustReference(this)

    override fun getName(): String? = identifier.text

    override fun setName(name: String): PsiElement? = identifier.replace(
        FaustElementFactory.createFile(project, text)
//        PsiFileFactory
//            .getInstance(project)
//            .createFileFromText("temp.dsp", FaustLanguage, text)
    )

    override fun getNameIdentifier(): PsiElement = identifier// findChildByType(FaustElementTypes.IDENTIFIER)
}
