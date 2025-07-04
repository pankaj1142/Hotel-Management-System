package hotel_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class login extends JFrame implements ActionListener {

     JTextField textField1;

     JPasswordField passwordField1;

     JButton b1,b2;

          login(){
          JLabel label1 = new JLabel("username");
          label1.setBounds(40,20,100,30);
          label1.setFont(new Font("Tahoma",Font.BOLD,16));
          setForeground(Color.BLUE);
          add(label1);

          JLabel label2 = new JLabel("password");
          label2.setBounds(40,70,100,30);
          label2.setFont(new Font("Tahoma",Font.BOLD,16));
          setForeground(Color.black);
          add(label2);


          textField1=new JTextField();
          textField1.setBounds(150,20,150,30);
          textField1.setFont(new Font("Tahoma",Font.PLAIN,16));
          textField1.setForeground(Color.black);
          add(textField1);


          passwordField1=new JPasswordField();
          passwordField1.setBounds(150,70,150,30);
          passwordField1.setFont(new Font("Tahoma",Font.PLAIN,16));
          passwordField1.setForeground(Color.green);
          add(passwordField1);

          ImageIcon imageIcon =new ImageIcon(ClassLoader.getSystemResource("icone/a.gif"));
          JLabel label=new JLabel(imageIcon);
          label.setBounds(315, -10,255,300);
          add(label);


          b1  = new JButton("Login");
          b1.setBounds(40,150,100,30);
          b1.setFont(new Font("Tahoma",Font.BOLD,16));
          b1.setForeground(Color.black);
          b1.setBackground(Color.PINK);
          b1.addActionListener(this);
          add(b1);

          b2 = new JButton("Cancel");
          b2.setBounds(150,150,100,30);
          b2.setFont(new Font("Tahoma",Font.BOLD,16));
          b2. setForeground(Color.black);
          b2.setBackground(Color.PINK);
          b2.addActionListener(this);

          add(b2);

          getContentPane().setBackground(Color.cyan);
          setLayout(null);
          setLocation(400,270);
          setSize(600,300);
          setVisible(true);

         try{



        } catch (Exception e){
             e.printStackTrace();
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

               if (e.getSource() ==b1){
                 try{
                     con c = new con();
//                     Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelMS","root","pankaj1437");
                     String user= textField1.getText();
                     String pass=passwordField1.getText();

//                      Statement statement=connection.createStatement();

                             ResultSet resultSet=c.statement.executeQuery(("Select * from login where username='"+user+"' and password='"+pass+"'"));

                     if (resultSet.next()){

                         new Dashbord();
                         setVisible(false);
                     }
                     else{
                         JOptionPane.showMessageDialog(null,"wrong id' password");
                     }


                 }  catch (Exception E){
                     E.printStackTrace();
                 }


        }else{
                   System.exit(273);
        }
    }

    public static void main(String[] args) {
        new login();


    }
}
