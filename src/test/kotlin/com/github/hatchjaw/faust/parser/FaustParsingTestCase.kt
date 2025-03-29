package com.github.hatchjaw.faust.parser

import com.github.hatchjaw.faust.lang.parser.FaustParserDefinition
import com.intellij.testFramework.ParsingTestCase
import com.intellij.testFramework.TestDataPath

@TestDataPath("\$CONTENT_ROOT/testData/parser")
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

    fun testRoutes() = doTest(true)
}
