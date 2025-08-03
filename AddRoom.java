package hotel_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddRoom extends JFrame implements ActionListener{
 JTextField t2,t4;
 JComboBox t3,t5,t6;

 JButton b1,b2;
      AddRoom(){
          JPanel panel=new JPanel();
          panel.setBackground(new Color(120, 85, 215));
          panel.setBounds(5,5,875,490);
          panel.setLayout(null);
          add(panel);

            JLabel label=new JLabel("Add Rooms");
            label.setBounds(250,10,160,22);
            label.setFont(new Font("Tahoma",Font.BOLD,26));
            label.setForeground(Color.BLACK);
            panel.add(label);

           JLabel label2=new JLabel("ROOM NUMBER");
           label2.setBounds(64,70,152,22);
           label2.setFont(new Font("Tahoma",Font.BOLD,17));
           label2.setForeground(Color.black);

          panel.add(label2);

          t2=new JTextField();
          t2.setFont(new Font("Tahoma",Font.PLAIN,17));
          t2.setForeground(Color.yellow);
          t2.setBounds(230,70,152,22);
          t2.setBackground(new Color(16,108,115));

          panel.add(t2);

          JLabel label3=new JLabel("Availablity");
          label3.setForeground(Color.BLACK);
          label3.setFont(new Font("Tahoma",Font.BOLD,17));
          label3.setBounds(64,120,160,22);
          panel.add(label3);

          t3=new JComboBox(new String[] {"AVAILABLE","OCCUPIED" });
          t3.setBounds(230,120,152,22);
          t3.setFont(new Font("Tahoma",Font.PLAIN,17));
          t3.setForeground(Color.yellow);
          t3.setBackground(new Color(16,108,115));
          panel.add(t3);


          JLabel label4=new JLabel("PRICE");
          label4.setFont(new Font("Tahoma",Font.BOLD,17));
          label4.setForeground(Color.BLACK);
          label4.setBounds(64,220,160,22);
          panel.add(label4);

          t4=new JTextField();
          t4.setFont(new Font("Tahoma",Font.PLAIN,17));
          t4.setForeground(Color.yellow);
          t4.setBackground(new Color(16,108,115));
          t4.setBounds(230,220,152,22);
          panel.add(t4);


           JLabel label5 =new JLabel("Clening Status");
           label5.setBounds(64,170,160,22);
           label5.setFont(new Font("Tahoma",Font.BOLD,17));
           label5.setForeground(Color.black);
           label5.setBackground(new Color(16,108,115));
           panel.add(label5);


          t5=new JComboBox(new String[] {"Cleaned","Dirty"});
          t5.setFont(new Font("Tahoma",Font.PLAIN,17));
          t5.setBackground(new Color(16,108,115));
          t5.setBounds(230,170,152,22);
          panel.add(t5);


          JLabel label6=new JLabel("ROOM BED");
          label6.setBounds(64,270,160,22);
          label6.setFont(new Font("Tahoma",Font.BOLD,17));
          label6.setForeground(Color.BLACK);
          panel.add(label6);

          t6=new JComboBox(new String[] {"Single bed","Doubble bed"});
          t6.setBounds(230,270,152,22);
          t6.setFont(new Font("Tahoma",Font.PLAIN,17));
          t6.setForeground(Color.yellow);
          t6.setBackground(new Color(16,108,115));
          panel.add(t6);

          b1=new JButton("ADD");
          b1.setBounds(64,350,111,30);
          b1.setFont(new Font("Tahoma",Font.BOLD,17));
          b1.setBackground(Color.orange);
          b1.setForeground(Color.BLACK);
          b1.addActionListener(this);
          panel.add(b1);


          b2=new JButton("BACK");
          b2.setBounds(198,350,111,30);
          b2.setFont(new Font("Tahoma",Font.BOLD,17));
          b2.setBackground(Color.orange);
          b2.setForeground(Color.BLACK);
          b2.addActionListener(this);
          panel.add(b2);


          ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icone/pankaj4.jpeg"));
          Image image=imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
          ImageIcon imageIcon1=new ImageIcon(image);
          JLabel label1 =new JLabel(imageIcon1);
          label1.setBounds(500,60,300,300);
          panel.add(label1);


          setUndecorated(true);
          getContentPane().setBackground(new Color(0x4848F1));
          setLocation(20,200);
          setSize(885,500);
          setLayout(null);
          setVisible(true);

      }

    @Override
    public void actionPerformed(ActionEvent e) {
          if (e.getSource()==b1) {
              try {
                  con c = new con();
                  String room = t2.getText();
                  String ava = (String) t3.getSelectedItem();
                  String status = (String) t5.getSelectedItem();
                  String price =  t4.getText() ;
                  String type = (String) t6.getSelectedItem();

                  String q = "insert into room values('" + room+ "','" + ava + "','" + status + "','"+price+"','" + type + "')";
                  c.statement.executeUpdate(q);


                  JOptionPane.showMessageDialog(null, "ROOM Successfully Added");
                  this.setVisible(false);


              } catch (Exception E) {
                  E.printStackTrace();
              }
          }
              else{
                  setVisible(false);
              }


    }

    public static void main(String[] args) {
        new AddRoom();
    }
}
