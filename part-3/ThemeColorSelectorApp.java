import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThemeColorSelectorApp  extends  JFrame implements ActionListener {
    private JFrame frame;
    private JPanel Colorpanel;
    private JButton RedButton;
    private JButton GreenButton;
    private JButton BlueButton;

    public ThemeColorSelectorApp(){
        frame = new JFrame("ThemeColorSelectorApp");
        setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
         Colorpanel = new JPanel();
        RedButton = new JButton("Red");
        GreenButton = new JButton("Green");
        BlueButton = new JButton("Blue");
        JPanel buttonPanel = new JPanel();
        RedButton.setActionCommand("Red");
        GreenButton.setActionCommand("Green");
        BlueButton.setActionCommand("Blue");
        RedButton.addActionListener(this);
        GreenButton.addActionListener(this);
        buttonPanel.add(RedButton);
        buttonPanel.add(BlueButton);
        buttonPanel.add(GreenButton);
        BlueButton.addActionListener(this);
        frame.add(Colorpanel,BorderLayout.CENTER);
        frame.add(buttonPanel,BorderLayout.NORTH);



        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "Red": Colorpanel.setBackground(Color.RED);
            break;
            case "Green": Colorpanel.setBackground(Color.GREEN);
            break;
            case "Blue": Colorpanel.setBackground(Color.BLUE);
            break;
        }
    }
}
