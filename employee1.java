package hotel_management_system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class employee1 extends JFrame {
    JTable table;
    JButton b3;
     employee1(){

         JPanel panel1=new JPanel();
         panel1.setLayout(null);
         panel1.setBounds(5,5,900,670);
         panel1.setBackground(new Color(197, 128, 126));
         add(panel1);

         table=new JTable();
         table.setBounds(10,60,790,500);
         table.setBackground(new Color(0xA8050606, true));
         table.setForeground(Color.white);
         panel1.add(table);
         try{
              con c=new con();
              String pankaj="select * from employee";
             ResultSet resultSet=c.statement.executeQuery(pankaj);
             table.setModel(DbUtils.resultSetToTableModel(resultSet));

         }catch (Exception E){
             E.printStackTrace();
         }

         JLabel label=new JLabel("NAME");
         label.setBounds(10,3,70,70);
         label.setForeground(Color.black);
         label.setFont(new Font("Tahoma",Font.BOLD,18));
         panel1.add(label);

         JLabel label1 =new JLabel("AGE");
         label1.setBounds(130,3,70,70);
         label1.setForeground(Color.black);
         label1.setFont(new Font("Tahoma",Font.BOLD,18));
         panel1.add(label1);

         JLabel label2 =new JLabel("GENDER");
         label2.setBounds(220,3,90,70);
         label2.setForeground(Color.black);
         label2.setFont(new Font("Tahoma",Font.BOLD,18));
         panel1.add(label2);

         JLabel label3 =new JLabel("JOB");
         label3.setBounds(320,3,90,70);
         label3.setForeground(Color.black);
         label3.setFont(new Font("Tahoma",Font.BOLD,18));
         panel1.add(label3);

         JLabel label4 =new JLabel("SALARY");
         label4.setBounds(410,3,90,70);
         label4.setForeground(Color.black);
         label4.setFont(new Font("Tahoma",Font.BOLD,18));
         panel1.add(label4);

         JLabel label5 =new JLabel("PHONE");
         label5.setBounds(510,3,90,70);
         label5.setForeground(Color.black);
         label5.setFont(new Font("Tahoma",Font.BOLD,18));
         panel1.add(label5);

         JLabel label6 =new JLabel("EMAIL");
         label6.setBounds(610,3,90,70);
         label6.setForeground(Color.black);
         label6.setFont(new Font("Tahoma",Font.BOLD,18));
         panel1.add(label6);

         JLabel label7 =new JLabel("AADHAAR");
         label7.setBounds(710,3,90,70);
         label7.setForeground(Color.black);
         label7.setFont(new Font("Tahoma",Font.BOLD,18));
         panel1.add(label7);

         b3=new JButton("BACK");
         b3.setFont(new Font("Tahoma",Font.BOLD,22));
         b3.setBounds(740,580,110,40);
         b3.setForeground(Color.black);
         b3.setBackground(new Color(0xF13171));
         b3.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 if (e.getSource()==b3){
                     setVisible(false);
                 }
             }
         });
         panel1.add(b3);




         setUndecorated(true);
         getContentPane().setBackground(new Color(0xF120F1));
         setLayout(null);
         setLocation(460,100);
         setSize(900,670);
         setVisible(true);
     }
    public static void main(String[] args) {
        new employee1();
    }
}
