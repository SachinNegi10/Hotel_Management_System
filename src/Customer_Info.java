import net.proteanit.sql.DbUtils;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Customer_Info extends JFrame implements ActionListener {
    JButton back;

    Customer_Info(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,1940,1070);
        panel.setBackground(new Color(149, 188, 227));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(10,40,1490,1070);
        table.setBackground(new Color(149, 188, 227));
        table.setRowHeight(20);
        table.setForeground(Color.BLACK);

        table.setFont(new Font("Tahoma", Font.BOLD , 10));
        panel.add(table);

        back = new JButton("BACK");
        back.setBounds(500, 1200, 100, 25);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);

        JLabel title = new JLabel("Title");
        title.setBounds(50,10,45,15);
        title.setForeground(Color.WHITE);
        panel.add(title);

        JLabel firstName = new JLabel("First Name");
        firstName.setBounds(200,10,80,15);
        firstName.setForeground(Color.WHITE);
        panel.add(firstName);

        JLabel lastName = new JLabel("Last Name");
        lastName.setBounds(350,10,80,15);
        lastName.setForeground(Color.WHITE);
        panel.add(lastName);

        JLabel email = new JLabel("E-Mail ID");
        email.setBounds(500,10,80,15);
        email.setForeground(Color.WHITE);
        panel.add(email);

        JLabel roomtype = new JLabel("Room Type");
        roomtype.setBounds(620,10,80,15);
        roomtype.setForeground(Color.WHITE);
        panel.add(roomtype);

        JLabel noofroom = new JLabel("No Of Room");
        noofroom.setBounds(780,10,80,15);
        noofroom.setForeground(Color.WHITE);
        panel.add(noofroom);

        JLabel in = new JLabel("Check In Date");
        in.setBounds(920,10,80,15);
        in.setForeground(Color.WHITE);
        panel.add(in);

        JLabel out = new JLabel("Check Out Date");
        out.setBounds(1080,10,120,15);
        out.setForeground(Color.WHITE);
        panel.add(out);

        JLabel idproof = new JLabel("ID Proof");
        idproof.setBounds(1240,10,80,15);
        idproof.setForeground(Color.WHITE);
        panel.add(idproof);

        JLabel idno = new JLabel("ID Number");
        idno.setBounds(1390,10,80,15);
        idno.setForeground(Color.WHITE);
        panel.add(idno);

        try{
            Conn c = new Conn();
            String q = "Select * from Reservation";
            ResultSet rs =  c.s.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(rs));

        }catch (Exception e){
            e.printStackTrace();
        }

        setLayout(null);
        setSize(1950,1080);
        //setLocation(250,100);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Customer_Info();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==back){
            new dashboard1();
            setVisible(false);
        }
    }
}
