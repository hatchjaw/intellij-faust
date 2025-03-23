// This is a generated file. Not intended for manual editing.
package com.github.hatchjaw.faust.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.hatchjaw.faust.psi.impl.*;

public interface FaustTypes {

  IElementType ABSTRACTION = new FaustElementType("ABSTRACTION");
  IElementType ACCESS = new FaustElementType("ACCESS");
  IElementType ARGUMENT_SEQ = new FaustElementType("ARGUMENT_SEQ");
  IElementType ARG_TYPE = new FaustElementType("ARG_TYPE");
  IElementType ARG_TYPES = new FaustElementType("ARG_TYPES");
  IElementType ATTACH_EXPR = new FaustElementType("ATTACH_EXPR");
  IElementType BITWISE = new FaustElementType("BITWISE");
  IElementType COMPARATOR = new FaustElementType("COMPARATOR");
  IElementType COMPONENT_EXPR = new FaustElementType("COMPONENT_EXPR");
  IElementType COMPOSITION = new FaustElementType("COMPOSITION");
  IElementType CUT = new FaustElementType("CUT");
  IElementType DECLARATION = new FaustElementType("DECLARATION");
  IElementType DEFINITION = new FaustElementType("DEFINITION");
  IElementType DELAY = new FaustElementType("DELAY");
  IElementType DELAY_1 = new FaustElementType("DELAY_1");
  IElementType DIAG_COMPOSITION = new FaustElementType("DIAG_COMPOSITION");
  IElementType DIAG_ITERATION = new FaustElementType("DIAG_ITERATION");
  IElementType DIFF_EQUATION = new FaustElementType("DIFF_EQUATION");
  IElementType DOCUMENTATION = new FaustElementType("DOCUMENTATION");
  IElementType ENVIRONMENT_EXPR = new FaustElementType("ENVIRONMENT_EXPR");
  IElementType FILE_IMPORT = new FaustElementType("FILE_IMPORT");
  IElementType FOREIGN_FUNCTION = new FaustElementType("FOREIGN_FUNCTION");
  IElementType FUNCTION_CALL = new FaustElementType("FUNCTION_CALL");
  IElementType FUNCTION_DEFINITION = new FaustElementType("FUNCTION_DEFINITION");
  IElementType FUN_NAMES = new FaustElementType("FUN_NAMES");
  IElementType INFIX = new FaustElementType("INFIX");
  IElementType LAMBDA_ABSTRACTION = new FaustElementType("LAMBDA_ABSTRACTION");
  IElementType LETREC_EXPRESSION = new FaustElementType("LETREC_EXPRESSION");
  IElementType LIBRARY_EXPR = new FaustElementType("LIBRARY_EXPR");
  IElementType MATH = new FaustElementType("MATH");
  IElementType NUM_ITER = new FaustElementType("NUM_ITER");
  IElementType OPERAND = new FaustElementType("OPERAND");
  IElementType PARAMETER_SEQ = new FaustElementType("PARAMETER_SEQ");
  IElementType PARTIAL = new FaustElementType("PARTIAL");
  IElementType PATTERN_ABSTRACTION = new FaustElementType("PATTERN_ABSTRACTION");
  IElementType PREFIX = new FaustElementType("PREFIX");
  IElementType PROG_EXP = new FaustElementType("PROG_EXP");
  IElementType ROUTE_EXPR = new FaustElementType("ROUTE_EXPR");
  IElementType RULE = new FaustElementType("RULE");
  IElementType SIGNATURE = new FaustElementType("SIGNATURE");
  IElementType TYPE = new FaustElementType("TYPE");
  IElementType TYPE_CAST = new FaustElementType("TYPE_CAST");
  IElementType UI_ELEMENT = new FaustElementType("UI_ELEMENT");
  IElementType UI_ELEMENT_BUTTON = new FaustElementType("UI_ELEMENT_BUTTON");
  IElementType UI_ELEMENT_GRAPH = new FaustElementType("UI_ELEMENT_GRAPH");
  IElementType UI_ELEMENT_GROUP = new FaustElementType("UI_ELEMENT_GROUP");
  IElementType UI_ELEMENT_SLIDER = new FaustElementType("UI_ELEMENT_SLIDER");
  IElementType VARIANT = new FaustElementType("VARIANT");
  IElementType WAVEFORM_EXPR = new FaustElementType("WAVEFORM_EXPR");
  IElementType WITH_EXPRESSION = new FaustElementType("WITH_EXPRESSION");

