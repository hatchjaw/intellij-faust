package com.github.hatchjaw.faust.lang.stubs

import com.github.hatchjaw.faust.lang.psi.FaustIdent
import com.intellij.psi.stubs.IStubElementType
import com.intellij.psi.stubs.StubBase
import com.intellij.psi.stubs.StubElement

class FaustIdentStub(parent: StubElement<*>?, elementType: IStubElementType<*, *>) :
    StubBase<FaustIdent>(parent, elementType) {
}
