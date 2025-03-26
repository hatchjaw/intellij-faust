// This is a generated file. Not intended for manual editing.
package com.github.hatchjaw.faust.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.hatchjaw.faust.psi.FaustTypes.*;
import com.github.hatchjaw.faust.psi.*;

public class FaustParenIfxImpl extends FaustInfixImpl implements FaustParenIfx {

  public FaustParenIfxImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull FaustVisitor visitor) {
    visitor.visitParenIfx(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FaustVisitor) accept((FaustVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public FaustArgList getArgList() {
    return findNotNullChildByClass(FaustArgList.class);
  }

  @Override
  @NotNull
  public FaustInfix getInfix() {
    return findNotNullChildByClass(FaustInfix.class);
  }

}
