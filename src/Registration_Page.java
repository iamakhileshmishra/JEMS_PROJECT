import java.awt.EventQueue;
import java.awt.Font;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Registration_Page {

	private JFrame frame;
	private JTextField StudentName;
	private JTextField MName;
	private JTextField FName;
	private JTextField Address;
	private JTextField Email;
	private JTextField Mobile_No;
	private JPasswordField Password;
	private JPasswordField RePass;

	/**
	 * Launch the application.
	 */
	public static void RP() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_Page window = new Registration_Page();
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
	public Registration_Page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(0, 0, 1297, 1084);
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
		JLabel lblNewLabel_3 = new JLabel("Registration Form");
		lblNewLabel_3.setBounds(544, 107, 256, 39);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Serif", Font.BOLD, 22));
		frame.getContentPane().add(lblNewLabel_3);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(603, 245, -274, 39);
		frame.getContentPane().add(scrollPane_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(2, 465, 1212, -465);
		frame.getContentPane().add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(40, 157, 1212, 403);
		frame.getContentPane().add(scrollPane_1);
		
		JPanel panel = new JPanel();
		scrollPane_1.setViewportView(panel);
		panel.setBorder(new CompoundBorder());
		panel.setBackground(SystemColor.info);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("---Personel Details-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(10, 11, 1192, 22);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Candidate's Name:");
		lblNewLabel_5.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(10, 62, 132, 22);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Mother's Name:");
		lblNewLabel_6.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(10, 95, 132, 22);
		panel.add(lblNewLabel_6);
		
		StudentName = new JTextField();
		StudentName.setBounds(152, 65, 437, 20);
		panel.add(StudentName);
		StudentName.setColumns(10);
		
		MName = new JTextField();
		MName.setColumns(10);
		MName.setBounds(152, 98, 437, 20);
		panel.add(MName);
		
		JLabel lblNewLabel_6_1 = new JLabel("Father's Name:");
		lblNewLabel_6_1.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_6_1.setBounds(599, 62, 132, 22);
		panel.add(lblNewLabel_6_1);
		
		FName = new JTextField();
		FName.setColumns(10);
		FName.setBounds(741, 65, 437, 20);
		panel.add(FName);
		
		JLabel lblNewLabel_7 = new JLabel("Date of Birth");
		lblNewLabel_7.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(599, 101, 132, 16);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_6_2 = new JLabel("Gender ");
		lblNewLabel_6_2.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_6_2.setBounds(10, 128, 132, 22);
		panel.add(lblNewLabel_6_2);
		
		JComboBox Gender = new JComboBox();
		Gender.setModel(new DefaultComboBoxModel(new String[] {"Male ", "Female", "Others"}));
		Gender.setFont(new Font("Serif", Font.PLAIN, 16));
		Gender.setToolTipText("Male\r\nFemale\r\nOthers");
		Gender.setBounds(152, 130, 96, 22);
		panel.add(Gender);
		
		JComboBox Date = new JComboBox();
		Date.setFont(new Font("Serif", Font.PLAIN, 16));
		Date.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		Date.setBounds(741, 97, 96, 22);
		panel.add(Date);
		
		JComboBox Month = new JComboBox();
		Month.setFont(new Font("Serif", Font.PLAIN, 16));
		Month.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March", "April", "May", "June", "July ", "August ", "September ", "October ", "November ", "December"}));
		Month.setBounds(859, 95, 166, 23);
		panel.add(Month);
		
		JComboBox Year = new JComboBox();
		Year.setModel(new DefaultComboBoxModel(new String[] {"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006"}));
		Year.setFont(new Font("Serif", Font.PLAIN, 16));
		Year.setBounds(1043, 95, 132, 22);
		panel.add(Year);
		
		JLabel lblNewLabel_8 = new JLabel("Category\r\n");
		lblNewLabel_8.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_8.setBounds(599, 134, 96, 18);
		panel.add(lblNewLabel_8);
		
		JComboBox Category = new JComboBox();
		Category.setModel(new DefaultComboBoxModel(new String[] {"GEN", "EWS", "OBC", "SC", "ST", "Minority"}));
		Category.setFont(new Font("Serif", Font.PLAIN, 16));
		Category.setBounds(741, 130, 284, 22);
		panel.add(Category);
		
		JLabel lblNewLabel_9 = new JLabel("Are You PwD ?");
		lblNewLabel_9.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_9.setBounds(302, 130, 132, 22);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Domicile");
		lblNewLabel_10.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_10.setBounds(599, 171, 132, 19);
		panel.add(lblNewLabel_10);
		
		JComboBox Domicile = new JComboBox();
		Domicile.setModel(new DefaultComboBoxModel(new String[] {"Andhra Pradesh", "Andaman and Nicobar Island", "Arunachal Pradesh", "Assam", "Bihar", "Chandigarh", "Chhattisgarh ", "Dadra and Nagar Haveli and Daman and Diu", "Delhi", "Goa ", "Gujarat ", "Haryana ", "Himachal Pradesh ", "Jammu and Kashmir", "Jharkhand ", "Karnataka", "Kerala", "Ladakh", "Lakshadweep", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Puducherry", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal"}));
		Domicile.setFont(new Font("Serif", Font.PLAIN, 16));
		Domicile.setBounds(741, 167, 284, 22);
		panel.add(Domicile);
		
		JLabel lblNewLabel_11 = new JLabel("Address");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_11.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_11.setBounds(10, 161, 132, 31);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("E-Mail I'D");
		lblNewLabel_12.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_12.setBounds(599, 208, 133, 21);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_4_1 = new JLabel("---Apply For-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_4_1.setBounds(10, 240, 1192, 22);
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_13 = new JLabel("Apply For");
		lblNewLabel_13.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_13.setBounds(10, 273, 96, 22);
		panel.add(lblNewLabel_13);
		
		JComboBox AppliedFor = new JComboBox();
		AppliedFor.setFont(new Font("Serif", Font.PLAIN, 16));
		AppliedFor.setModel(new DefaultComboBoxModel(new String[] {"B.Arch", "B.E/B.Tech Only", "B.Planning"}));
		AppliedFor.setBounds(152, 273, 282, 22);
		panel.add(AppliedFor);
		
		JLabel lblNewLabel_14 = new JLabel("Question Paper Medium");
		lblNewLabel_14.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_14.setBounds(599, 273, 156, 22);
		panel.add(lblNewLabel_14);
		
		JComboBox Medium_Exam = new JComboBox();
		Medium_Exam.setFont(new Font("Serif", Font.PLAIN, 16));
		Medium_Exam.setModel(new DefaultComboBoxModel(new String[] {"English", "Assamese", "Bengali", "Gujarati", "Hindi", "Kannada", "Malayalam", "Marathi", "Odiya", "Punjabi", "Tamil", "Urdu", "Telugu", "Others"}));
		Medium_Exam.setBounds(765, 273, 284, 22);
		panel.add(Medium_Exam);
		
		JLabel lblNewLabel_17 = new JLabel("Exam City 1");
		lblNewLabel_17.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_17.setBounds(10, 306, 96, 22);
		panel.add(lblNewLabel_17);
		
		JComboBox Center1 = new JComboBox();
		Center1.setFont(new Font("Serif", Font.PLAIN, 16));
		Center1.setModel(new DefaultComboBoxModel(new String[] {"AGARTALA    TA01", "AGRA    UP01", "AHMEDABAD/ GANDHINAGAR  GJ01", "AHMEDNAGAR  MR01", "AJMER   RJ01", "AKOLA   MR02", "ALAPPUZHA/ CHENGANNUR   KL01", "ALIGARH UP02", "ALLAHABAD/ PRAYAGRAJ    UP03", "ALMORA  UK09", "ALWAR   RJ02", "AMBALA  HR01", "AMBEDKAR NAGAR  UP25", "AMRAVATI    MR03", "AMRITSAR    PB01", "ANAND   GJ02", "ANANTAPUR   AP01", "ANANTNAG    JK05", "ANGUL   OR10", "ARRAH   BR09", "ASANSOL WB01", "AURANGABAD (BIHAR)  BR01", "AURANGABAD (MAHARASHTRA)    MR04", "AZAMGARH    UP19", "BALAGHAT    MP01", "BALASORE (BALESWAR) OR02", "BALLIA  UP20", "BANDA   UP26", "BANKURA WB16", "BARABANKI   UP27", "BARAMULLA   JK01", "BAREILLY    UP04", "BASTI   UP28", "BEED    MR30", "BEGUSARAI   BR13", "BELAGAVI(BELGAUM)   KK02", "BELLARY KK03", "BENGALURU   KK04", "BERHAMPUR / GANJAM  OR03", "BETUL   MP02", "BHADRAK OR11", "BHAGALPUR   BR02", "BHANDARA    MR31", "BHARATPUR   RJ16", "BHARUCH GJ16", "BHATINDA    PB02", "BHAVNAGAR   GJ03", "BHAWANIPATNA / KALAHANDI    OR18", "BHILAI NAGAR/DURG   CG01", "BHILWARA    RJ12", "BHIMAVARAM  AP03", "BHIWANI HR13", "BHOPAL  MP03", "BHUBANESWAR OR04", "BHUJ    GJ17", "BIDAR   KK05", "BIJNOR  UP21", "BIKANER RJ05", "BILASPUR (CHHATTISGARH) CG02", "BILASPUR (HIMACHAL PRADESH) HP01", "BOKARO STEEL CITY   JH01", "BULANDSHAHR UP29", "BULDHANA    MR32", "BURDWAN (BARDHAMAN) WB02", "CHANDAULI   UP41", "CHANDIGARH  ", "CHANDRAPUR  MR09", "CHENNAI TN01", "CHHINDWARA  MP05", "CHIRALA AP04", "CHITTOOR    AP05", "COIMBATORE  TN02", "CUDDALORE   TN03", "CUTTACK OR05", "DADRA & NAGAR HAVELI    DN01", "DAMAN   DD01", "DARBHANGA   BR04", "DAUSA   RJ17", "DAVANAGERE  KK06", "DEHRADUN    UK01", "DELHI   DELHI/NEW DELHI DL01", "DEORIA  UP30", "DEWAS   MP19", "DHANBAD JH02", "DHAR    MP16", "DHARWAD/HUBBALLI (HUBLI)    KK10", "DHENKANAL   OR06", "DHULE   MR10", "DIBRUGARH   AM01", "DIMAPUR NL01", "DIU DD02", "DURGAPUR    WB04", "EAST CHAMPARAN  BR14", "EAST KHASI HILLS    MG02", "ELURU   AP06", "ERNAKULAM/ ANGAMALY/ MOOVATTUPUZHA  KL04", "ETAWAH  UP31", "FAIZABAD    UP06", "FARIDABAD   HR03", "FIROZABAD   UP22", "GANGTOK SM01", "GAYA    BR05", "GHAZIABAD   UP07", "GHAZIPUR    UP23", "GIRIDIH JH07", "GONDIA  MR35", "GOPALGANJ   BR10", "GORAKHPUR   UP08", "GULBARGA    KK08", "GUNTUR  AP07", "GURUGRAM    HR04", "GUWAHATI    AM02", "GWALIOR MP06", "HALDWANI    UK02", "HAMIRPUR (HIMACHAL PRADESH) HP03", "HARIDWAR    UK03", "HASSAN  KK09", "HAZARIBAGH  JH05", "HIMATNAGAR  GJ14", "HISSAR  HR05", "HOOGHLY WB06", "HOSHANGABAD MP17", "HOSHIARPUR  PB13", "HOWRAH  WB07", "HYDERABAD/ SECUNDERABAD/ RANGA REDDY    TL01", "IDUKKI  KL05", "IMPHAL  MN01", "INDORE  MP07", "ITANAGAR/ NAHARLAGUN    AL01", "JABALPUR    MP08", "JAGATSINGHPUR   OR17", "JAIPUR  RJ06", "JAJPUR  OR13", "JALANDHAR   PB04", "JALAUN (ORAI)   UP32", "JALGAON MR13", "JAMMU   JK02", "JAMNAGAR    GJ06", "JAMSHEDPUR  JH03", "JAUNPUR UP24", "JEYPORE / KORAPUT   OR19", "JHANSI  UP10", "JHUNJHUNU   RJ13", "JODHPUR RJ07", "JORHAT  AM03", "JUNAGADH    GJ07", "KADAPA  AP08", "KAKINADA    AP09", "KALYANI WB08", "KANCHIPURAM TN05", "KANGRA/PALAMPUR HP04", "KANNUR  KL07", "KANPUR  UP11", "KANYAKUMARI/ NAGERCOIL  TN06", "KARAULI RJ18", "KARIMNAGAR  TL02", "KARNAL  HR06", "KASARAGOD   KL08", "KENDRAPARA  OR14", "KENDUJHAR (KEONJHAR)    OR15", "KHAMMAM TL03", "KHARGONE (WEST NIMAR)   MP18", "KOHIMA  NL02", "KOLHAPUR    MR14", "KOLKATA WB10", "KOLLAM  KL09", "KOTA    RJ08", "KOTTAYAM    KL11", "KOZHIKODE   KL12", "KRISHNAGIRI TN21", "KULLU   HP10", "KURNOOL AP10", "KURUKSHETRA HR07", "KUSHINAGAR  UP33", "LADHAK  KARGIL  -", "LAKHINPUR KHERI UP34", "LAKSHADWEEP KAVARATTI   LD01", "LATUR   MR15", "LEH AND LADHAK  LEH LL01", "LUCKNOW UP12", "LUDHIANA    PB05", "MADHUBANI   BR15", "MADURAI TN08", "MAHABUBABAD TL10", "MAHBUBNAGAR TL04", "MAHENDRAGARH    HR14", "MALAPPURAM  KL13", "MANDI   HP08", "MANDYA  KK18", "MANGALURU (MANGALORE)   KK12", "MATHURA UP13", "MAU UP35", "MAYURBHANJ/ BARIPADA    OR12", "MEERUT  UP14", "MEHSANA GJ08", "MIRZAPUR    UP36", "MIZORAM AIZAWL  MZ01", "MORADABAD   UP15", "MUMBAI/NAVI MUMBAI  MR16", "MUZAFFARNAGAR   UP16", "MUZAFFARPUR BR06", "MYSURU(MYSORE)  KK14", "NADIA   WB17", "NAGAUR  RJ14", "NAGPUR  MR17", "NAINITAL    UK04", "NALANDA BR11", "NALGONDA    TL05", "NAMAKKAL    TN10", "NANDED  MR18", "NARASARAOPET    AP20", "NASHIK  MR19", "NAVSARI GJ15", "NAWADA  BR16", "NELLORE AP11", "NIZAMABAD   TL08", "NOIDA/GREATER NOIDA UP09", "NORTH 24 PARGANAS   WB12", "ONGOLE  AP12", "PALAKKAD    KL15", "PALGHAR MR33", "PANAJI/MADGAON  GO01", "PANIPAT HR08", "PANTNAGAR   UK05", "PASCHIM MEDINIPUR   WB13", "PATHANAMTHITTA  KL16", "PATHANKOT   PB07", "PATIALA/ FATEHGARH SAHIB    PB08", "PATNA   BR07", "PAURI GARHWAL   UK08", "PORT BLAIR  AN01", "PRATAPGARH  UP43", "PRODDATUR   AP21", "PUDUCHERRY  PO01", "PULWAMA JK06", "PUNE    MR22", "PURBA MEDINIPUR WB14", "PURI    OR16", "PURNEA  BR08", "RAEBAREILI  UP37", "RAIGAD  MR23", "RAIPUR  CG03", "RAJAHMUNDRY AP13", "RAJKOT  GJ10", "RAMGARH JH06", "RANCHI  JH04", "RATNAGIRI   MR24", "REWA    MP11", "REWARI  HR11", "ROHTAK  HR12", "ROHTAS  BR17", "ROORKEE UK06", "ROURKELA    OR08", "SAGAR   MP12", "SAHARANPUR  UP38", "SAHIBZADA AJIT SINGH NAGAR  PB12", "SALEM   TN11", "SAMASTIPUR  BR12", "SAMBA   JK03", "SAMBALPUR   OR09", "SANGLI  MR25", "SANGRUR PB11", "SATARA  MR26", "SATNA   MP13", "SAWAI MADHOPUR  RJ15", "SHAHJANPUR  UP39", "SHILLONG    MG01", "SHIMLA  HP06", "SHIVAMOGA (SHIMOGA) KK15", "SIDDIPET    TL11", "SIKAR   RJ09", "SILCHAR(ASSAM)  AM04", "SILIGURI    WB11", "SIRMAUR HP11", "SITAMARHI   BR18", "SITAPUR UP17", "SIWAN   BR19", "SOLAN   HP07", "SOLAPUR MR27", "SONBHADRA   UP42", "SONIPAT HR09", "SOUTH 24 PARGANAS   WB15", "SRIGANGANAGAR   RJ10", "SRIKAKULAM  AP14", "SRINAGAR (J & K)    JK04", "SULTANPUR   UP40", "SURAMPALEM  AP23", "SURAT   GJ11", "SURYAPET    TL09", "TEZPUR  AM05", "THANE   MR28", "THANJAVUR   TN12", "THIRUVANANTHAPUR AM KL17", "THOOTHUKUDI TN13", "THRISSUR    KL18", "TIRUCHIRAPPALLI TN14", "TIRUNELVELI TN15", "TIRUPATHI   AP16", "TIRUPUR TN22", "TIRUVALLUR  TN16", "TUMAKURU    KK16", "UDAIPUR RJ11", "UDHAM SINGH NAGAR   UK07", "UDUPI/MANIPAL   KK17", "UJJAIN  MP15", "UNA HP09", "VADODARA    GJ12", "VALSAD/VAPI GJ13", "VARANASI    UP18", "VELLORE TN18", "VIDISHA MP20", "VIJAYAWADA  AP17", "VILUPPURAM  TN23", "VIRUDHUNAGAR    TN20", "VISAKHAPATNAM   AP18", "VIZIANAGARAM    AP19", "WARANGAL    TL07", "WARDHA  MR29", "WAYANAD KL19", "WEST CHAMPARAN  BR20", "YAMUNA NAGAR    HR10", "YAVATMAL    MR34"}));
		Center1.setBounds(152, 306, 282, 22);
		panel.add(Center1);
		
		JLabel lblNewLabel_17_1 = new JLabel("Exam City 2");
		lblNewLabel_17_1.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_17_1.setBounds(599, 306, 96, 22);
		panel.add(lblNewLabel_17_1);
		
		JComboBox Center2 = new JComboBox();
		Center2.setFont(new Font("Serif", Font.PLAIN, 16));
		Center2.setModel(new DefaultComboBoxModel(new String[] {"AGARTALA    TA01", "AGRA    UP01", "AHMEDABAD/ GANDHINAGAR  GJ01", "AHMEDNAGAR  MR01", "AJMER   RJ01", "AKOLA   MR02", "ALAPPUZHA/ CHENGANNUR   KL01", "ALIGARH UP02", "ALLAHABAD/ PRAYAGRAJ    UP03", "ALMORA  UK09", "ALWAR   RJ02", "AMBALA  HR01", "AMBEDKAR NAGAR  UP25", "AMRAVATI    MR03", "AMRITSAR    PB01", "ANAND   GJ02", "ANANTAPUR   AP01", "ANANTNAG    JK05", "ANGUL   OR10", "ARRAH   BR09", "ASANSOL WB01", "AURANGABAD (BIHAR)  BR01", "AURANGABAD (MAHARASHTRA)    MR04", "AZAMGARH    UP19", "BALAGHAT    MP01", "BALASORE (BALESWAR) OR02", "BALLIA  UP20", "BANDA   UP26", "BANKURA WB16", "BARABANKI   UP27", "BARAMULLA   JK01", "BAREILLY    UP04", "BASTI   UP28", "BEED    MR30", "BEGUSARAI   BR13", "BELAGAVI(BELGAUM)   KK02", "BELLARY KK03", "BENGALURU   KK04", "BERHAMPUR / GANJAM  OR03", "BETUL   MP02", "BHADRAK OR11", "BHAGALPUR   BR02", "BHANDARA    MR31", "BHARATPUR   RJ16", "BHARUCH GJ16", "BHATINDA    PB02", "BHAVNAGAR   GJ03", "BHAWANIPATNA / KALAHANDI    OR18", "BHILAI NAGAR/DURG   CG01", "BHILWARA    RJ12", "BHIMAVARAM  AP03", "BHIWANI HR13", "BHOPAL  MP03", "BHUBANESWAR OR04", "BHUJ    GJ17", "BIDAR   KK05", "BIJNOR  UP21", "BIKANER RJ05", "BILASPUR (CHHATTISGARH) CG02", "BILASPUR (HIMACHAL PRADESH) HP01", "BOKARO STEEL CITY   JH01", "BULANDSHAHR UP29", "BULDHANA    MR32", "BURDWAN (BARDHAMAN) WB02", "CHANDAULI   UP41", "CHANDIGARH  ", "CHANDRAPUR  MR09", "CHENNAI TN01", "CHHINDWARA  MP05", "CHIRALA AP04", "CHITTOOR    AP05", "COIMBATORE  TN02", "CUDDALORE   TN03", "CUTTACK OR05", "DADRA & NAGAR HAVELI    DN01", "DAMAN   DD01", "DARBHANGA   BR04", "DAUSA   RJ17", "DAVANAGERE  KK06", "DEHRADUN    UK01", "DELHI   DELHI/NEW DELHI DL01", "DEORIA  UP30", "DEWAS   MP19", "DHANBAD JH02", "DHAR    MP16", "DHARWAD/HUBBALLI (HUBLI)    KK10", "DHENKANAL   OR06", "DHULE   MR10", "DIBRUGARH   AM01", "DIMAPUR NL01", "DIU DD02", "DURGAPUR    WB04", "EAST CHAMPARAN  BR14", "EAST KHASI HILLS    MG02", "ELURU   AP06", "ERNAKULAM/ ANGAMALY/ MOOVATTUPUZHA  KL04", "ETAWAH  UP31", "FAIZABAD    UP06", "FARIDABAD   HR03", "FIROZABAD   UP22", "GANGTOK SM01", "GAYA    BR05", "GHAZIABAD   UP07", "GHAZIPUR    UP23", "GIRIDIH JH07", "GONDIA  MR35", "GOPALGANJ   BR10", "GORAKHPUR   UP08", "GULBARGA    KK08", "GUNTUR  AP07", "GURUGRAM    HR04", "GUWAHATI    AM02", "GWALIOR MP06", "HALDWANI    UK02", "HAMIRPUR (HIMACHAL PRADESH) HP03", "HARIDWAR    UK03", "HASSAN  KK09", "HAZARIBAGH  JH05", "HIMATNAGAR  GJ14", "HISSAR  HR05", "HOOGHLY WB06", "HOSHANGABAD MP17", "HOSHIARPUR  PB13", "HOWRAH  WB07", "HYDERABAD/ SECUNDERABAD/ RANGA REDDY    TL01", "IDUKKI  KL05", "IMPHAL  MN01", "INDORE  MP07", "ITANAGAR/ NAHARLAGUN    AL01", "JABALPUR    MP08", "JAGATSINGHPUR   OR17", "JAIPUR  RJ06", "JAJPUR  OR13", "JALANDHAR   PB04", "JALAUN (ORAI)   UP32", "JALGAON MR13", "JAMMU   JK02", "JAMNAGAR    GJ06", "JAMSHEDPUR  JH03", "JAUNPUR UP24", "JEYPORE / KORAPUT   OR19", "JHANSI  UP10", "JHUNJHUNU   RJ13", "JODHPUR RJ07", "JORHAT  AM03", "JUNAGADH    GJ07", "KADAPA  AP08", "KAKINADA    AP09", "KALYANI WB08", "KANCHIPURAM TN05", "KANGRA/PALAMPUR HP04", "KANNUR  KL07", "KANPUR  UP11", "KANYAKUMARI/ NAGERCOIL  TN06", "KARAULI RJ18", "KARIMNAGAR  TL02", "KARNAL  HR06", "KASARAGOD   KL08", "KENDRAPARA  OR14", "KENDUJHAR (KEONJHAR)    OR15", "KHAMMAM TL03", "KHARGONE (WEST NIMAR)   MP18", "KOHIMA  NL02", "KOLHAPUR    MR14", "KOLKATA WB10", "KOLLAM  KL09", "KOTA    RJ08", "KOTTAYAM    KL11", "KOZHIKODE   KL12", "KRISHNAGIRI TN21", "KULLU   HP10", "KURNOOL AP10", "KURUKSHETRA HR07", "KUSHINAGAR  UP33", "LADHAK  KARGIL  -", "LAKHINPUR KHERI UP34", "LAKSHADWEEP KAVARATTI   LD01", "LATUR   MR15", "LEH AND LADHAK  LEH LL01", "LUCKNOW UP12", "LUDHIANA    PB05", "MADHUBANI   BR15", "MADURAI TN08", "MAHABUBABAD TL10", "MAHBUBNAGAR TL04", "MAHENDRAGARH    HR14", "MALAPPURAM  KL13", "MANDI   HP08", "MANDYA  KK18", "MANGALURU (MANGALORE)   KK12", "MATHURA UP13", "MAU UP35", "MAYURBHANJ/ BARIPADA    OR12", "MEERUT  UP14", "MEHSANA GJ08", "MIRZAPUR    UP36", "MIZORAM AIZAWL  MZ01", "MORADABAD   UP15", "MUMBAI/NAVI MUMBAI  MR16", "MUZAFFARNAGAR   UP16", "MUZAFFARPUR BR06", "MYSURU(MYSORE)  KK14", "NADIA   WB17", "NAGAUR  RJ14", "NAGPUR  MR17", "NAINITAL    UK04", "NALANDA BR11", "NALGONDA    TL05", "NAMAKKAL    TN10", "NANDED  MR18", "NARASARAOPET    AP20", "NASHIK  MR19", "NAVSARI GJ15", "NAWADA  BR16", "NELLORE AP11", "NIZAMABAD   TL08", "NOIDA/GREATER NOIDA UP09", "NORTH 24 PARGANAS   WB12", "ONGOLE  AP12", "PALAKKAD    KL15", "PALGHAR MR33", "PANAJI/MADGAON  GO01", "PANIPAT HR08", "PANTNAGAR   UK05", "PASCHIM MEDINIPUR   WB13", "PATHANAMTHITTA  KL16", "PATHANKOT   PB07", "PATIALA/ FATEHGARH SAHIB    PB08", "PATNA   BR07", "PAURI GARHWAL   UK08", "PORT BLAIR  AN01", "PRATAPGARH  UP43", "PRODDATUR   AP21", "PUDUCHERRY  PO01", "PULWAMA JK06", "PUNE    MR22", "PURBA MEDINIPUR WB14", "PURI    OR16", "PURNEA  BR08", "RAEBAREILI  UP37", "RAIGAD  MR23", "RAIPUR  CG03", "RAJAHMUNDRY AP13", "RAJKOT  GJ10", "RAMGARH JH06", "RANCHI  JH04", "RATNAGIRI   MR24", "REWA    MP11", "REWARI  HR11", "ROHTAK  HR12", "ROHTAS  BR17", "ROORKEE UK06", "ROURKELA    OR08", "SAGAR   MP12", "SAHARANPUR  UP38", "SAHIBZADA AJIT SINGH NAGAR  PB12", "SALEM   TN11", "SAMASTIPUR  BR12", "SAMBA   JK03", "SAMBALPUR   OR09", "SANGLI  MR25", "SANGRUR PB11", "SATARA  MR26", "SATNA   MP13", "SAWAI MADHOPUR  RJ15", "SHAHJANPUR  UP39", "SHILLONG    MG01", "SHIMLA  HP06", "SHIVAMOGA (SHIMOGA) KK15", "SIDDIPET    TL11", "SIKAR   RJ09", "SILCHAR(ASSAM)  AM04", "SILIGURI    WB11", "SIRMAUR HP11", "SITAMARHI   BR18", "SITAPUR UP17", "SIWAN   BR19", "SOLAN   HP07", "SOLAPUR MR27", "SONBHADRA   UP42", "SONIPAT HR09", "SOUTH 24 PARGANAS   WB15", "SRIGANGANAGAR   RJ10", "SRIKAKULAM  AP14", "SRINAGAR (J & K)    JK04", "SULTANPUR   UP40", "SURAMPALEM  AP23", "SURAT   GJ11", "SURYAPET    TL09", "TEZPUR  AM05", "THANE   MR28", "THANJAVUR   TN12", "THIRUVANANTHAPUR AM KL17", "THOOTHUKUDI TN13", "THRISSUR    KL18", "TIRUCHIRAPPALLI TN14", "TIRUNELVELI TN15", "TIRUPATHI   AP16", "TIRUPUR TN22", "TIRUVALLUR  TN16", "TUMAKURU    KK16", "UDAIPUR RJ11", "UDHAM SINGH NAGAR   UK07", "UDUPI/MANIPAL   KK17", "UJJAIN  MP15", "UNA HP09", "VADODARA    GJ12", "VALSAD/VAPI GJ13", "VARANASI    UP18", "VELLORE TN18", "VIDISHA MP20", "VIJAYAWADA  AP17", "VILUPPURAM  TN23", "VIRUDHUNAGAR    TN20", "VISAKHAPATNAM   AP18", "VIZIANAGARAM    AP19", "WARANGAL    TL07", "WARDHA  MR29", "WAYANAD KL19", "WEST CHAMPARAN  BR20", "YAMUNA NAGAR    HR10", "YAVATMAL    MR34"}));
		Center2.setBounds(765, 306, 284, 22);
		panel.add(Center2);
		
		JComboBox Pwd_Status = new JComboBox();
		Pwd_Status.setModel(new DefaultComboBoxModel(new String[] {"No", "Yes"}));
		Pwd_Status.setToolTipText("No\r\nYes");
		Pwd_Status.setFont(new Font("Serif", Font.PLAIN, 16));
		Pwd_Status.setBounds(457, 129, 132, 22);
		panel.add(Pwd_Status);
		
		Address = new JTextField();
		Address.setColumns(10);
		Address.setBounds(152, 172, 437, 20);
		panel.add(Address);
		
		Email = new JTextField();
		Email.setColumns(10);
		Email.setBounds(741, 205, 437, 20);
		panel.add(Email);
		
		JLabel lblNewLabel_11_1 = new JLabel("Mobile No");
		lblNewLabel_11_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_11_1.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_11_1.setBounds(10, 203, 132, 31);
		panel.add(lblNewLabel_11_1);
		
		Mobile_No = new JTextField();
		Mobile_No.setColumns(10);
		Mobile_No.setBounds(152, 210, 437, 20);
		panel.add(Mobile_No);
		
		JLabel lblNewLabel_11_1_1 = new JLabel("Create Password");
		lblNewLabel_11_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_11_1_1.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_11_1_1.setBounds(10, 359, 132, 31);
		panel.add(lblNewLabel_11_1_1);
		
		Password = new JPasswordField();
		Password.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Password.setBounds(152, 370, 284, 20);
		panel.add(Password);
		
		JLabel lblNewLabel_11_1_1_1 = new JLabel("Re-Enter Password");
		lblNewLabel_11_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_11_1_1_1.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_11_1_1_1.setBounds(599, 359, 132, 31);
		panel.add(lblNewLabel_11_1_1_1);
		
		RePass = new JPasswordField();
		RePass.setFont(new Font("Tahoma", Font.PLAIN, 16));
		RePass.setBounds(765, 366, 284, 20);
		panel.add(RePass);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Show Password");
		rdbtnNewRadioButton.setFont(new Font("Serif", Font.PLAIN, 15));
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected())
				{
					Password.setEchoChar((char)0);
					RePass.setEchoChar((char)0);
				}
			else
			{
				Password.setEchoChar('*');
				RePass.setEchoChar('*');
			}
				
			}
		});
		rdbtnNewRadioButton.setBackground(SystemColor.info);
		rdbtnNewRadioButton.setBounds(1072, 365, 125, 23);
		panel.add(rdbtnNewRadioButton);
		
