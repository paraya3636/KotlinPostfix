package main.java.org.paradrops.postfix

import com.intellij.codeInsight.template.postfix.templates.JavaPostfixTemplateProvider
import com.intellij.codeInsight.template.postfix.templates.PostfixTemplate
import com.intellij.util.containers.ContainerUtil
import java.util.*

class KotlinPostfix : JavaPostfixTemplateProvider {

    private val templates: HashSet<PostfixTemplate>

    constructor() : super() {
        val templates = ArrayList<PostfixTemplate>(
        )
        this.templates = ContainerUtil.newHashSet<PostfixTemplate>(templates)
    }

    override fun getTemplates(): MutableSet<PostfixTemplate> {
        return templates
    }
}
