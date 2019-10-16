package dependencies

import dagger.Component;
import newmvp.INewMVPDialog
import newmvp.NewMVPDialog

@Component(modules = [MVPModule::class])
public interface MVPComponent {

    fun inject(newMVPDialog: NewMVPDialog)

}
