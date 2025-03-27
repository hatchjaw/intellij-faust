// This is a generated file. Not intended for manual editing.
package com.github.hatchjaw.faust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FaustEnvironmentConstruction extends PsiElement {

  @NotNull
  List<FaustDeclaration> getDeclarationList();

  @NotNull
  List<FaustDefinition> getDefinitionList();

  @NotNull
  List<FaustFileImport> getFileImportList();

  @NotNull
  List<FaustVariant> getVariantList();

}
