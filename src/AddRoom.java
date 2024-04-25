import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class AddRoom extends JFrame implements ActionListener {

    JTextField t2,t4;
    JComboBox t3, t5,t6;
    JButton add,back;

    AddRoom(){
        JPanel panel1 = new JPanel();
        panel1.setBounds(5, 5, 890, 490);
        panel1.setLayout(null);
        panel1.setBackground(new Color(149, 188, 227));
        add(panel1);

        JLabel l1 = new JLabel("Add Room");
        l1.setBounds(400,10,160,25);
        l1.setFont(new Font("Calibri", Font.BOLD,25));
        l1.setForeground(Color.WHITE);
        panel1.add(l1);

        JLabel RoomNo = new JLabel("Room Number");
        RoomNo.setBounds(60, 90, 150,25);
        RoomNo.setForeground(Color.WHITE);
        panel1.add(RoomNo);
        t2 = new JTextField();
        t2.setBounds(210, 90, 160,25);
        t2.setForeground(Color.WHITE);
        t2.setBackground(new Color(186, 216, 239));
        panel1.add(t2);

        JLabel Available = new JLabel("Availability");
        Available.setBounds(60, 140, 150, 25);
        Available.setForeground(Color.WHITE);
        panel1.add(Available);
        t3 = new JComboBox(new String[]{"Available","Occupied"});
        t3.setBounds(210,140,160,25);
        t3.setForeground(Color.WHITE);
        t3.setBackground(new Color(186, 216, 239));
        panel1.add(t3);

        JLabel price = new JLabel("Price");
        price.setBounds(60, 190, 150, 25);
        price.setForeground(Color.WHITE);
        panel1.add(price);
        t4 = new JTextField();
        t4.setBounds(210,190,160,25);
        t4.setForeground(Color.WHITE);
        t4.setBackground(new Color(186, 216, 239));
        panel1.add(t4);

        JLabel CleaningStatus = new JLabel("Cleaning Status");
        CleaningStatus.setBounds(60,240,150,25);
        CleaningStatus.setForeground(Color.WHITE);
        panel1.add(CleaningStatus);
        t5 = new JComboBox(new String[] {" Cleaned ","Dirty"});
        t5.setBounds(210,240,160,25);
        t5.setForeground(Color.WHITE);
        t5.setBackground(new Color(186, 216, 239));
        panel1.add(t5);

        JLabel type = new JLabel("Bed Type");
        type.setBounds(60, 290, 150, 25);
        type.setForeground(Color.WHITE);
        panel1.add(type);
        t6 = new JComboBox(new String[] {"Single Bed","Double Bed"});
        t6.setBounds(210,290,160,25);
        t6.setForeground(Color.WHITE);
        t6.setBackground(new Color(186, 216, 239));
        panel1.add(t6);

        add = new JButton("Add");
        add.setBounds(64, 400, 100, 30);
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.addActionListener(this);
        panel1.add(add);

        back = new JButton("Back");
        back.setBounds(200, 400, 100, 30);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        back.addActionListener(this);
        panel1.add(back);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Icons/Room22-.png"));
        Image image = imageIcon.getImage().getScaledInstance(400, 250, Image.SCALE_DEFAULT);
        ImageIcon i1 = new ImageIcon(image);
        JLabel label = new JLabel(i1);
        label.setBounds(420, 60, 400, 250);
        panel1.add(label);




        setUndecorated(true);
        setLocation(330,150);
        setLayout(null);
        setSize(900,500);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add) {

            String Room_number = t2.getText();
            String availability = (String)t3.getSelectedItem();
            String Price = t4.getText();
            String Cleaning_Status = (String)t5.getSelectedItem();
            String Bed_type = (String)t6.getSelectedItem();
            try {
                Conn con = new Conn();
                String query = " insert into addroom values('"+Room_number+"','"+availability+"','"+Price+"','"+Cleaning_Status+"','"+Bed_type+"')";


                con.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "New Room Added Successfully");
                setVisible(false);

            }catch(Exception E) {
                E.printStackTrace();
            }
        }
        else if(e.getSource()==back) {
            setVisible(false);
            //new Admin();
        }

        else {
            setVisible(false);
        }


    }

    public static void main(String[] args) {
        new AddRoom();


    }



}
