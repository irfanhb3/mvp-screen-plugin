package newmvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H&\u00a8\u0006\f"}, d2 = {"Lnewmvp/INewMVPDialog;", "", "close", "", "selectModule", "module", "", "showModules", "modules", "", "showPackage", "packageName", "mvp"})
public abstract interface INewMVPDialog {
    
    public abstract void showModules(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> modules);
    
    public abstract void showPackage(@org.jetbrains.annotations.NotNull()
    java.lang.String packageName);
    
    public abstract void selectModule(@org.jetbrains.annotations.NotNull()
    java.lang.String module);
    
    public abstract void close();
}