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

public class FaustFileImportImpl extends ASTWrapperPsiElement implements FaustFileImport {

  public FaustFileImportImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FaustVisitor visitor) {
    visitor.visitFileImport(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FaustVisitor) accept((FaustVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<FaustVariant> getVariantList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FaustVariant.class);
  }

  @Override
  @NotNull
  public PsiElement getLibfile() {
    return findNotNullChildByType(LIBFILE);
  }

}
