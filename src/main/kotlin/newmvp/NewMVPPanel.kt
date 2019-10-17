package newmvp

import com.intellij.openapi.ui.ComboBox
import java.awt.Dimension
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JTextField

class NewMVPPanel: JPanel(){

    val nameTextField = JTextField()
    val packageTextField = JTextField()
    val moduleComboBox = ComboBox<String>()

    init {
        layout = null

        val moduleLabel = JLabel("module")
        moduleLabel.setBounds(25, 17 ,77, 27)
        add(moduleLabel)
        moduleComboBox.setBounds(87, 17, 245, 27)
        add(moduleComboBox)

        val packageLabel = JLabel("package")
        packageLabel.setBounds(25, 54 ,77, 27)
        add(packageLabel)
        packageTextField.setBounds(87, 54, 245, 27)
        add(packageTextField)

        val nameLabel = JLabel("name")
        nameLabel.setBounds(25, 91 ,77, 27)
        add(nameLabel)
        nameTextField.setBounds(87, 91, 245, 27)
        add(nameTextField)

    }

    override fun getPreferredSize() = Dimension(350, 135)

}