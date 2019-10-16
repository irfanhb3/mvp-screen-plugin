package newmvp

import data.file.IPackageExtractor
import data.file.PackageExtractor
import data.repository.IModuleRepository
import data.repository.ModuleRepository
import file.CurrentPath
import javax.inject.Inject

interface INewMVPDialogPresenter{
    fun attachView(view: INewMVPDialog)
    fun onLoadView()
    fun onClick()
}

class NewMVPDialogPresenter @Inject constructor(val packageExtractor: IPackageExtractor,
                                                val moduleRepository: IModuleRepository,
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

    override fun onClick(){

    }

}