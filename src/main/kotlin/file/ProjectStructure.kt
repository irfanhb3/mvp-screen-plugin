package file

import com.intellij.openapi.module.ModuleManager
import com.intellij.openapi.project.Project
import org.jetbrains.kotlin.idea.util.sourceRoots

interface IProjectStructure {

    fun findSourceRoots(module: String): List<SourceRoot>
    fun getAllModules(): List<String>
    fun getProjectName(): String
    fun getProjectPath(): String
}

class ProjectStructure(private val project: Project) : IProjectStructure {

    override fun findSourceRoots(module: String) =
            ModuleManager.getInstance(project).findModuleByName(module)?.sourceRoots?.map { SourceRoot(project, it) }
                    ?: throw IllegalStateException("$module module doesn't exist!")

    override fun getAllModules() = ModuleManager.getInstance(project).modules.map { it.name }

    override fun getProjectName() = project.name

    override fun getProjectPath() = project.basePath ?: ""
}