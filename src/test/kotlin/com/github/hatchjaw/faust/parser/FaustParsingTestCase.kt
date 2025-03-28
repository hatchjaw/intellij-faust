package com.github.hatchjaw.faust.parser

import com.github.hatchjaw.faust.FaustParserDefinition
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiElementVisitor
import com.intellij.psi.PsiErrorElement
import com.intellij.psi.PsiFile
import com.intellij.testFramework.ParsingTestCase
import com.intellij.testFramework.TestDataPath
import java.nio.file.Paths

class FaustParsingTestCase : ParsingTestCase(
    "",
    "lib",
    true,
    FaustParserDefinition()
) {

    override fun getTestDataPath(): String = "src/test/testData/parser"

    override fun getTestName(lowercaseFirstLetter: Boolean): String =
        super.getTestName(lowercaseFirstLetter).trim()

    override fun includeRanges(): Boolean = true

    fun `test routes`() = doTest(true)
}
