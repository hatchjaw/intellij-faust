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

public class FaustDocumentationImpl extends ASTWrapperPsiElement implements FaustDocumentation {

  public FaustDocumentationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FaustVisitor visitor) {
    visitor.visitDocumentation(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FaustVisitor) accept((FaustVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<FaustAccess> getAccessList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FaustAccess.class);
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
  @NotNull
  public List<FaustComponentExpr> getComponentExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FaustComponentExpr.class);
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
  @NotNull
  public List<FaustDiagComposition> getDiagCompositionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FaustDiagComposition.class);
  }

  @Override
  @NotNull
  public List<FaustDiagIteration> getDiagIterationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FaustDiagIteration.class);
  }

  @Override
  @NotNull
  public List<FaustEnvironmentExpr> getEnvironmentExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FaustEnvironmentExpr.class);
  }

  @Override
  @NotNull
  public List<FaustLibraryExpr> getLibraryExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FaustLibraryExpr.class);
  }

  @Override
  @NotNull
  public List<FaustMath> getMathList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FaustMath.class);
  }

}
