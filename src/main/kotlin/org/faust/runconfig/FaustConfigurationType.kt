package org.faust.runconfig

import org.faust.FaustBundle
import org.faust.ide.icons.FaustIcons
import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.ConfigurationTypeBase
import com.intellij.execution.configurations.ConfigurationTypeUtil
import com.intellij.execution.configurations.RunConfiguration
import com.intellij.openapi.project.Project

class FaustConfigurationType : ConfigurationTypeBase(
    "FaustRunConfiguration",
    FaustBundle.message("faust.language.display.name"),
    FaustBundle.message("faust.run.configuration"),
    FaustIcons.FaustDSP
) {
    init {
        addFactory(object : ConfigurationFactory(this) {
            override fun createTemplateConfiguration(project: Project): RunConfiguration =
                FaustRunConfiguration(project, FaustBundle.message("faust.language.display.name"), this)

            override fun getId(): String = "Faust Program"
        })
    }

    val factory: ConfigurationFactory get() = configurationFactories.single()

    companion object {
        fun getInstance(): FaustConfigurationType =
            ConfigurationTypeUtil.findConfigurationType(FaustConfigurationType::class.java)
    }
}
