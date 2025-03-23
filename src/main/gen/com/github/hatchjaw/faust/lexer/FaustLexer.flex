package com.github.hatchjaw.faust.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.hatchjaw.faust.psi.FaustTypes.*;

%%

%{
  public _FaustLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _FaustLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

WHITESPACE=[ \t\n\x0B\f\r]+
LINE_COMMENT="//".*
IDENTIFIER=[:letter:][a-zA-Z_0-9]*
LIBFILE=\"[a-zA-Z_0-9]+\.lib\"
DSPFILE=\"[a-zA-Z_0-9]+\.dsp\"
CINCLUDE=(<[a-zA-Z_0-9]+\.h>|\"[a-zA-Z_0-9]+\.h\")
NUMBER=([0-9]+(\.[0-9]*)?|(\.[0-9]+))([eE][+-]?[0-9]+)?f?

%%
<YYINITIAL> {
  {WHITE_SPACE}             { return WHITE_SPACE; }

  "~"                       { return COMPOSE_REC; }
  ","                       { return COMPOSE_PAR; }
  ":"                       { return COMPOSE_SEQ; }
  "<:"                      { return COMPOSE_SPLIT; }
  ":>"                      { return COMPOSE_MERGE; }
  "_"                       { return SIG_IDENTITY; }
  "!"                       { return SIG_CUT; }
  "+"                       { return MATH_ADD; }
  "-"                       { return MATH_SUB; }
  "*"                       { return MATH_MUL; }
  "^"                       { return MATH_POW; }
  "/"                       { return MATH_DIV; }
  "%"                       { return MATH_REM; }
  "|"                       { return BIT_OR; }
  "&"                       { return BIT_AND; }
  "xor"                     { return BIT_XOR; }
  "<<"                      { return BIT_LSHIFT; }
  ">>"                      { return BIT_RSHIFT; }
  "<"                       { return COMPARE_LESS; }
  "<="                      { return COMPARE_LEQ; }
  ">"                       { return COMPARE_MORE; }
  ">="                      { return COMPARE_GEQ; }
  "=="                      { return COMPARE_EQ; }
  "!="                      { return COMPARE_NEQ; }
  "mem"                     { return TIME_MEM; }
  "'"                       { return TIME_DELAY1; }
  "@"                       { return TIME_DELAY; }
  "FreeText"                { return FREETEXT; }
  "Keyword"                 { return KEYWORD; }
  "mdoctags"                { return MDOCTAGS; }
  "dependencies"            { return DEPENDENCIES; }
  "distributed"             { return DISTRIBUTED; }
  "import"                  { return IMPORT; }
  "singleprecision"         { return SINGLEPRECISION; }
  "doubleprecision"         { return DOUBLEPRECISION; }
  "quadprecision"           { return QUADPRECISION; }
  "fixedpointprecision"     { return FIXEDPOINTPRECISION; }
  "declare"                 { return DECLARE; }
  "name"                    { return NAME; }
  "author"                  { return AUTHOR; }
  "copyright"               { return COPYRIGHT; }
  "version"                 { return VERSION; }
  "license"                 { return LICENSE; }
  "licence"                 { return LICENCE; }
  "description"             { return DESCRIPTION; }
  "STRING"                  { return STRING; }
  "par"                     { return PAR; }
  "seq"                     { return SEQ; }
  "sum"                     { return SUM; }
  "prod"                    { return PROD; }
  "ExplicitSubst"           { return EXPLICITSUBST; }
  "with"                    { return WITH; }
  "letrec"                  { return LETREC; }
  "where"                   { return WHERE; }
  "library"                 { return LIBRARY; }
  "component"               { return COMPONENT; }
  "environment"             { return ENVIRONMENT; }
  "route"                   { return ROUTE; }
  "waveform"                { return WAVEFORM; }
  "case"                    { return CASE; }
  "int"                     { return INT; }
  "float"                   { return FLOAT; }
  "button"                  { return BUTTON; }
  "checkbox"                { return CHECKBOX; }
  "hslider"                 { return HSLIDER; }
  "vslider"                 { return VSLIDER; }
  "nentry"                  { return NENTRY; }
  "hgroup"                  { return HGROUP; }
  "vgroup"                  { return VGROUP; }
  "tgroup"                  { return TGROUP; }
  "hbargraph"               { return HBARGRAPH; }
  "vbargraph"               { return VBARGRAPH; }
  "attach"                  { return ATTACH; }
  "MEM"                     { return MEM; }
  "ffunction"               { return FFUNCTION; }
  "any"                     { return ANY; }

  {WHITESPACE}              { return WHITESPACE; }
  {LINE_COMMENT}            { return LINE_COMMENT; }
  {IDENTIFIER}              { return IDENTIFIER; }
  {LIBFILE}                 { return LIBFILE; }
  {DSPFILE}                 { return DSPFILE; }
  {CINCLUDE}                { return CINCLUDE; }
  {NUMBER}                  { return NUMBER; }

}

[^] { return BAD_CHARACTER; }
