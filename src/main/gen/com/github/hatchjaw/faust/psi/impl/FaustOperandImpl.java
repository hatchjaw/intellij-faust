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

public class FaustOperandImpl extends ASTWrapperPsiElement implements FaustOperand {

  public FaustOperandImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FaustVisitor visitor) {
    visitor.visitOperand(this);
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
  public List<FaustDelay1> getDelay1List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FaustDelay1.class);
  }

  @Override
  @Nullable
  public FaustDiagComposition getDiagComposition() {
    return findChildByClass(FaustDiagComposition.class);
  }

  @Override
  @Nullable
  public FaustFunctionCall getFunctionCall() {
    return findChildByClass(FaustFunctionCall.class);
  }

  @Override
  @Nullable
  public FaustPartial getPartial() {
    return findChildByClass(FaustPartial.class);
  }

  @Override
  @Nullable
  public FaustUIElement getUIElement() {
    return findChildByClass(FaustUIElement.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

  @Override
  @Nullable
  public PsiElement getNumber() {
    return findChildByType(NUMBER);
  }

}
