package model

import java.io.Serializable

private const val DEFAULT_BASE_ACTIVITY_CLASS = "androidx.appcompat.app.AppCompatActivity"
private const val DEFAULT_BASE_ACTIVITY_NAME = "Activity"
private const val DEFAULT_BASE_FRAGMENT_CLASS = "androidx.fragment.app.Fragment"
private val DEFAULT_MVP_TEMPLATE = "package ${FileNames.PACKAGE_NAME.value}\n\nimport ${FileNames.ANDROID_COMPONENT_FULL_CLASS_NAME.value}\n\nclass ${FileNames.NAME.value}${FileNames.ANDROID_COMPONENT_NAME.value} : ${FileNames.ANDROID_COMPONENT_CLASS_NAME.value}"
private val DEFAULT_ACTIVITY_TEMPLATE = "package ${FileNames.PACKAGE_NAME.value}\n\nclass ${FileNames.NAME.value}${FileNames.ANDROID_COMPONENT_NAME.value} : " +
        "BaseActivity<${FileNames.NAME.value}View, ${FileNames.NAME.value}State, I${FileNames.NAME.value}Presenter>(), ${FileNames.NAME.value}View{\n\n" +
        "\t@Inject\n\toverride lateinit var presenter: I${FileNames.NAME.value}Presenter\n\n" +
        "\toverride fun onCreate(savedInstanceState: Bundle?){" +
        "\n\t\tsuper.onCreate(savedInstanceState)\n\t\tpresenter.attachView(this)\n\t}\n\n" +
        "\toverride fun showLoading(){\n\t}\n\n" +
        "\toverride fun hideLoading(){\n\t}\n\n" +
        "\toverride fun showError(error: Throwable){\n\t}\n\n" +
        "}"

private val DEFAULT_PRESENTER_TEMPLATE = "package ${FileNames.PACKAGE_NAME.value}\n\nclass ${FileNames.NAME.value}Presenter: I${FileNames.NAME.value}Presenter{\n\n" +
        "\toverride var view: ${FileNames.NAME.value}View? = null\n\n" +
        "\toverride fun updateView(state: ${FileNames.NAME.value}State){\n" +
        "\t\twhen(state){}\n\t}\n\n" +
        "}"

private val DEFAULT_CONTRACT_TEMPLATE = "package ${FileNames.PACKAGE_NAME.value}\n\ninterface ${FileNames.NAME.value}View: BaseView{\n\n" +
        "\tfun showLoading()\n" +
        "\tfun hideLoading()\n" +
        "\tfun showError(error: Throwable)\n\n}\n\n" +
        "interface I${FileNames.NAME.value}Presenter: BasePresenter<${FileNames.NAME.value}View, ${FileNames.NAME.value}State>{}\n\n" +
        "sealed class ${FileNames.NAME.value}State: BaseState{}"

private fun defaultMVPElements() = mutableListOf(
        MVPElement("Presenter", DEFAULT_PRESENTER_TEMPLATE, FileType.KOTLIN, FileType.KOTLIN.defaultFileName),
        MVPElement("Activity", DEFAULT_ACTIVITY_TEMPLATE, FileType.KOTLIN, FileType.KOTLIN.defaultFileName),
        MVPElement("Contract", DEFAULT_CONTRACT_TEMPLATE, FileType.KOTLIN, FileType.KOTLIN.defaultFileName),
        MVPElement("layout", FileType.LAYOUT_XML.defaultTemplate, FileType.LAYOUT_XML, FileType.LAYOUT_XML.defaultFileName)
)

data class Settings(var MVPElements: MutableList<MVPElement> = defaultMVPElements(),
               var activityBaseClass: String = DEFAULT_BASE_ACTIVITY_CLASS,
               var activityComponentName: String = DEFAULT_BASE_ACTIVITY_NAME) : Serializable