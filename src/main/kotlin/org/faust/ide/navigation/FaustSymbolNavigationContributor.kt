package org.faust.ide.navigation

import org.faust.lang.FaustUtils
import org.faust.lang.psi.FaustIdent
import com.intellij.navigation.ChooseByNameContributorEx
import com.intellij.navigation.NavigationItem
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.util.Processor
import com.intellij.util.containers.ContainerUtil
import com.intellij.util.indexing.FindSymbolParameters
import com.intellij.util.indexing.IdFilter


class FaustSymbolNavigationContributor : ChooseByNameContributorEx {

    override fun processNames(processor: Processor<in String?>, scope: GlobalSearchScope, filter: IdFilter?) {
        scope.project?.let {
            val propertyKeys: List<String?> = ContainerUtil.map(
                FaustUtils.findIdents(it), FaustIdent::getName
            )
            ContainerUtil.process(propertyKeys, processor)
        }
    }

    override fun processElementsWithName(
        name: String,
        processor: Processor<in NavigationItem?>,
        parameters: FindSymbolParameters
    ) {
        val properties: List<NavigationItem> = ContainerUtil.map(
            FaustUtils.findIdents(parameters.project, name)
        ) { ident -> ident as NavigationItem }
        ContainerUtil.process(properties, processor)
    }
}
