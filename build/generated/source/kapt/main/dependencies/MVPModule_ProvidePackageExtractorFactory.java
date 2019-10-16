package dependencies;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import data.file.IPackageExtractor;
import file.repository.ISourceRootRepository;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MVPModule_ProvidePackageExtractorFactory implements Factory<IPackageExtractor> {
  private final MVPModule module;

  private final Provider<ISourceRootRepository> sourceRootRepositoryProvider;

  public MVPModule_ProvidePackageExtractorFactory(
      MVPModule module, Provider<ISourceRootRepository> sourceRootRepositoryProvider) {
    assert module != null;
    this.module = module;
    assert sourceRootRepositoryProvider != null;
    this.sourceRootRepositoryProvider = sourceRootRepositoryProvider;
  }

  @Override
  public IPackageExtractor get() {
    return Preconditions.checkNotNull(
        module.providePackageExtractor(sourceRootRepositoryProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<IPackageExtractor> create(
      MVPModule module, Provider<ISourceRootRepository> sourceRootRepositoryProvider) {
    return new MVPModule_ProvidePackageExtractorFactory(module, sourceRootRepositoryProvider);
  }
}
