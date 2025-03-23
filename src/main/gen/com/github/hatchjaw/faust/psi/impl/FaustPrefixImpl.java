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

public class FaustPrefixImpl extends ASTWrapperPsiElement implements FaustPrefix {

  public FaustPrefixImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FaustVisitor visitor) {
    visitor.visitPrefix(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FaustVisitor) accept((FaustVisitor)visitor);
    else super.accept(visitor);
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
  public FaustMath getMath() {
    return findChildByClass(FaustMath.class);
  }

  @Override
  @NotNull
  public List<FaustOperand> getOperandList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FaustOperand.class);
  }

}
