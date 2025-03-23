// This is a generated file. Not intended for manual editing.
package com.github.hatchjaw.faust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FaustInfix extends PsiElement {

  @NotNull
  List<FaustBitwise> getBitwiseList();

  @NotNull
  List<FaustComparator> getComparatorList();

  @NotNull
  List<FaustCut> getCutList();

  @NotNull
  List<FaustDelay> getDelayList();

  @Nullable
  FaustInfix getInfix();

  @NotNull
  List<FaustMath> getMathList();

  @Nullable
  FaustOperand getOperand();

  @Nullable
  FaustPartial getPartial();

}
