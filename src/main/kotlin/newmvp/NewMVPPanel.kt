package newmvp

import com.intellij.openapi.ui.ComboBox
import java.awt.Dimension
import javax.swing.JPanel
import javax.swing.JTextField

class NewMVPPanel: JPanel(){

    val nameTextField = JTextField()
    val packageTextField = JTextField()

    val moduleComboBox = ComboBox<String>()

    init {
        layout = null

        nameTextField.setBounds(25, 33, 77, 16)
        add(nameTextField)

        packageTextField.setBounds(114, 28, 183, 26)
        add(packageTextField)

        moduleComboBox.setBounds(25, 75, 77, 16)
        add(moduleComboBox)
    }

    override fun getPreferredSize() = Dimension(350, 110)

}