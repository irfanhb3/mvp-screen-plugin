package file;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH&J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lfile/Directory;", "", "addFile", "", "file", "Lfile/File;", "createSubdirectory", "name", "", "findSubdirectory", "mvp"})
public abstract interface Directory {
    
    @org.jetbrains.annotations.Nullable()
    public abstract file.Directory findSubdirectory(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.NotNull()
    public abstract file.Directory createSubdirectory(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    public abstract void addFile(@org.jetbrains.annotations.NotNull()
    file.File file);
}