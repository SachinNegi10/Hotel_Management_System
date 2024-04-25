

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class signUp extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JTextField t1, t2;
    JPasswordField t3;
    JButton b1, b2;

    signUp() {

        super("SignUp");

        setLayout(null);

        l1 = new JLabel("Username");
        l1.setBounds(40, 20, 100, 30);
        add(l1);

        l2 = new JLabel("Mobile No.");
        l2.setBounds(40, 70, 100, 30);
        add(l2);

        l3 = new JLabel("Password");
        l3.setBounds(40, 120, 100, 30);
        add(l3);

        t1 = new JTextField();
        t1.setBounds(150, 20, 150, 30);
        add(t1);

        t2 = new JTextField();
        t2.setBounds(150, 70, 150, 30);
        add(t2);

        t3 = new JPasswordField();
        t3.setBounds(150, 120, 150, 30);
        add(t3);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/user.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(350, 10, 150, 150);
        add(l3);


        b1 = new JButton("Sign Up");
        b1.setBounds(120, 160, 90, 30);
        b1.setFont(new Font("serif", Font.BOLD, 15));
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);

        b2 = new JButton("Back");
        b2.setBounds(220, 160, 90, 30);
        b2.setFont(new Font("serif", Font.BOLD, 15));
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new login1();
            }
        });
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        add(b2);


        // b2.addActionListener(this);


        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
        setSize(600, 400);
        setLocation(500, 200);

    }


    public static void main(String[] arg) {
        new signUp();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
                String un = t1.getText();
                String phone= t2.getText();
                String pw = t3.getText();
                int len = phone.length();
                String msg = "" + un;
                msg += " \n";
                if (len!=10) {
                    JOptionPane.showMessageDialog(b1, "Enter a valid mobile number");
                }
                else{
                    try {
                        Conn c = new Conn();
                        String query = "INSERT into account2 values('" + un + "','" + phone + "','" + pw + "')";
                        int rs = c.s.executeUpdate(query);
                        JOptionPane.showMessageDialog(b1, "Welcome, " + msg + "Your account is successfully created");
                        setVisible(false);
                        new login1();

                    } catch (Exception eb) {
                        JOptionPane.showMessageDialog(b1, "This is already exist");
                        setVisible(false);
                    }
                }

            }

        }
    }

