package hotel_management_system;

import javax.swing.*;
import java.awt.*;

public class splash extends JFrame {

     splash(){

          ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icone/a.gif"));
          JLabel label=new JLabel();
          label.setIcon(imageIcon);
          label.setBounds(0,0,840,550);
          add(label);


       setLayout(null);
         setLocation(500,20);
         getContentPane().setBackground(Color.yellow);
         setSize(858,650);
         setVisible(true);

         try {
             Thread.sleep(5000);
             new login();
             setVisible(false);
         }
         catch (Exception e){
             e.printStackTrace();
         }
     }

    public static void main(String[] args) {
          new splash();
    }

}
