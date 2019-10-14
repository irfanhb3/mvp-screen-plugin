import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.module.ModuleManager
import com.intellij.openapi.roots.ProjectRootManager
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.PsiDirectory
import com.intellij.psi.PsiFileFactory
import com.intellij.psi.PsiManager
import org.jetbrains.kotlin.idea.KotlinLanguage
import org.jetbrains.kotlin.idea.util.sourceRoots

class NewActivityAction: AnAction(){

    override fun actionPerformed(e: AnActionEvent) {
        val psiFile = PsiFileFactory.getInstance(e.project).
            createFileFromText("MyActivity", KotlinLanguage.INSTANCE, "class MyActivity: AppCompatActivity")
        lateinit var virtualFile: VirtualFile
        ModuleManager.getInstance(e.project!!).
            findModuleByName("app")?.sourceRoots?.map { virtualFile = it }
            ?: throw IllegalStateException("app module doesn't exist!")
        val psiDirectory = PsiManager.getInstance(e.project!!).findDirectory(virtualFile)!!
        psiDirectory.add(psiFile)
    }

}