package newmvp;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NewMVPDialog_MembersInjector implements MembersInjector<NewMVPDialog> {
  private final Provider<INewMVPDialogPresenter> presenterProvider;

  public NewMVPDialog_MembersInjector(Provider<INewMVPDialogPresenter> presenterProvider) {
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<NewMVPDialog> create(
      Provider<INewMVPDialogPresenter> presenterProvider) {
    return new NewMVPDialog_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(NewMVPDialog instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.presenter = presenterProvider.get();
  }
}
