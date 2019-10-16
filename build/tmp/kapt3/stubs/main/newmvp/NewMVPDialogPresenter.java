package newmvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lnewmvp/NewMVPDialogPresenter;", "Lnewmvp/INewMVPDialogPresenter;", "packageExtractor", "Ldata/file/IPackageExtractor;", "moduleRepository", "Ldata/repository/IModuleRepository;", "currentPath", "Lfile/CurrentPath;", "(Ldata/file/IPackageExtractor;Ldata/repository/IModuleRepository;Lfile/CurrentPath;)V", "getCurrentPath", "()Lfile/CurrentPath;", "getModuleRepository", "()Ldata/repository/IModuleRepository;", "getPackageExtractor", "()Ldata/file/IPackageExtractor;", "view", "Lnewmvp/INewMVPDialog;", "attachView", "", "onClick", "onLoadView", "mvp"})
public final class NewMVPDialogPresenter implements newmvp.INewMVPDialogPresenter {
    private newmvp.INewMVPDialog view;
    @org.jetbrains.annotations.NotNull()
    private final data.file.IPackageExtractor packageExtractor = null;
    @org.jetbrains.annotations.NotNull()
    private final data.repository.IModuleRepository moduleRepository = null;
    @org.jetbrains.annotations.Nullable()
    private final file.CurrentPath currentPath = null;
    
    @java.lang.Override()
    public void attachView(@org.jetbrains.annotations.NotNull()
    newmvp.INewMVPDialog view) {
    }
    
    @java.lang.Override()
    public void onLoadView() {
    }
    
    @java.lang.Override()
    public void onClick() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final data.file.IPackageExtractor getPackageExtractor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final data.repository.IModuleRepository getModuleRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final file.CurrentPath getCurrentPath() {
        return null;
    }
    
    @javax.inject.Inject()
    public NewMVPDialogPresenter(@org.jetbrains.annotations.NotNull()
    data.file.IPackageExtractor packageExtractor, @org.jetbrains.annotations.NotNull()
    data.repository.IModuleRepository moduleRepository, @org.jetbrains.annotations.Nullable()
    file.CurrentPath currentPath) {
        super();
    }
}