// This is a generated file. Not intended for manual editing.
package com.github.hatchjaw.faust.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.hatchjaw.faust.psi.impl.*;

public interface FaustTypes {

  IElementType ACCESS_IFX = new FaustElementType("ACCESS_IFX");
  IElementType ADD_IFX = new FaustElementType("ADD_IFX");
  IElementType AND_IFX = new FaustElementType("AND_IFX");
  IElementType ARGUMENT = new FaustElementType("ARGUMENT");
  IElementType ARG_LIST = new FaustElementType("ARG_LIST");
  IElementType ARG_TYPE = new FaustElementType("ARG_TYPE");
  IElementType BRACK_IFX = new FaustElementType("BRACK_IFX");
  IElementType DECLARATION = new FaustElementType("DECLARATION");
  IElementType DEC_NAME = new FaustElementType("DEC_NAME");
  IElementType DEFINITION = new FaustElementType("DEFINITION");
  IElementType DEF_NAME = new FaustElementType("DEF_NAME");
  IElementType DELAY_1_IFX = new FaustElementType("DELAY_1_IFX");
  IElementType DELAY_IFX = new FaustElementType("DELAY_IFX");
  IElementType DIV_IFX = new FaustElementType("DIV_IFX");
  IElementType ENVIRONMENT_CONSTRUCTION = new FaustElementType("ENVIRONMENT_CONSTRUCTION");
  IElementType EQ_IFX = new FaustElementType("EQ_IFX");
  IElementType EXPRESSION = new FaustElementType("EXPRESSION");
  IElementType FILE_IMPORT = new FaustElementType("FILE_IMPORT");
  IElementType FOREIGN_CONSTANT = new FaustElementType("FOREIGN_CONSTANT");
  IElementType FOREIGN_FUNCTION = new FaustElementType("FOREIGN_FUNCTION");
  IElementType FOREIGN_VARIABLE = new FaustElementType("FOREIGN_VARIABLE");
  IElementType FSTRING = new FaustElementType("FSTRING");
  IElementType GE_IFX = new FaustElementType("GE_IFX");
  IElementType GT_IFX = new FaustElementType("GT_IFX");
  IElementType IDENT = new FaustElementType("IDENT");
  IElementType INFIX = new FaustElementType("INFIX");
  IElementType INFIX_ARG = new FaustElementType("INFIX_ARG");
  IElementType INFIX_EXPR = new FaustElementType("INFIX_EXPR");
  IElementType INPUTS = new FaustElementType("INPUTS");
  IElementType ITERATION = new FaustElementType("ITERATION");
  IElementType LAMBDA_ABSTRACTION = new FaustElementType("LAMBDA_ABSTRACTION");
  IElementType LETREC_DEF_LIST_EXPR = new FaustElementType("LETREC_DEF_LIST_EXPR");
  IElementType LETREC_EXPR = new FaustElementType("LETREC_EXPR");
  IElementType LE_IFX = new FaustElementType("LE_IFX");
  IElementType LSH_IFX = new FaustElementType("LSH_IFX");
  IElementType LT_IFX = new FaustElementType("LT_IFX");
  IElementType MERGE_ARG = new FaustElementType("MERGE_ARG");
  IElementType MERGE_COMP = new FaustElementType("MERGE_COMP");
  IElementType MOD_IFX = new FaustElementType("MOD_IFX");
  IElementType MUL_IFX = new FaustElementType("MUL_IFX");
  IElementType NE_IFX = new FaustElementType("NE_IFX");
  IElementType OR_IFX = new FaustElementType("OR_IFX");
  IElementType OUTPUTS = new FaustElementType("OUTPUTS");
  IElementType PARALLEL_COMP = new FaustElementType("PARALLEL_COMP");
  IElementType PARAMS = new FaustElementType("PARAMS");
  IElementType PAREN_IFX = new FaustElementType("PAREN_IFX");
  IElementType PATTERN_ABSTRACTION = new FaustElementType("PATTERN_ABSTRACTION");
  IElementType POW_IFX = new FaustElementType("POW_IFX");
  IElementType PRIMITIVE = new FaustElementType("PRIMITIVE");
  IElementType RECURSIVE_COMP = new FaustElementType("RECURSIVE_COMP");
  IElementType REC_ARG = new FaustElementType("REC_ARG");
  IElementType REC_DEFINITION = new FaustElementType("REC_DEFINITION");
  IElementType REC_NAME = new FaustElementType("REC_NAME");
  IElementType RSH_IFX = new FaustElementType("RSH_IFX");
  IElementType RULE = new FaustElementType("RULE");
  IElementType RULE_LIST = new FaustElementType("RULE_LIST");
  IElementType SEQUENTIAL_COMP = new FaustElementType("SEQUENTIAL_COMP");
  IElementType SEQ_ARG = new FaustElementType("SEQ_ARG");
  IElementType SIGNATURE = new FaustElementType("SIGNATURE");
  IElementType SOUNDFILE_PRIM = new FaustElementType("SOUNDFILE_PRIM");
  IElementType SPLIT_ARG = new FaustElementType("SPLIT_ARG");
  IElementType SPLIT_COMP = new FaustElementType("SPLIT_COMP");
  IElementType STRING = new FaustElementType("STRING");
  IElementType SUB_IFX = new FaustElementType("SUB_IFX");
  IElementType TYPE = new FaustElementType("TYPE");
  IElementType TYPE_LIST = new FaustElementType("TYPE_LIST");
  IElementType UI_BUTTON = new FaustElementType("UI_BUTTON");
  IElementType UI_CHECKBOX = new FaustElementType("UI_CHECKBOX");
  IElementType UI_HBARGRAPH = new FaustElementType("UI_HBARGRAPH");
  IElementType UI_HGROUP = new FaustElementType("UI_HGROUP");
  IElementType UI_HSLIDER = new FaustElementType("UI_HSLIDER");
  IElementType UI_NENTRY = new FaustElementType("UI_NENTRY");
  IElementType UI_TGROUP = new FaustElementType("UI_TGROUP");
  IElementType UI_VBARGRAPH = new FaustElementType("UI_VBARGRAPH");
  IElementType UI_VGROUP = new FaustElementType("UI_VGROUP");
  IElementType UI_VSLIDER = new FaustElementType("UI_VSLIDER");
  IElementType UQ_STRING = new FaustElementType("UQ_STRING");
  IElementType VAL_LIST = new FaustElementType("VAL_LIST");
  IElementType VARIANT = new FaustElementType("VARIANT");
  IElementType WAVEFORM_PRIM_ITIVE = new FaustElementType("WAVEFORM_PRIM_ITIVE");
  IElementType WITH_EXPR = new FaustElementType("WITH_EXPR");
  IElementType XOR_IFX = new FaustElementType("XOR_IFX");

