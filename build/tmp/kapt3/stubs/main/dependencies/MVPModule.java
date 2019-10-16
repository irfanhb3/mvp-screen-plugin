package dependencies;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\fH\u0007J\b\u0010\u0017\u001a\u00020\u000eH\u0007J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0019"}, d2 = {"Ldependencies/MVPModule;", "", "project", "Lcom/intellij/openapi/project/Project;", "currentPath", "Lfile/CurrentPath;", "(Lcom/intellij/openapi/project/Project;Lfile/CurrentPath;)V", "getCurrentPath", "()Lfile/CurrentPath;", "getProject", "()Lcom/intellij/openapi/project/Project;", "provideModuleRepository", "Ldata/repository/IModuleRepository;", "projectStructure", "Lfile/IProjectStructure;", "providePackageExtractor", "Ldata/file/IPackageExtractor;", "sourceRootRepository", "Lfile/repository/ISourceRootRepository;", "providePresenter", "Lnewmvp/INewMVPDialogPresenter;", "packageExtractor", "moduleRepository", "provideProjectStructure", "provideSourceRepository", "mvp"})
@dagger.Module()
public final class MVPModule {
    @org.jetbrains.annotations.NotNull()
    private final com.intellij.openapi.project.Project project = null;
    @org.jetbrains.annotations.NotNull()
    private final file.CurrentPath currentPath = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final file.IProjectStructure provideProjectStructure() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final file.repository.ISourceRootRepository provideSourceRepository(@org.jetbrains.annotations.NotNull()
    file.IProjectStructure projectStructure) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final data.file.IPackageExtractor providePackageExtractor(@org.jetbrains.annotations.NotNull()
    file.repository.ISourceRootRepository sourceRootRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final data.repository.IModuleRepository provideModuleRepository(@org.jetbrains.annotations.NotNull()
    file.IProjectStructure projectStructure) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final newmvp.INewMVPDialogPresenter providePresenter(@org.jetbrains.annotations.NotNull()
    data.file.IPackageExtractor packageExtractor, @org.jetbrains.annotations.NotNull()
    data.repository.IModuleRepository moduleRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellij.openapi.project.Project getProject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final file.CurrentPath getCurrentPath() {
        return null;
    }
    
    public MVPModule(@org.jetbrains.annotations.NotNull()
    com.intellij.openapi.project.Project project, @org.jetbrains.annotations.NotNull()
    file.CurrentPath currentPath) {
        super();
    }
}