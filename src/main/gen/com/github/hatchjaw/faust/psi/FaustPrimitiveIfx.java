// This is a generated file. Not intended for manual editing.
package com.github.hatchjaw.faust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FaustPrimitiveIfx extends FaustInfix {

  @NotNull
  List<FaustArgument> getArgumentList();

  @Nullable
  FaustEnvironmentConstruction getEnvironmentConstruction();

  @Nullable
  FaustExpression getExpression();

  @Nullable
  FaustInputs getInputs();

  @Nullable
  FaustIterPar getIterPar();

  @Nullable
  FaustIterProd getIterProd();

  @Nullable
  FaustIterSeq getIterSeq();

  @Nullable
  FaustIterSum getIterSum();

  @Nullable
  FaustLambdaAbstraction getLambdaAbstraction();

  @Nullable
  FaustOutputs getOutputs();

  @Nullable
  FaustPatternAbstraction getPatternAbstraction();

  @Nullable
  FaustSoundfilePrim getSoundfilePrim();

  @Nullable
  FaustUiButton getUiButton();

  @Nullable
  FaustUiCheckbox getUiCheckbox();

  @Nullable
  FaustUiHbargraph getUiHbargraph();

  @Nullable
  FaustUiHgroup getUiHgroup();

  @Nullable
  FaustUiHslider getUiHslider();

  @Nullable
  FaustUiNentry getUiNentry();

  @Nullable
  FaustUiTgroup getUiTgroup();

  @Nullable
  FaustUiVbargraph getUiVbargraph();

  @Nullable
  FaustUiVgroup getUiVgroup();

  @Nullable
  FaustUiVslider getUiVslider();

  @Nullable
  FaustUqString getUqString();

  @Nullable
  PsiElement getIdentifier();

  @Nullable
  PsiElement getNumber();

}
