package org.faust.lang.psi.impl

import org.faust.lang.psi.FaustNamedElement
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode

abstract class FaustNamedElementImpl(node: ASTNode) : ASTWrapperPsiElement(node), FaustNamedElement
