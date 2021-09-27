
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

//import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
//import javax.swing.JTextField;
public class MyReport {

	private JFrame frame;
	private JTable table_1;
	private JTable table_2;
//	private String userID;
//	private JTextField RegNo;
//	private JTextField textField;
	private  String sUser;
//private Object retNo;

	/**
	 * Launch the application.
	 */
	public static void MR() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyReport window = new MyReport();
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
	public MyReport() {
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
		panel.setBounds(16, 119, 1247, 472);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Senior Director (NTA)");
		lblNewLabel_5.setBounds(1081, 449, 131, 14);
		lblNewLabel_5.setFont(new Font("Serif", Font.PLAIN, 14));
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(977, 368, 270, 95);
		lblNewLabel_6.setBackground(SystemColor.info);
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\AKHILESH\\eclipse-workspace\\JEMS\\image-removebg-preview.png"));
		panel.add(lblNewLabel_6);
		
		JButton btnNewButton_1 = new JButton("Show Details");
		btnNewButton_1.setBounds(10, 90, 118, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//show details
				DefaultTableModel model = new DefaultTableModel();
				model.addColumn("Registration No");
				model.addColumn("Name");
				model.addColumn("Father's Name");
				model.addColumn("Mother's Name");
				model.addColumn("Category");
				model.addColumn("Pwd?");
				model.addColumn("Mobile");
				model.addColumn("E-Mail ID");
				
				table_1.setModel(model);
				table_1.setAutoResizeMode(0);
				table_1.getColumnModel().getColumn(0).setPreferredWidth(100);
				table_1.getColumnModel().getColumn(1).setPreferredWidth(200);
				table_1.getColumnModel().getColumn(2).setPreferredWidth(200);
				table_1.getColumnModel().getColumn(3).setPreferredWidth(200);
				table_1.getColumnModel().getColumn(4).setPreferredWidth(100);
				table_1.getColumnModel().getColumn(5).setPreferredWidth(50);
				table_1.getColumnModel().getColumn(6).setPreferredWidth(100);
				table_1.getColumnModel().getColumn(7).setPreferredWidth(300);
				try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
				String query ="select * from students_profile where Registration_No='"+sUser+"'";//'"+s1+"'";
				Statement st=conn.createStatement();
				ResultSet rs=st.executeQuery(query);
				while(rs.next()) {
					model.addRow(new Object[]{
							rs.getString("Registration_No"),
							rs.getString("SName"),
							rs.getString("f_name"),
							rs.getString("m_name"),
							rs.getString("Category"),
							rs.getString("Pwd_Status"),
							rs.getString("Mobile"),
							rs.getString("EMail"),
				});
				}}
//				rs.close();
//				st.close();
//				conn.close();
//				
				catch(Exception e1) {
					System.out.println(e1);
				}
				
		};
			
		});
		btnNewButton_1.setFont(new Font("Serif", Font.PLAIN, 16));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Show Marks");
		btnNewButton_1_1.setBounds(10, 240, 118, 23);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//show marks
//				showResul(userID);
				DefaultTableModel model = new DefaultTableModel();
				model.addColumn("Registration No");
				model.addColumn("Physics");
				model.addColumn("Chemisry");
				model.addColumn("Mathematics");
				model.addColumn("Total");
				model.addColumn("Percentile");
				model.addColumn("All India Rank");
				model.addColumn("Catogry Rank");
				
				table_2.setModel(model);
				table_2.setAutoResizeMode(0);
				table_2.getColumnModel().getColumn(0).setPreferredWidth(100);
				table_2.getColumnModel().getColumn(1).setPreferredWidth(200);
				table_2.getColumnModel().getColumn(2).setPreferredWidth(200);
				table_2.getColumnModel().getColumn(3).setPreferredWidth(200);
				table_2.getColumnModel().getColumn(4).setPreferredWidth(200);
				table_2.getColumnModel().getColumn(5).setPreferredWidth(400);
				table_2.getColumnModel().getColumn(6).setPreferredWidth(200);
				table_2.getColumnModel().getColumn(7).setPreferredWidth(200);
				try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
				String query ="select * from scorecard where Registration_No ='"+sUser+"'";//Registration_No where Registration_No='"+userID+"';
				Statement st=conn.createStatement();
				ResultSet rs=st.executeQuery(query);
				while(rs.next()) {
					model.addRow(new Object[]{
							rs.getString("Registration_No"),
							rs.getString("Physics"),
							rs.getString("Chemistry"),
							rs.getString("Maths"),
							rs.getString("Total"),
							rs.getString("Percentile"),
							rs.getString("AIR"),
							rs.getString("CatR"),
				});
				}
//				rs.close();
//				st.close();
//				conn.close();
				}
				catch(Exception e1) {
					System.out.println(e1);
				}
				
		}
			
		});
		btnNewButton_1_1.setFont(new Font("Serif", Font.PLAIN, 16));
		panel.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_4_1_1_1.setBounds(173, 241, 1260, 22);
		lblNewLabel_4_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_1.setFont(new Font("Serif", Font.PLAIN, 16));
		panel.add(lblNewLabel_4_1_1_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(105, 124, 1008, 63);
		panel.add(scrollPane_1);
		
//		table.getColumnModel().getColumn(0).setPreferredWidth(100);
//		table.setBorder(new CompoundBorder());
//		table.setBounds(105, 284, 1008, 123);
//		panel.add(table);
//		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(105, 288, 1008, 69);
		panel.add(scrollPane);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		scrollPane.setViewportView(table_2);
		JLabel lblNewLabel_4_1_1_1_1 = new JLabel("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_4_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_1_1.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_4_1_1_1_1.setBounds(173, 91, 1260, 22);
		panel.add(lblNewLabel_4_1_1_1_1);
		
		JLabel retNo = new JLabel("New label");
		retNo.setFont(new Font("Serif", Font.PLAIN, 18));
		retNo.setBounds(559, 11, 187, 31);
		panel.add(retNo);
		
		
		
		
		JLabel lblNewLabel_3 = new JLabel("SCORE CARD");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(563, 96, 223, 19);
		frame.getContentPane().add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Georgia", Font.BOLD, 16));
		
		JButton btnNewButton = new JButton("PRINT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Downloading Started ");
			}
		});
		btnNewButton.setBounds(585, 608, 89, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("Serif", Font.PLAIN, 15));
	}
		
	public String username(String s1)
	{
		sUser=s1;
		System.out.println(s1);
		return s1;
	}
}
