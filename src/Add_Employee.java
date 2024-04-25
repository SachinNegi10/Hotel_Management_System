import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Add_Employee extends JFrame  implements ActionListener {
    JTextField nameText,ageText,t3,t4,t5,salaryText, phoneText, aadhaarText, emailText;
    JRadioButton male, female;
    JComboBox combobox;
    JButton add, back;

    Add_Employee(){



        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 890, 490);
        panel.setLayout(null);
        panel.setBackground(new Color(149, 188, 227));
        add(panel);

        ImageIcon imageIcon= new ImageIcon(ClassLoader.getSystemResource("Icons/ss-removebg-preview.png"));
		Image image = imageIcon.getImage().getScaledInstance(350, 350, Image.SCALE_DEFAULT);
		ImageIcon i1 = new ImageIcon(image);
        JLabel image1 = new JLabel(i1);
        image1.setBounds(450, 50, 350, 350);
        panel.add(image1);


        JLabel top = new JLabel("ADD EMPLOYEE DETAILS");
        top.setBounds(350, 3 , 445, 35);
        top.setFont(new Font("Raleway",Font.BOLD,20));
        top.setForeground(Color.WHITE);
        panel.add(top);

        JLabel name = new JLabel("NAME");
        name.setBounds(60, 40, 150, 30);
        name.setForeground(Color.WHITE);
        panel.add(name);
        nameText = new JTextField();
        nameText.setBounds(200, 40, 150, 25);
        nameText.setBackground(new Color(186, 216, 239));
        nameText.setForeground(Color.WHITE);
        panel.add(nameText);

        JLabel age = new JLabel("AGE");
        age.setBounds(60, 80, 150, 30);
        age.setForeground(Color.WHITE);
        panel.add(age);
        ageText = new JTextField();
        ageText.setBounds(200, 80, 150, 25);
        ageText.setBackground(new Color(186, 216, 239));
        ageText.setForeground(Color.WHITE);
        panel.add(ageText);

        JLabel gender = new JLabel("GENDER");
        gender.setBounds(60, 120, 150, 30);
        gender.setForeground(Color.WHITE);
        panel.add(gender);

        male = new JRadioButton("MALE");
        male.setBounds(200, 120, 70, 25);
        male.setBackground(new Color(149, 188, 227));
        male.setForeground(Color.WHITE);
        panel.add(male);

        female = new JRadioButton("FEMALE");
        female.setBounds(280, 120, 110, 25);
        female.setBackground(new Color(149, 188, 227));
        female.setForeground(Color.WHITE);
        panel.add(female);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

        JLabel job = new JLabel("JOB");
        job.setBounds(60, 160, 150, 30);
        job.setForeground(Color.WHITE);
        panel.add(job);

        combobox = new JComboBox(new String[] {"Front Desk","Housekeeping","Kitchen Staff","Room Service","Manager","Accountent","Chef"});
        combobox.setBounds(200, 160, 150, 25);
        combobox.setForeground(Color.WHITE);
        combobox.setBackground(new Color(186, 216, 239));
        panel.add(combobox);

        JLabel salary = new JLabel("SALARY");
        salary.setBounds(60, 200, 150, 30);
        salary.setForeground(Color.WHITE);
        panel.add(salary);
        salaryText = new JTextField();
        salaryText.setBounds(200, 200, 150, 25);
        salaryText.setForeground(Color.WHITE);
        salaryText.setBackground(new Color(186, 216, 239));
        panel.add(salaryText);

        JLabel phone = new JLabel("PHONE NO.");
        phone.setBounds(60, 240,150, 30);
        phone.setForeground(Color.WHITE);
        panel.add(phone);
        phoneText = new JTextField();
        phoneText.setBounds(200,240,150,25);
        phoneText.setForeground(Color.WHITE);
        phoneText.setBackground(new Color(186, 216, 239));
        panel.add(phoneText);

        JLabel aadhaar = new JLabel("AADHAAR NO.");
        aadhaar.setBounds(60, 280,150, 30);
        aadhaar.setForeground(Color.WHITE);
        panel.add(aadhaar);
        aadhaarText = new JTextField();
        aadhaarText.setBounds(200,280,150,25);
        aadhaarText.setForeground(Color.WHITE);
        aadhaarText.setBackground(new Color(186, 216, 239));
        panel.add(aadhaarText);

        JLabel email = new JLabel("E-MAIL ");
        email.setBounds(60, 320,150, 30);
        email.setForeground(Color.WHITE);
        panel.add(email);
        emailText = new JTextField();
        emailText.setBounds(200,320,150,25);
        emailText.setForeground(Color.WHITE);
        emailText.setBackground(new Color(186, 216, 239));
        panel.add(emailText);

        add = new JButton("Add");
        add.setBounds(80, 400, 100, 25);
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("Back");
        back.setBounds(200, 400, 100, 25);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        back.addActionListener(this);
        panel.add(back);




        setUndecorated(true);
        setLocation(330,150);
        setLayout(null);
        setSize(900,500);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== add) {
            String name = nameText.getText();
            String age = ageText.getText();
            String salary = salaryText.getText();
            String phone = phoneText.getText();
            String aadhaar = aadhaarText.getText();
            String email = emailText.getText();
            String job = (String)combobox.getSelectedItem();
            String gender = null;
            if(male.isSelected()) {
                gender = "Male";
            }else if(female.isSelected()) {
                gender = "Female";
            }

            try {
                Conn con = new Conn();
                String Query = "insert into addEmployee values('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+aadhaar+"','"+email+"')";
                con.s.executeUpdate(Query);
                JOptionPane.showMessageDialog(null, "Employee Added");
                //setVisible(false);

            }catch(Exception E) {
                E.printStackTrace();

            }
        }
        else if(e.getSource()== back) {
            setVisible(false);
           // new Admin();
        }
        else {
            setVisible(false);
        }

    }

    public static void main(String[] args) {

        new Add_Employee();
    }



}
