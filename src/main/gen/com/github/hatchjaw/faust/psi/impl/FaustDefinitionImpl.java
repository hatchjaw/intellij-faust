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

public class FaustDefinitionImpl extends ASTWrapperPsiElement implements FaustDefinition {

  public FaustDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FaustVisitor visitor) {
    visitor.visitDefinition(this);
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
  @Nullable
  public FaustBitwise getBitwise() {
    return findChildByClass(FaustBitwise.class);
  }

  @Override
  @Nullable
  public FaustComparator getComparator() {
    return findChildByClass(FaustComparator.class);
  }

  @Override
  @Nullable
  public FaustComponentExpr getComponentExpr() {
    return findChildByClass(FaustComponentExpr.class);
  }

  @Override
  @Nullable
  public FaustCut getCut() {
    return findChildByClass(FaustCut.class);
  }

  @Override
  @Nullable
  public FaustDelay getDelay() {
    return findChildByClass(FaustDelay.class);
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
  public FaustEnvironmentExpr getEnvironmentExpr() {
    return findChildByClass(FaustEnvironmentExpr.class);
  }

  @Override
  @Nullable
  public FaustLibraryExpr getLibraryExpr() {
    return findChildByClass(FaustLibraryExpr.class);
  }

  @Override
  @Nullable
  public FaustMath getMath() {
    return findChildByClass(FaustMath.class);
  }

  @Override
  @NotNull
  public List<FaustVariant> getVariantList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FaustVariant.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

  @Override
  @Nullable
  public PsiElement getNumber() {
    return findChildByType(NUMBER);
  }

}
