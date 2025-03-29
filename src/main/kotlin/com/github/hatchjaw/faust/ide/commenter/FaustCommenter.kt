package com.github.hatchjaw.faust.ide.commenter

import com.github.hatchjaw.faust.psi.FaustTypes
import com.intellij.lang.CodeDocumentationAwareCommenter
import com.intellij.psi.PsiComment
import com.intellij.psi.tree.IElementType


class FaustCommenter : CodeDocumentationAwareCommenter {

    override fun getLineCommentPrefix(): String = "//"

    override fun getBlockCommentPrefix(): String = "/*"

    override fun getBlockCommentSuffix(): String = "*/"

    override fun getCommentedBlockCommentPrefix(): String? = null

    override fun getCommentedBlockCommentSuffix(): String? = null

    override fun getLineCommentTokenType(): IElementType? = FaustTypes.LINE_COMMENT

    override fun getBlockCommentTokenType(): IElementType? = FaustTypes.BLOCK_COMMENT

    override fun getDocumentationCommentTokenType(): IElementType? = FaustTypes.DEF_DOC_COMMENT

    override fun getDocumentationCommentPrefix(): String? = null

    override fun getDocumentationCommentLinePrefix(): String? = null

    override fun getDocumentationCommentSuffix(): String? = null

    override fun isDocumentationComment(p0: PsiComment?): Boolean = false
}
