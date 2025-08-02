package hotel_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addDriver extends JFrame implements ActionListener {

    JTextField t2 ,t3,t5,t6,t8;
    JButton b1,b2;
    JComboBox g1,g2;

    addDriver(){

        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(0x7D3BC2));
        panel.setLayout(null);
        add(panel);

         JLabel label1=new JLabel("ADD DRIVER ");
         label1.setBounds(50,10,400,50);
         label1.setFont(new Font("Tahoma",Font.BOLD,22));
         label1.setForeground(Color.BLACK);
         panel.add(label1);

         JLabel label2=new JLabel("NAME");
         label2.setForeground(Color.black);
         label2.setFont(new Font("Tahoma",Font.BOLD,22));
         label2.setBounds(400,55,153,22);
         panel.add(label2);

         t2=new JTextField();
         t2.setBounds(570,50,200,28);
         t2.setFont(new Font("Tahoma",Font.PLAIN,17));
         t2.setBackground(new Color(0xBDB973));
         t2.setForeground(Color.black);
         panel.add(t2);

         JLabel label3=new JLabel("AGE");
         label3.setBounds(400,110,153,22);
         label3.setFont(new Font("Tahoma",Font.BOLD,22));
         label3.setForeground(Color.black);
         panel.add(label3);


         t3=new JTextField();
         t3.setForeground(Color.black);
         t3.setBounds(570,110,200,28);
         t3.setForeground(Color.black);
         t3.setFont(new Font("Tahoma",Font.PLAIN,17));
         t3.setBackground(new Color(0xBDB973));
         panel.add(t3);

         JLabel label4=new JLabel("GENDER");
         label4.setForeground(Color.black);
         label4.setFont(new Font("Tahoma",Font.BOLD,22));
         label4.setBounds(390,165,153,22);
         panel.add(label4);

         g1=new JComboBox(new String[] {"MALE","FEMALE"});
         g1.setFont(new Font("Tahoma",Font.PLAIN,17));
         g1.setBounds(570,165,200,28);
         g1.setForeground(Color.black);
         g1.setBackground(new Color(0xBDB973));
         panel.add(g1);

        JLabel label5 =new JLabel("CAR COMPANY");
        label5.setBounds(390,210,170,22);
        label5.setFont(new Font("Tahoma",Font.BOLD,22));
        label5.setForeground(Color.black);
        panel.add(label5);

        t5=new JTextField();
        t5.setForeground(Color.black);
        t5.setBounds(570,210,200,28);
        t5.setForeground(Color.black);
        t5.setFont(new Font("Tahoma",Font.PLAIN,17));
        t5.setBackground(new Color(0xBDB973));
        panel.add(t5);

        JLabel label6 =new JLabel("CAR NAME");
        label6.setBounds(390,260,170,22);
        label6.setFont(new Font("Tahoma",Font.BOLD,22));
        label6.setForeground(Color.black);
        panel.add(label6);

        t6=new JTextField();
        t6.setForeground(Color.black);
        t6.setBounds(570,260,200,28);
        t6.setForeground(Color.black);
        t6.setFont(new Font("Tahoma",Font.PLAIN,17));
        t6.setBackground(new Color(0xBDB973));
        panel.add(t6);

        JLabel label7 =new JLabel("AVAILABLE");
        label7.setForeground(Color.black);
        label7.setFont(new Font("Tahoma",Font.BOLD,22));
        label7.setBounds(390,310,153,22);
        panel.add(label7);

        g2=new JComboBox(new String[] {"YES","NO"});
        g2.setFont(new Font("Tahoma",Font.PLAIN,17));
        g2.setBounds(570,310,200,28);
        g2.setForeground(Color.black);
        g2.setBackground(new Color(0xBDB973));
        panel.add(g2);

        JLabel label8=new JLabel("LOCATION");
        label8.setBounds(390,365,200,28);
        label8.setFont(new Font("Tahoma",Font.BOLD,22));
        label8.setForeground(Color.BLACK);
        panel.add(label8);

        t8=new JTextField();
        t8.setBackground(new Color(0xBDB973));
        t8.setBounds(570,365,200,28);
        t8.setFont(new Font("Tahoma",Font.PLAIN,17));
        t8.setForeground(Color.black);
        panel.add(t8);

        b1=new JButton("ADD");
        b1.setFont(new Font("Tahoma",Font.BOLD,17));
        b1.setForeground(Color.black);
        b1.setBounds(500,470,90,40);
        b1.setBackground(Color.orange);
        b1.addActionListener(this);
        panel.add(b1);

        b2=new JButton("BACK");
        b2.setFont(new Font("Tahoma",Font.BOLD,17));
        b2.setForeground(Color.black);
        b2.setBounds(640,470,90,40);
        b2.setBackground(Color.orange);
        b2.addActionListener(this);
        panel.add(b2);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icone/pankaj7.png"));
        Image i11=i1.getImage().getScaledInstance(350,500,Image.SCALE_DEFAULT);
        ImageIcon imageIcon=new ImageIcon(i11);
        JLabel label=new JLabel(imageIcon);
        label.setBounds(30,50,350,500);
        panel.add(label);

        setUndecorated(false);
        setLocation(150,200);
        setSize(900,600);
        setLayout(null);
        getContentPane().setBackground(new Color(0xFFD69D64, true));
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){

              String name=t2.getText();
              String age=t3.getText();
              String gender=(String) g1.getSelectedItem();
              String carN=t5.getText();
              String carC=t6.getText();
              String avilaible =(String)g2.getSelectedItem();
              String location=t8.getText();
             try {

                 con c = new con();
                 String q = "insert into deriver1 values ('" + name + "','" + age + "','" + gender + "','" + carN + "','" + carC + "','" + avilaible + "','" + location + "')";
                 c.statement.executeUpdate(q);

                 JOptionPane.showMessageDialog(null, "DRIVER ADDED SUCCESSFULLY");
                 setVisible(false);
             }catch (Exception E) {
                 E.printStackTrace();
             }

        }else{
            System.exit(112);
        }
    }

    public static void main(String[] args) {
        new addDriver();
    }
}
