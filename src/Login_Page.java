import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.*;
import java.awt.event.*;
//import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login_Page {

	private JFrame frame;
	private JTextField userID;
	private JPasswordField pass;
	Connection con=null;
	ResultSet rs=null;
	PreparedStatement pst=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Page window = new Login_Page();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the application.
	 */
	public Login_Page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(0, 0, 1815, 728);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(11, 11, 296, 67);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\AKHILESH\\eclipse-workspace\\JEMS\\download"));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(973, 11, 301, 67);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\AKHILESH\\eclipse-workspace\\JEMS\\NTA"));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("JEE (MAINS) - 2021");
		lblNewLabel_2.setBounds(545, 50, 256, 28);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Georgia", Font.BOLD, 24));
		frame.getContentPane().add(lblNewLabel_2);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(445, 440, 446, -238);
		frame.getContentPane().add(horizontalStrut);
		
		JPanel panel = new JPanel();
//		panel.addMouseMotionListener(new MouseMotionAdapter() {
//			@Override
//			public void mouseDragged(MouseEvent e) {
//			}
//		});
//		panel.setToolTipText("Student \r\nAdministration");
		panel.setBackground(SystemColor.info);
		panel.setBounds(95, 129, 1095, 460);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Registration No. :");
		lblNewLabel_4.setFont(new Font("Serif", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(286, 79, 154, 31);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("Sign In");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(461, 11, 173, 39);
		lblNewLabel_3.setFont(new Font("Serif", Font.PLAIN, 24));
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Password: ");
		lblNewLabel_5.setFont(new Font("Serif", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(286, 165, 154, 31);
		panel.add(lblNewLabel_5);
		
		userID = new JTextField();
		userID.setToolTipText("Enter your Registration No.");
		userID.setFont(new Font("Serif", Font.PLAIN, 20));
		userID.setBackground(new Color(255, 255, 255));
		userID.setBounds(597, 80, 212, 29);
		panel.add(userID);
		userID.setColumns(10);
		
		pass = new JPasswordField();
		pass.setFont(new Font("Serif", Font.PLAIN, 20));
		pass.setBounds(597, 169, 212, 31);
		panel.add(pass);
		
		JLabel lblNewLabel_6 = new JLabel("Login Type: ");
		lblNewLabel_6.setFont(new Font("Serif", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(286, 241, 154, 31);
		panel.add(lblNewLabel_6);
		
		JComboBox LoginType = new JComboBox();
		LoginType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox comboBox = (JComboBox) e.getSource();
			}
		});
		LoginType.setModel(new DefaultComboBoxModel(new String[] {"Student", "Administration"}));
		LoginType.setFont(new Font("Serif", Font.PLAIN, 20));
		LoginType.setToolTipText("");
		LoginType.setBounds(597, 241, 212, 31);
		panel.add(LoginType);
		
		Button button = new Button("Login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String query ="select * from students_profile where Registration_No=? and password=? and logintype=?";
				try {
					con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
					pst=con.prepareStatement(query);
					String qw;
					qw=userID.getText();
					MyReport user=new MyReport();
					user.username(qw); 
					pst.setString(1, userID.getText());
					pst.setString(2, pass.getText());
					pst.setString(3, String.valueOf(LoginType.getSelectedItem()));
					rs=pst.executeQuery();
					if(rs.next()) {
						if(LoginType.getSelectedIndex()==0)
						{
						JOptionPane.showMessageDialog(null, " Student Login Successfull");
						MyReport op=new MyReport();
						op.MR();
						}
						else if(LoginType.getSelectedIndex()==1)
						{
							JOptionPane.showMessageDialog(null, " Admin Login Successfull");
							ADMIN_PAGE oi=new ADMIN_PAGE();
							oi.AP();}
						}
					
					else {
						JOptionPane.showMessageDialog(null, "Invlid Login Please try Again");
					}
				}catch(Exception e1) {
					System.out.println(e1);
				}
				
			}
		});
		button.setFont(new Font("Serif", Font.PLAIN, 20));
		button.setBounds(655, 308, 154, 39);
		panel.add(button);
		
		Button button_1 = new Button("Fogot Password?");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			}
		});
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				REcovery_Page nw=new REcovery_Page();
				nw.Recover();
			}
		});
		button_1.setFont(new Font("Serif", Font.PLAIN, 20));
		button_1.setBounds(286, 308, 154, 39);
		panel.add(button_1);
		
		JLabel lblNewLabel_7 = new JLabel("Don't Have An Account?");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(461, 374, 173, 15);
		panel.add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("Register Here");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registration_Page pi=new Registration_Page();
				pi.RP();
			}
		});
		btnNewButton.setFont(new Font("Serif", Font.PLAIN, 20));
		btnNewButton.setBounds(461, 400, 173, 34);
		panel.add(btnNewButton);
		
		JRadioButton chckbxNewCheckBox = new JRadioButton("Show Password");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected())
				{
					pass.setEchoChar((char)0);
				}
				else
				{
					pass.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox.setBackground(SystemColor.info);
		chckbxNewCheckBox.setFont(new Font("Serif", Font.PLAIN, 16));
		chckbxNewCheckBox.setBounds(838, 171, 139, 23);
		panel.add(chckbxNewCheckBox);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setBounds(11, 366, 122, -72);
		frame.getContentPane().add(horizontalStrut_1);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalGlue.setBounds(66, 386, 52, -43);
		frame.getContentPane().add(horizontalGlue);
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		horizontalGlue_1.setBounds(140, 455, -134, -80);
		frame.getContentPane().add(horizontalGlue_1);
		
		JLabel lblNewLabel_8 = new JLabel("DAA Project   ");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Serif", Font.BOLD, 10));
		lblNewLabel_8.setBounds(66, 600, 102, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("2020UGCS053");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Serif", Font.BOLD, 10));
		lblNewLabel_9.setBounds(545, 600, 256, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Akhilesh Kumar Mishra");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setFont(new Font("Serif", Font.BOLD, 10));
		lblNewLabel_10.setBounds(1039, 600, 235, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		horizontalGlue_2.setBounds(84, 600, -26, 14);
		frame.getContentPane().add(horizontalGlue_2);
		
		Component horizontalGlue_3 = Box.createHorizontalGlue();
		horizontalGlue_3.setBounds(66, 623, 19, -22);
		frame.getContentPane().add(horizontalGlue_3);
		
		Component horizontalGlue_4 = Box.createHorizontalGlue();
		horizontalGlue_4.setBounds(66, 600, 19, 14);
		frame.getContentPane().add(horizontalGlue_4);
		
		Component horizontalGlue_4_1 = Box.createHorizontalGlue();
		horizontalGlue_4_1.setBounds(1255, 600, 19, 14);
		frame.getContentPane().add(horizontalGlue_4_1);
		
		Component horizontalGlue_5 = Box.createHorizontalGlue();
		horizontalGlue_5.setBounds(619, 623, -478, -22);
		frame.getContentPane().add(horizontalGlue_5);
	}
}
