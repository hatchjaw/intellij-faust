package org.faust.lang.psi

import org.faust.lang.FaustDSPFileType
import org.faust.lang.FaustLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider


class FaustFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, FaustLanguage) {

    override fun getFileType(): FileType = FaustDSPFileType

    override fun toString(): String = "Faust File"
}
