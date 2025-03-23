// This is a generated file. Not intended for manual editing.
package com.github.hatchjaw.faust.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.hatchjaw.faust.psi.FaustTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.hatchjaw.faust.psi.*;

public class FaustDiagCompositionImpl extends ASTWrapperPsiElement implements FaustDiagComposition {

  public FaustDiagCompositionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FaustVisitor visitor) {
    visitor.visitDiagComposition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FaustVisitor) accept((FaustVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FaustAccess getAccess() {
    return findChildByClass(FaustAccess.class);
  }

  @Override
  @NotNull
  public List<FaustBitwise> getBitwiseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FaustBitwise.class);
  }

  @Override
  @NotNull
  public List<FaustComparator> getComparatorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FaustComparator.class);
  }

  @Override
  @Nullable
  public FaustComposition getComposition() {
    return findChildByClass(FaustComposition.class);
  }

  @Override
  @NotNull
  public List<FaustCut> getCutList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FaustCut.class);
  }

  @Override
  @NotNull
  public List<FaustDelay> getDelayList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FaustDelay.class);
  }

  @Override
  @Nullable
  public FaustDiagComposition getDiagComposition() {
    return findChildByClass(FaustDiagComposition.class);
  }

  @Override
  @Nullable
  public FaustDiagIteration getDiagIteration() {
    return findChildByClass(FaustDiagIteration.class);
  }

  @Override
  @Nullable
  public FaustForeignFunction getForeignFunction() {
    return findChildByClass(FaustForeignFunction.class);
  }

  @Override
  @Nullable
  public FaustFunctionCall getFunctionCall() {
    return findChildByClass(FaustFunctionCall.class);
  }

  @Override
  @Nullable
  public FaustInfix getInfix() {
    return findChildByClass(FaustInfix.class);
  }

  @Override
  @NotNull
  public List<FaustLetrecExpression> getLetrecExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FaustLetrecExpression.class);
  }

  @Override
  @NotNull
  public List<FaustMath> getMathList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FaustMath.class);
  }

  @Override
  @Nullable
  public FaustOperand getOperand() {
    return findChildByClass(FaustOperand.class);
  }

  @Override
  @Nullable
  public FaustPartial getPartial() {
    return findChildByClass(FaustPartial.class);
  }

  @Override
  @Nullable
  public FaustPrefix getPrefix() {
    return findChildByClass(FaustPrefix.class);
  }

  @Override
  @Nullable
  public FaustProgExp getProgExp() {
    return findChildByClass(FaustProgExp.class);
  }

  @Override
  @Nullable
  public FaustRouteExpr getRouteExpr() {
    return findChildByClass(FaustRouteExpr.class);
  }

  @Override
  @Nullable
  public FaustTypeCast getTypeCast() {
    return findChildByClass(FaustTypeCast.class);
  }

  @Override
  @Nullable
  public FaustWaveformExpr getWaveformExpr() {
    return findChildByClass(FaustWaveformExpr.class);
  }

  @Override
  @NotNull
  public List<FaustWithExpression> getWithExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FaustWithExpression.class);
  }

}
