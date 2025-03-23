// This is a generated file. Not intended for manual editing.
package com.github.hatchjaw.faust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FaustOperand extends PsiElement {

  @Nullable
  FaustAccess getAccess();

  @NotNull
  List<FaustDelay1> getDelay1List();

  @Nullable
  FaustDiagComposition getDiagComposition();

  @Nullable
  FaustFunctionCall getFunctionCall();

  @Nullable
  FaustPartial getPartial();

  @Nullable
  FaustUIElement getUIElement();

  @Nullable
  PsiElement getIdentifier();

  @Nullable
  PsiElement getNumber();

}
