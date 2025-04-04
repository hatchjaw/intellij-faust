package com.github.hatchjaw.faust.ide.navigation

import com.intellij.navigation.ChooseByNameContributorEx
import com.intellij.navigation.NavigationItem
import com.intellij.openapi.project.Project
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.util.Processor
import com.intellij.util.containers.ContainerUtil
import com.intellij.util.indexing.FindSymbolParameters
import com.intellij.util.indexing.IdFilter
import java.util.*


//class FaustSymbolNavigationContributor : ChooseByNameContributorEx {
//    override fun processNames(processor: Processor<in String>, scope: GlobalSearchScope, filter: IdFilter?) {
//        val project: Project? = Objects.requireNonNull(scope.project)
//        val propertyKeys: List<String> = ContainerUtil.map(
//            SimpleUtil.findProperties(project), SimpleProperty::getKey
//        )
//        ContainerUtil.process(propertyKeys, processor)
//    }
//
//    override fun processElementsWithName(
//        name: String,
//        processor: Processor<in NavigationItem>,
//        parameters: FindSymbolParameters
//    ) {
//        val properties: List<NavigationItem> = ContainerUtil.map(
//            SimpleUtil.findProperties(parameters.project, name)
//        ) { property -> property }
//        ContainerUtil.process(properties, processor)
//    }
//}
