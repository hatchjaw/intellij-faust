package com.github.hatchjaw.intellijfaust

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class FaustDSPFileType private constructor() : LanguageFileType(FaustLanguage.INSTANCE) {
    override fun getName(): String = "Faust DSP"
    override fun getDescription(): String = FaustBundle.message("faust.dsp.file.type.description")
    override fun getDefaultExtension(): String = "dsp"
    override fun getIcon(): Icon = FaustIcons.FaustDSP

    companion object {
        @JvmField
        val INSTANCE = FaustDSPFileType()
    }
}

class FaustLibFileType private constructor() : LanguageFileType(FaustLanguage.INSTANCE) {
    override fun getName(): String = "Faust Library"
    override fun getDescription(): String = FaustBundle.message("faust.lib.file.type.description")
    override fun getDefaultExtension(): String = "lib"
    override fun getIcon(): Icon = FaustIcons.FaustLib

    companion object {
        @JvmField
        val INSTANCE = FaustLibFileType()
    }
}