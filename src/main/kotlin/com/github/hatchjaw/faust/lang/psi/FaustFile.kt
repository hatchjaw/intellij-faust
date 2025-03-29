package com.github.hatchjaw.faust.lang.psi

import com.github.hatchjaw.faust.lang.FaustDSPFileType
import com.github.hatchjaw.faust.lang.FaustLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider


class FaustFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, FaustLanguage) {
    override fun getFileType(): FileType = FaustDSPFileType

    override fun toString(): String = "Faust File"

//    override fun processDeclarations(processor: PsiScopeProcessor, state: ResolveState, lastParent: PsiElement?, place: PsiElement): Boolean {
//        processDeclarations(this, processor, state, lastParent, place)
//        return false
//    }
}
