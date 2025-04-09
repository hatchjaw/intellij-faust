package com.github.hatchjaw.faust.ide.structure

import com.github.hatchjaw.faust.lang.psi.FaustFile
import com.github.hatchjaw.faust.lang.psi.FaustFunctionDefinition
import com.github.hatchjaw.faust.lang.psi.FaustIdent
import com.github.hatchjaw.faust.lang.psi.FaustSimpleDefinition
import com.intellij.ide.structureView.StructureViewModel
import com.intellij.ide.structureView.StructureViewModelBase
import com.intellij.ide.structureView.StructureViewTreeElement
import com.intellij.ide.util.treeView.smartTree.Sorter
import com.intellij.openapi.editor.Editor


class FaustStructureViewModel(editor: Editor?, file: FaustFile) :
    StructureViewModelBase(file, editor, FaustStructureViewElement(file)),
    StructureViewModel.ElementInfoProvider {

    init {
        withSuitableClasses(
            FaustSimpleDefinition::class.java,
            FaustFunctionDefinition::class.java,
        )
        withSorters(
            Sorter.ALPHA_SORTER
        )
    }

    override fun isAlwaysShowsPlus(element: StructureViewTreeElement): Boolean = element.value is FaustFile

    override fun isAlwaysLeaf(element: StructureViewTreeElement): Boolean =
        when (element.value) {
            is FaustSimpleDefinition,
            is FaustFunctionDefinition -> true

            else -> false
        }
}
