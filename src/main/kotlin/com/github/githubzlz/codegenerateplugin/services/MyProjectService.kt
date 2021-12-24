package com.github.githubzlz.codegenerateplugin.services

import com.intellij.openapi.project.Project
import com.github.githubzlz.codegenerateplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
