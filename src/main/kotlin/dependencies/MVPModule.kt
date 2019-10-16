package dependencies

import com.intellij.openapi.project.Project
import dagger.Module
import dagger.Provides
import data.file.IPackageExtractor
import data.file.PackageExtractor
import data.repository.IModuleRepository
import data.repository.ModuleRepository
import file.CurrentPath
import file.IProjectStructure
import file.ProjectStructure
import file.repository.ISourceRootRepository
import file.repository.SourceRootRepository
import newmvp.INewMVPDialogPresenter
import newmvp.NewMVPDialogPresenter

@Module
class MVPModule(val project: Project, val currentPath: CurrentPath){

    @Provides
    fun provideProjectStructure(): IProjectStructure = ProjectStructure(project)

    @Provides
    fun provideSourceRepository(projectStructure: IProjectStructure): ISourceRootRepository = SourceRootRepository(projectStructure)

    @Provides
    fun providePackageExtractor(sourceRootRepository: ISourceRootRepository): IPackageExtractor = PackageExtractor(currentPath, sourceRootRepository)

    @Provides
    fun provideModuleRepository(projectStructure: IProjectStructure): IModuleRepository = ModuleRepository(projectStructure)

    @Provides
    fun providePresenter(packageExtractor: IPackageExtractor, moduleRepository: IModuleRepository): INewMVPDialogPresenter{
        return NewMVPDialogPresenter(packageExtractor, moduleRepository, currentPath)
    }

}