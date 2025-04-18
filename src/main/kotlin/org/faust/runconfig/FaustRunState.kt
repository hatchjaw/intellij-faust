package org.faust.runconfig

import com.intellij.execution.configurations.CommandLineState
import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.process.ProcessHandler
import com.intellij.execution.process.ProcessHandlerFactory
import com.intellij.execution.process.ProcessTerminatedListener
import com.intellij.execution.runners.ExecutionEnvironment


class FaustRunState(environment: ExecutionEnvironment, private val runConfiguration: FaustRunConfiguration) :
    CommandLineState(environment) {

    override fun startProcess(): ProcessHandler {
        val commandLine = GeneralCommandLine(runConfiguration.executable)
            .withParameters(runConfiguration.inputFiles)
            .withWorkDirectory(runConfiguration.workingDirectory?.toFile())
        val processHandler = ProcessHandlerFactory.getInstance()
            .createColoredProcessHandler(commandLine)
        ProcessTerminatedListener.attach(processHandler)
        return processHandler
    }
}
