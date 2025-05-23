package org.faust.lang.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static org.faust.lang.psi.FaustElementTypes.*;

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

NOTICE=<notice[ \t\n\x0B\f\r]?"/">
WHITE_SPACE=[ \t\r\n]+
IDENTIFIER=(::)?_*[a-zA-Z][a-zA-Z_0-9]*(::_*[a-zA-Z][a-zA-Z_0-9]*)*
STRING_LITERAL=\"[^\"]*\"?
C_HEADER=<[a-zA-Z_0-9]+(\.[a-zA-Z])?>
LIB_DOC_COMMENT=("//"#+([^#]+?)#+[\r\n])("//".*[\r\n])+
DEF_DOC_COMMENT=("//"-+`([^-]+?)`-+[\r\n])("//".*[\r\n])+
LINE_COMMENT="//"[^\r\n]*
BLOCK_COMMENT="/"\*(([^*]|[\r\n])*(\*+[^*/])?)*(\*+"/")?
NUMBER=([0-9]+(\.[0-9]*)?|(\.[0-9]+))([eE][+-]?[0-9]+)?f?

%%
<YYINITIAL> {
  {WHITE_SPACE}               { return WHITE_SPACE; }

  "<mdoc>"                    { return BDOC; }
  "</mdoc>"                   { return EDOC; }
  "<equation>"                { return BEQN; }
  "</equation>"               { return EEQN; }
  "<diagram>"                 { return BDGM; }
  "</diagram>"                { return EDGM; }
  "<listing"                  { return BLST; }
  "/>"                        { return ELST; }
  "<metadata>"                { return BMTD; }
  "</metadata>"               { return EMTD; }
  "dependencies"              { return LSTDEPENDENCIES; }
  "mdoctags"                  { return LSTMDOCTAGS; }
  "distributed"               { return LSTDISTRIBUTED; }
  "\"true\""                  { return LSTTRUE; }
  "\"false\""                 { return LSTFALSE; }
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
  "prefix"                    { return PREFIX; }
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
  "seq"                       { return ITER_SEQ; }
  "par"                       { return ITER_PAR; }
  "sum"                       { return ITER_SUM; }
  "prod"                      { return ITER_PROD; }
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

  {NOTICE}                    { return NOTICE; }
  {WHITE_SPACE}               { return WHITE_SPACE; }
  {IDENTIFIER}                { return IDENTIFIER; }
  {STRING_LITERAL}            { return STRING_LITERAL; }
  {C_HEADER}                  { return C_HEADER; }
  {LIB_DOC_COMMENT}           { return LIB_DOC_COMMENT; }
  {DEF_DOC_COMMENT}           { return DEF_DOC_COMMENT; }
  {LINE_COMMENT}              { return LINE_COMMENT; }
  {BLOCK_COMMENT}             { return BLOCK_COMMENT; }
  {NUMBER}                    { return NUMBER; }

}

[^] { return BAD_CHARACTER; }
