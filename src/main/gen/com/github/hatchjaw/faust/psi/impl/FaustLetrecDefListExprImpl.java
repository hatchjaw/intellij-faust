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

public class FaustLetrecDefListExprImpl extends FaustExpressionImpl implements FaustLetrecDefListExpr {

  public FaustLetrecDefListExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull FaustVisitor visitor) {
    visitor.visitLetrecDefListExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FaustVisitor) accept((FaustVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<FaustDefinition> getDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FaustDefinition.class);
  }

  @Override
  @NotNull
  public FaustExpression getExpression() {
    return findNotNullChildByClass(FaustExpression.class);
  }

  @Override
  @NotNull
  public List<FaustRecDefinition> getRecDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FaustRecDefinition.class);
  }

  @Override
  @NotNull
  public List<FaustVariant> getVariantList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FaustVariant.class);
  }

}
