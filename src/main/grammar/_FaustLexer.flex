package com.github.hatchjaw.faust;

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

WHITE_SPACE=[ \t\r\n]+
IDENTIFIER=(::)?_*[a-zA-Z][a-zA-Z_0-9]*(::_*[a-zA-Z][a-zA-Z_0-9]*)*
STRING_LITERAL=\"[^\"]*\"
DOC_COMMENT=("//"-+`[^`]+`-+[\r\n])("//".*[\r\n]|[\r\n])*?("//"-+\R)
LINE_COMMENT="//"[^\r\n]*
BLOCK_COMMENT="/"\*(([^*]|[\r\n])*(\*+[^*/])?)*(\*+"/")?
NUMBER=([0-9]+(\.[0-9]*)?|(\.[0-9]+))([eE][+-]?[0-9]+)?f?

%%
<YYINITIAL> {
  {WHITE_SPACE}               { return WHITE_SPACE; }

  ","                         { return PAR; }
  ":"                         { return SEQ; }
  ":>"                        { return MERGE; }
  "<:"                        { return SPLIT; }
  "~"                         { return REC; }
  "+"                         { return ADD; }
  "-"                         { return SUB; }
  "*"                         { return MUL; }
  "/"                         { return DIV; }
  "%"                         { return MOD; }
  "@"                         { return DELAY; }
  "'"                         { return DELAY1; }
  "&"                         { return AND; }
  "|"                         { return OR; }
  "xor"                       { return XOR; }
  "<<"                        { return LSH; }
  ">>"                        { return RSH; }
  "<"                         { return LT; }
  "<="                        { return LE; }
  ">"                         { return GT; }
  ">="                        { return GE; }
  "=="                        { return EQ; }
  "!="                        { return NE; }
  "_"                         { return WIRE; }
  "!"                         { return CUT; }
  ";"                         { return ENDDEF; }
  "="                         { return DEF; }
  "("                         { return LPAREN; }
  ")"                         { return RPAREN; }
  "{"                         { return LBRACE; }
  "}"                         { return RBRACE; }
  "["                         { return LBRACK; }
  "]"                         { return RBRACK; }
  "\\"                        { return LAMBDA; }
  "."                         { return DOT; }
  "with"                      { return WITH; }
  "letrec"                    { return LETREC; }
  "where"                     { return WHERE; }
  "mem"                       { return MEM; }
  "prefix"                    { return PRFIX; }
  "int"                       { return INTCAST; }
  "float"                     { return FLOATCAST; }
  "any"                       { return NOTYPECAST; }
  "rdtable"                   { return RDTBL; }
  "rwtable"                   { return RWTBL; }
  "select2"                   { return SELECT2; }
  "select3"                   { return SELECT3; }
  "ffunction"                 { return FFUNCTION; }
  "fconstant"                 { return FCONSTANT; }
  "fvariable"                 { return FVARIABLE; }
  "button"                    { return BUTTON; }
  "checkbox"                  { return CHECKBOX; }
  "vslider"                   { return VSLIDER; }
  "hslider"                   { return HSLIDER; }
  "nentry"                    { return NENTRY; }
  "vgroup"                    { return VGROUP; }
  "hgroup"                    { return HGROUP; }
  "tgroup"                    { return TGROUP; }
  "vbargraph"                 { return VBARGRAPH; }
  "hbargraph"                 { return HBARGRAPH; }
  "soundfile"                 { return SOUNDFILE; }
  "attach"                    { return ATTACH; }
  "minput"                    { return MODULATE; }
  "acos"                      { return ACOS; }
  "asin"                      { return ASIN; }
  "atan"                      { return ATAN; }
  "atan2"                     { return ATAN2; }
  "cos"                       { return COS; }
  "sin"                       { return SIN; }
  "tan"                       { return TAN; }
  "exp"                       { return EXP; }
  "log"                       { return LOG; }
  "log10"                     { return LOG10; }
  "^"                         { return POWOP; }
  "pow"                       { return POWFUN; }
  "sqrt"                      { return SQRT; }
  "abs"                       { return ABS; }
  "min"                       { return MIN; }
  "max"                       { return MAX; }
  "fmod"                      { return FMOD; }
  "remainder"                 { return REMAINDER; }
  "floor"                     { return FLOOR; }
  "ceil"                      { return CEIL; }
  "rint"                      { return RINT; }
  "round"                     { return ROUND; }
  "seq"                       { return ISEQ; }
  "par"                       { return IPAR; }
  "sum"                       { return ISUM; }
  "prod"                      { return IPROD; }
  "inputs"                    { return INS; }
  "outputs"                   { return OUTS; }
  "import"                    { return IMPORT; }
  "component"                 { return COMPONENT; }
  "library"                   { return LIBRARY; }
  "environment"               { return ENVIRONMENT; }
  "waveform"                  { return WAVEFORM; }
  "route"                     { return ROUTE; }
  "enable"                    { return ENABLE; }
  "control"                   { return CONTROL; }
  "declare"                   { return DECLARE; }
  "case"                      { return CASE; }
  "=>"                        { return ARROW; }
  "->"                        { return LAPPLY; }
  "assertbounds"              { return ASSERTBOUNDS; }
  "lowest"                    { return LOWEST; }
  "highest"                   { return HIGHEST; }
  "singleprecision"           { return FLOATMODE; }
  "doubleprecision"           { return DOUBLEMODE; }
  "quadprecision"             { return QUADMODE; }
  "fixedpointprecision"       { return FIXEDPOINTMODE; }
  "PREFIX"                    { return PREFIX; }

  {WHITE_SPACE}               { return WHITE_SPACE; }
  {IDENTIFIER}                { return IDENTIFIER; }
  {STRING_LITERAL}            { return STRING_LITERAL; }
  {DOC_COMMENT}               { return DOC_COMMENT; }
  {LINE_COMMENT}              { return LINE_COMMENT; }
  {BLOCK_COMMENT}             { return BLOCK_COMMENT; }
  {NUMBER}                    { return NUMBER; }

}

[^] { return BAD_CHARACTER; }
