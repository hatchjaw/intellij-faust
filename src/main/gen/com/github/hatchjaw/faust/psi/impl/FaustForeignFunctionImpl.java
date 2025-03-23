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

public class FaustForeignFunctionImpl extends ASTWrapperPsiElement implements FaustForeignFunction {

  public FaustForeignFunctionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FaustVisitor visitor) {
    visitor.visitForeignFunction(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FaustVisitor) accept((FaustVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public FaustSignature getSignature() {
    return findNotNullChildByClass(FaustSignature.class);
  }

  @Override
  @NotNull
  public PsiElement getCinclude() {
    return findNotNullChildByType(CINCLUDE);
  }

  @Override
  @Nullable
  public PsiElement getLibfile() {
    return findChildByType(LIBFILE);
  }

}
