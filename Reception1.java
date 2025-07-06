package hotel_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception1 extends JFrame {
JButton b1,b2;
      Reception1(){

              JPanel panel= new JPanel();
              panel.setLayout(null);
              panel.setBounds(300,3,1220,780);
              panel.setBackground(new Color(3,45,48));
              add(panel);

              JPanel panel1=new JPanel();
              panel1.setLayout(null);
              panel1.setBounds(5,5,280,780);
              panel1.setBackground(new Color(3,45,48));
              add(panel1);

              ImageIcon i111= new ImageIcon(ClassLoader.getSystemResource("icone/pankaj6.png"));
              Image i22= i111.getImage().getScaledInstance(400,595,Image.SCALE_DEFAULT);
              ImageIcon imageIcon111=new ImageIcon(i22);
              JLabel label11 =new JLabel(imageIcon111);
              label11.setBounds(630,300,600,395);
              panel. add(label11);

              ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource("icone/a.gif"));
              Image i2= i11.getImage().getScaledInstance(180,400,Image.SCALE_DEFAULT);
              ImageIcon imageIcon=new ImageIcon(i2);
              JLabel label1=new JLabel(imageIcon);
              label1.setBounds(5,660,130,260);
              panel1.add(label1);

              JButton btnncf= new JButton("ADD NEW Customer");
              btnncf.setBounds(35,15,200,30);
              btnncf.setBackground(new Color(0xFF109A9A, true));
              btnncf.setFont(new Font("Tahoma",Font.BOLD,17));
              btnncf.setForeground(Color.BLACK);
              panel1.add(btnncf);
              btnncf.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e) {
                         try{
                            new new_custmore();
                         }catch (Exception e1){
                             e1.printStackTrace();
                         }
                     }
                 });
                 JButton btn=new JButton("Room");
                 btn.setBounds(38,75,200,30);
                 btn.setBackground(new Color(0xFF109A9A, true));
                 btn.setFont(new Font("Tahoma",Font.BOLD,17));
                 btn.setForeground(Color.BLACK);
                 panel1.add(btn);
                 btn.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e) {
                        try {
                             if (e.getSource()==btn){
                                new room1();
                             }

                        }catch (Exception E) {
                            E.printStackTrace();
                        }
                        }

                 });

              JButton btnd=new JButton("Department");
              btnd.setBounds(40,145,200,30);
              btnd.setBackground( new Color(0xFF109A9A, true));
              btnd.setFont(new Font("Tahoma",Font.BOLD,17));
              btnd.setForeground(Color.BLACK);
              add(btnd);
              btnd.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try{
                    new department();
                 } catch (Exception E){

                  }
                }
             });

          JButton btnE=new JButton("All Employee info");
          btnE.setBounds(40,215,200,30);
          btnE.setBackground( new Color(0xFF109A9A, true));
          btnE.setForeground(Color.BLACK);
          btnE.setFont(new Font("Tahoma",Font.BOLD,17));
          add(btnE);
          btnE.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try{
                     new employee1();
                 }catch (Exception E){

                 }
             }
          });
           JButton btnC1= new JButton("Customer info");
           btnC1.setBounds(40,285,200,30);
           btnC1.setForeground(Color.black);
           btnC1.setFont(new Font("Tahoma",Font.BOLD,17));
           btnC1.setBackground(new Color(0xFF109A9A, true));
           add(btnC1);
           btnC1.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                    new customerinfo();
              }
           });

           JButton btnm= new JButton("Manager info");
           btnm.setBounds(40,355,200,30);
           btnm.setForeground(Color.black);
           btnm.setFont(new Font("Tahoma",Font.BOLD,17));
           btnm.setBackground(new Color(0xFF109A9A, true));
           add(btnm);
           btnm.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                new info_manager();
              }
           });



           JButton btncheck= new JButton("Check out");
           btncheck.setBounds(40,425,200,30);
           btncheck.setForeground(Color.black);
           btncheck.setFont(new Font("Tahoma",Font.BOLD,17));
           btncheck.setBackground(new Color(0xFF109A9A, true));
           add(btncheck);
           btncheck.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {new Updatecheck();

              }
           });

           JButton btncheck3 = new JButton("Search Room");
           btncheck3.setBounds(40,490,200,30);
           btncheck3.setForeground(Color.black);
           btncheck3.setFont(new Font("Tahoma",Font.BOLD,17));
           btncheck3.setBackground(new Color(0xFF109A9A, true));
           add(btncheck3);
           btncheck3.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  new searchroom();
              }
           });

           JButton btncheck2 = new JButton("pick-up-service");
           btncheck2.setBounds(40,545,200,30);
           btncheck2.setForeground(Color.black);
           btncheck2.setFont(new Font("Tahoma",Font.BOLD,17));
           btncheck2.setBackground(new Color(0xFF109A9A, true));
           add(btncheck2);
           btncheck2.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                    new pick_up ();
              }
           });
           JButton btncheck7 =new JButton("Update Room Status");
           btncheck7.setBounds(40,615,200,30);
           btncheck7.setForeground(Color.BLACK);
           btncheck7.setBackground(new Color(0xFF109A9A, true));
           btncheck7.setFont(new Font("TAhoma",Font.BOLD,17));
           add(btncheck7);
           btncheck7.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                    new UpdateRoom();
               }
           });


          b1=new JButton("BACK");
          b1.setBackground(new Color(0xE1BC3C));
          b1.setFont(new Font("Tahoma",Font.BOLD,18));
          b1.setBounds(600,650,110,40);
          b1.setForeground(Color.black);
          b1.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  if (e.getSource()==b1){
                      setVisible(false);
                  }
              }
          });
          panel.add(b1);

          getContentPane().setBackground(Color.pink);
          setLayout(null);

           setSize(1950,1090);
           setVisible(true);

      }
    public static void main(String[] args) {
           new Reception1();

    }
}

