package hotel_management_system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class room1 extends JFrame implements ActionListener {
    JTable table;
    JButton b3;
     room1(){



         JPanel panel1=new JPanel();
         panel1.setLayout(null);
         panel1.setBounds(5,5,1200,900);
         panel1.setBackground(new Color(54, 192, 201));
         add(panel1);

         ImageIcon imageIcon =new ImageIcon(ClassLoader.getSystemResource("icone/pankaj10.png"));
         JLabel label1=new JLabel(imageIcon);
         label1.setBounds(800,340,300,150);
         panel1.add(label1);

         table=new JTable();
         table.setBounds(10,55,700,600);
         table.setBackground(new Color(0xE1BC3C));
         table.setForeground(Color.white);
         panel1.add(table);

         try{
              con c=new con();
              String roominfo="select * from room";
             ResultSet resultSet=c.statement.executeQuery(roominfo);
             table.setModel(DbUtils.resultSetToTableModel(resultSet));

         }catch (Exception E){
             E.printStackTrace();
         }

         b3=new JButton("BACK");
         b3.setBackground(new Color(0xE1BC3C));
         b3.setFont(new Font("Tahoma",Font.BOLD,18));
         b3.setBounds(850,600,110,40);
         b3.setForeground(Color.black);
         b3.addActionListener(this);
         panel1.add(b3);

         JLabel labe3 =new JLabel("Room no");
         labe3.setBounds(50,2,200,50);
         labe3.setFont(new Font("Tahoma",Font.BOLD,17));
         labe3.setForeground(Color.black);
         panel1.add(labe3);

         JLabel label=new JLabel("AVAILABLE");
         label.setBounds(190,2,200,50);
         label.setFont(new Font("Tahoma",Font.BOLD,17));
         label.setForeground(Color.black);
         panel1.add(label);

         JLabel labe2 =new JLabel("Status");
         labe2.setBounds(365,2,200,50);
         labe2.setFont(new Font("Tahoma",Font.BOLD,17));
         labe2.setForeground(Color.black);
         panel1.add(labe2);

         JLabel labe5 =new JLabel("Price");
         labe5.setBounds(520,2,200,50);
         labe5.setFont(new Font("Tahoma",Font.BOLD,17));
         labe5.setForeground(Color.black);
         panel1.add(labe5);

         JLabel labe4 =new JLabel("Bed Size");
         labe4.setBounds(680,2,200,50);
         labe4.setFont(new Font("Tahoma",Font.BOLD,17));
         labe4.setForeground(Color.black);
         panel1.add(labe4);

         getContentPane().setBackground(new Color(0xF120F1));
         setLayout(null);
         setLocation(250,40);
         setSize(1200,750);
         setVisible(true);
     }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b3){
            setVisible(false);
        }
    }
    public static void main(String[] args) {
         new room1();

    }
}
