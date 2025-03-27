// This is a generated file. Not intended for manual editing.
package com.github.hatchjaw.faust;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.hatchjaw.faust.psi.FaustTypes.*;
import static com.github.hatchjaw.faust.FaustParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class FaustParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, EXTENDS_SETS_);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    result_ = parse_root_(root_, builder_);
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_) {
    return parse_root_(root_, builder_, 0);
  }

  static boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return Program(builder_, level_ + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ARGUMENT, INFIX_ARG, MERGE_ARG, REC_ARG,
      SEQ_ARG, SPLIT_ARG),
    create_token_set_(EXPRESSION, INFIX_EXPR, LETREC_DEF_LIST_EXPR, LETREC_EXPR,
      MERGE_COMP, PARALLEL_COMP, RECURSIVE_COMP, SEQUENTIAL_COMP,
      SPLIT_COMP, WITH_EXPR),
    create_token_set_(ACCESS_IFX, ADD_IFX, AND_IFX, BRACK_IFX,
      DELAY_1_IFX, DELAY_IFX, DIV_IFX, EQ_IFX,
      GE_IFX, GT_IFX, INFIX, LE_IFX,
      LSH_IFX, LT_IFX, MOD_IFX, MUL_IFX,
      NE_IFX, OR_IFX, PAREN_IFX, POW_IFX,
      PRIMITIVE_IFX, RSH_IFX, SUB_IFX, XOR_IFX),
  };

  /* ********************************************************** */
  // (Argument PAR)* Argument
  public static boolean ArgList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArgList")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARG_LIST, "<arg list>");
    result_ = ArgList_0(builder_, level_ + 1);
    result_ = result_ && Argument(builder_, level_ + 1, -1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (Argument PAR)*
  private static boolean ArgList_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArgList_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!ArgList_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ArgList_0", pos_)) break;
    }
    return true;
  }

  // Argument PAR
  private static boolean ArgList_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArgList_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = Argument(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, PAR);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // DECLARE Name String ENDDEF
  //     | DECLARE Name Name String ENDDEF
  public static boolean Declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Declaration")) return false;
    if (!nextTokenIs(builder_, DECLARE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = Declaration_0(builder_, level_ + 1);
    if (!result_) result_ = Declaration_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, DECLARATION, result_);
    return result_;
  }

  // DECLARE Name String ENDDEF
  private static boolean Declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Declaration_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DECLARE);
    result_ = result_ && Name(builder_, level_ + 1);
    result_ = result_ && String(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ENDDEF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // DECLARE Name Name String ENDDEF
  private static boolean Declaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Declaration_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DECLARE);
    result_ = result_ && Name(builder_, level_ + 1);
    result_ = result_ && Name(builder_, level_ + 1);
    result_ = result_ && String(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ENDDEF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (VariantList Definition)*
  static boolean DefList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DefList")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!DefList_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "DefList", pos_)) break;
    }
    return true;
  }

  // VariantList Definition
  private static boolean DefList_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DefList_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = VariantList(builder_, level_ + 1);
    result_ = result_ && Definition(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // Ident
  public static boolean DefName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DefName")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = Ident(builder_, level_ + 1);
    exit_section_(builder_, marker_, DEF_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // DefName LPAREN ArgList RPAREN DEF Expression ENDDEF
  //     | DefName DEF Expression ENDDEF
  public static boolean Definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Definition")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = Definition_0(builder_, level_ + 1);
    if (!result_) result_ = Definition_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, DEFINITION, result_);
    return result_;
  }

  // DefName LPAREN ArgList RPAREN DEF Expression ENDDEF
  private static boolean Definition_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Definition_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = DefName(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LPAREN);
    result_ = result_ && ArgList(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, RPAREN, DEF);
    result_ = result_ && Expression(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, ENDDEF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // DefName DEF Expression ENDDEF
  private static boolean Definition_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Definition_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = DefName(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DEF);
    result_ = result_ && Expression(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, ENDDEF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ENVIRONMENT LBRACE StmtList RBRACE
  public static boolean EnvironmentConstruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EnvironmentConstruction")) return false;
    if (!nextTokenIs(builder_, ENVIRONMENT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, ENVIRONMENT, LBRACE);
    result_ = result_ && StmtList(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, ENVIRONMENT_CONSTRUCTION, result_);
    return result_;
  }

  /* ********************************************************** */
  // IMPORT LPAREN UqString RPAREN ENDDEF
  public static boolean FileImport(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FileImport")) return false;
    if (!nextTokenIs(builder_, IMPORT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IMPORT, LPAREN);
    result_ = result_ && UqString(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, RPAREN, ENDDEF);
    exit_section_(builder_, marker_, FILE_IMPORT, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean Ident(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Ident")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, IDENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // INS LPAREN Expression RPAREN
  public static boolean Inputs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Inputs")) return false;
    if (!nextTokenIs(builder_, INS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, INS, LPAREN);
    result_ = result_ && Expression(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, INPUTS, result_);
    return result_;
  }

  /* ********************************************************** */
  // IPAR LPAREN IDENTIFIER PAR Argument PAR Expression RPAREN
  public static boolean IterPar(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IterPar")) return false;
    if (!nextTokenIs(builder_, IPAR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IPAR, LPAREN, IDENTIFIER, PAR);
    result_ = result_ && Argument(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, PAR);
    result_ = result_ && Expression(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, ITER_PAR, result_);
    return result_;
  }

  /* ********************************************************** */
  // IPROD LPAREN IDENTIFIER PAR Argument PAR Expression RPAREN
  public static boolean IterProd(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IterProd")) return false;
    if (!nextTokenIs(builder_, IPROD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IPROD, LPAREN, IDENTIFIER, PAR);
    result_ = result_ && Argument(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, PAR);
    result_ = result_ && Expression(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, ITER_PROD, result_);
    return result_;
  }

  /* ********************************************************** */
  // ISEQ LPAREN IDENTIFIER PAR Argument PAR Expression RPAREN
  public static boolean IterSeq(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IterSeq")) return false;
    if (!nextTokenIs(builder_, ISEQ)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, ISEQ, LPAREN, IDENTIFIER, PAR);
    result_ = result_ && Argument(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, PAR);
    result_ = result_ && Expression(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, ITER_SEQ, result_);
    return result_;
  }

  /* ********************************************************** */
  // ISUM LPAREN IDENTIFIER PAR Argument PAR Expression RPAREN
  public static boolean IterSum(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IterSum")) return false;
    if (!nextTokenIs(builder_, ISUM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, ISUM, LPAREN, IDENTIFIER, PAR);
    result_ = result_ && Argument(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, PAR);
    result_ = result_ && Expression(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, ITER_SUM, result_);
    return result_;
  }

  /* ********************************************************** */
  // LAMBDA LPAREN Params RPAREN DOT LPAREN Expression RPAREN
  public static boolean LambdaAbstraction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LambdaAbstraction")) return false;
    if (!nextTokenIs(builder_, LAMBDA)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, LAMBDA, LPAREN);
    result_ = result_ && Params(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, RPAREN, DOT, LPAREN);
    result_ = result_ && Expression(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, LAMBDA_ABSTRACTION, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean Name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Name")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // OUTS LPAREN Expression RPAREN
  public static boolean Outputs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Outputs")) return false;
    if (!nextTokenIs(builder_, OUTS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, OUTS, LPAREN);
    result_ = result_ && Expression(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, OUTPUTS, result_);
    return result_;
  }

  /* ********************************************************** */
  // (IDENTIFIER PAR)* IDENTIFIER
  public static boolean Params(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Params")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = Params_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, PARAMS, result_);
    return result_;
  }

  // (IDENTIFIER PAR)*
  private static boolean Params_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Params_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!Params_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "Params_0", pos_)) break;
    }
    return true;
  }

  // IDENTIFIER PAR
  private static boolean Params_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Params_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, PAR);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // CASE LBRACE RuleList RBRACE
  public static boolean PatternAbstraction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PatternAbstraction")) return false;
    if (!nextTokenIs(builder_, CASE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, CASE, LBRACE);
    result_ = result_ && RuleList(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, PATTERN_ABSTRACTION, result_);
    return result_;
  }

  /* ********************************************************** */
  // !<<eof>> StmtList
  static boolean Program(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Program")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = Program_0(builder_, level_ + 1);
    result_ = result_ && StmtList(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !<<eof>>
  private static boolean Program_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Program_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !eof(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // RecName DEF Expression ENDDEF
  public static boolean RecDefinition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RecDefinition")) return false;
    if (!nextTokenIs(builder_, DELAY1)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = RecName(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DEF);
    result_ = result_ && Expression(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, ENDDEF);
    exit_section_(builder_, marker_, REC_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // RecDefinition*
  static boolean RecList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RecList")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!RecDefinition(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "RecList", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // DELAY1 IDENTIFIER
  public static boolean RecName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RecName")) return false;
    if (!nextTokenIs(builder_, DELAY1)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DELAY1, IDENTIFIER);
    exit_section_(builder_, marker_, REC_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // LPAREN ArgList RPAREN ARROW Expression ENDDEF
  public static boolean Rule(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Rule")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && ArgList(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, RPAREN, ARROW);
    result_ = result_ && Expression(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, ENDDEF);
    exit_section_(builder_, marker_, RULE, result_);
    return result_;
  }

  /* ********************************************************** */
  // Rule*
  public static boolean RuleList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RuleList")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, RULE_LIST, "<rule list>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!Rule(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "RuleList", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // SOUNDFILE LPAREN UqString PAR Argument RPAREN
  public static boolean SoundfilePrim(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SoundfilePrim")) return false;
    if (!nextTokenIs(builder_, SOUNDFILE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, SOUNDFILE, LPAREN);
    result_ = result_ && UqString(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PAR);
    result_ = result_ && Argument(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, SOUNDFILE_PRIM, result_);
    return result_;
  }

  /* ********************************************************** */
  // FileImport
  //     | Declaration
  //     | Definition
  static boolean Statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Statement")) return false;
    boolean result_;
    result_ = FileImport(builder_, level_ + 1);
    if (!result_) result_ = Declaration(builder_, level_ + 1);
    if (!result_) result_ = Definition(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // (VariantList Statement)*
  static boolean StmtList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StmtList")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!StmtList_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "StmtList", pos_)) break;
    }
    return true;
  }

  // VariantList Statement
  private static boolean StmtList_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StmtList_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = VariantList(builder_, level_ + 1);
    result_ = result_ && Statement(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // STRING_LITERAL
  public static boolean String(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "String")) return false;
    if (!nextTokenIs(builder_, STRING_LITERAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, STRING_LITERAL);
    exit_section_(builder_, marker_, STRING, result_);
    return result_;
  }

  /* ********************************************************** */
  // BUTTON LPAREN UqString RPAREN
  public static boolean UiButton(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UiButton")) return false;
    if (!nextTokenIs(builder_, BUTTON)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, BUTTON, LPAREN);
    result_ = result_ && UqString(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, UI_BUTTON, result_);
    return result_;
  }

  /* ********************************************************** */
  // LPAREN UqString RPAREN
  public static boolean UiCheckbox(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UiCheckbox")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && UqString(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, UI_CHECKBOX, result_);
    return result_;
  }

  /* ********************************************************** */
  // HBARGRAPH LPAREN UqString PAR Argument PAR Argument RPAREN
  public static boolean UiHbargraph(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UiHbargraph")) return false;
    if (!nextTokenIs(builder_, HBARGRAPH)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, HBARGRAPH, LPAREN);
    result_ = result_ && UqString(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PAR);
    result_ = result_ && Argument(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, PAR);
    result_ = result_ && Argument(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, UI_HBARGRAPH, result_);
    return result_;
  }

  /* ********************************************************** */
  // HGROUP LPAREN UqString PAR Expression RPAREN
  public static boolean UiHgroup(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UiHgroup")) return false;
    if (!nextTokenIs(builder_, HGROUP)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, HGROUP, LPAREN);
    result_ = result_ && UqString(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PAR);
    result_ = result_ && Expression(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, UI_HGROUP, result_);
    return result_;
  }

  /* ********************************************************** */
  // HSLIDER LPAREN UqString PAR Argument PAR Argument PAR Argument PAR Argument RPAREN
  public static boolean UiHslider(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UiHslider")) return false;
    if (!nextTokenIs(builder_, HSLIDER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, HSLIDER, LPAREN);
    result_ = result_ && UqString(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PAR);
    result_ = result_ && Argument(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, PAR);
    result_ = result_ && Argument(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, PAR);
    result_ = result_ && Argument(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, PAR);
    result_ = result_ && Argument(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, UI_HSLIDER, result_);
    return result_;
  }

  /* ********************************************************** */
  // NENTRY LPAREN UqString PAR Argument PAR Argument PAR Argument PAR Argument RPAREN
  public static boolean UiNentry(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UiNentry")) return false;
    if (!nextTokenIs(builder_, NENTRY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, NENTRY, LPAREN);
    result_ = result_ && UqString(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PAR);
    result_ = result_ && Argument(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, PAR);
    result_ = result_ && Argument(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, PAR);
    result_ = result_ && Argument(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, PAR);
    result_ = result_ && Argument(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, UI_NENTRY, result_);
    return result_;
  }

  /* ********************************************************** */
  // TGROUP LPAREN UqString PAR Expression RPAREN
  public static boolean UiTgroup(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UiTgroup")) return false;
    if (!nextTokenIs(builder_, TGROUP)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, TGROUP, LPAREN);
    result_ = result_ && UqString(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PAR);
    result_ = result_ && Expression(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, UI_TGROUP, result_);
    return result_;
  }

  /* ********************************************************** */
  // VBARGRAPH LPAREN UqString PAR Argument PAR Argument RPAREN
  public static boolean UiVbargraph(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UiVbargraph")) return false;
    if (!nextTokenIs(builder_, VBARGRAPH)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, VBARGRAPH, LPAREN);
    result_ = result_ && UqString(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PAR);
    result_ = result_ && Argument(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, PAR);
    result_ = result_ && Argument(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, UI_VBARGRAPH, result_);
    return result_;
  }

  /* ********************************************************** */
  // VGROUP LPAREN UqString PAR Expression RPAREN
  public static boolean UiVgroup(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UiVgroup")) return false;
    if (!nextTokenIs(builder_, VGROUP)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, VGROUP, LPAREN);
    result_ = result_ && UqString(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PAR);
    result_ = result_ && Expression(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, UI_VGROUP, result_);
    return result_;
  }

  /* ********************************************************** */
  // VSLIDER LPAREN UqString PAR Argument PAR Argument PAR Argument PAR Argument RPAREN
  public static boolean UiVslider(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UiVslider")) return false;
    if (!nextTokenIs(builder_, VSLIDER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, VSLIDER, LPAREN);
    result_ = result_ && UqString(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PAR);
    result_ = result_ && Argument(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, PAR);
    result_ = result_ && Argument(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, PAR);
    result_ = result_ && Argument(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, PAR);
    result_ = result_ && Argument(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, UI_VSLIDER, result_);
    return result_;
  }

  /* ********************************************************** */
  // STRING_LITERAL
  public static boolean UqString(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UqString")) return false;
    if (!nextTokenIs(builder_, STRING_LITERAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, STRING_LITERAL);
    exit_section_(builder_, marker_, UQ_STRING, result_);
    return result_;
  }

  /* ********************************************************** */
  // FLOATMODE
  //     | DOUBLEMODE
  //     | QUADMODE
  //     | FIXEDPOINTMODE
  public static boolean Variant(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Variant")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VARIANT, "<variant>");
    result_ = consumeToken(builder_, FLOATMODE);
    if (!result_) result_ = consumeToken(builder_, DOUBLEMODE);
    if (!result_) result_ = consumeToken(builder_, QUADMODE);
    if (!result_) result_ = consumeToken(builder_, FIXEDPOINTMODE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // Variant*
  static boolean VariantList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VariantList")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!Variant(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "VariantList", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Expression root: Argument
  // Operator priority table:
  // 0: BINARY(SeqArg)
  // 1: BINARY(SplitArg)
  // 2: BINARY(MergeArg)
  // 3: BINARY(RecArg)
  // 4: ATOM(InfixArg)
  public static boolean Argument(PsiBuilder builder_, int level_, int priority_) {
    if (!recursion_guard_(builder_, level_, "Argument")) return false;
    addVariant(builder_, "<argument>");
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<argument>");
    result_ = InfixArg(builder_, level_ + 1);
    pinned_ = result_;
    result_ = result_ && Argument_0(builder_, level_ + 1, priority_);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  public static boolean Argument_0(PsiBuilder builder_, int level_, int priority_) {
    if (!recursion_guard_(builder_, level_, "Argument_0")) return false;
    boolean result_ = true;
    while (true) {
      Marker marker_ = enter_section_(builder_, level_, _LEFT_, null);
      if (priority_ < 0 && consumeTokenSmart(builder_, SEQ)) {
        result_ = Argument(builder_, level_, 0);
        exit_section_(builder_, level_, marker_, SEQ_ARG, result_, true, null);
      }
      else if (priority_ < 1 && consumeTokenSmart(builder_, SPLIT)) {
        result_ = Argument(builder_, level_, 1);
        exit_section_(builder_, level_, marker_, SPLIT_ARG, result_, true, null);
      }
      else if (priority_ < 2 && consumeTokenSmart(builder_, MERGE)) {
        result_ = Argument(builder_, level_, 2);
        exit_section_(builder_, level_, marker_, MERGE_ARG, result_, true, null);
      }
      else if (priority_ < 3 && consumeTokenSmart(builder_, REC)) {
        result_ = Argument(builder_, level_, 3);
        exit_section_(builder_, level_, marker_, REC_ARG, result_, true, null);
      }
      else {
        exit_section_(builder_, level_, marker_, null, false, false, null);
        break;
      }
    }
    return result_;
  }

  // Infix
  public static boolean InfixArg(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InfixArg")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, INFIX_ARG, "<infix arg>");
    result_ = Infix(builder_, level_ + 1, -1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // Expression root: Expression
  // Operator priority table:
  // 0: POSTFIX(WithExpr)
  // 1: POSTFIX(LetrecExpr)
  // 2: POSTFIX(LetrecDefListExpr)
  // 3: BINARY(SequentialComp)
  // 4: BINARY(ParallelComp)
  // 5: BINARY(SplitComp)
  // 6: BINARY(MergeComp)
  // 7: BINARY(RecursiveComp)
  // 8: ATOM(InfixExpr)
  public static boolean Expression(PsiBuilder builder_, int level_, int priority_) {
    if (!recursion_guard_(builder_, level_, "Expression")) return false;
    addVariant(builder_, "<expression>");
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<expression>");
    result_ = InfixExpr(builder_, level_ + 1);
    pinned_ = result_;
    result_ = result_ && Expression_0(builder_, level_ + 1, priority_);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  public static boolean Expression_0(PsiBuilder builder_, int level_, int priority_) {
    if (!recursion_guard_(builder_, level_, "Expression_0")) return false;
    boolean result_ = true;
    while (true) {
      Marker marker_ = enter_section_(builder_, level_, _LEFT_, null);
      if (priority_ < 0 && WithExpr_0(builder_, level_ + 1)) {
        result_ = true;
        exit_section_(builder_, level_, marker_, WITH_EXPR, result_, true, null);
      }
      else if (priority_ < 1 && LetrecExpr_0(builder_, level_ + 1)) {
        result_ = true;
        exit_section_(builder_, level_, marker_, LETREC_EXPR, result_, true, null);
      }
      else if (priority_ < 2 && LetrecDefListExpr_0(builder_, level_ + 1)) {
        result_ = true;
        exit_section_(builder_, level_, marker_, LETREC_DEF_LIST_EXPR, result_, true, null);
      }
      else if (priority_ < 3 && consumeTokenSmart(builder_, SEQ)) {
        result_ = Expression(builder_, level_, 3);
        exit_section_(builder_, level_, marker_, SEQUENTIAL_COMP, result_, true, null);
      }
      else if (priority_ < 4 && consumeTokenSmart(builder_, PAR)) {
        result_ = Expression(builder_, level_, 4);
        exit_section_(builder_, level_, marker_, PARALLEL_COMP, result_, true, null);
      }
      else if (priority_ < 5 && consumeTokenSmart(builder_, SPLIT)) {
        result_ = Expression(builder_, level_, 5);
        exit_section_(builder_, level_, marker_, SPLIT_COMP, result_, true, null);
      }
      else if (priority_ < 6 && consumeTokenSmart(builder_, MERGE)) {
        result_ = Expression(builder_, level_, 6);
        exit_section_(builder_, level_, marker_, MERGE_COMP, result_, true, null);
      }
      else if (priority_ < 7 && consumeTokenSmart(builder_, REC)) {
        result_ = Expression(builder_, level_, 7);
        exit_section_(builder_, level_, marker_, RECURSIVE_COMP, result_, true, null);
      }
      else {
        exit_section_(builder_, level_, marker_, null, false, false, null);
        break;
      }
    }
    return result_;
  }

  // WITH LBRACE DefList RBRACE
  private static boolean WithExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "WithExpr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokensSmart(builder_, 0, WITH, LBRACE);
    result_ = result_ && DefList(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LETREC LBRACE RecList RBRACE
  private static boolean LetrecExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LetrecExpr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokensSmart(builder_, 0, LETREC, LBRACE);
    result_ = result_ && RecList(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LETREC LBRACE RecList WHERE DefList RBRACE
  private static boolean LetrecDefListExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LetrecDefListExpr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokensSmart(builder_, 0, LETREC, LBRACE);
    result_ = result_ && RecList(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, WHERE);
    result_ = result_ && DefList(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // Infix
  public static boolean InfixExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InfixExpr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, INFIX_EXPR, "<infix expr>");
    result_ = Infix(builder_, level_ + 1, -1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // Expression root: Infix
  // Operator priority table:
  // 0: BINARY(AddIfx)
  // 1: BINARY(SubIfx)
  // 2: BINARY(MulIfx)
  // 3: BINARY(DivIfx)
  // 4: BINARY(ModIfx)
  // 5: BINARY(PowIfx)
  // 6: BINARY(DelayIfx)
  // 7: POSTFIX(Delay1Ifx)
  // 8: POSTFIX(AccessIfx)
  // 9: BINARY(AndIfx)
  // 10: BINARY(OrIfx)
  // 11: BINARY(XorIfx)
  // 12: BINARY(LshIfx)
  // 13: BINARY(RshIfx)
  // 14: BINARY(LtIfx)
  // 15: BINARY(LeIfx)
  // 16: BINARY(GtIfx)
  // 17: BINARY(GeIfx)
  // 18: BINARY(EqIfx)
  // 19: BINARY(NeIfx)
  // 20: POSTFIX(ParenIfx)
  // 21: POSTFIX(BrackIfx)
  // 22: ATOM(PrimitiveIfx)
  public static boolean Infix(PsiBuilder builder_, int level_, int priority_) {
    if (!recursion_guard_(builder_, level_, "Infix")) return false;
    addVariant(builder_, "<infix>");
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<infix>");
    result_ = PrimitiveIfx(builder_, level_ + 1);
    pinned_ = result_;
    result_ = result_ && Infix_0(builder_, level_ + 1, priority_);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  public static boolean Infix_0(PsiBuilder builder_, int level_, int priority_) {
    if (!recursion_guard_(builder_, level_, "Infix_0")) return false;
    boolean result_ = true;
    while (true) {
      Marker marker_ = enter_section_(builder_, level_, _LEFT_, null);
      if (priority_ < 0 && consumeTokenSmart(builder_, ADD)) {
        result_ = Infix(builder_, level_, 0);
        exit_section_(builder_, level_, marker_, ADD_IFX, result_, true, null);
      }
      else if (priority_ < 1 && consumeTokenSmart(builder_, SUB)) {
        result_ = Infix(builder_, level_, 1);
        exit_section_(builder_, level_, marker_, SUB_IFX, result_, true, null);
      }
      else if (priority_ < 2 && consumeTokenSmart(builder_, MUL)) {
        result_ = Infix(builder_, level_, 2);
        exit_section_(builder_, level_, marker_, MUL_IFX, result_, true, null);
      }
      else if (priority_ < 3 && consumeTokenSmart(builder_, DIV)) {
        result_ = Infix(builder_, level_, 3);
        exit_section_(builder_, level_, marker_, DIV_IFX, result_, true, null);
      }
      else if (priority_ < 4 && consumeTokenSmart(builder_, MOD)) {
        result_ = Infix(builder_, level_, 4);
        exit_section_(builder_, level_, marker_, MOD_IFX, result_, true, null);
      }
      else if (priority_ < 5 && consumeTokenSmart(builder_, POWOP)) {
        result_ = Infix(builder_, level_, 5);
        exit_section_(builder_, level_, marker_, POW_IFX, result_, true, null);
      }
      else if (priority_ < 6 && consumeTokenSmart(builder_, DELAY)) {
        result_ = Infix(builder_, level_, 6);
        exit_section_(builder_, level_, marker_, DELAY_IFX, result_, true, null);
      }
      else if (priority_ < 7 && consumeTokenSmart(builder_, DELAY1)) {
        result_ = true;
        exit_section_(builder_, level_, marker_, DELAY_1_IFX, result_, true, null);
      }
      else if (priority_ < 8 && parseTokensSmart(builder_, 0, DOT, IDENTIFIER)) {
        result_ = true;
        exit_section_(builder_, level_, marker_, ACCESS_IFX, result_, true, null);
      }
      else if (priority_ < 9 && consumeTokenSmart(builder_, AND)) {
        result_ = Infix(builder_, level_, 9);
        exit_section_(builder_, level_, marker_, AND_IFX, result_, true, null);
      }
      else if (priority_ < 10 && consumeTokenSmart(builder_, OR)) {
        result_ = Infix(builder_, level_, 10);
        exit_section_(builder_, level_, marker_, OR_IFX, result_, true, null);
      }
      else if (priority_ < 11 && consumeTokenSmart(builder_, XOR)) {
        result_ = Infix(builder_, level_, 11);
        exit_section_(builder_, level_, marker_, XOR_IFX, result_, true, null);
      }
      else if (priority_ < 12 && consumeTokenSmart(builder_, LSH)) {
        result_ = Infix(builder_, level_, 12);
        exit_section_(builder_, level_, marker_, LSH_IFX, result_, true, null);
      }
      else if (priority_ < 13 && consumeTokenSmart(builder_, RSH)) {
        result_ = Infix(builder_, level_, 13);
        exit_section_(builder_, level_, marker_, RSH_IFX, result_, true, null);
      }
      else if (priority_ < 14 && consumeTokenSmart(builder_, LT)) {
        result_ = Infix(builder_, level_, 14);
        exit_section_(builder_, level_, marker_, LT_IFX, result_, true, null);
      }
      else if (priority_ < 15 && consumeTokenSmart(builder_, LE)) {
        result_ = Infix(builder_, level_, 15);
        exit_section_(builder_, level_, marker_, LE_IFX, result_, true, null);
      }
      else if (priority_ < 16 && consumeTokenSmart(builder_, GT)) {
        result_ = Infix(builder_, level_, 16);
        exit_section_(builder_, level_, marker_, GT_IFX, result_, true, null);
      }
      else if (priority_ < 17 && consumeTokenSmart(builder_, GE)) {
        result_ = Infix(builder_, level_, 17);
        exit_section_(builder_, level_, marker_, GE_IFX, result_, true, null);
      }
      else if (priority_ < 18 && consumeTokenSmart(builder_, EQ)) {
        result_ = Infix(builder_, level_, 18);
        exit_section_(builder_, level_, marker_, EQ_IFX, result_, true, null);
      }
      else if (priority_ < 19 && consumeTokenSmart(builder_, NE)) {
        result_ = Infix(builder_, level_, 19);
        exit_section_(builder_, level_, marker_, NE_IFX, result_, true, null);
      }
      else if (priority_ < 20 && ParenIfx_0(builder_, level_ + 1)) {
        result_ = true;
        exit_section_(builder_, level_, marker_, PAREN_IFX, result_, true, null);
      }
      else if (priority_ < 21 && BrackIfx_0(builder_, level_ + 1)) {
        result_ = true;
        exit_section_(builder_, level_, marker_, BRACK_IFX, result_, true, null);
      }
      else {
        exit_section_(builder_, level_, marker_, null, false, false, null);
        break;
      }
    }
    return result_;
  }

  // LPAREN ArgList RPAREN
  private static boolean ParenIfx_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ParenIfx_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, LPAREN);
    result_ = result_ && ArgList(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LBRACK DefList RBRACK
  private static boolean BrackIfx_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BrackIfx_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, LBRACK);
    result_ = result_ && DefList(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACK);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // NUMBER
  //     | ADD NUMBER
  //     | SUB NUMBER
  //     | WIRE
  //     | CUT
  //     | MEM
  //     | PREFIX
  //     | INTCAST
  //     | FLOATCAST
  //     | ADD
  //     | SUB
  //     | MUL
  //     | DIV
  //     | MOD
  //     | DELAY
  //     | AND
  //     | OR
  //     | XOR
  //     | LSH
  //     | RSH
  //     | LT
  //     | LE
  //     | GT
  //     | GE
  //     | EQ
  //     | NE
  //     | ATTACH
  //     | ENABLE
  //     | CONTROL
  //     | ACOS
  //     | ASIN
  //     | ATAN
  //     | ATAN2
  //     | COS
  //     | SIN
  //     | TAN
  //     | EXP
  //     | LOG
  //     | LOG10
  //     | POWOP
  //     | POWFUN
  //     | SQRT
  //     | ABS
  //     | MIN
  //     | MAX
  //     | FMOD
  //     | REMAINDER
  //     | FLOOR
  //     | CEIL
  //     | RINT
  //     | ROUND
  //     | RDTBL
  //     | RWTBL
  //     | SELECT2
  //     | SELECT3
  //     | ASSERTBOUNDS
  //     | LOWEST
  //     | HIGHEST
  //     | IDENTIFIER
  //     | SUB IDENTIFIER
  //     | LPAREN Expression RPAREN
  //     | LambdaAbstraction
  // //    | LBRACK ModList LAPPLY Expression RBRACK
  //     | PatternAbstraction
  // //    | ForeignFunction
  // //    | ForeignConstant
  // //    | ForeignVariable
  //     | COMPONENT LPAREN UqString RPAREN
  //     | LIBRARY LPAREN UqString RPAREN
  //     | EnvironmentConstruction
  // //    | WAVEFORM LBRACE ValList RBRACE
  //     | ROUTE LPAREN Argument PAR Argument RPAREN // Fake route?
  //     | ROUTE LPAREN Argument PAR Argument PAR Expression RPAREN
  //     | UiButton
  //     | UiCheckbox
  //     | UiVslider
  //     | UiHslider
  //     | UiNentry
  //     | UiVgroup
  //     | UiHgroup
  //     | UiTgroup
  //     | UiVbargraph
  //     | UiHbargraph
  //     | SoundfilePrim
  //     | IterPar
  //     | IterSeq
  //     | IterSum
  //     | IterProd
  //     | Inputs
  //     | Outputs
  public static boolean PrimitiveIfx(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PrimitiveIfx")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PRIMITIVE_IFX, "<primitive ifx>");
    result_ = consumeTokenSmart(builder_, NUMBER);
    if (!result_) result_ = parseTokensSmart(builder_, 0, ADD, NUMBER);
    if (!result_) result_ = parseTokensSmart(builder_, 0, SUB, NUMBER);
    if (!result_) result_ = consumeTokenSmart(builder_, WIRE);
    if (!result_) result_ = consumeTokenSmart(builder_, CUT);
    if (!result_) result_ = consumeTokenSmart(builder_, MEM);
    if (!result_) result_ = consumeTokenSmart(builder_, PREFIX);
    if (!result_) result_ = consumeTokenSmart(builder_, INTCAST);
    if (!result_) result_ = consumeTokenSmart(builder_, FLOATCAST);
    if (!result_) result_ = consumeTokenSmart(builder_, ADD);
    if (!result_) result_ = consumeTokenSmart(builder_, SUB);
    if (!result_) result_ = consumeTokenSmart(builder_, MUL);
    if (!result_) result_ = consumeTokenSmart(builder_, DIV);
    if (!result_) result_ = consumeTokenSmart(builder_, MOD);
    if (!result_) result_ = consumeTokenSmart(builder_, DELAY);
    if (!result_) result_ = consumeTokenSmart(builder_, AND);
    if (!result_) result_ = consumeTokenSmart(builder_, OR);
    if (!result_) result_ = consumeTokenSmart(builder_, XOR);
    if (!result_) result_ = consumeTokenSmart(builder_, LSH);
    if (!result_) result_ = consumeTokenSmart(builder_, RSH);
    if (!result_) result_ = consumeTokenSmart(builder_, LT);
    if (!result_) result_ = consumeTokenSmart(builder_, LE);
    if (!result_) result_ = consumeTokenSmart(builder_, GT);
    if (!result_) result_ = consumeTokenSmart(builder_, GE);
    if (!result_) result_ = consumeTokenSmart(builder_, EQ);
    if (!result_) result_ = consumeTokenSmart(builder_, NE);
    if (!result_) result_ = consumeTokenSmart(builder_, ATTACH);
    if (!result_) result_ = consumeTokenSmart(builder_, ENABLE);
    if (!result_) result_ = consumeTokenSmart(builder_, CONTROL);
    if (!result_) result_ = consumeTokenSmart(builder_, ACOS);
    if (!result_) result_ = consumeTokenSmart(builder_, ASIN);
    if (!result_) result_ = consumeTokenSmart(builder_, ATAN);
    if (!result_) result_ = consumeTokenSmart(builder_, ATAN2);
    if (!result_) result_ = consumeTokenSmart(builder_, COS);
    if (!result_) result_ = consumeTokenSmart(builder_, SIN);
    if (!result_) result_ = consumeTokenSmart(builder_, TAN);
    if (!result_) result_ = consumeTokenSmart(builder_, EXP);
    if (!result_) result_ = consumeTokenSmart(builder_, LOG);
    if (!result_) result_ = consumeTokenSmart(builder_, LOG10);
    if (!result_) result_ = consumeTokenSmart(builder_, POWOP);
    if (!result_) result_ = consumeTokenSmart(builder_, POWFUN);
    if (!result_) result_ = consumeTokenSmart(builder_, SQRT);
    if (!result_) result_ = consumeTokenSmart(builder_, ABS);
    if (!result_) result_ = consumeTokenSmart(builder_, MIN);
    if (!result_) result_ = consumeTokenSmart(builder_, MAX);
    if (!result_) result_ = consumeTokenSmart(builder_, FMOD);
    if (!result_) result_ = consumeTokenSmart(builder_, REMAINDER);
    if (!result_) result_ = consumeTokenSmart(builder_, FLOOR);
    if (!result_) result_ = consumeTokenSmart(builder_, CEIL);
    if (!result_) result_ = consumeTokenSmart(builder_, RINT);
    if (!result_) result_ = consumeTokenSmart(builder_, ROUND);
    if (!result_) result_ = consumeTokenSmart(builder_, RDTBL);
    if (!result_) result_ = consumeTokenSmart(builder_, RWTBL);
    if (!result_) result_ = consumeTokenSmart(builder_, SELECT2);
    if (!result_) result_ = consumeTokenSmart(builder_, SELECT3);
    if (!result_) result_ = consumeTokenSmart(builder_, ASSERTBOUNDS);
    if (!result_) result_ = consumeTokenSmart(builder_, LOWEST);
    if (!result_) result_ = consumeTokenSmart(builder_, HIGHEST);
    if (!result_) result_ = consumeTokenSmart(builder_, IDENTIFIER);
    if (!result_) result_ = parseTokensSmart(builder_, 0, SUB, IDENTIFIER);
    if (!result_) result_ = PrimitiveIfx_60(builder_, level_ + 1);
    if (!result_) result_ = LambdaAbstraction(builder_, level_ + 1);
    if (!result_) result_ = PatternAbstraction(builder_, level_ + 1);
    if (!result_) result_ = PrimitiveIfx_63(builder_, level_ + 1);
    if (!result_) result_ = PrimitiveIfx_64(builder_, level_ + 1);
    if (!result_) result_ = EnvironmentConstruction(builder_, level_ + 1);
    if (!result_) result_ = PrimitiveIfx_66(builder_, level_ + 1);
    if (!result_) result_ = PrimitiveIfx_67(builder_, level_ + 1);
    if (!result_) result_ = UiButton(builder_, level_ + 1);
    if (!result_) result_ = UiCheckbox(builder_, level_ + 1);
    if (!result_) result_ = UiVslider(builder_, level_ + 1);
    if (!result_) result_ = UiHslider(builder_, level_ + 1);
    if (!result_) result_ = UiNentry(builder_, level_ + 1);
    if (!result_) result_ = UiVgroup(builder_, level_ + 1);
    if (!result_) result_ = UiHgroup(builder_, level_ + 1);
    if (!result_) result_ = UiTgroup(builder_, level_ + 1);
    if (!result_) result_ = UiVbargraph(builder_, level_ + 1);
    if (!result_) result_ = UiHbargraph(builder_, level_ + 1);
    if (!result_) result_ = SoundfilePrim(builder_, level_ + 1);
    if (!result_) result_ = IterPar(builder_, level_ + 1);
    if (!result_) result_ = IterSeq(builder_, level_ + 1);
    if (!result_) result_ = IterSum(builder_, level_ + 1);
    if (!result_) result_ = IterProd(builder_, level_ + 1);
    if (!result_) result_ = Inputs(builder_, level_ + 1);
    if (!result_) result_ = Outputs(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // LPAREN Expression RPAREN
  private static boolean PrimitiveIfx_60(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PrimitiveIfx_60")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, LPAREN);
    result_ = result_ && Expression(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // COMPONENT LPAREN UqString RPAREN
  private static boolean PrimitiveIfx_63(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PrimitiveIfx_63")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokensSmart(builder_, 0, COMPONENT, LPAREN);
    result_ = result_ && UqString(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LIBRARY LPAREN UqString RPAREN
  private static boolean PrimitiveIfx_64(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PrimitiveIfx_64")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokensSmart(builder_, 0, LIBRARY, LPAREN);
    result_ = result_ && UqString(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ROUTE LPAREN Argument PAR Argument RPAREN
  private static boolean PrimitiveIfx_66(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PrimitiveIfx_66")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokensSmart(builder_, 0, ROUTE, LPAREN);
    result_ = result_ && Argument(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, PAR);
    result_ = result_ && Argument(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ROUTE LPAREN Argument PAR Argument PAR Expression RPAREN
  private static boolean PrimitiveIfx_67(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PrimitiveIfx_67")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokensSmart(builder_, 0, ROUTE, LPAREN);
    result_ = result_ && Argument(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, PAR);
    result_ = result_ && Argument(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, PAR);
    result_ = result_ && Expression(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

}
