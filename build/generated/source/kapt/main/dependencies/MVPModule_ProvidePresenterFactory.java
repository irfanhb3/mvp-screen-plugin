package dependencies;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import data.file.IPackageExtractor;
import data.repository.IModuleRepository;
import javax.annotation.Generated;
import javax.inject.Provider;
import newmvp.INewMVPDialogPresenter;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MVPModule_ProvidePresenterFactory implements Factory<INewMVPDialogPresenter> {
  private final MVPModule module;

  private final Provider<IPackageExtractor> packageExtractorProvider;

  private final Provider<IModuleRepository> moduleRepositoryProvider;

  public MVPModule_ProvidePresenterFactory(
      MVPModule module,
      Provider<IPackageExtractor> packageExtractorProvider,
      Provider<IModuleRepository> moduleRepositoryProvider) {
    assert module != null;
    this.module = module;
    assert packageExtractorProvider != null;
    this.packageExtractorProvider = packageExtractorProvider;
    assert moduleRepositoryProvider != null;
    this.moduleRepositoryProvider = moduleRepositoryProvider;
  }

  @Override
  public INewMVPDialogPresenter get() {
    return Preconditions.checkNotNull(
        module.providePresenter(packageExtractorProvider.get(), moduleRepositoryProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<INewMVPDialogPresenter> create(
      MVPModule module,
      Provider<IPackageExtractor> packageExtractorProvider,
      Provider<IModuleRepository> moduleRepositoryProvider) {
    return new MVPModule_ProvidePresenterFactory(
        module, packageExtractorProvider, moduleRepositoryProvider);
  }
}
