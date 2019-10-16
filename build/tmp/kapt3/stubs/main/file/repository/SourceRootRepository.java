package file.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0014\u0010\n\u001a\u00020\b*\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lfile/repository/SourceRootRepository;", "Lfile/repository/ISourceRootRepository;", "projectStructure", "Lfile/IProjectStructure;", "(Lfile/IProjectStructure;)V", "findCodeSourceRoot", "Lfile/SourceRoot;", "module", "", "findResourcesSourceRoot", "removeModulePathPrefix", "mvp"})
public final class SourceRootRepository implements file.repository.ISourceRootRepository {
    private final file.IProjectStructure projectStructure = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public file.SourceRoot findCodeSourceRoot(@org.jetbrains.annotations.NotNull()
    java.lang.String module) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public file.SourceRoot findResourcesSourceRoot(@org.jetbrains.annotations.NotNull()
    java.lang.String module) {
        return null;
    }
    
    private final java.lang.String removeModulePathPrefix(@org.jetbrains.annotations.NotNull()
    java.lang.String $receiver, java.lang.String module) {
        return null;
    }
    
    public SourceRootRepository(@org.jetbrains.annotations.NotNull()
    file.IProjectStructure projectStructure) {
        super();
    }
}