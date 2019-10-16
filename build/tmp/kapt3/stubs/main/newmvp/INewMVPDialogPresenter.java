package newmvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lnewmvp/INewMVPDialogPresenter;", "", "attachView", "", "view", "Lnewmvp/INewMVPDialog;", "onClick", "onLoadView", "mvp"})
public abstract interface INewMVPDialogPresenter {
    
    public abstract void attachView(@org.jetbrains.annotations.NotNull()
    newmvp.INewMVPDialog view);
    
    public abstract void onLoadView();
    
    public abstract void onClick();
}