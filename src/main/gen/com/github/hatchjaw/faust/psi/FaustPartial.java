// This is a generated file. Not intended for manual editing.
package com.github.hatchjaw.faust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FaustPartial extends PsiElement {

  @Nullable
  FaustBitwise getBitwise();

  @Nullable
  FaustComparator getComparator();

  @Nullable
  FaustCut getCut();

  @Nullable
  FaustDelay getDelay();

  @Nullable
  FaustDiagComposition getDiagComposition();

  @Nullable
  FaustDiagIteration getDiagIteration();

  @Nullable
  FaustMath getMath();

  @Nullable
  FaustTypeCast getTypeCast();

}
