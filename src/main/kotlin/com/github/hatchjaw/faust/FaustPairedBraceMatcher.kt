package com.github.hatchjaw.faust

import com.intellij.codeInsight.highlighting.PairedBraceMatcherAdapter

class FaustPairedBraceMatcher : PairedBraceMatcherAdapter(FaustBraceMatcher(), FaustLanguage)
