package data.repository

import file.IProjectStructure
import file.ProjectStructure


interface IModuleRepository {

    fun getAllModules(): List<String>
}

class ModuleRepository(private val projectStructure: IProjectStructure) : IModuleRepository {

    override fun getAllModules() = projectStructure.getAllModules().filter { !it.contains(projectStructure.getProjectName()) }

}