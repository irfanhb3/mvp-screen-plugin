package file;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&J\b\u0010\b\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0006H&\u00a8\u0006\n"}, d2 = {"Lfile/IProjectStructure;", "", "findSourceRoots", "", "Lfile/SourceRoot;", "module", "", "getAllModules", "getProjectName", "getProjectPath", "mvp"})
public abstract interface IProjectStructure {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<file.SourceRoot> findSourceRoots(@org.jetbrains.annotations.NotNull()
    java.lang.String module);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getAllModules();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getProjectName();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getProjectPath();
}