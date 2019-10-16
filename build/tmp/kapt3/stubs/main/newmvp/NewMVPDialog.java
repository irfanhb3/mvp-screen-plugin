package newmvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0015H\u0014J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0016\u0010\u001c\u001a\u00020\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001bH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006!"}, d2 = {"Lnewmvp/NewMVPDialog;", "Lcom/intellij/openapi/ui/DialogWrapper;", "Lnewmvp/INewMVPDialog;", "project", "Lcom/intellij/openapi/project/Project;", "currentPath", "Lfile/CurrentPath;", "(Lcom/intellij/openapi/project/Project;Lfile/CurrentPath;)V", "getCurrentPath", "()Lfile/CurrentPath;", "panel", "Lnewmvp/NewMVPPanel;", "presenter", "Lnewmvp/INewMVPDialogPresenter;", "getPresenter", "()Lnewmvp/INewMVPDialogPresenter;", "setPresenter", "(Lnewmvp/INewMVPDialogPresenter;)V", "getProject", "()Lcom/intellij/openapi/project/Project;", "close", "", "createCenterPanel", "Ljavax/swing/JComponent;", "doOKAction", "selectModule", "module", "", "showModules", "modules", "", "showPackage", "packageName", "mvp"})
public final class NewMVPDialog extends com.intellij.openapi.ui.DialogWrapper implements newmvp.INewMVPDialog {
    private final newmvp.NewMVPPanel panel = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public newmvp.INewMVPDialogPresenter presenter;
    @org.jetbrains.annotations.NotNull()
    private final com.intellij.openapi.project.Project project = null;
    @org.jetbrains.annotations.Nullable()
    private final file.CurrentPath currentPath = null;
    
    @org.jetbrains.annotations.NotNull()
    public final newmvp.INewMVPDialogPresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    newmvp.INewMVPDialogPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected javax.swing.JComponent createCenterPanel() {
        return null;
    }
    
    @java.lang.Override()
    protected void doOKAction() {
    }
    
    @java.lang.Override()
    public void showModules(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> modules) {
    }
    
    @java.lang.Override()
    public void showPackage(@org.jetbrains.annotations.NotNull()
    java.lang.String packageName) {
    }
    
    @java.lang.Override()
    public void selectModule(@org.jetbrains.annotations.NotNull()
    java.lang.String module) {
    }
    
    @java.lang.Override()
    public void close() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellij.openapi.project.Project getProject() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final file.CurrentPath getCurrentPath() {
        return null;
    }
    
    public NewMVPDialog(@org.jetbrains.annotations.NotNull()
    com.intellij.openapi.project.Project project, @org.jetbrains.annotations.Nullable()
    file.CurrentPath currentPath) {
        super(null, false);
    }
}