// This is a generated file. Not intended for manual editing.
package com.github.hatchjaw.faust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FaustDiagComposition extends PsiElement {

  @Nullable
  FaustAccess getAccess();

  @NotNull
  List<FaustBitwise> getBitwiseList();

  @NotNull
  List<FaustComparator> getComparatorList();

  @Nullable
  FaustComposition getComposition();

  @NotNull
  List<FaustCut> getCutList();

  @NotNull
  List<FaustDelay> getDelayList();

  @Nullable
  FaustDiagComposition getDiagComposition();

  @Nullable
  FaustDiagIteration getDiagIteration();

  @Nullable
  FaustForeignFunction getForeignFunction();

  @Nullable
  FaustFunctionCall getFunctionCall();

  @Nullable
  FaustInfix getInfix();

  @NotNull
  List<FaustLetrecExpression> getLetrecExpressionList();

  @NotNull
  List<FaustMath> getMathList();

  @Nullable
  FaustOperand getOperand();

  @Nullable
  FaustPartial getPartial();

  @Nullable
  FaustPrefix getPrefix();

  @Nullable
  FaustProgExp getProgExp();

  @Nullable
  FaustRouteExpr getRouteExpr();

  @Nullable
  FaustTypeCast getTypeCast();

  @Nullable
  FaustWaveformExpr getWaveformExpr();

  @NotNull
  List<FaustWithExpression> getWithExpressionList();

}
