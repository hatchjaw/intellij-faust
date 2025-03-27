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

public class FaustEnvironmentConstructionImpl extends ASTWrapperPsiElement implements FaustEnvironmentConstruction {

  public FaustEnvironmentConstructionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FaustVisitor visitor) {
    visitor.visitEnvironmentConstruction(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FaustVisitor) accept((FaustVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<FaustDeclaration> getDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FaustDeclaration.class);
  }

  @Override
  @NotNull
  public List<FaustDefinition> getDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FaustDefinition.class);
  }

  @Override
  @NotNull
  public List<FaustFileImport> getFileImportList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FaustFileImport.class);
  }

  @Override
  @NotNull
  public List<FaustVariant> getVariantList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FaustVariant.class);
  }

}