  IElementType ANY = new FaustTokenType("any");
  IElementType ATTACH = new FaustTokenType("attach");
  IElementType AUTHOR = new FaustTokenType("author");
  IElementType BIT_AND = new FaustTokenType("&");
  IElementType BIT_LSHIFT = new FaustTokenType("<<");
  IElementType BIT_OR = new FaustTokenType("|");
  IElementType BIT_RSHIFT = new FaustTokenType(">>");
  IElementType BIT_XOR = new FaustTokenType("xor");
  IElementType BUTTON = new FaustTokenType("button");
  IElementType CASE = new FaustTokenType("case");
  IElementType CHECKBOX = new FaustTokenType("checkbox");
  IElementType CINCLUDE = new FaustTokenType("CINCLUDE");
  IElementType COMPARE_EQ = new FaustTokenType("==");
  IElementType COMPARE_GEQ = new FaustTokenType(">=");
  IElementType COMPARE_LEQ = new FaustTokenType("<=");
  IElementType COMPARE_LESS = new FaustTokenType("<");
  IElementType COMPARE_MORE = new FaustTokenType(">");
  IElementType COMPARE_NEQ = new FaustTokenType("!=");
  IElementType COMPONENT = new FaustTokenType("component");
  IElementType COMPOSE_MERGE = new FaustTokenType(":>");
  IElementType COMPOSE_PAR = new FaustTokenType(",");
  IElementType COMPOSE_REC = new FaustTokenType("~");
  IElementType COMPOSE_SEQ = new FaustTokenType(":");
  IElementType COMPOSE_SPLIT = new FaustTokenType("<:");
  IElementType COPYRIGHT = new FaustTokenType("copyright");
  IElementType DECLARE = new FaustTokenType("declare");
  IElementType DEPENDENCIES = new FaustTokenType("dependencies");
  IElementType DESCRIPTION = new FaustTokenType("description");
  IElementType DISTRIBUTED = new FaustTokenType("distributed");
  IElementType DOUBLEPRECISION = new FaustTokenType("doubleprecision");
  IElementType DSPFILE = new FaustTokenType("DSPFILE");
  IElementType ENVIRONMENT = new FaustTokenType("environment");
  IElementType EXPLICITSUBST = new FaustTokenType("ExplicitSubst");
  IElementType FFUNCTION = new FaustTokenType("ffunction");
  IElementType FIXEDPOINTPRECISION = new FaustTokenType("fixedpointprecision");
  IElementType FLOAT = new FaustTokenType("float");
  IElementType FREETEXT = new FaustTokenType("FreeText");
  IElementType HBARGRAPH = new FaustTokenType("hbargraph");
  IElementType HGROUP = new FaustTokenType("hgroup");
  IElementType HSLIDER = new FaustTokenType("hslider");
  IElementType IDENTIFIER = new FaustTokenType("IDENTIFIER");
  IElementType IMPORT = new FaustTokenType("import");
  IElementType INT = new FaustTokenType("int");
  IElementType KEYWORD = new FaustTokenType("Keyword");
  IElementType LETREC = new FaustTokenType("letrec");
  IElementType LIBFILE = new FaustTokenType("LIBFILE");
  IElementType LIBRARY = new FaustTokenType("library");
  IElementType LICENCE = new FaustTokenType("licence");
  IElementType LICENSE = new FaustTokenType("license");
  IElementType LINE_COMMENT = new FaustTokenType("LINE_COMMENT");
  IElementType MATH_ADD = new FaustTokenType("+");
  IElementType MATH_DIV = new FaustTokenType("/");
  IElementType MATH_MUL = new FaustTokenType("*");
  IElementType MATH_POW = new FaustTokenType("^");
  IElementType MATH_REM = new FaustTokenType("%");
  IElementType MATH_SUB = new FaustTokenType("-");
  IElementType MDOCTAGS = new FaustTokenType("mdoctags");
  IElementType MEM = new FaustTokenType("MEM");
  IElementType NAME = new FaustTokenType("name");
  IElementType NENTRY = new FaustTokenType("nentry");
  IElementType NUMBER = new FaustTokenType("NUMBER");
  IElementType PAR = new FaustTokenType("par");
  IElementType PROD = new FaustTokenType("prod");
  IElementType QUADPRECISION = new FaustTokenType("quadprecision");
  IElementType ROUTE = new FaustTokenType("route");
  IElementType SEQ = new FaustTokenType("seq");
  IElementType SIG_CUT = new FaustTokenType("!");
  IElementType SIG_IDENTITY = new FaustTokenType("_");
  IElementType SINGLEPRECISION = new FaustTokenType("singleprecision");
  IElementType STRING = new FaustTokenType("STRING");
  IElementType SUM = new FaustTokenType("sum");
  IElementType TGROUP = new FaustTokenType("tgroup");
  IElementType TIME_DELAY = new FaustTokenType("@");
  IElementType TIME_DELAY1 = new FaustTokenType("'");
  IElementType TIME_MEM = new FaustTokenType("mem");
  IElementType VBARGRAPH = new FaustTokenType("vbargraph");
  IElementType VERSION = new FaustTokenType("version");
  IElementType VGROUP = new FaustTokenType("vgroup");
  IElementType VSLIDER = new FaustTokenType("vslider");
  IElementType WAVEFORM = new FaustTokenType("waveform");
  IElementType WHERE = new FaustTokenType("where");
  IElementType WITH = new FaustTokenType("with");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ABSTRACTION) {
        return new FaustAbstractionImpl(node);
      }
      else if (type == ACCESS) {
        return new FaustAccessImpl(node);
      }
      else if (type == ARGUMENT_SEQ) {
        return new FaustArgumentSeqImpl(node);
      }
      else if (type == ARG_TYPE) {
        return new FaustArgTypeImpl(node);
      }
      else if (type == ARG_TYPES) {
        return new FaustArgTypesImpl(node);
      }
      else if (type == ATTACH_EXPR) {
        return new FaustAttachExprImpl(node);
      }
      else if (type == BITWISE) {
        return new FaustBitwiseImpl(node);
      }
      else if (type == COMPARATOR) {
        return new FaustComparatorImpl(node);
      }
      else if (type == COMPONENT_EXPR) {
        return new FaustComponentExprImpl(node);
      }
      else if (type == COMPOSITION) {
        return new FaustCompositionImpl(node);
      }
      else if (type == CUT) {
        return new FaustCutImpl(node);
      }
      else if (type == DECLARATION) {
        return new FaustDeclarationImpl(node);
      }
      else if (type == DEFINITION) {
        return new FaustDefinitionImpl(node);
      }
      else if (type == DELAY) {
        return new FaustDelayImpl(node);
      }
      else if (type == DELAY_1) {
        return new FaustDelay1Impl(node);
      }
      else if (type == DIAG_COMPOSITION) {
        return new FaustDiagCompositionImpl(node);
      }
      else if (type == DIAG_ITERATION) {
        return new FaustDiagIterationImpl(node);
      }
      else if (type == DIFF_EQUATION) {
        return new FaustDiffEquationImpl(node);
      }
      else if (type == DOCUMENTATION) {
        return new FaustDocumentationImpl(node);
      }
      else if (type == ENVIRONMENT_EXPR) {
        return new FaustEnvironmentExprImpl(node);
      }
      else if (type == FILE_IMPORT) {
        return new FaustFileImportImpl(node);
      }
      else if (type == FOREIGN_FUNCTION) {
        return new FaustForeignFunctionImpl(node);
      }
      else if (type == FUNCTION_CALL) {
        return new FaustFunctionCallImpl(node);
      }
      else if (type == FUNCTION_DEFINITION) {
        return new FaustFunctionDefinitionImpl(node);
      }
      else if (type == FUN_NAMES) {
        return new FaustFunNamesImpl(node);
      }
      else if (type == INFIX) {
        return new FaustInfixImpl(node);
      }
      else if (type == LAMBDA_ABSTRACTION) {
        return new FaustLambdaAbstractionImpl(node);
      }
      else if (type == LETREC_EXPRESSION) {
        return new FaustLetrecExpressionImpl(node);
      }
      else if (type == LIBRARY_EXPR) {
        return new FaustLibraryExprImpl(node);
      }
      else if (type == MATH) {
        return new FaustMathImpl(node);
      }
      else if (type == NUM_ITER) {
        return new FaustNumIterImpl(node);
      }
      else if (type == OPERAND) {
        return new FaustOperandImpl(node);
      }
      else if (type == PARAMETER_SEQ) {
        return new FaustParameterSeqImpl(node);
      }
      else if (type == PARTIAL) {
        return new FaustPartialImpl(node);
      }
      else if (type == PATTERN_ABSTRACTION) {
        return new FaustPatternAbstractionImpl(node);
      }
      else if (type == PREFIX) {
        return new FaustPrefixImpl(node);
      }
      else if (type == PROG_EXP) {
        return new FaustProgExpImpl(node);
      }
      else if (type == ROUTE_EXPR) {
        return new FaustRouteExprImpl(node);
      }
      else if (type == RULE) {
        return new FaustRuleImpl(node);
      }
      else if (type == SIGNATURE) {
        return new FaustSignatureImpl(node);
      }
      else if (type == TYPE) {
        return new FaustTypeImpl(node);
      }
      else if (type == TYPE_CAST) {
        return new FaustTypeCastImpl(node);
      }
      else if (type == UI_ELEMENT) {
        return new FaustUIElementImpl(node);
      }
      else if (type == UI_ELEMENT_BUTTON) {
        return new FaustUIElementButtonImpl(node);
      }
      else if (type == UI_ELEMENT_GRAPH) {
        return new FaustUIElementGraphImpl(node);
      }
      else if (type == UI_ELEMENT_GROUP) {
        return new FaustUIElementGroupImpl(node);
      }
      else if (type == UI_ELEMENT_SLIDER) {
        return new FaustUIElementSliderImpl(node);
      }
      else if (type == VARIANT) {
        return new FaustVariantImpl(node);
      }
      else if (type == WAVEFORM_EXPR) {
        return new FaustWaveformExprImpl(node);
      }
      else if (type == WITH_EXPRESSION) {
        return new FaustWithExpressionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
