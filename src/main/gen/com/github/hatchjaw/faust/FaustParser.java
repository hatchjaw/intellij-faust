// This is a generated file. Not intended for manual editing.
package com.github.hatchjaw.faust;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.hatchjaw.faust.psi.FaustTypes.*;
//import static com.github.hatchjaw.faust.FaustParserUtil.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class FaustParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return Program(b, l + 1);
  }

  /* ********************************************************** */
  // LambdaAbstraction | PatternAbstraction
  public static boolean Abstraction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Abstraction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ABSTRACTION, "<abstraction>");
    r = LambdaAbstraction(b, l + 1);
    if (!r) r = PatternAbstraction(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ('.' (FunctionCall | IDENTIFIER))*
  public static boolean Access(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Access")) return false;
    Marker m = enter_section_(b, l, _NONE_, ACCESS, "<access>");
    while (true) {
      int c = current_position_(b);
      if (!Access_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Access", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // '.' (FunctionCall | IDENTIFIER)
  private static boolean Access_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Access_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".");
    r = r && Access_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // FunctionCall | IDENTIFIER
  private static boolean Access_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Access_0_1")) return false;
    boolean r;
    r = FunctionCall(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    return r;
  }

  /* ********************************************************** */
  // Type | any
  public static boolean ArgType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARG_TYPE, "<arg type>");
    r = Type(b, l + 1);
    if (!r) r = consumeToken(b, ANY);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ArgType [',' ArgTypes]
  public static boolean ArgTypes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgTypes")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARG_TYPES, "<arg types>");
    r = ArgType(b, l + 1);
    r = r && ArgTypes_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [',' ArgTypes]
  private static boolean ArgTypes_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgTypes_1")) return false;
    ArgTypes_1_0(b, l + 1);
    return true;
  }

  // ',' ArgTypes
  private static boolean ArgTypes_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgTypes_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMPOSE_PAR);
    r = r && ArgTypes(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression [ ',' ArgumentSeq ]
  public static boolean ArgumentSeq(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgumentSeq")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, ARGUMENT_SEQ, "<argument seq>");
    r = Expression(b, l + 1);
    r = r && ArgumentSeq_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ ',' ArgumentSeq ]
  private static boolean ArgumentSeq_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgumentSeq_1")) return false;
    ArgumentSeq_1_0(b, l + 1);
    return true;
  }

  // ',' ArgumentSeq
  private static boolean ArgumentSeq_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgumentSeq_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMPOSE_PAR);
    r = r && ArgumentSeq(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // attach '(' Expression ',' Expression ')'
  public static boolean AttachExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttachExpr")) return false;
    if (!nextTokenIs(b, ATTACH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ATTACH);
    r = r && consumeToken(b, "(");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, COMPOSE_PAR);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, ATTACH_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // BIT_AND
  //     | BIT_OR
  //     | BIT_XOR
  //     | BIT_LSHIFT
  //     | BIT_RSHIFT
  public static boolean Bitwise(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Bitwise")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BITWISE, "<bitwise>");
    r = consumeToken(b, BIT_AND);
    if (!r) r = consumeToken(b, BIT_OR);
    if (!r) r = consumeToken(b, BIT_XOR);
    if (!r) r = consumeToken(b, BIT_LSHIFT);
    if (!r) r = consumeToken(b, BIT_RSHIFT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // COMPARE_LESS
  //     | COMPARE_LEQ
  //     | COMPARE_MORE
  //     | COMPARE_GEQ
  //     | COMPARE_EQ
  //     | COMPARE_NEQ
  public static boolean Comparator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Comparator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPARATOR, "<comparator>");
    r = consumeToken(b, COMPARE_LESS);
    if (!r) r = consumeToken(b, COMPARE_LEQ);
    if (!r) r = consumeToken(b, COMPARE_MORE);
    if (!r) r = consumeToken(b, COMPARE_GEQ);
    if (!r) r = consumeToken(b, COMPARE_EQ);
    if (!r) r = consumeToken(b, COMPARE_NEQ);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // component '(' DSPFILE ')'
  public static boolean ComponentExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComponentExpr")) return false;
    if (!nextTokenIs(b, COMPONENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMPONENT);
    r = r && consumeToken(b, "(");
    r = r && consumeToken(b, DSPFILE);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, COMPONENT_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // COMPOSE_REC
  //     | COMPOSE_PAR
  //     | COMPOSE_SEQ
  //     | COMPOSE_MERGE
  //     | COMPOSE_SPLIT
  public static boolean Composition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Composition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPOSITION, "<composition>");
    r = consumeToken(b, COMPOSE_REC);
    if (!r) r = consumeToken(b, COMPOSE_PAR);
    if (!r) r = consumeToken(b, COMPOSE_SEQ);
    if (!r) r = consumeToken(b, COMPOSE_MERGE);
    if (!r) r = consumeToken(b, COMPOSE_SPLIT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SIG_CUT
  public static boolean Cut(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Cut")) return false;
    if (!nextTokenIs(b, SIG_CUT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SIG_CUT);
    exit_section_(b, m, CUT, r);
    return r;
  }

  /* ********************************************************** */
  // declare [IDENTIFIER] (name|author|copyright|version|license|licence|description) STRING
  public static boolean Declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declaration")) return false;
    if (!nextTokenIs(b, DECLARE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DECLARE);
    r = r && Declaration_1(b, l + 1);
    r = r && Declaration_2(b, l + 1);
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, DECLARATION, r);
    return r;
  }

  // [IDENTIFIER]
  private static boolean Declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declaration_1")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  // name|author|copyright|version|license|licence|description
  private static boolean Declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Declaration_2")) return false;
    boolean r;
    r = consumeToken(b, NAME);
    if (!r) r = consumeToken(b, AUTHOR);
    if (!r) r = consumeToken(b, COPYRIGHT);
    if (!r) r = consumeToken(b, VERSION);
    if (!r) r = consumeToken(b, LICENSE);
    if (!r) r = consumeToken(b, LICENCE);
    if (!r) r = consumeToken(b, DESCRIPTION);
    return r;
  }

  /* ********************************************************** */
  // [Variant*] IDENTIFIER '=' Expression
  public static boolean Definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFINITION, "<definition>");
    r = Definition_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "=");
    r = r && Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [Variant*]
  private static boolean Definition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definition_0")) return false;
    Definition_0_0(b, l + 1);
    return true;
  }

  // Variant*
  private static boolean Definition_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definition_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Variant(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Definition_0_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // TIME_DELAY | MEM
  public static boolean Delay(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Delay")) return false;
    if (!nextTokenIs(b, "<delay>", MEM, TIME_DELAY)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DELAY, "<delay>");
    r = consumeToken(b, TIME_DELAY);
    if (!r) r = consumeToken(b, MEM);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TIME_DELAY1
  public static boolean Delay1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Delay1")) return false;
    if (!nextTokenIs(b, TIME_DELAY1)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TIME_DELAY1);
    exit_section_(b, m, DELAY_1, r);
    return r;
  }

  /* ********************************************************** */
  // ( DiagCompositionImpl | '(' DiagCompositionImpl ')' ) ( WithExpression | LetrecExpression )*
  public static boolean DiagComposition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DiagComposition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, DIAG_COMPOSITION, "<diag composition>");
    r = DiagComposition_0(b, l + 1);
    r = r && DiagComposition_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // DiagCompositionImpl | '(' DiagCompositionImpl ')'
  private static boolean DiagComposition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DiagComposition_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DiagCompositionImpl(b, l + 1);
    if (!r) r = DiagComposition_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' DiagCompositionImpl ')'
  private static boolean DiagComposition_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DiagComposition_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && DiagCompositionImpl(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( WithExpression | LetrecExpression )*
  private static boolean DiagComposition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DiagComposition_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DiagComposition_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DiagComposition_1", c)) break;
    }
    return true;
  }

  // WithExpression | LetrecExpression
  private static boolean DiagComposition_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DiagComposition_1_0")) return false;
    boolean r;
    r = WithExpression(b, l + 1);
    if (!r) r = LetrecExpression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ExpressionElement [ Composition DiagComposition ]
  static boolean DiagCompositionImpl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DiagCompositionImpl")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExpressionElement(b, l + 1);
    r = r && DiagCompositionImpl_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ Composition DiagComposition ]
  private static boolean DiagCompositionImpl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DiagCompositionImpl_1")) return false;
    DiagCompositionImpl_1_0(b, l + 1);
    return true;
  }

  // Composition DiagComposition
  private static boolean DiagCompositionImpl_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DiagCompositionImpl_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Composition(b, l + 1);
    r = r && DiagComposition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (par|seq|sum|prod) '(' IDENTIFIER ',' NumIter ',' DiagramExp ')'
  public static boolean DiagIteration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DiagIteration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DIAG_ITERATION, "<diag iteration>");
    r = DiagIteration_0(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && consumeTokens(b, 0, IDENTIFIER, COMPOSE_PAR);
    r = r && NumIter(b, l + 1);
    r = r && consumeToken(b, COMPOSE_PAR);
    r = r && DiagramExp(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // par|seq|sum|prod
  private static boolean DiagIteration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DiagIteration_0")) return false;
    boolean r;
    r = consumeToken(b, PAR);
    if (!r) r = consumeToken(b, SEQ);
    if (!r) r = consumeToken(b, SUM);
    if (!r) r = consumeToken(b, PROD);
    return r;
  }

  /* ********************************************************** */
  // '<diagram>' Expression '</diagram>'
  static boolean Diagram(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Diagram")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "<diagram>");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, "</diagram>");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DiagComposition | DiagIteration
  static boolean DiagramExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DiagramExp")) return false;
    boolean r;
    r = DiagComposition(b, l + 1);
    if (!r) r = DiagIteration(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // "'" IDENTIFIER '=' Expression ';'
  public static boolean DiffEquation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DiffEquation")) return false;
    if (!nextTokenIs(b, TIME_DELAY1)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TIME_DELAY1, IDENTIFIER);
    r = r && consumeToken(b, "=");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, DIFF_EQUATION, r);
    return r;
  }

  /* ********************************************************** */
  // '<mdoc>' (FreeText | Equation | Diagram | Metadata | Notice | Listing)* '</mdoc>'
  public static boolean Documentation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Documentation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DOCUMENTATION, "<documentation>");
    r = consumeToken(b, "<mdoc>");
    r = r && Documentation_1(b, l + 1);
    r = r && consumeToken(b, "</mdoc>");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (FreeText | Equation | Diagram | Metadata | Notice | Listing)*
  private static boolean Documentation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Documentation_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Documentation_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Documentation_1", c)) break;
    }
    return true;
  }

  // FreeText | Equation | Diagram | Metadata | Notice | Listing
  private static boolean Documentation_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Documentation_1_0")) return false;
    boolean r;
    r = consumeToken(b, FREETEXT);
    if (!r) r = Equation(b, l + 1);
    if (!r) r = Diagram(b, l + 1);
    if (!r) r = Metadata(b, l + 1);
    if (!r) r = Notice(b, l + 1);
    if (!r) r = Listing(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // EnvironmentExpr [Access]
  //     | LibraryExpr
  //     | ComponentExpr
  //     | ExplicitSubst
  static boolean EnvExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnvExp")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EnvExp_0(b, l + 1);
    if (!r) r = LibraryExpr(b, l + 1);
    if (!r) r = ComponentExpr(b, l + 1);
    if (!r) r = consumeToken(b, EXPLICITSUBST);
    exit_section_(b, m, null, r);
    return r;
  }

  // EnvironmentExpr [Access]
  private static boolean EnvExp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnvExp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EnvironmentExpr(b, l + 1);
    r = r && EnvExp_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [Access]
  private static boolean EnvExp_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnvExp_0_1")) return false;
    Access(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // environment '{' ((Definition | FunctionDefinition) ';')* '}'
  public static boolean EnvironmentExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnvironmentExpr")) return false;
    if (!nextTokenIs(b, ENVIRONMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENVIRONMENT);
    r = r && consumeToken(b, "{");
    r = r && EnvironmentExpr_2(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, ENVIRONMENT_EXPR, r);
    return r;
  }

  // ((Definition | FunctionDefinition) ';')*
  private static boolean EnvironmentExpr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnvironmentExpr_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!EnvironmentExpr_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EnvironmentExpr_2", c)) break;
    }
    return true;
  }

  // (Definition | FunctionDefinition) ';'
  private static boolean EnvironmentExpr_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnvironmentExpr_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EnvironmentExpr_2_0_0(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // Definition | FunctionDefinition
  private static boolean EnvironmentExpr_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnvironmentExpr_2_0_0")) return false;
    boolean r;
    r = Definition(b, l + 1);
    if (!r) r = FunctionDefinition(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '<equation>' Expression '</equation>'
  static boolean Equation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Equation")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "<equation>");
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, "</equation>");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EnvExp
  //     | DiagramExp
  //     | NUMBER
  //     | Operator
  static boolean Expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    boolean r;
    r = EnvExp(b, l + 1);
    if (!r) r = DiagramExp(b, l + 1);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = Operator(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // DiagIteration
  //     | ForeignExpression
  //     | ProgExp
  //     | Infix
  //     | Prefix
  //     | Partial
  //     | Operand
  //     | FunctionCall [Access]
  //     | TypeCast
  //     | Operator Operator*
  //     | Primitive
  static boolean ExpressionElement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionElement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DiagIteration(b, l + 1);
    if (!r) r = ForeignExpression(b, l + 1);
    if (!r) r = ProgExp(b, l + 1);
    if (!r) r = Infix(b, l + 1);
    if (!r) r = Prefix(b, l + 1);
    if (!r) r = Partial(b, l + 1);
    if (!r) r = Operand(b, l + 1);
    if (!r) r = ExpressionElement_7(b, l + 1);
    if (!r) r = TypeCast(b, l + 1);
    if (!r) r = ExpressionElement_9(b, l + 1);
    if (!r) r = Primitive(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // FunctionCall [Access]
  private static boolean ExpressionElement_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionElement_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionCall(b, l + 1);
    r = r && ExpressionElement_7_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [Access]
  private static boolean ExpressionElement_7_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionElement_7_1")) return false;
    Access(b, l + 1);
    return true;
  }

  // Operator Operator*
  private static boolean ExpressionElement_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionElement_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Operator(b, l + 1);
    r = r && ExpressionElement_9_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Operator*
  private static boolean ExpressionElement_9_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpressionElement_9_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Operator(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ExpressionElement_9_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // [Variant*] import '(' LIBFILE ')'
  public static boolean FileImport(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FileImport")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FILE_IMPORT, "<file import>");
    r = FileImport_0(b, l + 1);
    r = r && consumeToken(b, IMPORT);
    r = r && consumeToken(b, "(");
    r = r && consumeToken(b, LIBFILE);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [Variant*]
  private static boolean FileImport_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FileImport_0")) return false;
    FileImport_0_0(b, l + 1);
    return true;
  }

  // Variant*
  private static boolean FileImport_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FileImport_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Variant(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FileImport_0_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ForeignFunction
  static boolean ForeignExpression(PsiBuilder b, int l) {
    return ForeignFunction(b, l + 1);
  }

  /* ********************************************************** */
  // ffunction '(' Signature ',' CINCLUDE ',' ('""' | LIBFILE) ')'
  public static boolean ForeignFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeignFunction")) return false;
    if (!nextTokenIs(b, FFUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FFUNCTION);
    r = r && consumeToken(b, "(");
    r = r && Signature(b, l + 1);
    r = r && consumeTokens(b, 0, COMPOSE_PAR, CINCLUDE, COMPOSE_PAR);
    r = r && ForeignFunction_6(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, FOREIGN_FUNCTION, r);
    return r;
  }

  // '""' | LIBFILE
  private static boolean ForeignFunction_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeignFunction_6")) return false;
    boolean r;
    r = consumeToken(b, "\"\"");
    if (!r) r = consumeToken(b, LIBFILE);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER [ '|' FunNames]
  public static boolean FunNames(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunNames")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && FunNames_1(b, l + 1);
    exit_section_(b, m, FUN_NAMES, r);
    return r;
  }

  // [ '|' FunNames]
  private static boolean FunNames_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunNames_1")) return false;
    FunNames_1_0(b, l + 1);
    return true;
  }

  // '|' FunNames
  private static boolean FunNames_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunNames_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BIT_OR);
    r = r && FunNames(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER '(' ArgumentSeq ')'
  public static boolean FunctionCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCall")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "(");
    r = r && ArgumentSeq(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, FUNCTION_CALL, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER '(' ParameterSeq ')' '=' Expression
  public static boolean FunctionDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "(");
    r = r && ParameterSeq(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && consumeToken(b, "=");
    r = r && Expression(b, l + 1);
    exit_section_(b, m, FUNCTION_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // (Operand | Operator) Operator ((Infix | Partial) | '(' Infix ')') | Operand
  public static boolean Infix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Infix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, INFIX, "<infix>");
    r = Infix_0(b, l + 1);
    if (!r) r = Operand(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (Operand | Operator) Operator ((Infix | Partial) | '(' Infix ')')
  private static boolean Infix_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Infix_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Infix_0_0(b, l + 1);
    r = r && Operator(b, l + 1);
    r = r && Infix_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Operand | Operator
  private static boolean Infix_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Infix_0_0")) return false;
    boolean r;
    r = Operand(b, l + 1);
    if (!r) r = Operator(b, l + 1);
    return r;
  }

  // (Infix | Partial) | '(' Infix ')'
  private static boolean Infix_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Infix_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Infix_0_2_0(b, l + 1);
    if (!r) r = Infix_0_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Infix | Partial
  private static boolean Infix_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Infix_0_2_0")) return false;
    boolean r;
    r = Infix(b, l + 1);
    if (!r) r = Partial(b, l + 1);
    return r;
  }

  // '(' Infix ')'
  private static boolean Infix_0_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Infix_0_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && Infix(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '\' '(' ParameterSeq ')' '.' '(' DiagComposition ')'
  public static boolean LambdaAbstraction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaAbstraction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LAMBDA_ABSTRACTION, "<lambda abstraction>");
    r = consumeToken(b, "\\");
    r = r && consumeToken(b, "(");
    r = r && ParameterSeq(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && consumeToken(b, ".");
    r = r && consumeToken(b, "(");
    r = r && DiagComposition(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // letrec '{' DiffEquation* [where Definition*] '}'
  public static boolean LetrecExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetrecExpression")) return false;
    if (!nextTokenIs(b, LETREC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LETREC);
    r = r && consumeToken(b, "{");
    r = r && LetrecExpression_2(b, l + 1);
    r = r && LetrecExpression_3(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, LETREC_EXPRESSION, r);
    return r;
  }

  // DiffEquation*
  private static boolean LetrecExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetrecExpression_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DiffEquation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LetrecExpression_2", c)) break;
    }
    return true;
  }

  // [where Definition*]
  private static boolean LetrecExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetrecExpression_3")) return false;
    LetrecExpression_3_0(b, l + 1);
    return true;
  }

  // where Definition*
  private static boolean LetrecExpression_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetrecExpression_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHERE);
    r = r && LetrecExpression_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Definition*
  private static boolean LetrecExpression_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetrecExpression_3_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Definition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LetrecExpression_3_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // library '(' LIBFILE ')'
  public static boolean LibraryExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LibraryExpr")) return false;
    if (!nextTokenIs(b, LIBRARY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LIBRARY);
    r = r && consumeToken(b, "(");
    r = r && consumeToken(b, LIBFILE);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, LIBRARY_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // '<listing' ListingAttribute* '/>'
  static boolean Listing(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Listing")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "<listing");
    r = r && Listing_1(b, l + 1);
    r = r && consumeToken(b, "/>");
    exit_section_(b, m, null, r);
    return r;
  }

  // ListingAttribute*
  private static boolean Listing_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Listing_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ListingAttribute(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Listing_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // mdoctags|dependencies|distributed '=' ('"true"'|'"false"')
  static boolean ListingAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListingAttribute")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MDOCTAGS);
    if (!r) r = consumeToken(b, DEPENDENCIES);
    if (!r) r = ListingAttribute_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // distributed '=' ('"true"'|'"false"')
  private static boolean ListingAttribute_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListingAttribute_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DISTRIBUTED);
    r = r && consumeToken(b, "=");
    r = r && ListingAttribute_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '"true"'|'"false"'
  private static boolean ListingAttribute_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListingAttribute_2_2")) return false;
    boolean r;
    r = consumeToken(b, "\"true\"");
    if (!r) r = consumeToken(b, "\"false\"");
    return r;
  }

  /* ********************************************************** */
  // MATH_ADD
  //     | MATH_SUB
  //     | MATH_MUL
  //     | MATH_POW
  //     | MATH_DIV
  //     | MATH_REM
  public static boolean Math(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Math")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MATH, "<math>");
    r = consumeToken(b, MATH_ADD);
    if (!r) r = consumeToken(b, MATH_SUB);
    if (!r) r = consumeToken(b, MATH_MUL);
    if (!r) r = consumeToken(b, MATH_POW);
    if (!r) r = consumeToken(b, MATH_DIV);
    if (!r) r = consumeToken(b, MATH_REM);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '<metadata>' Keyword '</metadata>'
  static boolean Metadata(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Metadata")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "<metadata>");
    r = r && consumeToken(b, KEYWORD);
    r = r && consumeToken(b, "</metadata>");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '<notice />'
  static boolean Notice(PsiBuilder b, int l) {
    return consumeToken(b, "<notice />");
  }

  /* ********************************************************** */
  // Infix
  public static boolean NumIter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumIter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUM_ITER, "<num iter>");
    r = Infix(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OperandImpl [Delay1*]
  public static boolean Operand(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Operand")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERAND, "<operand>");
    r = OperandImpl(b, l + 1);
    r = r && Operand_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [Delay1*]
  private static boolean Operand_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Operand_1")) return false;
    Operand_1_0(b, l + 1);
    return true;
  }

  // Delay1*
  private static boolean Operand_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Operand_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Delay1(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Operand_1_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // [MATH_SUB] (FunctionCall [Access])
  //     | IDENTIFIER [Access]
  //     | [MATH_SUB] IDENTIFIER
  //     | [MATH_SUB | MATH_ADD] NUMBER
  //     | Partial
  //     | UIElement
  //     | SIG_IDENTITY
  //     | '(' DiagComposition ')'
  static boolean OperandImpl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperandImpl")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OperandImpl_0(b, l + 1);
    if (!r) r = OperandImpl_1(b, l + 1);
    if (!r) r = OperandImpl_2(b, l + 1);
    if (!r) r = OperandImpl_3(b, l + 1);
    if (!r) r = Partial(b, l + 1);
    if (!r) r = UIElement(b, l + 1);
    if (!r) r = consumeToken(b, SIG_IDENTITY);
    if (!r) r = OperandImpl_7(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [MATH_SUB] (FunctionCall [Access])
  private static boolean OperandImpl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperandImpl_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OperandImpl_0_0(b, l + 1);
    r = r && OperandImpl_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [MATH_SUB]
  private static boolean OperandImpl_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperandImpl_0_0")) return false;
    consumeToken(b, MATH_SUB);
    return true;
  }

  // FunctionCall [Access]
  private static boolean OperandImpl_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperandImpl_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionCall(b, l + 1);
    r = r && OperandImpl_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [Access]
  private static boolean OperandImpl_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperandImpl_0_1_1")) return false;
    Access(b, l + 1);
    return true;
  }

  // IDENTIFIER [Access]
  private static boolean OperandImpl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperandImpl_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && OperandImpl_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [Access]
  private static boolean OperandImpl_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperandImpl_1_1")) return false;
    Access(b, l + 1);
    return true;
  }

  // [MATH_SUB] IDENTIFIER
  private static boolean OperandImpl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperandImpl_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OperandImpl_2_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // [MATH_SUB]
  private static boolean OperandImpl_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperandImpl_2_0")) return false;
    consumeToken(b, MATH_SUB);
    return true;
  }

  // [MATH_SUB | MATH_ADD] NUMBER
  private static boolean OperandImpl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperandImpl_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OperandImpl_3_0(b, l + 1);
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  // [MATH_SUB | MATH_ADD]
  private static boolean OperandImpl_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperandImpl_3_0")) return false;
    OperandImpl_3_0_0(b, l + 1);
    return true;
  }

  // MATH_SUB | MATH_ADD
  private static boolean OperandImpl_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperandImpl_3_0_0")) return false;
    boolean r;
    r = consumeToken(b, MATH_SUB);
    if (!r) r = consumeToken(b, MATH_ADD);
    return r;
  }

  // '(' DiagComposition ')'
  private static boolean OperandImpl_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperandImpl_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && DiagComposition(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Cut
  //     | Math
  //     | Delay
  //     | Bitwise
  //     | Comparator
  static boolean Operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Operator")) return false;
    boolean r;
    r = Cut(b, l + 1);
    if (!r) r = Math(b, l + 1);
    if (!r) r = Delay(b, l + 1);
    if (!r) r = Bitwise(b, l + 1);
    if (!r) r = Comparator(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ParameterSeqImpl | '(' ParameterSeqImpl ')'
  public static boolean ParameterSeq(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterSeq")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, PARAMETER_SEQ, "<parameter seq>");
    r = ParameterSeqImpl(b, l + 1);
    if (!r) r = ParameterSeq_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' ParameterSeqImpl ')'
  private static boolean ParameterSeq_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterSeq_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && ParameterSeqImpl(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (IDENTIFIER|NUMBER) [ ',' ParameterSeq ]
  static boolean ParameterSeqImpl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterSeqImpl")) return false;
    if (!nextTokenIs(b, "", IDENTIFIER, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParameterSeqImpl_0(b, l + 1);
    r = r && ParameterSeqImpl_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER|NUMBER
  private static boolean ParameterSeqImpl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterSeqImpl_0")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  // [ ',' ParameterSeq ]
  private static boolean ParameterSeqImpl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterSeqImpl_1")) return false;
    ParameterSeqImpl_1_0(b, l + 1);
    return true;
  }

  // ',' ParameterSeq
  private static boolean ParameterSeqImpl_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterSeqImpl_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMPOSE_PAR);
    r = r && ParameterSeq(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (Operator | TypeCast) '(' DiagramExp ')'
  public static boolean Partial(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Partial")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARTIAL, "<partial>");
    r = Partial_0(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && DiagramExp(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Operator | TypeCast
  private static boolean Partial_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Partial_0")) return false;
    boolean r;
    r = Operator(b, l + 1);
    if (!r) r = TypeCast(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // case '{' Rule* '}'
  public static boolean PatternAbstraction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternAbstraction")) return false;
    if (!nextTokenIs(b, CASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CASE);
    r = r && consumeToken(b, "{");
    r = r && PatternAbstraction_2(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, PATTERN_ABSTRACTION, r);
    return r;
  }

  // Rule*
  private static boolean PatternAbstraction_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatternAbstraction_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Rule(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PatternAbstraction_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Operator '(' Operand ',' Operand ')'
  public static boolean Prefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Prefix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PREFIX, "<prefix>");
    r = Operator(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && Operand(b, l + 1);
    r = r && consumeToken(b, COMPOSE_PAR);
    r = r && Operand(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // RouteExpr
  //     | WaveformExpr
  static boolean Primitive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Primitive")) return false;
    if (!nextTokenIs(b, "", ROUTE, WAVEFORM)) return false;
    boolean r;
    r = RouteExpr(b, l + 1);
    if (!r) r = WaveformExpr(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // Abstraction
  public static boolean ProgExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProgExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROG_EXP, "<prog exp>");
    r = Abstraction(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Root*
  static boolean Program(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Program")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Root(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Program", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // !<<eof>> Statement
  static boolean Root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Root")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Root_0(b, l + 1);
    r = r && Statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<eof>>
  private static boolean Root_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Root_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !eof(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // route '(' ParameterSeq ')'
  public static boolean RouteExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RouteExpr")) return false;
    if (!nextTokenIs(b, ROUTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ROUTE);
    r = r && consumeToken(b, "(");
    r = r && ParameterSeq(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, ROUTE_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // '(' ParameterSeq ')' '=>' DiagComposition ';'
  public static boolean Rule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Rule")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RULE, "<rule>");
    r = consumeToken(b, "(");
    r = r && ParameterSeq(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && consumeToken(b, "=>");
    r = r && DiagComposition(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Type FunNames '(' [ArgTypes] ')'
  public static boolean Signature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Signature")) return false;
    if (!nextTokenIs(b, "<signature>", FLOAT, INT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGNATURE, "<signature>");
    r = Type(b, l + 1);
    r = r && FunNames(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && Signature_3(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ArgTypes]
  private static boolean Signature_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Signature_3")) return false;
    ArgTypes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ((FileImport | Declaration | Definition | FunctionDefinition) ';') | Documentation
  static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Statement_0(b, l + 1);
    if (!r) r = Documentation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (FileImport | Declaration | Definition | FunctionDefinition) ';'
  private static boolean Statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Statement_0_0(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // FileImport | Declaration | Definition | FunctionDefinition
  private static boolean Statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement_0_0")) return false;
    boolean r;
    r = FileImport(b, l + 1);
    if (!r) r = Declaration(b, l + 1);
    if (!r) r = Definition(b, l + 1);
    if (!r) r = FunctionDefinition(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // int | float
  public static boolean Type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type")) return false;
    if (!nextTokenIs(b, "<type>", FLOAT, INT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, FLOAT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // int | float
  public static boolean TypeCast(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeCast")) return false;
    if (!nextTokenIs(b, "<type cast>", FLOAT, INT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_CAST, "<type cast>");
    r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, FLOAT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // UIElementButton
  //     | UIElementSlider
  //     | UIElementGroup
  //     | UIElementGraph
  //     | AttachExpr
  public static boolean UIElement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UIElement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UI_ELEMENT, "<ui element>");
    r = UIElementButton(b, l + 1);
    if (!r) r = UIElementSlider(b, l + 1);
    if (!r) r = UIElementGroup(b, l + 1);
    if (!r) r = UIElementGraph(b, l + 1);
    if (!r) r = AttachExpr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (button | checkbox) '(' STRING ')'
  public static boolean UIElementButton(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UIElementButton")) return false;
    if (!nextTokenIs(b, "<ui element button>", BUTTON, CHECKBOX)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UI_ELEMENT_BUTTON, "<ui element button>");
    r = UIElementButton_0(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && consumeToken(b, STRING);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // button | checkbox
  private static boolean UIElementButton_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UIElementButton_0")) return false;
    boolean r;
    r = consumeToken(b, BUTTON);
    if (!r) r = consumeToken(b, CHECKBOX);
    return r;
  }

  /* ********************************************************** */
  // (hbargraph | vbargraph) '(' STRING ',' ArgumentSeq ')'
  public static boolean UIElementGraph(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UIElementGraph")) return false;
    if (!nextTokenIs(b, "<ui element graph>", HBARGRAPH, VBARGRAPH)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UI_ELEMENT_GRAPH, "<ui element graph>");
    r = UIElementGraph_0(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && consumeTokens(b, 0, STRING, COMPOSE_PAR);
    r = r && ArgumentSeq(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // hbargraph | vbargraph
  private static boolean UIElementGraph_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UIElementGraph_0")) return false;
    boolean r;
    r = consumeToken(b, HBARGRAPH);
    if (!r) r = consumeToken(b, VBARGRAPH);
    return r;
  }

  /* ********************************************************** */
  // (hgroup | vgroup | tgroup) '(' STRING ',' DiagComposition ')'
  public static boolean UIElementGroup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UIElementGroup")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UI_ELEMENT_GROUP, "<ui element group>");
    r = UIElementGroup_0(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && consumeTokens(b, 0, STRING, COMPOSE_PAR);
    r = r && DiagComposition(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // hgroup | vgroup | tgroup
  private static boolean UIElementGroup_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UIElementGroup_0")) return false;
    boolean r;
    r = consumeToken(b, HGROUP);
    if (!r) r = consumeToken(b, VGROUP);
    if (!r) r = consumeToken(b, TGROUP);
    return r;
  }

  /* ********************************************************** */
  // (hslider | vslider | nentry) '(' STRING ',' ArgumentSeq ')'
  public static boolean UIElementSlider(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UIElementSlider")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UI_ELEMENT_SLIDER, "<ui element slider>");
    r = UIElementSlider_0(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && consumeTokens(b, 0, STRING, COMPOSE_PAR);
    r = r && ArgumentSeq(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // hslider | vslider | nentry
  private static boolean UIElementSlider_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UIElementSlider_0")) return false;
    boolean r;
    r = consumeToken(b, HSLIDER);
    if (!r) r = consumeToken(b, VSLIDER);
    if (!r) r = consumeToken(b, NENTRY);
    return r;
  }

  /* ********************************************************** */
  // singleprecision | doubleprecision | quadprecision | fixedpointprecision
  public static boolean Variant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Variant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIANT, "<variant>");
    r = consumeToken(b, SINGLEPRECISION);
    if (!r) r = consumeToken(b, DOUBLEPRECISION);
    if (!r) r = consumeToken(b, QUADPRECISION);
    if (!r) r = consumeToken(b, FIXEDPOINTPRECISION);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // waveform '{' NUMBER (',' NUMBER)* '}'
  public static boolean WaveformExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WaveformExpr")) return false;
    if (!nextTokenIs(b, WAVEFORM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WAVEFORM);
    r = r && consumeToken(b, "{");
    r = r && consumeToken(b, NUMBER);
    r = r && WaveformExpr_3(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, WAVEFORM_EXPR, r);
    return r;
  }

  // (',' NUMBER)*
  private static boolean WaveformExpr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WaveformExpr_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!WaveformExpr_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "WaveformExpr_3", c)) break;
    }
    return true;
  }

  // ',' NUMBER
  private static boolean WaveformExpr_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WaveformExpr_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMPOSE_PAR, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // with '{' ((Definition | FunctionDefinition) ';')* '}'
  public static boolean WithExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WithExpression")) return false;
    if (!nextTokenIs(b, WITH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WITH);
    r = r && consumeToken(b, "{");
    r = r && WithExpression_2(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, WITH_EXPRESSION, r);
    return r;
  }

  // ((Definition | FunctionDefinition) ';')*
  private static boolean WithExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WithExpression_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!WithExpression_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "WithExpression_2", c)) break;
    }
    return true;
  }

  // (Definition | FunctionDefinition) ';'
  private static boolean WithExpression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WithExpression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = WithExpression_2_0_0(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // Definition | FunctionDefinition
  private static boolean WithExpression_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WithExpression_2_0_0")) return false;
    boolean r;
    r = Definition(b, l + 1);
    if (!r) r = FunctionDefinition(b, l + 1);
    return r;
  }

}
