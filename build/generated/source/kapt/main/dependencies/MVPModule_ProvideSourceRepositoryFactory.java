package dependencies;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import file.IProjectStructure;
import file.repository.ISourceRootRepository;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MVPModule_ProvideSourceRepositoryFactory
    implements Factory<ISourceRootRepository> {
  private final MVPModule module;

  private final Provider<IProjectStructure> projectStructureProvider;

  public MVPModule_ProvideSourceRepositoryFactory(
      MVPModule module, Provider<IProjectStructure> projectStructureProvider) {
    assert module != null;
    this.module = module;
    assert projectStructureProvider != null;
    this.projectStructureProvider = projectStructureProvider;
  }

  @Override
  public ISourceRootRepository get() {
    return Preconditions.checkNotNull(
        module.provideSourceRepository(projectStructureProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ISourceRootRepository> create(
      MVPModule module, Provider<IProjectStructure> projectStructureProvider) {
    return new MVPModule_ProvideSourceRepositoryFactory(module, projectStructureProvider);
  }
}
