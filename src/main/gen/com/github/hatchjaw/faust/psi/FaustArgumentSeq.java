// This is a generated file. Not intended for manual editing.
package com.github.hatchjaw.faust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FaustArgumentSeq extends PsiElement {

  @Nullable
  FaustAccess getAccess();

  @Nullable
  FaustArgumentSeq getArgumentSeq();

  @Nullable
  FaustBitwise getBitwise();

  @Nullable
  FaustComparator getComparator();

  @Nullable
  FaustComponentExpr getComponentExpr();

  @Nullable
  FaustCut getCut();

  @Nullable
  FaustDelay getDelay();

  @Nullable
  FaustDiagComposition getDiagComposition();

  @Nullable
  FaustDiagIteration getDiagIteration();

  @Nullable
  FaustEnvironmentExpr getEnvironmentExpr();

  @Nullable
  FaustLibraryExpr getLibraryExpr();

  @Nullable
  FaustMath getMath();

  @Nullable
  PsiElement getNumber();

}
