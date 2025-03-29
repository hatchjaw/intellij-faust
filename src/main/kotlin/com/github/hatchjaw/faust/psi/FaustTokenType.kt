package com.github.hatchjaw.faust.psi

import com.github.hatchjaw.faust.FaustLanguage
import com.github.hatchjaw.faust.psi.FaustTypes.*
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet

class FaustTokenType(debugName: String) : IElementType(debugName, FaustLanguage)

val FAUST_KEYWORDS: TokenSet = TokenSet.create(
    CASE,
    ENVIRONMENT,
    LETREC,
    WITH,
    WHERE,
    LIBRARY,
    IMPORT,
    COMPONENT,
)

val FAUST_TYPECASTS: TokenSet = TokenSet.create(
    INTCAST,
    FLOATCAST,
    NOTYPECAST,
)

val FAUST_VARIANTS: TokenSet = TokenSet.create(
    FLOATMODE,
    DOUBLEMODE,
    QUADMODE,
    FIXEDPOINTMODE,
)

val FAUST_DOCUMENTATION_TAGS: TokenSet = TokenSet.create(
    BDOC,
    EDOC,
    BEQN,
    EEQN,
    BDGM,
    EDGM,
    NOTICE,
    BLST,
    ELST,
    BMTD,
    EMTD,
)

val FAUST_DECLARE: TokenSet = TokenSet.create(
    DECLARE
)

val FAUST_METADATA: TokenSet = TokenSet.orSet(
    FAUST_DECLARE,
    FAUST_DOCUMENTATION_TAGS,
)

val FAUST_STRINGS: TokenSet = TokenSet.create(
    STRING_LITERAL,
    C_HEADER
)

val FAUST_REGULAR_COMMENTS: TokenSet = TokenSet.create(
    LINE_COMMENT,
    BLOCK_COMMENT,
)

val FAUST_DOC_COMMENTS: TokenSet = TokenSet.create(
    LIB_DOC_COMMENT,
    DEF_DOC_COMMENT,
)

val FAUST_COMMENTS: TokenSet = TokenSet.orSet(
    FAUST_REGULAR_COMMENTS,
    FAUST_DOC_COMMENTS,
)

val FAUST_UI_PRIMITIVES: TokenSet = TokenSet.create(
    BUTTON,
    CHECKBOX,
    VSLIDER,
    HSLIDER,
    NENTRY,
    VGROUP,
    HGROUP,
    TGROUP,
    VBARGRAPH,
    HBARGRAPH,
    SOUNDFILE,
)

val FAUST_ITERATIONS: TokenSet = TokenSet.create(
    ITER_PAR,
    ITER_SEQ,
    ITER_SUM,
    ITER_PROD,
)

val FAUST_TABLES: TokenSet = TokenSet.create(
    RWTBL,
    RDTBL
)

val FAUST_SELECTORS: TokenSet = TokenSet.create(
    SELECT2,
    SELECT3
)

val FAUST_COMPOSITIONS: TokenSet = TokenSet.create(
    PAR,
    SEQ,
    MERGE,
    SPLIT,
    REC,
)

val FAUST_TIME_PRIMITIVES: TokenSet = TokenSet.create(
    MEM,
    PREFIX
)

val FAUST_MATH_PRIMITIVES: TokenSet = TokenSet.create(
    ACOS,
    ASIN,
    ATAN,
    ATAN2,
    COS,
    SIN,
    TAN,
    EXP,
    LOG,
    LOG10,
    POWOP,
    POWFUN,
    SQRT,
    ABS,
    MIN,
    MAX,
    FMOD,
    REMAINDER,
    FLOOR,
    CEIL,
    RINT,
    ROUND,
)

val FAUST_MISC_PRIMITIVES: TokenSet = TokenSet.create(
    INS,
    OUTS,
    ROUTE,
    SOUNDFILE,
    WAVEFORM
)

val FAUST_OPERATORS: TokenSet = TokenSet.create(
    ADD,
    SUB,
    MUL,
    DIV,
    MOD,

    DELAY,
    DELAY1,

    AND,
    OR,
    XOR,

    LSH,
    RSH,

    LT,
    LE,
    GT,
    GE,
    EQ,
    NE,
)

val FAUST_FOREIGN_EXPRESSIONS: TokenSet = TokenSet.create(
    FFUNCTION,
    FCONSTANT,
    FVARIABLE
)
