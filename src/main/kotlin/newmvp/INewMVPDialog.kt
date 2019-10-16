package newmvp

interface INewMVPDialog {

    fun showModules(modules: List<String>)
    fun showPackage(packageName: String)
    fun selectModule(module: String)
    fun close()

}