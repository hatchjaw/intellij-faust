package com.github.hatchjaw.faust.lang.psi

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFileFactory
import com.github.hatchjaw.faust.lang.FaustDSPFileType


class FaustElementFactory {

    companion object {
        fun createDefName(project: Project, name: String): FaustDefName {
            val file: FaustFile = createFile(project, name)
            return file.firstChild as FaustDefName
        }

        fun createFile(project: Project, text: String): FaustFile {
            val name = "dummy.dsp"
            return PsiFileFactory.getInstance(project).createFileFromText(name, FaustDSPFileType, text) as FaustFile
        }
    }
}
