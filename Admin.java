package hotel_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame implements ActionListener {

     JButton add_Employee,add_room,add_Driver,logout,back;
     Admin(){
         super("Hotel management System");

           add_Employee= new JButton("ADD EMPLOYEE");
           add_Employee.setBounds(300,250,200,30);
           add_Employee.setBackground(new Color(0x22A5D0));
           add_Employee.setForeground(Color.BLACK);
           add_Employee.setFont(new Font("Tahoma",Font.BOLD,17));
           add_Employee.addActionListener(this);
           add(add_Employee);

           add_room=new JButton("ADD ROOM");
           add_room.setBackground(new Color(0x22A5D0));
           add_room.setBounds(300,400,200,30);
           add_room.setForeground(Color.BLACK);
           add_room.setFont(new Font("Tahoma",Font.BOLD,17));
           add_room.addActionListener(this);
           add(add_room);

           add_Driver =new JButton("ADD DRIVER");
           add_Driver.setBounds(300,560,200,30);
           add_Driver.setBackground(new Color(0x22A5D0));
           add_Driver.setForeground(Color.BLACK);
           add_Driver.setFont(new Font("Tahoma",Font.BOLD,17));
           add_Driver.addActionListener(this);
           add(add_Driver);

           logout=new JButton("LOGOUTT");
           logout.setFont(new Font("Tahoma",Font.BOLD,17));
           logout.setBounds(20,950,100,30);
           logout.setBackground(new Color(0xFF9D5252, true));
           logout.addActionListener(this);
           logout.setForeground(Color.BLACK);
           add(logout);

           back =new JButton("BACK");
           back.setForeground(Color.BLACK);
           back.setBounds(170,950,100,30);
           back.setBackground(new Color(0xFF9D5252));
           back.setFont(new Font("Tahoma",Font.BOLD,17));
           back.addActionListener(this);
           add(back);

           ImageIcon l1 =new ImageIcon(ClassLoader.getSystemResource("icone/hotelstaff.jpg"));
             Image i11=l1.getImage().getScaledInstance(140,140,Image.SCALE_DEFAULT);
             ImageIcon imageIcon=new ImageIcon(i11);
             JLabel label=new JLabel(imageIcon);
             label.setBounds(70,180,140,140);
             add(label);

         ImageIcon l11 =new ImageIcon(ClassLoader.getSystemResource("icone/room.jpg"));
         Image i111=l11.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
         ImageIcon imageIcon1=new ImageIcon(i111);
         JLabel label1 =new JLabel(imageIcon1);
         label1.setBounds(70,340,140,140);
         add(label1);

        ImageIcon l111=new ImageIcon(ClassLoader.getSystemResource("icone/Driver.jpg"));
        Image i1111=l111.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon11=new ImageIcon(i1111);
        JLabel label2=new JLabel(imageIcon11);
        label2.setBounds(70,500,140,140);
        add(label2);


        getContentPane().setBackground(new Color(0x6BDAD1));
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);

     }

    @Override
    public void actionPerformed(ActionEvent e) {

         if (e.getSource()==add_Employee){

             new AddEmployee();
         }
       else if (e.getSource()==add_room){
            new AddRoom();
        }
       else if (e.getSource()==add_Driver){
             new addDriver();
        } else if (e.getSource()==logout) {

           System.exit(102);
         } else if (e.getSource()==back) {

           new Dashbord();
           setVisible(false);
         }

    }

    public static void main(String[] args) {
        new Admin();
    }
}