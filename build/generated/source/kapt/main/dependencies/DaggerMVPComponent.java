package dependencies;

import dagger.MembersInjector;
import dagger.internal.Preconditions;
import data.file.IPackageExtractor;
import data.repository.IModuleRepository;
import file.IProjectStructure;
import file.repository.ISourceRootRepository;
import javax.annotation.Generated;
import javax.inject.Provider;
import newmvp.INewMVPDialogPresenter;
import newmvp.NewMVPDialog;
import newmvp.NewMVPDialog_MembersInjector;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerMVPComponent implements MVPComponent {
  private Provider<IProjectStructure> provideProjectStructureProvider;

  private Provider<ISourceRootRepository> provideSourceRepositoryProvider;

  private Provider<IPackageExtractor> providePackageExtractorProvider;

  private Provider<IModuleRepository> provideModuleRepositoryProvider;

  private Provider<INewMVPDialogPresenter> providePresenterProvider;

  private MembersInjector<NewMVPDialog> newMVPDialogMembersInjector;

  private DaggerMVPComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideProjectStructureProvider =
        MVPModule_ProvideProjectStructureFactory.create(builder.mVPModule);

    this.provideSourceRepositoryProvider =
        MVPModule_ProvideSourceRepositoryFactory.create(
            builder.mVPModule, provideProjectStructureProvider);

    this.providePackageExtractorProvider =
        MVPModule_ProvidePackageExtractorFactory.create(
            builder.mVPModule, provideSourceRepositoryProvider);

    this.provideModuleRepositoryProvider =
        MVPModule_ProvideModuleRepositoryFactory.create(
            builder.mVPModule, provideProjectStructureProvider);

    this.providePresenterProvider =
        MVPModule_ProvidePresenterFactory.create(
            builder.mVPModule, providePackageExtractorProvider, provideModuleRepositoryProvider);

    this.newMVPDialogMembersInjector =
        NewMVPDialog_MembersInjector.create(providePresenterProvider);
  }

  @Override
  public void inject(NewMVPDialog newMVPDialog) {
    newMVPDialogMembersInjector.injectMembers(newMVPDialog);
  }

  public static final class Builder {
    private MVPModule mVPModule;

    private Builder() {}

    public MVPComponent build() {
      if (mVPModule == null) {
        throw new IllegalStateException(MVPModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerMVPComponent(this);
    }

    public Builder mVPModule(MVPModule mVPModule) {
      this.mVPModule = Preconditions.checkNotNull(mVPModule);
      return this;
    }
  }
}
