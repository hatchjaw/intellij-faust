package com.github.hatchjaw.faust.lang.psi.impl

import com.github.hatchjaw.faust.lang.psi.FaustNamedElement
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode

abstract class FaustNamedElementImpl(node: ASTNode) : ASTWrapperPsiElement(node), FaustNamedElement
