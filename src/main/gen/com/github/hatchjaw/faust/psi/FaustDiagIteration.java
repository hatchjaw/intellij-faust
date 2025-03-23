// This is a generated file. Not intended for manual editing.
package com.github.hatchjaw.faust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FaustDiagIteration extends PsiElement {

  @Nullable
  FaustDiagComposition getDiagComposition();

  @Nullable
  FaustDiagIteration getDiagIteration();

  @NotNull
  FaustNumIter getNumIter();

  @NotNull
  PsiElement getIdentifier();

}
