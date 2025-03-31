package com.github.hatchjaw.faust.ide.actions

import com.github.hatchjaw.faust.FaustBundle
import com.github.hatchjaw.faust.ide.icons.FaustIcons
import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory

class FaustCreateDSPFileAction : CreateFileFromTemplateAction(CAPTION, "What the goddamn hell?", FaustIcons.FaustDSP),
    DumbAware {

    private companion object {
        private val CAPTION = FaustBundle.message("faust.dsp.file.type.description")
    }

    override fun buildDialog(project: Project, dir: PsiDirectory, builder: CreateFileFromTemplateDialog.Builder) {
        builder.setTitle(CAPTION)
            .addKind(FaustBundle.message("faust.create.file"), FaustIcons.FaustDSP, "Faust DSP.dsp")
    }

    override fun getActionName(dir: PsiDirectory?, newName: String, templateName: String?): String = CAPTION
}

class FaustCreateLibFileAction : CreateFileFromTemplateAction(CAPTION, "", FaustIcons.FaustLib),
    DumbAware {

    private companion object {
        private val CAPTION = FaustBundle.message("faust.lib.file.type.description")
    }

    override fun buildDialog(project: Project, dir: PsiDirectory, builder: CreateFileFromTemplateDialog.Builder) {
        builder.setTitle(CAPTION)
            .addKind(FaustBundle.message("faust.create.file"), FaustIcons.FaustLib, "Faust Library.lib")
    }

    override fun getActionName(dir: PsiDirectory?, newName: String, templateName: String?): String = CAPTION
}
