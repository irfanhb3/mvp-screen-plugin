package file

import com.intellij.openapi.application.ApplicationManager

interface IWriteActionDispatcher {
    fun dispatch(action: () -> Unit)
}

class WriteActionDispatcher : IWriteActionDispatcher {

    override fun dispatch(action: () -> Unit) = ApplicationManager.getApplication().runWriteAction {
        action()
    }
}