//		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("");
//		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				if(rdbtnNewRadioButton.isSelected())
//				{
//					RePass.setEchoChar((char)0);
//				}
//			else
//			{
//				RePass.setEchoChar('*');
//			}	
//			}
//		});
//		rdbtnNewRadioButton_1.setBackground(SystemColor.info);
//		rdbtnNewRadioButton_1.setBounds(1072, 365, 21, 23);
//		panel.add(rdbtnNewRadioButton_1);
//		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalGlue.setBounds(6, 365, 24, 10);
		frame.getContentPane().add(horizontalGlue);
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		horizontalGlue_1.setBounds(1259, 365, 24, 10);
		frame.getContentPane().add(horizontalGlue_1);
		
		JButton btnNewButton = new JButton("SAVE & NEXT");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
					PreparedStatement ps=conn.prepareStatement("insert into students_profile(SName,f_name,m_name,Date,Month,Year,Category,Gender,Pwd_Status,Address,Domicile,Mobile,EMail,AppliedFor,Medium_Exam,Center1,Center2,Password) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
					ps.setString(1, StudentName.getText());
					ps.setString(2, FName.getText());
					ps.setString(3, MName.getText());
					String da;
					da=Date.getSelectedItem().toString();
					ps.setString(4, da);
					String mo;
					mo=Month.getSelectedItem().toString();
					ps.setString(5, mo);
					String ye;
					ye=Year.getSelectedItem().toString();
					ps.setString(6, ye);
					String ca;
					ca=Category.getSelectedItem().toString();
					ps.setString(7, ca);
					String ge;
					ge=Gender.getSelectedItem().toString();
					ps.setString(8, ge);
					String pwd;
					pwd=Pwd_Status.getSelectedItem().toString();
					ps.setString(9, pwd);
					ps.setString(10, Address.getText());
					String dom;
					dom=Domicile.getSelectedItem().toString();
					ps.setString(11, dom);
					String xt;
					xt=Mobile_No.getText();
					ps.setString(12, Mobile_No.getText());
					ps.setString(13,Email.getText());
					String app;
					app=AppliedFor.getSelectedItem().toString();
					ps.setString(14, app);
					String me;
					me=Medium_Exam.getSelectedItem().toString();
					ps.setString(15, me);
					String c1;
					c1=Center1.getSelectedItem().toString();
					ps.setString(16, c1);
					String c2;
					c2=Center2.getSelectedItem().toString();
					ps.setString(17, c2);
					ps.setString(18, Password.getText());
					int x=ps.executeUpdate();
					if(x>0)
					{
						System.out.println("Registration Succesfull");
						String query="select Registration_No from students_profile where Mobile='"+xt+"'"; //";//where Mobile='"+xt+"'; 
//						System.out.println(xt);
						Statement st=conn.createStatement();
						ResultSet rs=st.executeQuery(query);
						if(rs.next())
						{
						JOptionPane.showMessageDialog(btnNewButton, "Your Registration No. is "+rs.getString("Registration_No"));}
							System.out.println(rs.getString("Registration_No"));
					}
					else {
						System.out.println("Registration Not Succesfull");
					}
			}
				catch(Exception e1) {
					System.out.println(e1);
				}
				}
		});
		
		btnNewButton.setBounds(569, 571, 147, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setFont(new Font("Serif", Font.PLAIN, 15));
	}
}
