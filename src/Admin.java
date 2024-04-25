import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Admin extends JFrame implements ActionListener {

    JButton addEmployee, addRoom, Status, LogOut,Back;
    Admin(){

        setSize(1360,565);


		addEmployee  = new JButton("ADD EMPLOYEE");
		addEmployee.setBounds(450, 500, 240, 30);
		addEmployee.setBackground(Color.WHITE);
		addEmployee.setForeground(Color.BLACK);
		addEmployee.addActionListener(this);
		// Manage_Employee.setFont(new Font("Caliber", Font.BOLD,15));
		add(addEmployee);

		addRoom = new JButton("ADD ROOMS");
		addRoom.setBounds(900, 500, 240, 30);
		addRoom.setBackground(Color.WHITE);
		addRoom.setForeground(Color.BLACK);
		addRoom.addActionListener(this);
		add(addRoom);

//		Status = new JButton("CHECK STATUS");
//		Status.setBounds(250, 450, 200, 25);
//		Status.setBackground(Color.WHITE);
//		Status.setForeground(Color.BLACK);
//		Status.addActionListener(this);
//		add(Status);

		LogOut = new JButton("LOGOUT");
		LogOut.setBounds(10, 800, 100, 25);
		LogOut.setBackground(Color.BLACK);
		LogOut.setForeground(Color.WHITE);
		LogOut.addActionListener(this);
		add(LogOut);

		Back = new JButton("BACK");
		Back.setBounds(150, 800, 100, 25);
		Back.setBackground(Color.BLACK);
		Back.setForeground(Color.WHITE);
		Back.addActionListener(this);
		add(Back);

        ImageIcon imageIcon= new ImageIcon(ClassLoader.getSystemResource("Icons/addemp.png"));
        Image image11 = imageIcon.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i1 = new ImageIcon(image11);
        JLabel image1 = new JLabel(i1);
        image1.setBounds(485, 300, 150, 150);
        add(image1);

		ImageIcon imageIcon1= new ImageIcon(ClassLoader.getSystemResource("Icons/room11.png"));
		Image image12 = imageIcon1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
		ImageIcon i2 = new ImageIcon(image12);
		JLabel image2 = new JLabel(i2);
		image2.setBounds(935, 300, 150, 150);
		add(image2);


        getContentPane().setBackground(new Color(186, 216, 239, 255));
		setLayout(null);
		setSize(1950,1090);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()== addEmployee) {
            new Add_Employee();

        }else if(e.getSource()== addRoom) {
            new AddRoom();

        }else if(e.getSource()==LogOut) {
			new dashboard1();
			setVisible(false);
			JOptionPane.showMessageDialog(null,"Successfully Logout");
            //System.exit(404);
        }else if(e.getSource()== Back) {
			//new dashboard1();
			setVisible(false);

            setVisible(false);

        }

    }

    public static void main(String[]args) {
        new Admin();

    }



}

