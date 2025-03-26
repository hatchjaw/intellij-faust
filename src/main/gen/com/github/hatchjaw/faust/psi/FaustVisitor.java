// This is a generated file. Not intended for manual editing.
package com.github.hatchjaw.faust.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class FaustVisitor extends PsiElementVisitor {

  public void visitAccessIfx(@NotNull FaustAccessIfx o) {
    visitInfix(o);
  }

  public void visitAddIfx(@NotNull FaustAddIfx o) {
    visitInfix(o);
  }

  public void visitAndIfx(@NotNull FaustAndIfx o) {
    visitInfix(o);
  }

  public void visitArgList(@NotNull FaustArgList o) {
    visitPsiElement(o);
  }

  public void visitArgument(@NotNull FaustArgument o) {
    visitPsiElement(o);
  }

  public void visitBrackIfx(@NotNull FaustBrackIfx o) {
    visitInfix(o);
  }

  public void visitDeclaration(@NotNull FaustDeclaration o) {
    visitPsiElement(o);
  }

  public void visitDefName(@NotNull FaustDefName o) {
    visitPsiElement(o);
  }

  public void visitDefinition(@NotNull FaustDefinition o) {
    visitPsiElement(o);
  }

  public void visitDelay1Ifx(@NotNull FaustDelay1Ifx o) {
    visitInfix(o);
  }

  public void visitDelayIfx(@NotNull FaustDelayIfx o) {
    visitInfix(o);
  }

  public void visitDivIfx(@NotNull FaustDivIfx o) {
    visitInfix(o);
  }

  public void visitEqIfx(@NotNull FaustEqIfx o) {
    visitInfix(o);
  }

  public void visitExpression(@NotNull FaustExpression o) {
    visitPsiElement(o);
  }

  public void visitFileImport(@NotNull FaustFileImport o) {
    visitPsiElement(o);
  }

  public void visitGeIfx(@NotNull FaustGeIfx o) {
    visitInfix(o);
  }

  public void visitGtIfx(@NotNull FaustGtIfx o) {
    visitInfix(o);
  }

  public void visitIdent(@NotNull FaustIdent o) {
    visitPsiElement(o);
  }

  public void visitInfix(@NotNull FaustInfix o) {
    visitPsiElement(o);
  }

  public void visitInfixArg(@NotNull FaustInfixArg o) {
    visitArgument(o);
  }

  public void visitInfixExpr(@NotNull FaustInfixExpr o) {
    visitExpression(o);
  }

  public void visitInputs(@NotNull FaustInputs o) {
    visitPsiElement(o);
  }

  public void visitIterPar(@NotNull FaustIterPar o) {
    visitPsiElement(o);
  }

  public void visitIterProd(@NotNull FaustIterProd o) {
    visitPsiElement(o);
  }

  public void visitIterSeq(@NotNull FaustIterSeq o) {
    visitPsiElement(o);
  }

  public void visitIterSum(@NotNull FaustIterSum o) {
    visitPsiElement(o);
  }

  public void visitLambdaAbstraction(@NotNull FaustLambdaAbstraction o) {
    visitPsiElement(o);
  }

  public void visitLeIfx(@NotNull FaustLeIfx o) {
    visitInfix(o);
  }

  public void visitLetrecDefListExpr(@NotNull FaustLetrecDefListExpr o) {
    visitExpression(o);
  }

  public void visitLetrecExpr(@NotNull FaustLetrecExpr o) {
    visitExpression(o);
  }

  public void visitLshIfx(@NotNull FaustLshIfx o) {
    visitInfix(o);
  }

  public void visitLtIfx(@NotNull FaustLtIfx o) {
    visitInfix(o);
  }

  public void visitMergeArg(@NotNull FaustMergeArg o) {
    visitArgument(o);
  }

  public void visitMergeComp(@NotNull FaustMergeComp o) {
    visitExpression(o);
  }

  public void visitModIfx(@NotNull FaustModIfx o) {
    visitInfix(o);
  }

  public void visitMulIfx(@NotNull FaustMulIfx o) {
    visitInfix(o);
  }

  public void visitName(@NotNull FaustName o) {
    visitPsiElement(o);
  }

  public void visitNeIfx(@NotNull FaustNeIfx o) {
    visitInfix(o);
  }

  public void visitOrIfx(@NotNull FaustOrIfx o) {
    visitInfix(o);
  }

  public void visitOutputs(@NotNull FaustOutputs o) {
    visitPsiElement(o);
  }

  public void visitParallelComp(@NotNull FaustParallelComp o) {
    visitExpression(o);
  }

  public void visitParams(@NotNull FaustParams o) {
    visitPsiElement(o);
  }

  public void visitParenIfx(@NotNull FaustParenIfx o) {
    visitInfix(o);
  }

  public void visitPowIfx(@NotNull FaustPowIfx o) {
    visitInfix(o);
  }

  public void visitPrimitiveIfx(@NotNull FaustPrimitiveIfx o) {
    visitInfix(o);
  }

  public void visitRecArg(@NotNull FaustRecArg o) {
    visitArgument(o);
  }

  public void visitRecDefinition(@NotNull FaustRecDefinition o) {
    visitPsiElement(o);
  }

  public void visitRecName(@NotNull FaustRecName o) {
    visitPsiElement(o);
  }

  public void visitRecursiveComp(@NotNull FaustRecursiveComp o) {
    visitExpression(o);
  }

  public void visitRshIfx(@NotNull FaustRshIfx o) {
    visitInfix(o);
  }

  public void visitRule(@NotNull FaustRule o) {
    visitPsiElement(o);
  }

  public void visitRuleList(@NotNull FaustRuleList o) {
    visitPsiElement(o);
  }

  public void visitSeqArg(@NotNull FaustSeqArg o) {
    visitArgument(o);
  }

  public void visitSequentialComp(@NotNull FaustSequentialComp o) {
    visitExpression(o);
  }

  public void visitSoundfilePrim(@NotNull FaustSoundfilePrim o) {
    visitPsiElement(o);
  }

  public void visitSplitArg(@NotNull FaustSplitArg o) {
    visitArgument(o);
  }

  public void visitSplitComp(@NotNull FaustSplitComp o) {
    visitExpression(o);
  }

  public void visitString(@NotNull FaustString o) {
    visitPsiElement(o);
  }

  public void visitSubIfx(@NotNull FaustSubIfx o) {
    visitInfix(o);
  }

  public void visitUiButton(@NotNull FaustUiButton o) {
    visitPsiElement(o);
  }

  public void visitUiCheckbox(@NotNull FaustUiCheckbox o) {
    visitPsiElement(o);
  }

  public void visitUiHbargraph(@NotNull FaustUiHbargraph o) {
    visitPsiElement(o);
  }

  public void visitUiHgroup(@NotNull FaustUiHgroup o) {
    visitPsiElement(o);
  }

  public void visitUiHslider(@NotNull FaustUiHslider o) {
    visitPsiElement(o);
  }

  public void visitUiNentry(@NotNull FaustUiNentry o) {
    visitPsiElement(o);
  }

  public void visitUiTgroup(@NotNull FaustUiTgroup o) {
    visitPsiElement(o);
  }

  public void visitUiVbargraph(@NotNull FaustUiVbargraph o) {
    visitPsiElement(o);
  }

  public void visitUiVgroup(@NotNull FaustUiVgroup o) {
    visitPsiElement(o);
  }

  public void visitUiVslider(@NotNull FaustUiVslider o) {
    visitPsiElement(o);
  }

  public void visitUqString(@NotNull FaustUqString o) {
    visitPsiElement(o);
  }

  public void visitVariant(@NotNull FaustVariant o) {
    visitPsiElement(o);
  }

  public void visitWithExpr(@NotNull FaustWithExpr o) {
    visitExpression(o);
  }

  public void visitXorIfx(@NotNull FaustXorIfx o) {
    visitInfix(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
