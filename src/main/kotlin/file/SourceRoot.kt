package file

import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.PsiManager

interface ISourceRoot {

    val path: String

    val directory: Directory
}

class SourceRoot(project: Project, virtualFile: VirtualFile) : ISourceRoot {

    override val path = virtualFile.path

    override val directory = DirectoryImpl(project, PsiManager.getInstance(project).findDirectory(virtualFile)!!)
}
