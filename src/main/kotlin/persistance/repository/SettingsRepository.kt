package persistance.repository

import com.intellij.openapi.project.Project
import model.Settings
import persistance.MVPComponent

interface ISettingsRepository {
    fun loadSettings(): Settings
    fun update(settings: Settings)
}

class SettingsRepository(private val project: Project) : ISettingsRepository {

    override fun loadSettings() = MVPComponent.getInstance(project).settings

    override fun update(settings: Settings) = MVPComponent.getInstance(project).run {
        this.settings = settings
    }
}