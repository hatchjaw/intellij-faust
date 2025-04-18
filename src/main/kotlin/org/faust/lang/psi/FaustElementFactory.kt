package org.faust.lang.psi

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFileFactory
import org.faust.lang.FaustLanguage
import org.faust.lang.psi.impl.FaustIdentImplMixin


class FaustElementFactory {

    companion object {
        fun createIdent(project: Project, name: String): FaustIdentImplMixin {
            val file: FaustFile = createFile(project, name)
            return file.firstChild.firstChild.firstChild as FaustIdentImplMixin
        }

        fun createFile(project: Project, text: String): FaustFile = PsiFileFactory
            .getInstance(project)
            .createFileFromText("dummy.dsp", FaustLanguage, text) as FaustFile
    }
}
