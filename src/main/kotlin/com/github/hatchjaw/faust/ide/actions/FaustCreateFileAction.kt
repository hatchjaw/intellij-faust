package com.github.hatchjaw.faust.ide.actions

import com.github.hatchjaw.faust.FaustBundle
import com.github.hatchjaw.faust.ide.icons.FaustIcons
import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory

class FaustCreateFileAction : CreateFileFromTemplateAction(FaustBundle.message("faust.file"), "", FaustIcons.FaustDSP),
    DumbAware {

    override fun buildDialog(project: Project, dir: PsiDirectory, builder: CreateFileFromTemplateDialog.Builder) {
        builder.setTitle(FaustBundle.message("faust.file.new"))
            .addKind(FaustBundle.message("faust.dsp.file.type.display.name"), FaustIcons.FaustDSP, "Faust DSP.dsp")
            .addKind(FaustBundle.message("faust.lib.file.type.display.name"), FaustIcons.FaustLib, "Faust Library.lib")
    }

    override fun getActionName(dir: PsiDirectory?, newName: String, templateName: String?): String = FaustBundle.message("faust.file")
}
