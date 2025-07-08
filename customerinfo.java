package hotel_management_system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class customerinfo extends JFrame {
JTable table;
JButton b2;
    customerinfo(){

        JPanel panel1=new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,1200,800);
        panel1.setBackground(new Color(245, 94, 90));
        add(panel1);

        table=new JTable();
        table.setBounds(10,50,980,400);
        table.setBackground(new Color(0xA8050606, true));
        table.setForeground(Color.white);
        panel1.add(table);
        try{
            con c=new con();
            String q="select * from customer";
            ResultSet resultSet=c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception E){
            E.printStackTrace();
        }
        JLabel label=new JLabel("ID");
        label.setFont(new Font("Tahoma",Font.BOLD,19));
        label.setBounds(12,30,100,20);
        label.setForeground(Color.BLACK);
        panel1.add(label);

        JLabel label1 =new JLabel("PHONE");
        label1.setFont(new Font("Tahoma",Font.BOLD,19));
        label1.setBounds(145,30,100,20);
        label1.setForeground(Color.BLACK);
        panel1.add(label1);

        JLabel label2=new JLabel("NAME");
        label2.setFont(new Font("Tahoma",Font.BOLD,19));
        label2.setBounds(265,30,100,20);
        label2.setForeground(Color.BLACK);
        panel1.add(label2);

        JLabel label3=new JLabel("GENDER");
        label3.setForeground(Color.BLACK);
        label3.setBounds(395,30,100,20);
        label3.setFont(new Font("Tahoma",Font.BOLD,19));
        panel1.add(label3);

        JLabel label4=new JLabel("COUNTRY");
        label4.setFont(new Font("Tahoma",Font.BOLD,19));
        label4.setBounds(505,30,100,20);
        label4.setForeground(Color.BLACK);
        panel1.add(label4);

        JLabel label5 =new JLabel("ROOM NO");
        label5.setFont(new Font("Tahoma",Font.BOLD,19));
        label5.setBounds(635,30,100,20);
        label5.setForeground(Color.BLACK);
        panel1.add(label5);

        JLabel label6 =new JLabel("DEPOSIT");
        label6.setFont(new Font("Tahoma",Font.BOLD,19));
        label6.setBounds(765,30,100,20);
        label6.setForeground(Color.BLACK);
        panel1.add(label6);

        JLabel label7 =new JLabel("CHECK-IN");
        label7.setFont(new Font("Tahoma",Font.BOLD,19));
        label7.setBounds(875,30,100,20);
        label7.setForeground(Color.BLACK);
        panel1.add(label7);

        b2=new JButton("BACK");
        b2.setFont(new Font("Tahoma",Font.BOLD,22));
        b2.setBounds(820,600,140,40);
        b2.setForeground(Color.black);
        b2.setBackground(new Color(0xF13171));
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        panel1.add(b2);

        setUndecorated(true);
        getContentPane().setBackground(new Color(0xF120F1));
        setLayout(null);
        setLocation(300,90);
        setSize(1120,720);
        setVisible(true);
    }


    public static void main(String[] args) {
        new customerinfo();
    }
}
