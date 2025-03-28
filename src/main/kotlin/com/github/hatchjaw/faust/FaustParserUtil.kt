package com.github.hatchjaw.faust

import com.github.hatchjaw.faust.psi.FaustTypes.*
import com.intellij.lang.parser.GeneratedParserUtilBase
import com.intellij.psi.tree.TokenSet

class FaustParserUtil : GeneratedParserUtilBase() {
    companion object {

        val FAUST_KEYWORDS: TokenSet = TokenSet.create(
            CASE,
            ENVIRONMENT,
            LETREC,
            WITH,
            WHERE,
            LIBRARY,
            IMPORT,
            DECLARE,
            COMPONENT,
        )

        val FAUST_STRINGS: TokenSet = TokenSet.create(
            STRING_LITERAL
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
    }
}
