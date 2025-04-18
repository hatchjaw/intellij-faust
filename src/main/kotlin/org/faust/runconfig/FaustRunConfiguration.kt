package org.faust.runconfig

import com.intellij.execution.Executor
import com.intellij.execution.ExternalizablePath
import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.LocatableConfigurationBase
import com.intellij.execution.configurations.RunConfiguration
import com.intellij.execution.configurations.RunProfileState
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.project.Project
import org.faust.FaustBundle
import org.jdom.Element
import java.nio.file.Path
import java.nio.file.Paths


class FaustRunConfiguration(project: Project, name: String, factory: ConfigurationFactory) :
    LocatableConfigurationBase<RunProfileState>(project, factory, name) {

    val executable: String get() = FaustBundle.message("faust.executable.name.default")
    var workingDirectory: Path? = Paths.get("").toAbsolutePath()
    var inputFiles: String = ""

    override fun getState(executor: Executor, environment: ExecutionEnvironment): RunProfileState =
        FaustRunState(environment, this)

    override fun getConfigurationEditor(): SettingsEditor<out RunConfiguration> = FaustConfigurationEditor(project)

    override fun writeExternal(element: Element) {
        super.writeExternal(element)

        var opt = Element("option")
        opt.setAttribute("name", "workingDirectory")
        opt.setAttribute("value", ExternalizablePath.urlValue(workingDirectory.toString()))
        element.addContent(opt)

        opt = Element("option")
        opt.setAttribute("name", "inputFiles")
        opt.setAttribute("value", inputFiles)
        element.addContent(opt)
    }

    override fun readExternal(element: Element) {
        super.readExternal(element)

        element.getChild("workingDirectory")?.getAttributeValue("value")
            ?.let { Paths.get(ExternalizablePath.localPathValue(it)) }
            .let { workingDirectory = it }

        element.getChild("inputFiles")?.getAttributeValue("value")
            ?.let { inputFiles = it }
    }
}
