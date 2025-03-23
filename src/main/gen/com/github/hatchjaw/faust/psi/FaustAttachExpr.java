// This is a generated file. Not intended for manual editing.
package com.github.hatchjaw.faust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FaustAttachExpr extends PsiElement {

  @NotNull
  List<FaustAccess> getAccessList();

  @NotNull
  List<FaustBitwise> getBitwiseList();

  @NotNull
  List<FaustComparator> getComparatorList();

  @NotNull
  List<FaustComponentExpr> getComponentExprList();

  @NotNull
  List<FaustCut> getCutList();

  @NotNull
  List<FaustDelay> getDelayList();

  @NotNull
  List<FaustDiagComposition> getDiagCompositionList();

  @NotNull
  List<FaustDiagIteration> getDiagIterationList();

  @NotNull
  List<FaustEnvironmentExpr> getEnvironmentExprList();

  @NotNull
  List<FaustLibraryExpr> getLibraryExprList();

  @NotNull
  List<FaustMath> getMathList();

}
