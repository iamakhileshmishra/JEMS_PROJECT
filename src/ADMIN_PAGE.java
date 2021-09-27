import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.List;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class ADMIN_PAGE {

	private JFrame frame;
	private JTextField RegNo;
	private JTextField CName;
	private JTextField Percent;
	private JTextField Pmarks;
	private JTextField CMarks;
	private JTextField MMarks;
	private JTextField Total;
	private JTextField AIR;
	private JTextField CR;

	/**
	 * Launch the application.
	 */
	public static void AP() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ADMIN_PAGE window = new ADMIN_PAGE();
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
	public ADMIN_PAGE() {
		initialize();
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
		panel.setBounds(16, 119, 1247, 398);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("---Student's Details-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_4_1_1.setBounds(0, 11, 1433, 22);
		panel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("Registration No.");
		lblNewLabel_4.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(10, 44, 166, 22);
		panel.add(lblNewLabel_4);
		
		RegNo = new JTextField();
		RegNo.setFont(new Font("Serif", Font.PLAIN, 16));
		RegNo.setBounds(186, 44, 346, 20);
		panel.add(RegNo);
		RegNo.setColumns(10);
		
		CName = new JTextField();
		CName.setFont(new Font("Serif", Font.PLAIN, 16));
		CName.setColumns(10);
		CName.setBounds(829, 44, 346, 20);
		panel.add(CName);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("---Score-Card-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_4_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_1.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_4_1_1_1.setBounds(0, 131, 1247, 22);
		panel.add(lblNewLabel_4_1_1_1);
		
		JLabel lblNewLabel_4_4 = new JLabel("NTA Score in Words");
		lblNewLabel_4_4.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_4_4.setBounds(10, 164, 213, 22);
		panel.add(lblNewLabel_4_4);
		
		Percent = new JTextField();
		Percent.setFont(new Font("Serif", Font.PLAIN, 16));
		Percent.setColumns(10);
		Percent.setBounds(233, 165, 942, 20);
		panel.add(Percent);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Physics");
		lblNewLabel_4_1_2.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_4_1_2.setBounds(10, 217, 98, 22);
		panel.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_3 = new JLabel("Chemistry");
		lblNewLabel_4_1_3.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_4_1_3.setBounds(197, 217, 98, 22);
		panel.add(lblNewLabel_4_1_3);
		
		JLabel lblNewLabel_4_1_4 = new JLabel("Maths");
		lblNewLabel_4_1_4.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_4_1_4.setBounds(363, 217, 98, 22);
		panel.add(lblNewLabel_4_1_4);
		
		JLabel lblNewLabel_4_1_5 = new JLabel("Total\r\n");
		lblNewLabel_4_1_5.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_4_1_5.setBounds(523, 217, 98, 22);
		panel.add(lblNewLabel_4_1_5);
		
		Pmarks = new JTextField();
		Pmarks.setFont(new Font("Serif", Font.PLAIN, 16));
		Pmarks.setColumns(10);
		Pmarks.setBounds(10, 264, 98, 20);
		panel.add(Pmarks);
		
		CMarks = new JTextField();
		CMarks.setFont(new Font("Serif", Font.PLAIN, 16));
		CMarks.setColumns(10);
		CMarks.setBounds(197, 264, 98, 20);
		panel.add(CMarks);
		
		MMarks = new JTextField();
		MMarks.setFont(new Font("Serif", Font.PLAIN, 16));
		MMarks.setColumns(10);
		MMarks.setBounds(363, 264, 98, 20);
		panel.add(MMarks);
		
		Total = new JTextField();
		Total.setFont(new Font("Serif", Font.PLAIN, 16));
		Total.setColumns(10);
		Total.setBounds(523, 264, 98, 20);
		panel.add(Total);
		
		JLabel lblNewLabel_4_1_5_1 = new JLabel("ALL INDIA RANK");
		lblNewLabel_4_1_5_1.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_4_1_5_1.setBounds(745, 217, 131, 22);
		panel.add(lblNewLabel_4_1_5_1);
		
		JLabel lblNewLabel_4_1_5_1_1 = new JLabel("CATEGORY RANK");
		lblNewLabel_4_1_5_1_1.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_4_1_5_1_1.setBounds(995, 217, 171, 22);
		panel.add(lblNewLabel_4_1_5_1_1);
		
		AIR = new JTextField();
		AIR.setFont(new Font("Serif", Font.PLAIN, 16));
		AIR.setColumns(10);
		AIR.setBounds(745, 264, 131, 20);
		panel.add(AIR);
		
		CR = new JTextField();
		CR.setFont(new Font("Serif", Font.PLAIN, 16));
		CR.setColumns(10);
		CR.setBounds(995, 264, 131, 20);
		panel.add(CR);
		
		JLabel lblNewLabel_5 = new JLabel("Senior Director (NTA)");
		lblNewLabel_5.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(1077, 373, 131, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBackground(SystemColor.info);
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\AKHILESH\\eclipse-workspace\\JEMS\\image-removebg-preview.png"));
		lblNewLabel_6.setBounds(977, 279, 270, 95);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_4_1 = new JLabel("Name");
		lblNewLabel_4_1.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_4_1.setBounds(626, 44, 67, 22);
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3 = new JLabel("ADMINISTRATOR PAGE ");
		lblNewLabel_3.setBounds(563, 96, 223, 19);
		frame.getContentPane().add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Georgia", Font.BOLD, 16));
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
					PreparedStatement ps=conn.prepareStatement("insert into scorecard(Registration_No,Name,Percentile,Physics,Chemistry,Maths,Total,AIR,CatR) values(?,?,?,?,?,?,?,?,?);");
					ps.setString(1, RegNo.getText());
					ps.setString(2, CName.getText());
					ps.setString(3, Percent.getText());
					ps.setString(4, Pmarks.getText());
					ps.setString(5, CMarks.getText());
					ps.setString(6, MMarks.getText());
					ps.setString(7, Total.getText());
					ps.setString(8, AIR.getText());
					ps.setString(9, CR.getText());
					int x=ps.executeUpdate();
					if(x>0)
					{
						JOptionPane.showMessageDialog(btnNewButton, "Data Uploaded");
					}
				}
					catch(Exception e1) {
						System.out.println(e1);
					}
					}
			});
		btnNewButton.setBounds(452, 549, 129, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("Serif", Font.PLAIN, 15));
		
		JButton btnNewButton_1 = new JButton("View Database");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ScoreCard op=new ScoreCard();
				op.SC();
			}
		});
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setFont(new Font("Serif", Font.PLAIN, 16));
		btnNewButton_1.setBounds(657, 549, 129, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
