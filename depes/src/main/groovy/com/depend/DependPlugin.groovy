package com.depend

import org.gradle.api.Plugin
import org.gradle.api.Project

public class DependPlugin implements Plugin<Project> {

    void apply(Project project) {
        project.extensions.create("depends", DependComp)
    }
}