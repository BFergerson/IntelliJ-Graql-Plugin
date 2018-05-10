// This is a generated file. Not intended for manual editing.
package com.intellij.lang.graql.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.graql.psi.GraqlTokenTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.graql.psi.*;

public class GraqlDegreesImpl extends ASTWrapperPsiElement implements GraqlDegrees {

  public GraqlDegreesImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GraqlVisitor visitor) {
    visitor.visitDegrees(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GraqlVisitor) accept((GraqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GraqlInList getInList() {
    return findChildByClass(GraqlInList.class);
  }

  @Override
  @Nullable
  public GraqlOfList getOfList() {
    return findChildByClass(GraqlOfList.class);
  }

}
