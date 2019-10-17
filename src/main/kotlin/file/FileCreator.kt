package file

import model.FileType
import model.Settings
import persistance.repository.ISettingsRepository
import persistance.repository.ISourceRootRepository
import javax.inject.Inject

private const val LAYOUT_DIRECTORY = "layout"

interface IFileCreator {

    fun createScreenFiles(packageName: String, screenName: String, module: String)

}

class FileCreator @Inject constructor(
    private val settingsRepository: ISettingsRepository,
    private val sourceRootRepository: ISourceRootRepository
) : IFileCreator {

    override fun createScreenFiles(
        packageName: String,
        screenName: String,
        module: String
    ) {
        val codeSubdirectory = findCodeSubdirectory(packageName, module)
        val resourcesSubdirectory = findResourcesSubdirectory(module)
        if (codeSubdirectory != null) {
            settingsRepository.loadSettings().apply {
                val baseClass = getAndroidComponentBaseClass()
                val activityComponent = getAndroidClassComponent()
                MVPElements.forEach {
                    if (it.fileType == FileType.LAYOUT_XML) {
                        val file = File(
                            it.fileName(screenName, packageName, activityComponent, baseClass),
                            it.body(screenName, packageName, activityComponent, baseClass),
                            it.fileType
                        )
                        resourcesSubdirectory.addFile(file)
                    } else {
                        val file = File(
                            it.fileName(screenName, packageName, activityComponent, baseClass),
                            it.body(screenName, packageName, activityComponent, baseClass),
                            it.fileType
                        )
                        codeSubdirectory.addFile(file)
                    }
                }
            }
        }
    }

    private fun findCodeSubdirectory(packageName: String, module: String): IDirectory? =
        sourceRootRepository.findCodeSourceRoot(module)?.run {
            var subdirectory = directory
            packageName.split(".").forEach {
                subdirectory = subdirectory.findSubdirectory(it) ?: subdirectory.createSubdirectory(it)
            }
            return subdirectory
        }

    private fun findResourcesSubdirectory(module: String) =
        sourceRootRepository.findResourcesSourceRoot(module).directory.run {
            findSubdirectory(LAYOUT_DIRECTORY) ?: createSubdirectory(LAYOUT_DIRECTORY)
        }

    private fun Settings.getAndroidComponentBaseClass() = activityBaseClass
    private fun Settings.getAndroidClassComponent() = activityComponentName

}