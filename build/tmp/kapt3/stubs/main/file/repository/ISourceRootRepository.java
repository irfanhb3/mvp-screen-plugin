package file.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lfile/repository/ISourceRootRepository;", "", "findCodeSourceRoot", "Lfile/ISourceRoot;", "module", "", "findResourcesSourceRoot", "mvp"})
public abstract interface ISourceRootRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract file.ISourceRoot findCodeSourceRoot(@org.jetbrains.annotations.NotNull()
    java.lang.String module);
    
    @org.jetbrains.annotations.NotNull()
    public abstract file.ISourceRoot findResourcesSourceRoot(@org.jetbrains.annotations.NotNull()
    java.lang.String module);
}