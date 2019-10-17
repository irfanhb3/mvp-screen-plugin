package persistance.repository

import file.IProjectStructure
import file.ISourceRoot

interface ISourceRootRepository {

    fun findCodeSourceRoot(module: String): ISourceRoot?
    fun findResourcesSourceRoot(module: String): ISourceRoot
}

class SourceRootRepository(private val projectStructure: IProjectStructure) :
    ISourceRootRepository {

    override fun findCodeSourceRoot(module: String) =
            projectStructure.findSourceRoots(module).firstOrNull {
                val pathTrimmed = it.path.removeModulePathPrefix(module)
                pathTrimmed.contains("src", true)
                        && pathTrimmed.contains("main", true)
                        && !pathTrimmed.contains("assets", true)
                        && !pathTrimmed.contains("test", true)
                        && !pathTrimmed.contains("res", true)
            }

    override fun findResourcesSourceRoot(module: String) =
            projectStructure.findSourceRoots(module).first {
                val pathTrimmed = it.path.removeModulePathPrefix(module)
                pathTrimmed.contains("src", true)
                        && pathTrimmed.contains("main", true)
                        && pathTrimmed.contains("res", true)
            }

    private fun String.removeModulePathPrefix(module: String) =
            removePrefix(projectStructure.getProjectPath() + "/" + module)
}