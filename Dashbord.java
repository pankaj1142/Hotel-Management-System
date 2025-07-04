package hotel_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashbord extends JFrame implements ActionListener {

     JButton add,rec;
     Dashbord(){
super("Hotel management system");

         rec=new JButton("ADMIN");
         rec.setBounds(805,510,140,38);
         rec.setFont(new Font("Tahoma",Font.BOLD,17));
         rec.setBackground(new Color(255,98,0));
         rec.setForeground(Color.white);
         rec.addActionListener(this);
         add(rec);


         add=new JButton("RECEPTION");
         add.setBounds(405,510,140,38);
         add.setFont(new Font("Tahoma",Font.BOLD,17));
         add.setBackground(new Color(255,98,0));
         add.setForeground(Color.white);
         add.addActionListener(this);
         add(add);

         ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource("icone/Admin2.jpg"));
         Image i2=i11.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT);
         ImageIcon imageIcon11=new ImageIcon(i2);
         JLabel label1=new JLabel(imageIcon11);
         label1.setBounds(780,300,200,195);
         add(label1);

         ImageIcon i111=new ImageIcon(ClassLoader.getSystemResource("icone/reception.jpg"));
         Image i21=i111.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT);
         ImageIcon imageIcon111=new ImageIcon(i21);
         JLabel label111=new JLabel(imageIcon111);
         label111.setBounds(380,300,200,195);
         add(label111);

         ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icone/Dash.jpg"));
         Image i1=imageIcon.getImage().getScaledInstance(1950,1090,Image.SCALE_DEFAULT);
         ImageIcon imageIcon1=new ImageIcon(i1);
         JLabel label=new JLabel(imageIcon1);
         label.setBounds(0,0,1950,1090);
         add(label);

         setLocation(0,0);
         setLayout(null);
         setSize(1950,1090);
         setVisible(true);
     }
    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource()==rec){
             new login2();
         }else {
             new Reception1();
         }

    }
    public static void main(String[] args) {
        new Dashbord();
    }
}
