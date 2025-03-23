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

public class FaustInfixImpl extends ASTWrapperPsiElement implements FaustInfix {

  public FaustInfixImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FaustVisitor visitor) {
    visitor.visitInfix(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FaustVisitor) accept((FaustVisitor)visitor);
    else super.accept(visitor);
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
  public FaustInfix getInfix() {
    return findChildByClass(FaustInfix.class);
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

}
