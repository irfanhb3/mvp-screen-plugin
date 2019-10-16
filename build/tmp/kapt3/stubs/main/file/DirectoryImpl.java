package file;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00002\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lfile/DirectoryImpl;", "Lfile/Directory;", "project", "Lcom/intellij/openapi/project/Project;", "psiDirectory", "Lcom/intellij/psi/PsiDirectory;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiDirectory;)V", "addFile", "", "file", "Lfile/File;", "createSubdirectory", "name", "", "findSubdirectory", "mvp"})
public final class DirectoryImpl implements file.Directory {
    private final com.intellij.openapi.project.Project project = null;
    private final com.intellij.psi.PsiDirectory psiDirectory = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public file.DirectoryImpl findSubdirectory(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public file.DirectoryImpl createSubdirectory(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @java.lang.Override()
    public void addFile(@org.jetbrains.annotations.NotNull()
    file.File file) {
    }
    
    public DirectoryImpl(@org.jetbrains.annotations.NotNull()
    com.intellij.openapi.project.Project project, @org.jetbrains.annotations.NotNull()
    com.intellij.psi.PsiDirectory psiDirectory) {
        super();
    }
}