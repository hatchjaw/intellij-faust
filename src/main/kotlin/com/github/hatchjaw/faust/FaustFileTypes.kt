package com.github.hatchjaw.faust

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object FaustDSPFileType : LanguageFileType(FaustLanguage) {
    override fun getName(): String = "Faust DSP"
    override fun getDescription(): String = FaustBundle.message("faust.dsp.file.type.description")
    override fun getDefaultExtension(): String = "dsp"
    override fun getIcon(): Icon = FaustIcons.FaustDSP
    override fun getDisplayName(): String = FaustBundle.message("faust.dsp.file.type.display.name")
}

object FaustLibFileType : LanguageFileType(FaustLanguage) {
    override fun getName(): String = "Faust Library"
    override fun getDescription(): String = FaustBundle.message("faust.lib.file.type.description")
    override fun getDefaultExtension(): String = "lib"
    override fun getIcon(): Icon = FaustIcons.FaustLib
    override fun getDisplayName(): String = FaustBundle.message("faust.lib.file.type.display.name")
}
