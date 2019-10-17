package dependencies

import com.intellij.openapi.project.Project
import dagger.Module
import dagger.Provides
import data.file.IPackageExtractor
import data.file.PackageExtractor
import data.repository.IModuleRepository
import data.repository.ModuleRepository
import file.*
import persistance.repository.ISourceRootRepository
import persistance.repository.SourceRootRepository
import newmvp.INewMVPDialogPresenter
import newmvp.NewMVPDialogPresenter
import persistance.repository.ISettingsRepository
import persistance.repository.SettingsRepository

@Module
class MVPModule(val project: Project, val currentPath: CurrentPath) {

    @Provides
    fun provideProjectStructure(): IProjectStructure = ProjectStructure(project)

    @Provides
    fun provideSourceRepository(projectStructure: IProjectStructure): ISourceRootRepository =
        SourceRootRepository(projectStructure)

    @Provides
    fun providePackageExtractor(sourceRootRepository: ISourceRootRepository): IPackageExtractor =
        PackageExtractor(currentPath, sourceRootRepository)

    @Provides
    fun provideModuleRepository(projectStructure: IProjectStructure): IModuleRepository =
        ModuleRepository(projectStructure)

    @Provides
    fun provideActionDispatcher(): IWriteActionDispatcher = WriteActionDispatcher()

    @Provides
    fun provideSettingsRepositoy(): ISettingsRepository = SettingsRepository(project)

    @Provides
    fun provideFileCreator(
        settingsRepository: ISettingsRepository,
        sourceRootRepository: ISourceRootRepository
    ): IFileCreator = FileCreator(settingsRepository, sourceRootRepository)

    @Provides
    fun providePresenter(
        packageExtractor: IPackageExtractor,
        moduleRepository: IModuleRepository,
        fileCreator: IFileCreator,
        writeActionDispatcher: IWriteActionDispatcher
    ): INewMVPDialogPresenter {
        return NewMVPDialogPresenter(packageExtractor, moduleRepository, fileCreator, writeActionDispatcher, currentPath)
    }

}