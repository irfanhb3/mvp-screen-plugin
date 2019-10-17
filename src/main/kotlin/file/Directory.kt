package file

import com.intellij.lang.xml.XMLLanguage
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory
import com.intellij.psi.PsiFileFactory
import model.FileType
import org.jetbrains.kotlin.idea.KotlinLanguage

interface IDirectory {

    fun findSubdirectory(name: String): IDirectory?
    fun createSubdirectory(name: String): IDirectory
    fun addFile(file: File)
}

class Directory(private val project: Project,
                    private val psiDirectory: PsiDirectory) : IDirectory {

    override fun findSubdirectory(name: String) = psiDirectory.findSubdirectory(name)?.let { Directory(project, it) }

    override fun createSubdirectory(name: String) = Directory(project, psiDirectory.createSubdirectory(name))

    override fun addFile(file: File) {
        val language = when(file.fileType) {
            FileType.KOTLIN -> KotlinLanguage.INSTANCE
            FileType.LAYOUT_XML -> XMLLanguage.INSTANCE
        }
        val psiFile = PsiFileFactory.getInstance(project).createFileFromText("${file.name}.${file.fileType.extension}", language, file.content)
        psiDirectory.add(psiFile)
    }
}
