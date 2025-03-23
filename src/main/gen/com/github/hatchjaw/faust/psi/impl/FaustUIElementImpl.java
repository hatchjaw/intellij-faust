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

public class FaustUIElementImpl extends ASTWrapperPsiElement implements FaustUIElement {

  public FaustUIElementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FaustVisitor visitor) {
    visitor.visitUIElement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FaustVisitor) accept((FaustVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FaustAttachExpr getAttachExpr() {
    return findChildByClass(FaustAttachExpr.class);
  }

  @Override
  @Nullable
  public FaustUIElementButton getUIElementButton() {
    return findChildByClass(FaustUIElementButton.class);
  }

  @Override
  @Nullable
  public FaustUIElementGraph getUIElementGraph() {
    return findChildByClass(FaustUIElementGraph.class);
  }

  @Override
  @Nullable
  public FaustUIElementGroup getUIElementGroup() {
    return findChildByClass(FaustUIElementGroup.class);
  }

  @Override
  @Nullable
  public FaustUIElementSlider getUIElementSlider() {
    return findChildByClass(FaustUIElementSlider.class);
  }

}
