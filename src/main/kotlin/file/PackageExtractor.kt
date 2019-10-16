package data.file

import file.CurrentPath
import file.repository.ISourceRootRepository


interface IPackageExtractor {

    fun extractFromCurrentPath(): String
}

class PackageExtractor(private val currentPath: CurrentPath?,
                           private val sourceRootRepository: ISourceRootRepository
) : IPackageExtractor {

    override fun extractFromCurrentPath(): String {
        val sourceRootPath = currentPath?.let { sourceRootRepository.findCodeSourceRoot(currentPath.module)?.path }
        return if (currentPath != null && sourceRootPath != null && currentPath.path != sourceRootPath && currentPath.path.contains(sourceRootPath)) {
            currentPath.path.removePrefix("$sourceRootPath/")
                    .removeFilePath(currentPath.isDirectory)
                    .replace("/", ".")
        } else {
            ""
        }
    }

    private fun String.removeFilePath(isDirectory: Boolean) =
            if (!isDirectory) {
                removeRange(indexOfLast { it == '/' }, length)
            } else {
                this
            }

}
