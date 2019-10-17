package newmvp

import data.file.IPackageExtractor
import data.repository.IModuleRepository
import file.*
import javax.inject.Inject

interface INewMVPDialogPresenter{
    fun attachView(view: INewMVPDialog)
    fun onLoadView()
    fun onClick(packageName: String, screenName: String, module: String)
}

class NewMVPDialogPresenter @Inject constructor(val packageExtractor: IPackageExtractor,
                                                val moduleRepository: IModuleRepository,
                                                val fileCreator: IFileCreator,
                                                val writerDispatcher: IWriteActionDispatcher,
                                                val currentPath: CurrentPath?): INewMVPDialogPresenter {


    private var view: INewMVPDialog? = null
    override fun attachView(view: INewMVPDialog){
        this.view = view
    }

    override fun onLoadView(){
        view?.showPackage(packageExtractor.extractFromCurrentPath())
        view?.showModules(moduleRepository.getAllModules())
        currentPath?.let { view?.selectModule(currentPath.module)}
    }

    override fun onClick(packageName: String, screenName: String, module: String) {
        writerDispatcher.dispatch {
            fileCreator.createScreenFiles(packageName, screenName, module)
        }
        view?.close()
    }

}