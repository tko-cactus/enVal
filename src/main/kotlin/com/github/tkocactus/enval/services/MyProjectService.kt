package com.github.tkocactus.enval.services

import com.intellij.openapi.project.Project
import com.github.tkocactus.enval.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
