package org.faust.lang.stubs

import org.faust.lang.psi.FaustIdent
import com.intellij.psi.stubs.IStubElementType
import com.intellij.psi.stubs.StubBase
import com.intellij.psi.stubs.StubElement

class FaustIdentStub(parent: StubElement<*>?, elementType: IStubElementType<*, *>) :
    StubBase<FaustIdent>(parent, elementType) {
}
