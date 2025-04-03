package com.github.hatchjaw.faust.lang.psi

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFileFactory
import com.github.hatchjaw.faust.lang.FaustDSPFileType


class FaustElementFactory {

    companion object {
        fun createIdent(project: Project, name: String): FaustIdent {
            val file: FaustFile = createFile(project, name)
            return file.firstChild as FaustIdent
        }

        fun createFile(project: Project, text: String): FaustFile = PsiFileFactory
            .getInstance(project)
            .createFileFromText("dummy.dsp", FaustDSPFileType, text) as FaustFile
    }
}
