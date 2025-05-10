import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
public class RegistrationFormApp extends JFrame implements ActionListener {

    private JTextField txtName;
    private JTextField txtEmail;
    private JPasswordField txtPassword;
    private JRadioButton RbMale, RbFemale;
    private JCheckBox cbJava, cbPython, cbCpp;
    private JButton btnSubmit;
    private GridBagConstraints gbc;
    public RegistrationFormApp() {
        setTitle("Registration Form");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel(new  GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Name:"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
         txtName = new JTextField(20);
        panel.add(txtName, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Email:"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
         txtEmail = new JTextField(30);
        panel.add(txtEmail, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Password:"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
         txtPassword = new JPasswordField(20);
        panel.add(txtPassword, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(new JLabel("Gender:"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        RbMale = new JRadioButton("Male");
        RbFemale = new JRadioButton("Female");
      ButtonGroup buttonGroup = new ButtonGroup();
      buttonGroup.add(RbMale);
      buttonGroup.add(RbFemale);
      JPanel GenderPanel = new JPanel();
      GenderPanel.add(RbMale);
      GenderPanel.add(RbFemale);
      panel.add(GenderPanel, gbc);
      gbc.gridx = 0;
      gbc.gridy = 4;
      panel.add(new Label("Interests: "), gbc);
      gbc.gridx = 1;
      gbc.gridy = 4;
       cbJava = new JCheckBox("Java");
       cbPython = new JCheckBox("Python");
       cbCpp = new JCheckBox("C++");
      JPanel InterestPanel = new JPanel();
      InterestPanel.add(cbJava);
      InterestPanel.add(cbPython);
      InterestPanel.add(cbCpp);
      panel.add(InterestPanel, gbc);
      gbc.gridx = 1;
      gbc.gridy = 5;
      gbc.anchor = GridBagConstraints.CENTER;
      btnSubmit = new JButton("Submit");
      btnSubmit.addActionListener(this);
      panel.add(btnSubmit, gbc);
      add(panel, BorderLayout.CENTER);
      setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    String name = txtName.getText();
    String email = txtEmail.getText();
    String Gender = RbMale.isSelected() ? "Male" : "Female";
    String interests = setInterests();
    JOptionPane.showMessageDialog(this, "Name: " + name + "\n" +
            "Email: " + email + "\n" +
            "Gender: " + Gender + "\n" +
            "Interests: " + interests, "Registration Form", JOptionPane.INFORMATION_MESSAGE);


    }
    public String setInterests() {
        String result = "";
        if (cbJava.isSelected()) {
            result += "Java ";
        }
        if (cbPython.isSelected()) {
            result += "Python ";
        }
        if (cbCpp.isSelected()) {
            result += "C++ ";
        }
        return result;
    }
}
