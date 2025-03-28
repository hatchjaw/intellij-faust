package com.github.hatchjaw.faust.psi

import com.github.hatchjaw.faust.FaustDSPFileType
import com.github.hatchjaw.faust.FaustLibFileType
import com.github.hatchjaw.faust.FaustLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.ResolveState
import com.intellij.psi.scope.PsiScopeProcessor


class FaustFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, FaustLanguage) {
    override fun getFileType(): FileType = FaustDSPFileType

    override fun toString(): String = "Faust File"

//    override fun processDeclarations(processor: PsiScopeProcessor, state: ResolveState, lastParent: PsiElement?, place: PsiElement): Boolean {
//        processDeclarations(this, processor, state, lastParent, place)
//        return false
//    }
}
