// This is a generated file. Not intended for manual editing.
package com.intellij.lang.graql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraqlIdentifierExpr extends GraqlNamedElement {

  @Nullable
  PsiElement getIdentifier();

  @Nullable
  PsiElement getStringLiteral();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

}
