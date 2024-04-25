import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.Insets;
import javax.swing.SpringLayout;


import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainframe extends JFrame implements ActionListener {
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JButton btn1,btn2,btn3,btn4,btn5,btn6,back;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainframe frame = new mainframe();
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
	public mainframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 150, 712, 559);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Available Rooms");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(166, 0, 364, 23);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel.setBounds(10, 33, 672, 479);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(2,2,15, 15));

		back = new JButton("Back");
		back.setBounds(300, 520, 100, 30);
		back.setForeground(Color.WHITE);
		back.setBackground(Color.BLACK);
		back.addActionListener(this);
		add(back);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(221, 237, 246));
		panel.add(panel_5);
		ImageIcon img1,img2,img3,img4,img5,img6;
		img1=new ImageIcon(getClass().getResource("Icons/h1.jpg"));
		img2=new ImageIcon(getClass().getResource("Icons/h2.jpg"));
		img3=new ImageIcon(getClass().getResource("Icons/r4.jpg"));
		img4=new ImageIcon(getClass().getResource("Icons/r2.jpg"));
		img5=new ImageIcon(getClass().getResource("Icons/h3.jpg"));
		img6=new ImageIcon(getClass().getResource("Icons/h4.jpg"));
		
		JLabel lblNewLabel_1 = new JLabel("Room 1");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_2 = new JLabel(img1);
		
		JLabel lblNewLabel_3 = new JLabel("Single Room");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		
		JLabel lblNewLabel_4 = new JLabel("Rating: 4/5");
		
		JLabel lblNewLabel_5 = new JLabel("Price: $123");
		
		btn1 = new JButton("Book");
		
		btn1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn1.addActionListener(this);
	
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel_5.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
							.addGap(66)
							.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(79)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(60)
							.addComponent(btn1, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(6)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 126, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(lblNewLabel_5))
					.addGap(3)
					.addComponent(btn1)
					.addContainerGap())
		);
		panel_5.setLayout(gl_panel_5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(221, 237, 246));
		panel.add(panel_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Room 2");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_2_2 = new JLabel(img2);
		
		JLabel lblNewLabel_3_2 = new JLabel("Double Room");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		
		JLabel lblNewLabel_4_2 = new JLabel("Rating:4.5/5");
		
		JLabel lblNewLabel_5_2 = new JLabel("Price:$224");
		
		btn2 = new JButton("Book");
		btn2.addActionListener(this);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 12));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_4_2)
					.addPreferredGap(ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
					.addComponent(lblNewLabel_5_2, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(83, Short.MAX_VALUE)
					.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addGap(70))
				.addGroup(Alignment.LEADING, gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(132, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_panel_2.createSequentialGroup()
					.addGap(69)
					.addComponent(btn2)
					.addContainerGap(85, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(6)
					.addComponent(lblNewLabel_1_2)
					.addGap(3)
					.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_3_2)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_5_2)
							.addGap(41))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_4_2)
							.addGap(8)
							.addComponent(btn2)
							.addContainerGap())))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(221, 237, 246));
		panel_1.setBackground(new Color(221, 237, 246));
		panel.add(panel_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Room 3");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_2_2_1 = new JLabel(img3);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Suite Room");
		lblNewLabel_3_2_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		
		JLabel lblNewLabel_4_2_1 = new JLabel("Rating:3.5/5");
		
		JLabel lblNewLabel_5_2_1 = new JLabel("Price: $300");
		
		btn3 = new JButton("Book");
		btn3.addActionListener(this);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 12));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(67)
									.addComponent(lblNewLabel_1_2_1, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_3_2_1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblNewLabel_4_2_1)
									.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
									.addComponent(lblNewLabel_5_2_1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(63)
							.addComponent(btn3))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_2_2_1, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(3)
					.addComponent(lblNewLabel_1_2_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2_2_1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblNewLabel_3_2_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4_2_1)
						.addComponent(lblNewLabel_5_2_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btn3)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(221, 237, 246));
		panel.add(panel_4);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Room 4");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_2_2_2 = new JLabel(img4);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("Suite Room");
		lblNewLabel_3_2_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		
		JLabel lblNewLabel_4_2_2 = new JLabel("Rating:5/5");
		
		JLabel lblNewLabel_5_2_2 = new JLabel("Price:$500");
		
		btn4 = new JButton("Book");
		btn4.addActionListener(this);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 12));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(67)
							.addComponent(lblNewLabel_1_2_2, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_2_2_2, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3_2_2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(lblNewLabel_4_2_2, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addGap(59)
							.addComponent(lblNewLabel_5_2_2)))
					.addContainerGap())
				.addGroup(Alignment.LEADING, gl_panel_4.createSequentialGroup()
					.addGap(70)
					.addComponent(btn4)
					.addContainerGap(74, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(3)
					.addComponent(lblNewLabel_1_2_2)
					.addGap(6)
					.addComponent(lblNewLabel_2_2_2, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblNewLabel_3_2_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4_2_2)
						.addComponent(lblNewLabel_5_2_2))
					.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
					.addComponent(btn4)
					.addContainerGap())
		);
		panel_4.setLayout(gl_panel_4);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(221, 237, 246));
		panel.add(panel_6);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Room 5");
		lblNewLabel_1_2_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_2_2_3 = new JLabel(img5);
		
		JLabel lblNewLabel_3_2_3 = new JLabel("Single Room");
		lblNewLabel_3_2_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		
		JLabel lblNewLabel_4_2_3 = new JLabel("Rating:3/5");
		
		JLabel lblNewLabel_5_2_3 = new JLabel("Price:$100");
		
		btn5 = new JButton("Book");
		btn5.addActionListener(this);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 12));
		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(
			gl_panel_6.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING, false)
						.addGroup(Alignment.TRAILING, gl_panel_6.createSequentialGroup()
							.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_6.createSequentialGroup()
									.addGap(67)
									.addComponent(lblNewLabel_1_2_3, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_2_3, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3_2_3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())
						.addGroup(gl_panel_6.createSequentialGroup()
							.addComponent(lblNewLabel_4_2_3, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblNewLabel_5_2_3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(21))))
				.addGroup(Alignment.LEADING, gl_panel_6.createSequentialGroup()
					.addGap(62)
					.addComponent(btn5)
					.addContainerGap(92, Short.MAX_VALUE))
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addGap(3)
					.addComponent(lblNewLabel_1_2_3)
					.addGap(6)
					.addComponent(lblNewLabel_2_2_3, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblNewLabel_3_2_3)
					.addGap(10)
					.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4_2_3)
						.addComponent(lblNewLabel_5_2_3))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btn5)
					.addContainerGap())
		);
		panel_6.setLayout(gl_panel_6);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(221, 237, 246));
		panel.add(panel_3);
		
		JLabel lblNewLabel_1_2_4 = new JLabel("Room 6");
		lblNewLabel_1_2_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_2_2_4 = new JLabel(img6);
		
		JLabel lblNewLabel_3_2_4 = new JLabel("Double Room");
		lblNewLabel_3_2_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		
		JLabel lblNewLabel_4_2_4 = new JLabel("Rating:3.5/5");
		
		JLabel lblNewLabel_5_2_4 = new JLabel("Price:$200");
		
		btn6 = new JButton("Book");
		btn6.addActionListener(this);
		
		btn6.setFont(new Font("Tahoma", Font.BOLD, 12));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_3.createSequentialGroup()
									.addGap(67)
									.addComponent(lblNewLabel_1_2_4, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2_2_4, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3_2_4, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(lblNewLabel_4_2_4)
							.addPreferredGap(ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
							.addComponent(lblNewLabel_5_2_4)
							.addGap(22))))
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(75)
					.addComponent(btn6)
					.addContainerGap(79, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(3)
					.addComponent(lblNewLabel_1_2_4)
					.addGap(6)
					.addComponent(lblNewLabel_2_2_4, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblNewLabel_3_2_4)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4_2_4)
						.addComponent(lblNewLabel_5_2_4))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btn6)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		setUndecorated(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		        // Perform action based on which button is clicked
		        if (e.getSource() == btn1) {
		            // Instantiate form class and perform required actions
		            form formInstance = new form("Room 1");
		            formInstance.setVisible(true);
					setVisible(false);
		        } else if (e.getSource() == btn2) {
		            // Instantiate form class and perform required actions
		            form formInstance = new form("Room 2");
		            formInstance.setVisible(true);
					setVisible(false);
		        } else if (e.getSource() == btn3) {
		            // Instantiate form class and perform required actions
		            form formInstance = new form("Room 3");
		            formInstance.setVisible(true);
					setVisible(false);
		        } else if (e.getSource() == btn4) {
		            // Instantiate form class and perform required actions
		            form formInstance = new form("Room 4");
		            formInstance.setVisible(true);
					setVisible(false);
		        } else if (e.getSource() == btn5) {
		            // Instantiate form class and perform required actions
		            form formInstance = new form("Room 5");
		            formInstance.setVisible(true);
					setVisible(false);
		        } else if (e.getSource() == btn6) {
		            // Instantiate form class and perform required actions
		            form formInstance = new form("Room 6");
		            formInstance.setVisible(true);
					setVisible(false);
		        }else if(e.getSource()==back){
					setVisible(false);
				}
		    }
		    
		
	}

	
	

