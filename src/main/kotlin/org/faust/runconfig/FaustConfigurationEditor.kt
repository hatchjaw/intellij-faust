package org.faust.runconfig

import com.intellij.execution.ExecutionBundle
import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory
import org.faust.FaustBundle
import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.LabeledComponent
import com.intellij.openapi.ui.TextFieldWithBrowseButton
import com.intellij.ui.dsl.builder.Align
import com.intellij.ui.dsl.builder.panel
import java.nio.file.Path
import java.nio.file.Paths
import javax.swing.JComponent
import javax.swing.JTextField

class FaustConfigurationEditor(project: Project) : SettingsEditor<FaustRunConfiguration>() {
    private val inputFiles: String? get() = inputFilesComponent.component.text

    private val inputFilesComponent: LabeledComponent<JTextField> = object : LabeledComponent<JTextField>() {
        init {
            component = JTextField()
            text = FaustBundle.message("faust.runconfig.inputfiles.text")
        }
    }

    private val workingDirectory: Path? get() = Paths.get(workingDirectoryComponent.component.text)

    private val workingDirectoryComponent: LabeledComponent<TextFieldWithBrowseButton> =
        object : LabeledComponent<TextFieldWithBrowseButton>() {
            init {
                component = TextFieldWithBrowseButton().apply {
                    val fileChooser = FileChooserDescriptorFactory.createSingleFolderDescriptor().apply {
                        title = ExecutionBundle.message("select.working.directory.message")
                    }
                    addBrowseFolderListener(null, null, null, fileChooser)
                }
                text = ExecutionBundle.message("run.configuration.working.directory.label")
            }
        }

    override fun resetEditorFrom(config: FaustRunConfiguration) {
        workingDirectoryComponent.component.text = config.workingDirectory?.toString().orEmpty()
        inputFilesComponent.component.text = config.inputFiles
    }

    override fun applyEditorTo(config: FaustRunConfiguration) {
        config.workingDirectory = workingDirectory
        config.inputFiles = inputFiles.toString()
    }

    override fun createEditor(): JComponent = panel {
        row(inputFilesComponent.label) {
            cell(inputFilesComponent).align(Align.FILL)
        }

        row(workingDirectoryComponent.label) {
            cell(workingDirectoryComponent).align(Align.FILL)
        }
    }
}
