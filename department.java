package hotel_management_system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class department extends JFrame {
    JTable table;
    JButton b3;
    department(){

        JPanel panel1=new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,900,670);
        panel1.setBackground(new Color(54, 192, 201));
        add(panel1);


        table=new JTable();
        table.setBounds(10,60,700,500);
        table.setBackground(new Color(0x7D4E9A));
        table.setForeground(Color.white);
        panel1.add(table);

        try {

            con c=new con();
            String pankaj="select * from department";
            ResultSet resultSet=c.statement.executeQuery(pankaj);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));


        }catch (Exception E){
            E.printStackTrace();
        }

        b3=new JButton("BACK");
        b3.setFont(new Font("Tahoma",Font.BOLD,22));
        b3.setBounds(750,600,110,40);
        b3.setForeground(Color.black);
        b3.setBackground(new Color(0x7D4DE3));
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==b3){
                    setVisible(false);
                }
            }
        });
        panel1.add(b3);

        JLabel labe3 =new JLabel("Department");
        labe3.setBounds(50,2,200,50);
        labe3.setFont(new Font("Tahoma",Font.BOLD,17));
        labe3.setForeground(Color.black);
        panel1.add(labe3);

        JLabel labe4 =new JLabel("Budgth");
        labe4.setBounds(500,2,200,50);
        labe4.setFont(new Font("Tahoma",Font.BOLD,17));
        labe4.setForeground(Color.black);
        panel1.add(labe4);

        setUndecorated(true);
        getContentPane().setBackground(new Color(0xF120F1));
        setLayout(null);
        setLocation(400,140);
        setSize(900,670);
        setVisible(true);
    }
    public static void main(String[] args) {
         new department();
    }
}