  IElementType ABS = new FaustTokenType("abs");
  IElementType ACOS = new FaustTokenType("acos");
  IElementType ADD = new FaustTokenType("+");
  IElementType AND = new FaustTokenType("&");
  IElementType ARROW = new FaustTokenType("=>");
  IElementType ASIN = new FaustTokenType("asin");
  IElementType ASSERTBOUNDS = new FaustTokenType("assertbounds");
  IElementType ATAN = new FaustTokenType("atan");
  IElementType ATAN2 = new FaustTokenType("atan2");
  IElementType ATTACH = new FaustTokenType("attach");
  IElementType BLOCK_COMMENT = new FaustTokenType("BLOCK_COMMENT");
  IElementType BUTTON = new FaustTokenType("button");
  IElementType CASE = new FaustTokenType("case");
  IElementType CEIL = new FaustTokenType("ceil");
  IElementType CHECKBOX = new FaustTokenType("checkbox");
  IElementType COMPONENT = new FaustTokenType("component");
  IElementType CONTROL = new FaustTokenType("control");
  IElementType COS = new FaustTokenType("cos");
  IElementType CUT = new FaustTokenType("!");
  IElementType C_HEADER = new FaustTokenType("C_HEADER");
  IElementType DECLARE = new FaustTokenType("declare");
  IElementType DEF = new FaustTokenType("=");
  IElementType DEF_DOC_COMMENT = new FaustTokenType("DEF_DOC_COMMENT");
  IElementType DELAY = new FaustTokenType("@");
  IElementType DELAY1 = new FaustTokenType("'");
  IElementType DIV = new FaustTokenType("/");
  IElementType DOT = new FaustTokenType(".");
  IElementType DOUBLEMODE = new FaustTokenType("doubleprecision");
  IElementType ENABLE = new FaustTokenType("enable");
  IElementType ENDDEF = new FaustTokenType(";");
  IElementType ENVIRONMENT = new FaustTokenType("environment");
  IElementType EQ = new FaustTokenType("==");
  IElementType EXP = new FaustTokenType("exp");
  IElementType FCONSTANT = new FaustTokenType("fconstant");
  IElementType FFUNCTION = new FaustTokenType("ffunction");
  IElementType FIXEDPOINTMODE = new FaustTokenType("fixedpointprecision");
  IElementType FLOATCAST = new FaustTokenType("float");
  IElementType FLOATMODE = new FaustTokenType("singleprecision");
  IElementType FLOOR = new FaustTokenType("floor");
  IElementType FMOD = new FaustTokenType("fmod");
  IElementType FVARIABLE = new FaustTokenType("fvariable");
  IElementType GE = new FaustTokenType(">=");
  IElementType GT = new FaustTokenType(">");
  IElementType HBARGRAPH = new FaustTokenType("hbargraph");
  IElementType HGROUP = new FaustTokenType("hgroup");
  IElementType HIGHEST = new FaustTokenType("highest");
  IElementType HSLIDER = new FaustTokenType("hslider");
  IElementType IDENTIFIER = new FaustTokenType("IDENTIFIER");
  IElementType IMPORT = new FaustTokenType("import");
  IElementType INS = new FaustTokenType("inputs");
  IElementType INTCAST = new FaustTokenType("int");
  IElementType IPAR = new FaustTokenType("par");
  IElementType IPROD = new FaustTokenType("prod");
  IElementType ISEQ = new FaustTokenType("seq");
  IElementType ISUM = new FaustTokenType("sum");
  IElementType LAMBDA = new FaustTokenType("\\");
  IElementType LAPPLY = new FaustTokenType("->");
  IElementType LBRACE = new FaustTokenType("{");
  IElementType LBRACK = new FaustTokenType("[");
  IElementType LE = new FaustTokenType("<=");
  IElementType LETREC = new FaustTokenType("letrec");
  IElementType LIBRARY = new FaustTokenType("library");
  IElementType LIB_DOC_COMMENT = new FaustTokenType("LIB_DOC_COMMENT");
  IElementType LINE_COMMENT = new FaustTokenType("LINE_COMMENT");
  IElementType LOG = new FaustTokenType("log");
  IElementType LOG10 = new FaustTokenType("log10");
  IElementType LOWEST = new FaustTokenType("lowest");
  IElementType LPAREN = new FaustTokenType("(");
  IElementType LSH = new FaustTokenType("<<");
  IElementType LT = new FaustTokenType("<");
  IElementType MAX = new FaustTokenType("max");
  IElementType MEM = new FaustTokenType("mem");
  IElementType MERGE = new FaustTokenType(":>");
  IElementType MIN = new FaustTokenType("min");
  IElementType MOD = new FaustTokenType("%");
  IElementType MODULATE = new FaustTokenType("minput");
  IElementType MUL = new FaustTokenType("*");
  IElementType NE = new FaustTokenType("!=");
  IElementType NENTRY = new FaustTokenType("nentry");
  IElementType NOTYPECAST = new FaustTokenType("any");
  IElementType NUMBER = new FaustTokenType("NUMBER");
  IElementType OR = new FaustTokenType("|");
  IElementType OUTS = new FaustTokenType("outputs");
  IElementType PAR = new FaustTokenType(",");
  IElementType POWFUN = new FaustTokenType("pow");
  IElementType POWOP = new FaustTokenType("^");
  IElementType PREFIX = new FaustTokenType("PREFIX");
  IElementType PRFIX = new FaustTokenType("prefix");
  IElementType QUADMODE = new FaustTokenType("quadprecision");
  IElementType RBRACE = new FaustTokenType("}");
  IElementType RBRACK = new FaustTokenType("]");
  IElementType RDTBL = new FaustTokenType("rdtable");
  IElementType REC = new FaustTokenType("~");
  IElementType REMAINDER = new FaustTokenType("remainder");
  IElementType RINT = new FaustTokenType("rint");
  IElementType ROUND = new FaustTokenType("round");
  IElementType ROUTE = new FaustTokenType("route");
  IElementType RPAREN = new FaustTokenType(")");
  IElementType RSH = new FaustTokenType(">>");
  IElementType RWTBL = new FaustTokenType("rwtable");
  IElementType SELECT2 = new FaustTokenType("select2");
  IElementType SELECT3 = new FaustTokenType("select3");
  IElementType SEQ = new FaustTokenType(":");
  IElementType SIN = new FaustTokenType("sin");
  IElementType SOUNDFILE = new FaustTokenType("soundfile");
  IElementType SPLIT = new FaustTokenType("<:");
  IElementType SQRT = new FaustTokenType("sqrt");
  IElementType STRING_LITERAL = new FaustTokenType("STRING_LITERAL");
  IElementType SUB = new FaustTokenType("-");
  IElementType TAN = new FaustTokenType("tan");
  IElementType TGROUP = new FaustTokenType("tgroup");
  IElementType VBARGRAPH = new FaustTokenType("vbargraph");
  IElementType VGROUP = new FaustTokenType("vgroup");
  IElementType VSLIDER = new FaustTokenType("vslider");
  IElementType WAVEFORM = new FaustTokenType("waveform");
  IElementType WHERE = new FaustTokenType("where");
  IElementType WIRE = new FaustTokenType("_");
  IElementType WITH = new FaustTokenType("with");
  IElementType XOR = new FaustTokenType("xor");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ACCESS_IFX) {
        return new FaustAccessIfxImpl(node);
      }
      else if (type == ADD_IFX) {
        return new FaustAddIfxImpl(node);
      }
      else if (type == AND_IFX) {
        return new FaustAndIfxImpl(node);
      }
      else if (type == ARG_LIST) {
        return new FaustArgListImpl(node);
      }
      else if (type == ARG_TYPE) {
        return new FaustArgTypeImpl(node);
      }
      else if (type == BRACK_IFX) {
        return new FaustBrackIfxImpl(node);
      }
      else if (type == DECLARATION) {
        return new FaustDeclarationImpl(node);
      }
      else if (type == DEC_NAME) {
        return new FaustDecNameImpl(node);
      }
      else if (type == DEFINITION) {
        return new FaustDefinitionImpl(node);
      }
      else if (type == DEF_NAME) {
        return new FaustDefNameImpl(node);
      }
      else if (type == DELAY_1_IFX) {
        return new FaustDelay1IfxImpl(node);
      }
      else if (type == DELAY_IFX) {
        return new FaustDelayIfxImpl(node);
      }
      else if (type == DIV_IFX) {
        return new FaustDivIfxImpl(node);
      }
      else if (type == ENVIRONMENT_CONSTRUCTION) {
        return new FaustEnvironmentConstructionImpl(node);
      }
      else if (type == EQ_IFX) {
        return new FaustEqIfxImpl(node);
      }
      else if (type == FILE_IMPORT) {
        return new FaustFileImportImpl(node);
      }
      else if (type == FOREIGN_CONSTANT) {
        return new FaustForeignConstantImpl(node);
      }
      else if (type == FOREIGN_FUNCTION) {
        return new FaustForeignFunctionImpl(node);
      }
      else if (type == FOREIGN_VARIABLE) {
        return new FaustForeignVariableImpl(node);
      }
      else if (type == FSTRING) {
        return new FaustFstringImpl(node);
      }
      else if (type == GE_IFX) {
        return new FaustGeIfxImpl(node);
      }
      else if (type == GT_IFX) {
        return new FaustGtIfxImpl(node);
      }
      else if (type == IDENT) {
        return new FaustIdentImpl(node);
      }
      else if (type == INFIX_ARG) {
        return new FaustInfixArgImpl(node);
      }
      else if (type == INFIX_EXPR) {
        return new FaustInfixExprImpl(node);
      }
      else if (type == INPUTS) {
        return new FaustInputsImpl(node);
      }
      else if (type == ITERATION) {
        return new FaustIterationImpl(node);
      }
      else if (type == LAMBDA_ABSTRACTION) {
        return new FaustLambdaAbstractionImpl(node);
      }
      else if (type == LETREC_DEF_LIST_EXPR) {
        return new FaustLetrecDefListExprImpl(node);
      }
      else if (type == LETREC_EXPR) {
        return new FaustLetrecExprImpl(node);
      }
      else if (type == LE_IFX) {
        return new FaustLeIfxImpl(node);
      }
      else if (type == LSH_IFX) {
        return new FaustLshIfxImpl(node);
      }
      else if (type == LT_IFX) {
        return new FaustLtIfxImpl(node);
      }
      else if (type == MERGE_ARG) {
        return new FaustMergeArgImpl(node);
      }
      else if (type == MERGE_COMP) {
        return new FaustMergeCompImpl(node);
      }
      else if (type == MOD_IFX) {
        return new FaustModIfxImpl(node);
      }
      else if (type == MUL_IFX) {
        return new FaustMulIfxImpl(node);
      }
      else if (type == NE_IFX) {
        return new FaustNeIfxImpl(node);
      }
      else if (type == OR_IFX) {
        return new FaustOrIfxImpl(node);
      }
      else if (type == OUTPUTS) {
        return new FaustOutputsImpl(node);
      }
      else if (type == PARALLEL_COMP) {
        return new FaustParallelCompImpl(node);
      }
      else if (type == PARAMS) {
        return new FaustParamsImpl(node);
      }
      else if (type == PAREN_IFX) {
        return new FaustParenIfxImpl(node);
      }
      else if (type == PATTERN_ABSTRACTION) {
        return new FaustPatternAbstractionImpl(node);
      }
      else if (type == POW_IFX) {
        return new FaustPowIfxImpl(node);
      }
      else if (type == PRIMITIVE) {
        return new FaustPrimitiveImpl(node);
      }
      else if (type == RECURSIVE_COMP) {
        return new FaustRecursiveCompImpl(node);
      }
      else if (type == REC_ARG) {
        return new FaustRecArgImpl(node);
      }
      else if (type == REC_DEFINITION) {
        return new FaustRecDefinitionImpl(node);
      }
      else if (type == REC_NAME) {
        return new FaustRecNameImpl(node);
      }
      else if (type == RSH_IFX) {
        return new FaustRshIfxImpl(node);
      }
      else if (type == RULE) {
        return new FaustRuleImpl(node);
      }
      else if (type == RULE_LIST) {
        return new FaustRuleListImpl(node);
      }
      else if (type == SEQUENTIAL_COMP) {
        return new FaustSequentialCompImpl(node);
      }
      else if (type == SEQ_ARG) {
        return new FaustSeqArgImpl(node);
      }
      else if (type == SIGNATURE) {
        return new FaustSignatureImpl(node);
      }
      else if (type == SOUNDFILE_PRIM) {
        return new FaustSoundfilePrimImpl(node);
      }
      else if (type == SPLIT_ARG) {
        return new FaustSplitArgImpl(node);
      }
      else if (type == SPLIT_COMP) {
        return new FaustSplitCompImpl(node);
      }
      else if (type == STRING) {
        return new FaustStringImpl(node);
      }
      else if (type == SUB_IFX) {
        return new FaustSubIfxImpl(node);
      }
      else if (type == TYPE) {
        return new FaustTypeImpl(node);
      }
      else if (type == TYPE_LIST) {
        return new FaustTypeListImpl(node);
      }
      else if (type == UI_BUTTON) {
        return new FaustUiButtonImpl(node);
      }
      else if (type == UI_CHECKBOX) {
        return new FaustUiCheckboxImpl(node);
      }
      else if (type == UI_HBARGRAPH) {
        return new FaustUiHbargraphImpl(node);
      }
      else if (type == UI_HGROUP) {
        return new FaustUiHgroupImpl(node);
      }
      else if (type == UI_HSLIDER) {
        return new FaustUiHsliderImpl(node);
      }
      else if (type == UI_NENTRY) {
        return new FaustUiNentryImpl(node);
      }
      else if (type == UI_TGROUP) {
        return new FaustUiTgroupImpl(node);
      }
      else if (type == UI_VBARGRAPH) {
        return new FaustUiVbargraphImpl(node);
      }
      else if (type == UI_VGROUP) {
        return new FaustUiVgroupImpl(node);
      }
      else if (type == UI_VSLIDER) {
        return new FaustUiVsliderImpl(node);
      }
      else if (type == UQ_STRING) {
        return new FaustUqStringImpl(node);
      }
      else if (type == VAL_LIST) {
        return new FaustValListImpl(node);
      }
      else if (type == VARIANT) {
        return new FaustVariantImpl(node);
      }
      else if (type == WAVEFORM_PRIM_ITIVE) {
        return new FaustWaveformPrimItiveImpl(node);
      }
      else if (type == WITH_EXPR) {
        return new FaustWithExprImpl(node);
      }
      else if (type == XOR_IFX) {
        return new FaustXorIfxImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
