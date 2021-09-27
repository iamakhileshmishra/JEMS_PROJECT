import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.util.Random;

public class REcovery_Page {

	private JFrame frame;
	private JTextField txtId;
	private JTextField txtVerify;
	private JPasswordField txtResetPass;
	private JPasswordField txtVerResetPass;
	int randomCode;

	/**
	 * Launch the application.
	 */
	public static void Recover() {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					REcovery_Page window = new REcovery_Page();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection con=null;
	ResultSet rs=null;
	PreparedStatement pst =null;
	public String user;

	/**
	 * Create the application.
	 */
	public REcovery_Page() {
		initialize();
	}
	public REcovery_Page(String username)
	{
		this.user=username;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(0,0, 1297, 936);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(976, 11, 307, 67);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\AKHILESH\\eclipse-workspace\\JEMS\\NTA"));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(6, 11, 298, 80);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\AKHILESH\\eclipse-workspace\\JEMS\\download"));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("JEE (MAINS) - 2021");
		lblNewLabel_2.setBounds(544, 37, 256, 28);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Georgia", Font.BOLD, 24));
		frame.getContentPane().add(lblNewLabel_2);
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.info);
		panel.setBounds(190, 121, 896, 398);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("No Worry , We will help you to recover your password . Please follow the procedure.");
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setFont(new Font("Serif", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(23, 24, 998, 28);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Enter Registration No");
		lblNewLabel_4.setFont(new Font("Serif", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(23, 87, 215, 22);
		panel.add(lblNewLabel_4);
		
		txtId = new JTextField();
		txtId.setFont(new Font("Serif", Font.PLAIN, 17));
		txtId.setBounds(299, 89, 409, 20);
		panel.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("Enter OTP (Sent to Mail)");
		lblNewLabel_4_1.setFont(new Font("Serif", Font.PLAIN, 18));
		lblNewLabel_4_1.setBounds(23, 138, 215, 22);
		panel.add(lblNewLabel_4_1);
		
		txtVerify = new JTextField();
		txtVerify.setFont(new Font("Serif", Font.PLAIN, 16));
		txtVerify.setBounds(299, 138, 96, 20);
		panel.add(txtVerify);
		txtVerify.setColumns(10);
		JButton btnResenOtp = new JButton("Send OTP");
		btnResenOtp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Random rand =new Random();
				randomCode=rand.nextInt(9999);

				JOptionPane.showMessageDialog(null, randomCode);
				}catch(Exception ex) {
				System.out.println(ex);
				}
			}
		});
		btnResenOtp.setFont(new Font("Serif", Font.PLAIN, 14));
		btnResenOtp.setBounds(718, 88, 109, 23);
		panel.add(btnResenOtp);
		
		JLabel lblNewLabel_5 = new JLabel("Create New Password");
		lblNewLabel_5.setFont(new Font("Serif", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(23, 196, 189, 22);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Re-Enter Password");
		lblNewLabel_5_1.setFont(new Font("Serif", Font.PLAIN, 18));
		lblNewLabel_5_1.setBounds(23, 242, 189, 22);
		panel.add(lblNewLabel_5_1);
		
		txtResetPass = new JPasswordField();
		txtResetPass.setFont(new Font("Serif", Font.PLAIN, 16));
		txtResetPass.setBounds(299, 200, 293, 20);
		panel.add(txtResetPass);
		
		txtVerResetPass = new JPasswordField();
		txtVerResetPass.setFont(new Font("Serif", Font.PLAIN, 16));
		txtVerResetPass.setBounds(299, 242, 293, 20);
		panel.add(txtVerResetPass);
		JRadioButton chckbxNewCheckBox = new JRadioButton("Show Password");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected())
				{
					txtResetPass.setEchoChar((char)0);
					txtVerResetPass.setEchoChar((char)0);
					
				}
				else
				{
					txtResetPass.setEchoChar('*');
					txtVerResetPass.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox.setBackground(SystemColor.info);
		chckbxNewCheckBox.setFont(new Font("Serif", Font.PLAIN, 16));
		chckbxNewCheckBox.setBounds(600, 220, 150, 23);
		panel.add(chckbxNewCheckBox);
		
		JButton btnNewButton_1 = new JButton("UPDATE");
		btnNewButton_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(txtResetPass.getText().equals(txtVerResetPass.getText()) && Integer.valueOf(txtVerify.getText())==randomCode)
				{
					try {
						String updateQuery="update students_profile set password=? where Registration_No=?"; 
						con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
						pst=con.prepareStatement(updateQuery);
						pst.setString(1,txtVerResetPass.getText());
						pst.setString(2,txtId.getText());
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "Password Updated . You can Login Now");
						
					}
					catch (Exception ex) {
						JOptionPane.showMessageDialog(null, ex);
					}
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton_1, "Password/OTP entered are Not Same");
				}
				
			}
		});
		btnNewButton_1.setFont(new Font("Serif", Font.PLAIN, 18));
		btnNewButton_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1.setBounds(402, 345, 127, 28);
		panel.add(btnNewButton_1);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(6, 255, 177, 12);
		frame.getContentPane().add(horizontalStrut);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalStrut_2.setBounds(1096, 383, 177, 12);
		frame.getContentPane().add(horizontalStrut_2);
	}
}
