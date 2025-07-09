package hotel_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Updatecheck extends JFrame {
    Choice choice;
    Updatecheck(){

        JPanel panel1=new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,1100,700);
        panel1.setBackground(new Color(34, 165, 208));
        add(panel1);

        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icone/pankaj4.jpeg"));
        Image image=imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(image);
        JLabel label=new JLabel(imageIcon1);
        label.setBounds(720,100,300,300);
        panel1.add(label);

        JLabel label1=new JLabel("CHECK-IN-DETAILS");
        label1.setBounds(124,11,300,25);
        label1.setFont(new Font("Tahoma",Font.BOLD,28));
        label1.setForeground(Color.BLACK);
        panel1.add(label1);

        JLabel label2 =new JLabel("ID");
        label2.setBounds(25,88,46,19);
        label2.setFont(new Font("Tahoma",Font.BOLD,28));
        label2.setForeground(Color.BLACK);
        panel1.add(label2);

        choice=new Choice();
        choice.setBounds(500,80,153,40);
        choice.setBackground(Color.pink);
        choice.setForeground(Color.black);
        choice.setFont(new Font("Tahoma",Font.PLAIN,18));
        panel1.add(choice);
         try{
            con c=new con();
             ResultSet resultSet=c.statement.executeQuery("select * from customer ");
            while (resultSet.next()){
                choice.add(resultSet.getString("number"));
             }
        }catch (Exception E){
            E.printStackTrace();
        }
        JLabel label4 =new JLabel("ROOM NUMBER");
        label4.setBounds(25,139,250,28);
        label4.setFont(new Font("Tahoma",Font.BOLD,28));
        label4.setForeground(Color.BLACK);
        panel1.add(label4);

        JTextField t1=new JTextField();
        t1.setFont(new Font("Tahoma",Font.BOLD,19));
        t1.setBounds(500,129,153,25);
        t1.setBackground(Color.PINK);
        t1.setForeground(Color.BLACK);
        panel1.add(t1);


        JLabel label5 =new JLabel("NAME");
        label5.setBounds(25,184,97,28);
        label5.setFont(new Font("Tahoma",Font.BOLD,28));
        label5.setForeground(Color.BLACK);
        panel1.add(label5);

        JTextField t2 =new JTextField();
        t2.setFont(new Font("Tahoma",Font.BOLD,19));
        t2.setBounds(500,184,153,25);
        t2.setBackground(Color.PINK);
        t2.setForeground(Color.BLACK);
        panel1.add(t2);

        JLabel label6 =new JLabel("CHECKED-IN");
        label6.setBounds(25,240,200,28);
        label6.setFont(new Font("Tahoma",Font.BOLD,28));
        label6.setForeground(Color.BLACK);
        panel1.add(label6);

        JTextField t3 =new JTextField();
        t3.setFont(new Font("Tahoma",Font.BOLD,19));
        t3.setBounds(500,240,153,25);
        t3.setBackground(Color.PINK);
        t3.setForeground(Color.BLACK);
        panel1.add(t3);

        JLabel label7 =new JLabel("AMOUNT-PAID (RS)");
        label7.setBounds(25,300,300,28);
        label7.setFont(new Font("Tahoma",Font.BOLD,28));
        label7.setForeground(Color.BLACK);
        panel1.add(label7);

        JTextField t4 =new JTextField();
        t4.setFont(new Font("Tahoma",Font.BOLD,19));
        t4.setBounds(500,300,153,25);
        t4.setBackground(Color.PINK);
        t4.setForeground(Color.BLACK);
        panel1.add(t4);

        JLabel label8 =new JLabel("PENDING-AMOUNT (RS)");
        label8.setBounds(25,360,400,28);
        label8.setFont(new Font("Tahoma",Font.BOLD,28));
        label8.setForeground(Color.BLACK);
        panel1.add(label8);

        JTextField t5 =new JTextField();
        t5.setFont(new Font("Tahoma",Font.BOLD,19));
        t5.setBounds(500,360,153,25);
        t5.setBackground(Color.PINK);
        t5.setForeground(Color.BLACK);
        panel1.add(t5);

        JButton b2 =new JButton("CHECK");
        b2.setBackground(new Color(0xE36B0E));
        b2.setForeground(Color.BLACK.darker());
        b2.setBounds(270,600,150,50);
        b2.setFont(new Font("Thoma",Font.BOLD,24));
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id= choice.getSelectedItem();
                String q="select * from customer where number='"+id+"'";
                try{
                    con c=new con();
                    ResultSet resultSet=c.statement.executeQuery(q);
                    while (resultSet.next()){
                        t1.setText(resultSet.getString("checkintime"));
                        t2.setText(resultSet.getString("name"));
                        t3.setText(resultSet.getString("checkin"));
                        t4.setText(resultSet.getString("deposit"));


                    }

                    ResultSet resultSet1=c.statement.executeQuery("select * from room where roomnuber='"+t1.getText()+"'");
                    while (resultSet1.next()){
                        String price=resultSet1.getString("price");
                        int amountpaid=Integer.parseInt(price)-Integer.parseInt(t4.getText());
                        t5.setText(""+amountpaid);
                    }
                }catch (Exception E){
                    E.printStackTrace();
                }

            }
        });
        panel1.add(b2);

        JButton b3 =new JButton("BACK");
        b3.setBackground(new Color(0xE36B0E));
        b3.setForeground(Color.BLACK.darker());
        b3.setBounds(500,600,150,50);
        b3.setFont(new Font("Thoma",Font.BOLD,24));
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        panel1.add(b3);


        setUndecorated(true);
        getContentPane().setBackground(new Color(0xF120F1));
        setLayout(null);
        setLocation(300,100);
        setSize(1100,700);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Updatecheck();
    }
}
