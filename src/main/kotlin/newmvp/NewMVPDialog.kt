package newmvp

import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.DialogWrapper
import dependencies.DaggerMVPComponent
import dependencies.MVPModule
import file.CurrentPath
import javax.inject.Inject
import javax.swing.JComponent

class NewMVPDialog(val project: Project, val currentPath: CurrentPath?): DialogWrapper(true), INewMVPDialog{

    private val panel = NewMVPPanel()
    @Inject
    lateinit var presenter: INewMVPDialogPresenter

    init {
        DaggerMVPComponent.builder()
            .mVPModule(MVPModule(project, currentPath!!))
            .build().inject(this)
        init()
    }

    override fun createCenterPanel(): JComponent {
        presenter.attachView(this)
        presenter.onLoadView()
        return panel
    }

    override fun doOKAction() = presenter.onClick()

    override fun showModules(modules: List<String>) {

    }

    override fun showPackage(packageName: String) {

    }

    override fun selectModule(module: String) {

    }

    override fun close() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}