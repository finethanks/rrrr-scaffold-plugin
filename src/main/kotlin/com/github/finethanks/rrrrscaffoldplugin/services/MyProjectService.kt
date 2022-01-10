package com.github.finethanks.rrrrscaffoldplugin.services

import com.intellij.openapi.project.Project
import com.github.finethanks.rrrrscaffoldplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
