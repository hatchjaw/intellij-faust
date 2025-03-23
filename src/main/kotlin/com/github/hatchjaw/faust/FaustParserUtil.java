package com.github.hatchjaw.faust;

import com.intellij.lang.parser.GeneratedParserUtilBase;
import com.intellij.psi.tree.IElementType;

import java.util.Arrays;
import java.util.HashSet;

import static com.github.hatchjaw.faust.psi.FaustTypes.*;

public class FaustParserUtil extends GeneratedParserUtilBase {
    static final HashSet<IElementType> KEYWORDS = new HashSet<>(Arrays.asList(CASE, ENVIRONMENT, LETREC, WITH));
}
