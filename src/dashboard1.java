


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class dashboard1 extends JFrame {
    JMenuItem loginDetails,loginDetails1;

    public static void main(String[] args) {

        new dashboard1().setVisible(true);
    }
    
    public dashboard1() {
        super("HOTEL MANAGEMENT SYSTEM");
	
        setForeground(Color.CYAN);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/hotel111.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1920, 1080,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
	    JLabel NewLabel = new JLabel(i3);
	    NewLabel.setBounds(0, 0, 1920, 1080);
        add(NewLabel);
        
        JLabel HOTELMANAGEMENTSYSTEM = new JLabel(" WELCOME TO HOTEL BLUE MOON !!");
        HOTELMANAGEMENTSYSTEM.setForeground(new Color(255, 255, 255));

        HOTELMANAGEMENTSYSTEM.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 46));
        HOTELMANAGEMENTSYSTEM.setBounds(400, 10, 1000, 85);
	    NewLabel.add(HOTELMANAGEMENTSYSTEM);
		
		
        JMenuBar menuBar = new JMenuBar();
	    setJMenuBar(menuBar);
		
        JMenu Admin = new JMenu("Admin");
        Admin.setForeground(Color.BLUE);
	    menuBar.add(Admin);
		
        loginDetails = new JMenuItem("login");
        loginDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    //new Admin().setVisible(true);
                    new login2();
                }catch(Exception e ){}
            }
        });
        Admin.add(loginDetails);
		
	    JMenu User = new JMenu("User");
        User.setForeground(Color.RED);
	    menuBar.add(User);
        
        loginDetails1 = new JMenuItem("login");
        loginDetails1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new mainframe().setVisible(true);
                }catch(Exception e ){}
            }
        });
        User.add(loginDetails1);
        
        setSize(1950,1080);
	    setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }


}
