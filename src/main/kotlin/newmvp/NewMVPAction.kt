package newmvp

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.module.ModuleUtil
import file.CurrentPath
import com.intellij.openapi.actionSystem.PlatformDataKeys

class NewMVPAction: AnAction(){

    override fun actionPerformed(e: AnActionEvent) {
        val currentPath = e.getData(PlatformDataKeys.VIRTUAL_FILE)?.let {
            val module = ModuleUtil.findModuleForFile(it, e.project!!)?.name ?: ""
            CurrentPath(it.path, it.isDirectory, module)
        }
        NewMVPDialog(e.project!!, currentPath).show()
    }

}