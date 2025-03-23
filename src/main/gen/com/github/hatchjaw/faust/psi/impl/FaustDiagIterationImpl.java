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

public class FaustDiagIterationImpl extends ASTWrapperPsiElement implements FaustDiagIteration {

  public FaustDiagIterationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FaustVisitor visitor) {
    visitor.visitDiagIteration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FaustVisitor) accept((FaustVisitor)visitor);
    else super.accept(visitor);
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
  @NotNull
  public FaustNumIter getNumIter() {
    return findNotNullChildByClass(FaustNumIter.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
