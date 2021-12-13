package com.github.specialk46.testplugin.services

import com.intellij.openapi.project.Project
import com.github.specialk46.testplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
