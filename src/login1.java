

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class login1 extends JFrame implements ActionListener {
    
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;

    login1(){

        super("Login");

        setLayout(null);

        l1 = new JLabel("Username");
        l1.setBounds(40,20,100,30);
        add(l1);
        
        l2 = new JLabel("Password");
        l2.setBounds(40,70,100,30);
        add(l2);
 
        t1=new JTextField();
        t1.setBounds(150,20,150,30);
        add(t1);

        t2=new JPasswordField();
        t2.setBounds(150,70,150,30);
        add(t2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/user.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(350,10,150,150);
        add(l3);


        b1 = new JButton("Login");
        b1.setBounds(150,140,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("SignUp");
        b2.setBounds(150,190,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.addActionListener(this);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        add(b2);

        
        
        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
        setSize(600,400);
        setLocation(500,200);

    }



    public static void main(String[] arg){
        new login1();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){

                String uname = t1.getText();
                String pass =  t2.getText();
            try {
                Conn c = new Conn();
                String query = "select uname , password from account2 where uname='" + uname + "' and password='"+pass+"'";
                ResultSet rs = c.s.executeQuery(query);

                if (rs.next()) {
                    setVisible(false);
                    JOptionPane.showMessageDialog(this,"Login successful");
                    new dashboard1();
                } else {
                    setLocation(500,300);
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                }

            } catch (Exception ea) {
                ea.printStackTrace();
            }

        }else if(e.getSource()==b2){
            setVisible(false);
            new signUp();
        }
    }
}
