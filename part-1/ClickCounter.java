import javax.swing.*;
import java.awt.*;

public class ClickCounter {
   private int count =0;
   private JButton ClickButton;
   private JLabel  countClick;
   public ClickCounter() {
       JFrame frame = new JFrame("Click Counter");

       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300,200);
       frame.setResizable(false);
       frame.setLocationRelativeTo(null);
//       frame.setLayout(null);
       ClickButton = new JButton("Click");
//       ClickButton.setBounds(0,113,300,50);
       countClick = new JLabel("Clicks: "+count,JLabel.CENTER);
       ClickButton.addActionListener(e -> {
         count++;
         countClick.setText("Clicks: "+count);
       });

       frame.add(ClickButton,BorderLayout.SOUTH);
       frame.add(countClick,BorderLayout.CENTER);
       frame.setVisible(true);
   }

}
