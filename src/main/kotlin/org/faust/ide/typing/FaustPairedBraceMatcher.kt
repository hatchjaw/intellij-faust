package org.faust.ide.typing

import org.faust.lang.FaustLanguage
import com.intellij.codeInsight.highlighting.PairedBraceMatcherAdapter

class FaustPairedBraceMatcher : PairedBraceMatcherAdapter(FaustBraceMatcher(), FaustLanguage)
