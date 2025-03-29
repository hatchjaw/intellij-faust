package com.github.hatchjaw.faust.ide.typing

import com.github.hatchjaw.faust.lang.FaustLanguage
import com.intellij.codeInsight.highlighting.PairedBraceMatcherAdapter

class FaustPairedBraceMatcher : PairedBraceMatcherAdapter(FaustBraceMatcher(), FaustLanguage)
