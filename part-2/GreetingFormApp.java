import javax.swing.*;
import java.awt.*;

public class GreetingFormApp {
    private JLabel lblGreeting;
    private JButton btnGreet;
    private final JTextField txtGreeting;

    public GreetingFormApp() {
        JFrame frame = new JFrame("Greeting");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(300, 150);
        txtGreeting = new JTextField( 20);
        JLabel lblGreeting = new JLabel("welcome to my application", SwingConstants.CENTER);
        JButton btnGreet = new JButton("Greet");
        btnGreet.addActionListener(e -> {
            String greeting = txtGreeting.getText();
            if ( greeting.isEmpty()) {
                JOptionPane.showMessageDialog(null, "please enter your name");

            } else {
                lblGreeting.setText("Hello, " + greeting + "!");
            }

        });
        JPanel panel = new JPanel();
        panel.add(txtGreeting);
        panel.add(btnGreet);
        frame.add(panel, BorderLayout.NORTH);
        frame.add(lblGreeting, BorderLayout.CENTER);
        frame.setVisible(true);


    }
}
