package newmvp

import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.DialogWrapper
import dependencies.DaggerMVPComponent
import dependencies.MVPModule
import file.CurrentPath
import javax.inject.Inject
import javax.swing.JComponent

class NewMVPDialog(val project: Project, val currentPath: CurrentPath?) : DialogWrapper(true), INewMVPDialog {

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

    override fun doOKAction() = presenter.onClick(
        panel.packageTextField.text,
        panel.nameTextField.text,
        panel.moduleComboBox.selectedItem.toString()
    )

    override fun showModules(modules: List<String>) = modules.forEach { panel.moduleComboBox.addItem(it) }

    override fun showPackage(packageName: String) {
        panel.packageTextField.text = packageName
    }

    override fun selectModule(module: String) {
        panel.moduleComboBox.selectedItem = module
    }

    override fun close() = close(OK_EXIT_CODE)


}