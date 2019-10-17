package persistance

import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.ServiceManager
import com.intellij.openapi.components.State
import com.intellij.openapi.components.Storage
import com.intellij.openapi.project.Project
import com.intellij.util.xmlb.XmlSerializerUtil
import model.Settings
import java.io.Serializable

@State(name = "MVPConfiguration",
        storages = [Storage(value = "MVPConfiguration.xml")])
class MVPComponent : Serializable, PersistentStateComponent<MVPComponent> {

    companion object {
        fun getInstance(project: Project) = ServiceManager.getService(project, MVPComponent::class.java)
    }

    var settings: Settings = Settings()

    override fun getState(): MVPComponent = this

    override fun loadState(state: MVPComponent) {
        XmlSerializerUtil.copyBean(state, this)
    }
}