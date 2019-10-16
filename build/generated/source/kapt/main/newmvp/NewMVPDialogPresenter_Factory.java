package newmvp;

import dagger.internal.Factory;
import data.file.IPackageExtractor;
import data.repository.IModuleRepository;
import file.CurrentPath;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NewMVPDialogPresenter_Factory implements Factory<NewMVPDialogPresenter> {
  private final Provider<IPackageExtractor> packageExtractorProvider;

  private final Provider<IModuleRepository> moduleRepositoryProvider;

  private final Provider<CurrentPath> currentPathProvider;

  public NewMVPDialogPresenter_Factory(
      Provider<IPackageExtractor> packageExtractorProvider,
      Provider<IModuleRepository> moduleRepositoryProvider,
      Provider<CurrentPath> currentPathProvider) {
    assert packageExtractorProvider != null;
    this.packageExtractorProvider = packageExtractorProvider;
    assert moduleRepositoryProvider != null;
    this.moduleRepositoryProvider = moduleRepositoryProvider;
    assert currentPathProvider != null;
    this.currentPathProvider = currentPathProvider;
  }

  @Override
  public NewMVPDialogPresenter get() {
    return new NewMVPDialogPresenter(
        packageExtractorProvider.get(), moduleRepositoryProvider.get(), currentPathProvider.get());
  }

  public static Factory<NewMVPDialogPresenter> create(
      Provider<IPackageExtractor> packageExtractorProvider,
      Provider<IModuleRepository> moduleRepositoryProvider,
      Provider<CurrentPath> currentPathProvider) {
    return new NewMVPDialogPresenter_Factory(
        packageExtractorProvider, moduleRepositoryProvider, currentPathProvider);
  }
}
