package dependencies;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import file.IProjectStructure;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MVPModule_ProvideProjectStructureFactory implements Factory<IProjectStructure> {
  private final MVPModule module;

  public MVPModule_ProvideProjectStructureFactory(MVPModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public IProjectStructure get() {
    return Preconditions.checkNotNull(
        module.provideProjectStructure(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<IProjectStructure> create(MVPModule module) {
    return new MVPModule_ProvideProjectStructureFactory(module);
  }
}
