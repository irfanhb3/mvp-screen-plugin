package dependencies;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import data.repository.IModuleRepository;
import file.IProjectStructure;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MVPModule_ProvideModuleRepositoryFactory implements Factory<IModuleRepository> {
  private final MVPModule module;

  private final Provider<IProjectStructure> projectStructureProvider;

  public MVPModule_ProvideModuleRepositoryFactory(
      MVPModule module, Provider<IProjectStructure> projectStructureProvider) {
    assert module != null;
    this.module = module;
    assert projectStructureProvider != null;
    this.projectStructureProvider = projectStructureProvider;
  }

  @Override
  public IModuleRepository get() {
    return Preconditions.checkNotNull(
        module.provideModuleRepository(projectStructureProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<IModuleRepository> create(
      MVPModule module, Provider<IProjectStructure> projectStructureProvider) {
    return new MVPModule_ProvideModuleRepositoryFactory(module, projectStructureProvider);
  }
}
