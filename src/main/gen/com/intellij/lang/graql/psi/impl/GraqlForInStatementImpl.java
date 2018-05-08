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

public class GraqlForInStatementImpl extends ASTWrapperPsiElement implements GraqlForInStatement {

  public GraqlForInStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GraqlVisitor visitor) {
    visitor.visitForInStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GraqlVisitor) accept((GraqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public GraqlBlock getBlock() {
    return findNotNullChildByClass(GraqlBlock.class);
  }

  @Override
  @NotNull
  public GraqlEscapedExpression getEscapedExpression() {
    return findNotNullChildByClass(GraqlEscapedExpression.class);
  }

  @Override
  @NotNull
  public GraqlIdentifier getIdentifier() {
    return findNotNullChildByClass(GraqlIdentifier.class);
  }

}
