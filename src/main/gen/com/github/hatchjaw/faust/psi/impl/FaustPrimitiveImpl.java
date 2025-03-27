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

public class FaustPrimitiveImpl extends FaustInfixImpl implements FaustPrimitive {

  public FaustPrimitiveImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull FaustVisitor visitor) {
    visitor.visitPrimitive(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FaustVisitor) accept((FaustVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<FaustArgument> getArgumentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FaustArgument.class);
  }

  @Override
  @Nullable
  public FaustEnvironmentConstruction getEnvironmentConstruction() {
    return findChildByClass(FaustEnvironmentConstruction.class);
  }

  @Override
  @Nullable
  public FaustExpression getExpression() {
    return findChildByClass(FaustExpression.class);
  }

  @Override
  @Nullable
  public FaustForeignConstant getForeignConstant() {
    return findChildByClass(FaustForeignConstant.class);
  }

  @Override
  @Nullable
  public FaustForeignFunction getForeignFunction() {
    return findChildByClass(FaustForeignFunction.class);
  }

  @Override
  @Nullable
  public FaustForeignVariable getForeignVariable() {
    return findChildByClass(FaustForeignVariable.class);
  }

  @Override
  @Nullable
  public FaustInputs getInputs() {
    return findChildByClass(FaustInputs.class);
  }

  @Override
  @Nullable
  public FaustIteration getIteration() {
    return findChildByClass(FaustIteration.class);
  }

  @Override
  @Nullable
  public FaustLambdaAbstraction getLambdaAbstraction() {
    return findChildByClass(FaustLambdaAbstraction.class);
  }

  @Override
  @Nullable
  public FaustOutputs getOutputs() {
    return findChildByClass(FaustOutputs.class);
  }

  @Override
  @Nullable
  public FaustPatternAbstraction getPatternAbstraction() {
    return findChildByClass(FaustPatternAbstraction.class);
  }

  @Override
  @Nullable
  public FaustSoundfilePrim getSoundfilePrim() {
    return findChildByClass(FaustSoundfilePrim.class);
  }

  @Override
  @Nullable
  public FaustUiButton getUiButton() {
    return findChildByClass(FaustUiButton.class);
  }

  @Override
  @Nullable
  public FaustUiCheckbox getUiCheckbox() {
    return findChildByClass(FaustUiCheckbox.class);
  }

  @Override
  @Nullable
  public FaustUiHbargraph getUiHbargraph() {
    return findChildByClass(FaustUiHbargraph.class);
  }

  @Override
  @Nullable
  public FaustUiHgroup getUiHgroup() {
    return findChildByClass(FaustUiHgroup.class);
  }

  @Override
  @Nullable
  public FaustUiHslider getUiHslider() {
    return findChildByClass(FaustUiHslider.class);
  }

  @Override
  @Nullable
  public FaustUiNentry getUiNentry() {
    return findChildByClass(FaustUiNentry.class);
  }

  @Override
  @Nullable
  public FaustUiTgroup getUiTgroup() {
    return findChildByClass(FaustUiTgroup.class);
  }

  @Override
  @Nullable
  public FaustUiVbargraph getUiVbargraph() {
    return findChildByClass(FaustUiVbargraph.class);
  }

  @Override
  @Nullable
  public FaustUiVgroup getUiVgroup() {
    return findChildByClass(FaustUiVgroup.class);
  }

  @Override
  @Nullable
  public FaustUiVslider getUiVslider() {
    return findChildByClass(FaustUiVslider.class);
  }

  @Override
  @Nullable
  public FaustUqString getUqString() {
    return findChildByClass(FaustUqString.class);
  }

  @Override
  @Nullable
  public FaustWaveformPrimItive getWaveformPrimItive() {
    return findChildByClass(FaustWaveformPrimItive.class);
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
