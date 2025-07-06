package hotel_management_system;
import java.awt.Choice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class new_custmore extends JFrame implements ActionListener {
    JComboBox c1;
    JTextField phone1,name1,country1,deposit1;
    JRadioButton male1,female1;
    Choice choice,choice1;
//    Choice choice1;
    JLabel date;
    JButton b4,b5;

    new_custmore(){

        JPanel panel1=new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,1200,800);
        panel1.setBackground(new Color(245, 94, 90));
        add(panel1);

        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icone/pankaj4.jpeg"));
        Image image=imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(image);
        JLabel label=new JLabel(imageIcon1);
        label.setBounds(800,280,170,170);
        panel1.add(label);

        JLabel label1=new JLabel("NEW CUSTOMER");
        label1.setBounds(118,11,260,53);
        label1.setFont(new Font("Tahoma",Font.BOLD,19));
        label1.setForeground(Color.BLACK);
        panel1.add(label1);

        JLabel label2 =new JLabel("ID:");
        label2.setBounds(35,76,200,17);
        label2.setFont(new Font("Tahoma",Font.BOLD,22));
        label2.setForeground(Color.BLACK);
        panel1.add(label2);

        c1=new JComboBox(new String[]{"passport","Aadhaar Card","Voter Id","Driving License"});
        c1.setFont(new Font("Tahoma",Font.PLAIN,18));
        c1.setBounds(400,73,160,24);
        c1.setForeground(Color.black);
        c1.setBackground(Color.PINK);
        panel1.add(c1);

        JLabel label3 =new JLabel("PHONE:");
        label3.setBounds(32,140,200,17);
        label3.setFont(new Font("Tahoma",Font.BOLD,22));
        label3.setForeground(Color.BLACK);
        panel1.add(label3);

        phone1=new JTextField();
        phone1.setBackground(Color.PINK);
        phone1.setForeground(Color.black);
        phone1.setBounds(400,135,160,24);
        phone1.setFont(new Font("Tahoma",Font.PLAIN,17));
        panel1.add(phone1);

        JLabel label4 =new JLabel("NAME:");
        label4.setBounds(32,210,200,17);
        label4.setFont(new Font("Tahoma",Font.BOLD,22));
        label4.setForeground(Color.BLACK);
        panel1.add(label4);

        name1=new JTextField();
        name1.setBackground(Color.PINK);
        name1.setForeground(Color.black);
        name1.setBounds(400,205,160,24);
        name1.setFont(new Font("Tahoma",Font.PLAIN,17));
        panel1.add(name1);

        JLabel label5 =new JLabel("GENDER:");
        label5.setBounds(32,260,200,17);
        label5.setFont(new Font("Tahoma",Font.BOLD,22));
        label5.setForeground(Color.BLACK);
        panel1.add(label5);

        male1=new JRadioButton("MALE");
        male1.setFont(new Font("Tahoma",Font.BOLD,18));
        male1.setBackground(Color.PINK);
        male1.setForeground(Color.black);
        male1.setBounds(400,250,80,40);
        panel1.add(male1);

        female1=new JRadioButton("FEMALE");
        female1.setFont(new Font("Tahoma",Font.BOLD,18));
        female1.setBackground(Color.PINK);
        female1.setForeground(Color.black);
        female1.setBounds(500,250,100,40);
        panel1.add(female1);

        JLabel label6 =new JLabel("COUNTRY:");
        label6.setBounds(30,310,200,17);
        label6.setFont(new Font("Tahoma",Font.BOLD,22));
        label6.setForeground(Color.BLACK);
        panel1.add(label6);

        country1=new JTextField();
        country1.setBackground(Color.PINK);
        country1.setForeground(Color.black);
        country1.setBounds(400,310,160,24);
        country1.setFont(new Font("Tahoma",Font.PLAIN,17));
        panel1.add(country1);

        JLabel label7 =new JLabel("ALLOCATED:");
        label7.setBounds(20,380,200,17);
        label7.setFont(new Font("Tahoma",Font.BOLD,22));
        label7.setForeground(Color.BLACK);
        panel1.add(label7);

        choice = new Choice();
        try{
            con c=new con();
            ResultSet resultSet=c.statement.executeQuery("select * from room ");
            while (resultSet.next()){
                choice.add(resultSet.getString("roomnuber"));
            }
        }catch (Exception E){
            E.printStackTrace();
        }
        choice1=new Choice();
        choice.setBounds(400,380,160,30);
        choice.setBackground(Color.pink);
        choice.setForeground(Color.black);
        choice.setFont(new Font("Tahoma",Font.PLAIN,18));
        panel1.add(choice);

        try {
            con c= new con();
            ResultSet resultSet=c.statement.executeQuery("select * from room");
            while (resultSet.next()){
                choice1.add(resultSet.getString("availability"));
            }
        }catch (Exception E){
            E.printStackTrace();
        }
        choice1.setFont(new Font("Tahoma",Font.BOLD,18));
        choice1.setForeground(Color.pink);
        choice1.setBounds(600,380,160,30);
        choice1.setBackground(Color.black);
        panel1.add(choice1);

        JLabel label8 =new JLabel("Checked In:");
        label8.setBounds(20,460,200,17);
        label8.setFont(new Font("Tahoma",Font.BOLD,22));
        label8.setForeground(Color.BLACK);
        panel1.add(label8);

        Date date1=new Date();

        date=new JLabel(""+date1);
        date.setBounds(400,460,400,17);
        date.setFont(new Font("Tahoma",Font.BOLD,22));
        date.setForeground(Color.BLACK);
        panel1.add(date);

        JLabel label9 =new JLabel("DEPOSIT:");
        label9.setBounds(32,520,200,17);
        label9.setFont(new Font("Tahoma",Font.BOLD,22));
        label9.setForeground(Color.BLACK);
        panel1.add(label9);

        deposit1=new JTextField();
        deposit1.setBackground(Color.PINK);
        deposit1.setForeground(Color.black);
        deposit1.setBounds(400,520,160,24);
        deposit1.setFont(new Font("Tahoma",Font.PLAIN,17));
        panel1.add(deposit1);

        b4=new JButton("ADD");
        b4.setFont(new Font("Tahoma",Font.BOLD,22));
        b4.setBounds(300,600,110,40);
        b4.setForeground(Color.black);
        b4.setBackground(new Color(0xF13171));
        b4.addActionListener(this);
        panel1.add(b4);

        b5=new JButton("BACk");
        b5.setFont(new Font("Tahoma",Font.BOLD,22));
        b5.setBounds(500,600,110,40);
        b5.setForeground(Color.black);
        b5.setBackground(new Color(0xF13171));
        b5.addActionListener(this);
        panel1.add(b5);

        setUndecorated(false);
        getContentPane().setBackground(new Color(0xF120F1));
        setLayout(null);
        setLocation(300,80);
        setSize(1000,730);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b4){
              con c =new con();
                 String radioBtn =null;
           if (male1.isSelected()){
             radioBtn="MALE";
           }   else if (female1.isSelected()) {
                  radioBtn ="FEMALE";
             }

            String s1 = (String)c1.getSelectedItem();
            String s2=phone1.getText();
            String s3=name1.getText();
            String s4=radioBtn;
            String s5=country1.getText();
            String s6=choice.getSelectedItem();
            String s8= deposit1.getText();
            String s7=date.getText();
             try {

                 String q="insert into customer values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s8+"','"+s7+"')";
                String q1="update room set availability='Occupied' where roomnuber="+s6;
                c.statement.executeUpdate(q);
                c.statement.executeUpdate(q1);

                JOptionPane.showMessageDialog(null," added Successfully ");
                setVisible(false);
//               ResultSet resultSet=c.statement.executeQuery(q);


             } catch (Exception E){
               E.printStackTrace();

             }


        }else {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new new_custmore();
    }
}
