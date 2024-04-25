

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.LayoutStyle.ComponentPlacement;

public class form extends JFrame implements ActionListener {
	JButton submit,btnBack;
	static JComboBox comboBox,comboBox_2,comboBox_3,comboBox_1,comboBox_1_1,comboBox_1_1_1,comboBox_1_2,comboBox_1_1_2,comboBox_1_1_1_1;

	private static final long serialVersionUID = 1L;
	static JPanel contentPane;
	static JTextField textField_1;
	static JTextField textField_2;
	static JTextField textField_3;
	static JTextField textField_4;
	static JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form frame = new form("");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public form(String room) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 150, 760, 610);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(149, 188, 227));
		contentPane.setSize(800,800);
		contentPane.setBackground(new Color(221, 237, 246));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		//ImageIcon img;
		//img=new ImageIcon(getClass().getResource("h1.jpg"));
		ImageIcon img=new ImageIcon(getClass().getResource("Icons/user1.jpg"));
		JLabel lblNewLabel_3 = new JLabel(img);
		JLabel lblNewLabel = new JLabel("Reservation");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 24));
		
		JLabel lblNewLabel_1 = new JLabel("Title");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_2 = new JLabel("First Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Email");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Type of Room");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel(" No.of Room");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Check-in-date");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("ID Proof");
		lblNewLabel_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_2 = new JLabel("Check-out-date");
		lblNewLabel_1_1_1_1_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1 = new JLabel("ID Number");
		lblNewLabel_1_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		String type[]= {"Single Room","Double Room","Suite"};
		comboBox = new JComboBox(type);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Single Room", "Double Room", "Suite"}));
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		 String dates[]
			        = { "1", "2", "3", "4", "5",
			            "6", "7", "8", "9", "10",
			            "11", "12", "13", "14", "15",
			            "16", "17", "18", "19", "20",
			            "21", "22", "23", "24", "25",
			            "26", "27", "28", "29", "30",
			            "31" };
			     String months[]
			        = { "Jan", "feb", "Mar", "Apr",
			            "May", "Jun", "July", "Aug",
			            "Sup", "Oct", "Nov", "Dec" };
			     String years[]
			        = { "1995", "1996", "1997", "1998",
			            "1999", "2000", "2001", "2002",
			            "2003", "2004", "2005", "2006",
			            "2007", "2008", "2009", "2010",
			            "2011", "2012", "2013", "2014",
			            "2015", "2016", "2017", "2018",
			            "2019" ,"2020","2021","2022","2023","2024","2025"};

		 comboBox_1 = new JComboBox(dates);
		
		 comboBox_1_1 = new JComboBox(months);
		
		 comboBox_1_1_1 = new JComboBox(years);
		
		 comboBox_1_2 = new JComboBox(dates);
		
		 comboBox_1_1_2 = new JComboBox(months);
		
		 comboBox_1_1_1_1 = new JComboBox(years);
		String id[]= {"Aadhar Card","PAN Card","Voter ID Card"};
		
		comboBox_2 = new JComboBox(id);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);

		submit = new JButton("Submit");
		submit.addActionListener(this);
		submit.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(this);
		btnBack.setFont(new Font("Verdana", Font.BOLD, 14));
		String title[]= {"Mr.","Mrs.","Ms."};
		
		comboBox_3 = new JComboBox(title);
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblNewLabel_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_1_1_1_1)
								.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_1_1_1_1_1_1_2)
								.addComponent(lblNewLabel_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(comboBox_3, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(comboBox_1_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(comboBox_1_1_2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(comboBox_1_1_1_1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(comboBox_1_1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(comboBox_1_1_1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
								.addComponent(textField_4)
								.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
								.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
								.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
								.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(comboBox_2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(submit)
									.addPreferredGap(ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
									.addComponent(btnBack))
								.addComponent(textField_5))))
					.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(269, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
					.addGap(268))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_1)
						.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_2)
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(26)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_1_1_1_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
										.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(28)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_1_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(28)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_1_1_1_1_1_1_2, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_1_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_1_1_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_1_1_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(28)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(28)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(submit)
								.addComponent(btnBack))
							.addGap(29))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 317, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		contentPane.setLayout(gl_contentPane);
		setUndecorated(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==submit) {
			String title = comboBox_3.getSelectedItem().toString();
			String firstName = textField_1.getText();
			String lastName = textField_2.getText();
			String email = textField_3.getText();
			String roomType = comboBox.getSelectedItem().toString();
			String roomNo = textField_4.getText();
			String checkInDate = comboBox_1.getSelectedItem().toString() + "-"
					+ comboBox_1_1.getSelectedItem().toString() + "-"
					+ comboBox_1_1_1.getSelectedItem().toString();
			String checkOutDate = comboBox_1_2.getSelectedItem().toString() + "-"
					+ comboBox_1_1_2.getSelectedItem().toString() + "-"
					+ comboBox_1_1_1_1.getSelectedItem().toString();
			String idProof = comboBox_2.getSelectedItem().toString();
			String idNumber = textField_5.getText();

			if (checktext(title, firstName, lastName, email, roomType, roomNo, checkInDate, checkOutDate, idProof, idNumber)) {
				try {
					Conn c = new Conn();
					String q = "insert into Reservation values('" + title + "','" + firstName + "','" + lastName + "','" + email + "','" + roomType + "','" + roomNo + "','" + checkInDate + "','" + checkOutDate + "','" + idProof + "','" + idNumber + "')";
					c.s.executeUpdate(q);

					JOptionPane.showMessageDialog(null, "Reservation Confirmed");
					new Customer_Info().setVisible(true);


				} catch (Exception E) {

					E.printStackTrace();
				}
			} else {
				JOptionPane.showMessageDialog(null, "Please fill all the above information");
			}


		}else if(e.getSource()==btnBack){
			new mainframe().setVisible(true);
			setVisible(false);

		}

	}

	private boolean checktext(String title, String firstName, String lastName, String email, String roomType, String NoOfroom, String checkInDate, String checkOutDate, String idProof, String idNumber) {
		if(title.equals("")){
			return  false;
		} else if (firstName.equals("")) {
			return  false;
		}
	 else if (lastName.equals("")) {
			return  false;
	}
 		else if (email.equals("")) {
			return  false;
		}
		 else if (roomType.equals("")) {
			return  false;

		} else if (NoOfroom.equals("")) {
			return  false;

		} else if (checkInDate.equals("")) {
			return  false;

		} else if (checkOutDate.equals("")) {
		return  false;

		} else if (idProof.equals("")) {
		return  false;

		} else if (idNumber.equals("")) {
		return  false;
		}
		return true;
	}

}
