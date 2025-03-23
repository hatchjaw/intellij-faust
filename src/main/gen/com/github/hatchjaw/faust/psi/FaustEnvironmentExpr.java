// This is a generated file. Not intended for manual editing.
package com.github.hatchjaw.faust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FaustEnvironmentExpr extends PsiElement {

  @NotNull
  List<FaustDefinition> getDefinitionList();

  @NotNull
  List<FaustFunctionDefinition> getFunctionDefinitionList();

}
