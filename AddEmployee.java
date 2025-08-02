package hotel_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddEmployee extends JFrame implements ActionListener {

     JTextField t2,t3,t6,t7,t8,t9;
     JRadioButton radioButtonM,radioButtonF ;

     JButton ADD,BACK;
     JComboBox t5;
    AddEmployee(){

         JPanel panel=new JPanel();
         panel.setBackground(new Color(0x8686EA));
         panel.setBounds(5,5,890,590);
         panel.setLayout(null);
         add(panel);

         JLabel label1=new JLabel("ADD EMPLOYEE DETAILS");
         label1.setBounds(300,5,400,30);
         label1.setFont(new Font("Tahoma",Font.BOLD,24));
         label1.setForeground(Color.BLACK);
         panel.add(label1);

         JLabel label2=new JLabel("NAME");
         label2.setBounds(64,70,153,22);
         label2.setForeground(Color.BLACK);
         label2.setFont(new Font("Tahoma",Font.BOLD,20));
         panel.add(label2);


         t2=new JTextField();
         t2.setFont(new Font("Tahoma",Font.PLAIN,17));
         t2.setForeground(Color.BLACK);
         t2.setBackground(new Color(0xA7A7EC));
         t2.setBounds(152,64,200,28);
         panel.add(t2);

         JLabel label3 =new JLabel("AGE");
         label3.setBounds(64,120,153,24);
         label3.setForeground(Color.BLACK);
         label3.setFont(new Font("Tahoma",Font.BOLD,20));
         panel.add(label3);


         t3=new JTextField();
         t3.setFont(new Font("Tahoma",Font.PLAIN,17));
         t3.setForeground(Color.BLACK);
         t3.setBackground(new Color(0xA7A7EC));
         t3.setBounds(152,115,200,28);
         panel.add(t3);


         JLabel label4 =new JLabel("GENDER");
         label4.setBounds(62,170,153,24);
         label4.setForeground(Color.BLACK);
         label4.setFont(new Font("Tahoma",Font.BOLD,20));
         panel.add(label4);

         radioButtonM=new JRadioButton("MALE");
         radioButtonM.setBounds(170,170,70,27);
         radioButtonM.setBackground(new Color(0x8686EA));
         radioButtonM.setFont(new Font("Tahoma",Font.BOLD,14));
         radioButtonM.setForeground(Color.black);
         panel.add(radioButtonM);

         radioButtonF=new JRadioButton("FEMALE");
         radioButtonF.setBounds(260,170,90,27);
         radioButtonF.setBackground(new Color(0x8686EA));
         radioButtonF.setFont(new Font("Tahoma",Font.BOLD,14));
         radioButtonF.setForeground(Color.black);
         panel.add( radioButtonF);

         JLabel label5=new JLabel("JOB");
         label5.setBounds(64,220,153,24);
         label5.setForeground(Color.BLACK);
         label5.setFont(new Font("Tahoma",Font.BOLD,22));
         panel.add(label5);

         t5=new JComboBox(new String[] {"Fornt Desk","House skeeping","Kitchan Staff","Room Service","Manager","Accountant","Chef"});
         t5.setBounds(152,215,200,28);
         t5.setFont(new Font("Tahoma",Font.PLAIN,17));
         t5.setBackground(new Color(0xA7A7EC));
         t5.setForeground(Color.BLACK);
         panel.add(t5);

          JLabel label6=new JLabel("SALARY");
          label6.setFont(new Font("TAhoma",Font.BOLD,22));
          label6.setForeground(Color.BLACK);
          label6.setBounds(60,270,153,24);
          panel.add(label6);

          t6=new JTextField();
          t6.setForeground(Color.BLACK);
          t6.setFont(new Font("Tahoma",Font.PLAIN,17));
          t6.setBackground(new Color(0xA7A7EC));
          t6.setBounds(152,270,200,28);
          panel.add(t6);

          JLabel label7=new JLabel("PHONE");
          label7.setBounds(62,320,153,24);
          label7.setForeground(Color.BLACK);
          label7.setFont(new Font("Tahoma",Font.BOLD,22));
          panel.add(label7);

          t7=new JTextField();
          t7.setBackground(new Color(0xA7A7EC));
          t7.setFont(new Font("Tahoma",Font.PLAIN,17));
          t7.setBounds(152,320,200,28);
          panel.add(t7);

         JLabel label8 =new JLabel("AADHAR");
         label8.setBounds(58,370,153,24);
         label8.setForeground(Color.BLACK);
         label8.setFont(new Font("Tahoma",Font.BOLD,22));
         panel.add(label8);

         t8=new JTextField();
         t8.setBackground(new Color(0xA7A7EC));
         t8.setFont(new Font("Tahoma",Font.PLAIN,17));
         t8.setBounds(152,370,200,28);
         panel.add(t8);



        JLabel label9 =new JLabel("EMAIL");
        label9.setBounds(58,420,153,24);
        label9.setForeground(Color.BLACK);
        label9.setFont(new Font("Tahoma",Font.BOLD,22));
        panel.add(label9);

        t9=new JTextField();
        t9.setBackground(new Color(0xA7A7EC));
        t9.setFont(new Font("Tahoma",Font.PLAIN,17));
        t9.setBounds(152,420,200,28);
        panel.add(t9);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icone/pankaj5.png"));
        Image i11=i1.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT);
        ImageIcon imageIcon=new ImageIcon(i11);
        JLabel label=new JLabel(imageIcon);
        label.setBounds(400,100,500,500);
       panel.add(label);

       ADD=new JButton("ADD");
       ADD.setBackground(new Color(0xD1C48D));
       ADD.setFont(new Font("Tahoma",Font.BOLD,19));
       ADD.setForeground(Color.BLACK);
       ADD.setBounds(77,490,100,35);
       ADD.addActionListener(this);
       panel.add(ADD);

       BACK=new JButton("BACK");
       BACK.setBackground(new Color(0xD1C48D));
       BACK.setFont(new Font("Tahoma",Font.BOLD,19));
       BACK.setForeground(Color.BLACK);
       BACK.setBounds(200,490,100,35);
       BACK.addActionListener(this);
       panel.add(BACK);


       setUndecorated(true);
       setLocation(150,200);
       setLayout(null);
       setSize(900,600);
       getContentPane().setBackground(Color.orange);
       setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ADD){
            try{

                String name= t2.getText();
                String age=t3.getText();
                String salary=t6.getText();
                String phone=t7.getText();
                String email=t9.getText();
                String aadhar=t8.getText();
                String job=(String)t5.getSelectedItem();
                String gender=null;

                if (radioButtonM.isSelected()){
                   gender ="Male";
                }else{
                    gender="Female";
                }

                try{
                    con c=new con();
                    String q="insert into employee values('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+email+"','"+aadhar+"')";
                    c.statement.executeUpdate(q);


                    JOptionPane.showMessageDialog(null,"EMPLOYEE Successfully Added ");
                    this.setVisible(false);

                }catch (Exception E){
                    E.printStackTrace();
                }



            }catch (Exception E){
                E.printStackTrace();
            }
        }else {
          setVisible(false);
        }
    }

    public static void main(String[] args) {
             new AddEmployee();
    }
}
