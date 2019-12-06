package attendance;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;

public class Attend {

	private JFrame frame;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Attend window = new Attend();
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
	public Attend() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1370, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel.setBounds(10, 11, 1345, 640);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_1.setBounds(116, 11, 6, 630);
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(274, 11, 6, 630);
		panel.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(363, 11, 6, 630);
		panel.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_4.setBackground(Color.DARK_GRAY);
		panel_4.setBounds(448, 11, 6, 630);
		panel.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_5.setBackground(Color.DARK_GRAY);
		panel_5.setBounds(552, 11, 6, 630);
		panel.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_6.setBackground(Color.DARK_GRAY);
		panel_6.setBounds(0, 44, 1345, 6);
		panel.add(panel_6);
		
		JLabel lblNewLabel = new JLabel("Student ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 19, 107, 14);
		panel.add(lblNewLabel);
		
		JLabel lblStudentName = new JLabel("Student Name");
		lblStudentName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblStudentName.setBounds(134, 19, 130, 14);
		panel.add(lblStudentName);
		
		JLabel lblNo = new JLabel("Grade");
		lblNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNo.setBounds(379, 19, 73, 14);
		panel.add(lblNo);
		
		JLabel lblCourseCode = new JLabel("Class");
		lblCourseCode.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCourseCode.setBounds(298, 19, 55, 14);
		panel.add(lblCourseCode);
		
		JLabel lblAllergies = new JLabel("Allergies");
		lblAllergies.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAllergies.setBounds(464, 19, 89, 14);
		panel.add(lblAllergies);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_7.setBackground(Color.DARK_GRAY);
		panel_7.setBounds(707, 11, 6, 630);
		panel.add(panel_7);
		
		JLabel lblClasstracker = new JLabel("ClassTracker - VSU");
		lblClasstracker.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblClasstracker.setBounds(954, 19, 188, 14);
		panel.add(lblClasstracker);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Attend.class.getResource("/attendance/59e9e84f6403f.image.jpg")));
		lblNewLabel_1.setBounds(842, 54, 439, 397);
		panel.add(lblNewLabel_1);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_8.setBackground(Color.DARK_GRAY);
		panel_8.setBounds(0, 91, 812, 6);
		panel.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_9.setBackground(Color.DARK_GRAY);
		panel_9.setBounds(0, 143, 812, 6);
		panel.add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_10.setBackground(Color.DARK_GRAY);
		panel_10.setBounds(0, 193, 812, 6);
		panel.add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_11.setBackground(Color.DARK_GRAY);
		panel_11.setBounds(0, 247, 812, 6);
		panel.add(panel_11);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_12.setBackground(Color.DARK_GRAY);
		panel_12.setBounds(0, 305, 812, 6);
		panel.add(panel_12);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_13.setBackground(Color.DARK_GRAY);
		panel_13.setBounds(0, 361, 812, 6);
		panel.add(panel_13);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_14.setBackground(Color.DARK_GRAY);
		panel_14.setBounds(0, 429, 812, 6);
		panel.add(panel_14);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_15.setBackground(Color.DARK_GRAY);
		panel_15.setBounds(2, 496, 810, 6);
		panel.add(panel_15);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_16.setBackground(Color.DARK_GRAY);
		panel_16.setBounds(0, 570, 812, 6);
		panel.add(panel_16);
		
		JLabel label = new JLabel("9786");
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(29, 66, 55, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("0823");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_1.setBounds(29, 118, 55, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("3750");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_2.setBounds(29, 168, 55, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("4812");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_3.setBounds(29, 210, 55, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("6367");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_4.setBounds(29, 274, 55, 14);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("3293");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_5.setBounds(29, 332, 55, 14);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("1706");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_6.setBounds(29, 388, 55, 14);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("7216");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_7.setBounds(29, 460, 55, 14);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("5821");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_8.setBounds(29, 527, 55, 14);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("0173");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_9.setBounds(29, 598, 55, 14);
		panel.add(label_9);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1 - Present", "2- Absent", "/ - Excused"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_1.setBounds(568, 61, 129, 22);
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1 - Present", "2- Absent", "/ - Excused"}));
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_2.setBounds(568, 108, 129, 22);
		panel.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"1 - Present", "2- Absent", "/ - Excused"}));
		comboBox_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_3.setBounds(565, 160, 129, 22);
		panel.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"1 - Present", "2- Absent", "/ - Excused"}));
		comboBox_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_4.setBounds(568, 210, 129, 22);
		panel.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"1 - Present", "2- Absent", "/ - Excused"}));
		comboBox_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_5.setBounds(568, 272, 129, 22);
		panel.add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"1 - Present", "2- Absent", "/ - Excused"}));
		comboBox_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_6.setBounds(568, 322, 129, 22);
		panel.add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"1 - Present", "2- Absent", "/ - Excused"}));
		comboBox_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_7.setBounds(568, 387, 129, 22);
		panel.add(comboBox_7);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"1 - Present", "2- Absent", "/ - Excused"}));
		comboBox_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_8.setBounds(568, 459, 129, 22);
		panel.add(comboBox_8);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"1 - Present", "2- Absent", "/ - Excused"}));
		comboBox_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_9.setBounds(568, 526, 129, 22);
		panel.add(comboBox_9);
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"1 - Present", "2- Absent", "/ - Excused"}));
		comboBox_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_10.setBounds(568, 597, 129, 22);
		panel.add(comboBox_10);
		
		JLabel lblJordanLewis = new JLabel("Lebron James");
		lblJordanLewis.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblJordanLewis.setBounds(132, 66, 132, 14);
		panel.add(lblJordanLewis);
		
		JLabel lblMacBrown = new JLabel("James Harden");
		lblMacBrown.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMacBrown.setBounds(132, 118, 142, 14);
		panel.add(lblMacBrown);
		
		JLabel lblBlakeGriffin = new JLabel("Blake Griffin");
		lblBlakeGriffin.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBlakeGriffin.setBounds(132, 168, 132, 14);
		panel.add(lblBlakeGriffin);
		
		JLabel lblPaulGeorge = new JLabel("Paul George");
		lblPaulGeorge.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPaulGeorge.setBounds(132, 222, 132, 14);
		panel.add(lblPaulGeorge);
		
		JLabel lblChrisPaul = new JLabel("Chris Paul");
		lblChrisPaul.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblChrisPaul.setBounds(146, 274, 118, 14);
		panel.add(lblChrisPaul);
		
		JLabel lblKevinDurant = new JLabel("Kevin Durant");
		lblKevinDurant.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblKevinDurant.setBounds(132, 335, 132, 14);
		panel.add(lblKevinDurant);
		
		JLabel lblKyrieIrving = new JLabel("Kyrie Irving");
		lblKyrieIrving.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblKyrieIrving.setBounds(132, 391, 132, 14);
		panel.add(lblKyrieIrving);
		
		JLabel lblKawhiLeonard = new JLabel("Kawhi Leonard");
		lblKawhiLeonard.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblKawhiLeonard.setBounds(132, 460, 148, 14);
		panel.add(lblKawhiLeonard);
		
		JLabel lblJoelEmbiid = new JLabel("Joel Embiid");
		lblJoelEmbiid.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblJoelEmbiid.setBounds(132, 530, 118, 14);
		panel.add(lblJoelEmbiid);
		
		JLabel lblAnthonyDavis = new JLabel("Anthony Davis");
		lblAnthonyDavis.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAnthonyDavis.setBounds(132, 601, 132, 14);
		panel.add(lblAnthonyDavis);
		
		JLabel lblAttendance = new JLabel("Attendance");
		lblAttendance.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAttendance.setBounds(568, 19, 118, 14);
		panel.add(lblAttendance);
		
		JLabel lblEng = new JLabel("English");
		lblEng.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEng.setBounds(290, 66, 79, 14);
		panel.add(lblEng);
		
		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C", "D", "F"}));
		comboBox_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_11.setBounds(378, 61, 60, 22);
		panel.add(comboBox_11);
		
		JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C", "D", "F"}));
		comboBox_12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_12.setBounds(379, 108, 60, 22);
		panel.add(comboBox_12);
		
		JComboBox comboBox_13 = new JComboBox();
		comboBox_13.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C", "D", "F"}));
		comboBox_13.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_13.setBounds(379, 160, 60, 22);
		panel.add(comboBox_13);
		
		JComboBox comboBox_14 = new JComboBox();
		comboBox_14.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C", "D", "F"}));
		comboBox_14.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_14.setBounds(379, 214, 60, 22);
		panel.add(comboBox_14);
		
		JComboBox comboBox_15 = new JComboBox();
		comboBox_15.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C", "D", "F"}));
		comboBox_15.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_15.setBounds(379, 273, 60, 22);
		panel.add(comboBox_15);
		
		JComboBox comboBox_16 = new JComboBox();
		comboBox_16.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C", "D", "F"}));
		comboBox_16.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_16.setBounds(379, 322, 60, 22);
		panel.add(comboBox_16);
		
		JComboBox comboBox_17 = new JComboBox();
		comboBox_17.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C", "D", "F"}));
		comboBox_17.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_17.setBounds(378, 387, 60, 22);
		panel.add(comboBox_17);
		
		JComboBox comboBox_18 = new JComboBox();
		comboBox_18.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C", "D", "F"}));
		comboBox_18.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_18.setBounds(379, 459, 60, 22);
		panel.add(comboBox_18);
		
		JComboBox comboBox_19 = new JComboBox();
		comboBox_19.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C", "D", "F"}));
		comboBox_19.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_19.setBounds(378, 526, 60, 22);
		panel.add(comboBox_19);
		
		JComboBox comboBox_20 = new JComboBox();
		comboBox_20.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C", "D", "F"}));
		comboBox_20.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_20.setBounds(378, 597, 60, 22);
		panel.add(comboBox_20);
		
		JComboBox comboBox_21 = new JComboBox();
		comboBox_21.setModel(new DefaultComboBoxModel(new String[] {"Nut", "Gluten", "Shellfish", "Dog", "Cat"}));
		comboBox_21.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_21.setBounds(463, 61, 79, 22);
		panel.add(comboBox_21);
		
		JComboBox comboBox_22 = new JComboBox();
		comboBox_22.setModel(new DefaultComboBoxModel(new String[] {"Nut", "Gluten", "Shellfish", "Dog", "Cat"}));
		comboBox_22.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_22.setBounds(463, 108, 79, 22);
		panel.add(comboBox_22);
		
		JComboBox comboBox_23 = new JComboBox();
		comboBox_23.setModel(new DefaultComboBoxModel(new String[] {"Nut", "Gluten", "Shellfish", "Dog", "Cat"}));
		comboBox_23.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_23.setBounds(464, 160, 79, 22);
		panel.add(comboBox_23);
		
		JComboBox comboBox_24 = new JComboBox();
		comboBox_24.setModel(new DefaultComboBoxModel(new String[] {"Nut", "Gluten", "Shellfish", "Dog", "Cat"}));
		comboBox_24.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_24.setBounds(464, 210, 79, 22);
		panel.add(comboBox_24);
		
		JComboBox comboBox_25 = new JComboBox();
		comboBox_25.setModel(new DefaultComboBoxModel(new String[] {"Nut", "Gluten", "Shellfish", "Dog", "Cat"}));
		comboBox_25.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_25.setBounds(464, 264, 79, 22);
		panel.add(comboBox_25);
		
		JComboBox comboBox_26 = new JComboBox();
		comboBox_26.setModel(new DefaultComboBoxModel(new String[] {"Nut", "Gluten", "Shellfish", "Dog", "Cat"}));
		comboBox_26.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_26.setBounds(464, 322, 79, 22);
		panel.add(comboBox_26);
		
		JComboBox comboBox_27 = new JComboBox();
		comboBox_27.setModel(new DefaultComboBoxModel(new String[] {"Nut", "Gluten", "Shellfish", "Dog", "Cat"}));
		comboBox_27.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_27.setBounds(464, 387, 79, 22);
		panel.add(comboBox_27);
		
		JComboBox comboBox_28 = new JComboBox();
		comboBox_28.setModel(new DefaultComboBoxModel(new String[] {"Nut", "Gluten", "Shellfish", "Dog", "Cat"}));
		comboBox_28.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_28.setBounds(463, 459, 79, 22);
		panel.add(comboBox_28);
		
		JComboBox comboBox_29 = new JComboBox();
		comboBox_29.setModel(new DefaultComboBoxModel(new String[] {"Nut", "Gluten", "Shellfish", "Dog", "Cat"}));
		comboBox_29.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_29.setBounds(464, 526, 79, 22);
		panel.add(comboBox_29);
		
		JComboBox comboBox_30 = new JComboBox();
		comboBox_30.setModel(new DefaultComboBoxModel(new String[] {"Nut", "Gluten", "Shellfish", "Dog", "Cat"}));
		comboBox_30.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_30.setBounds(464, 597, 79, 22);
		panel.add(comboBox_30);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEnglish.setBounds(290, 118, 79, 14);
		panel.add(lblEnglish);
		
		JLabel lblHistory = new JLabel("History");
		lblHistory.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHistory.setBounds(290, 160, 79, 14);
		panel.add(lblHistory);
		
		JLabel lblScience = new JLabel("Science");
		lblScience.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblScience.setBounds(290, 222, 79, 14);
		panel.add(lblScience);
		
		JLabel lblMath = new JLabel("Math");
		lblMath.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMath.setBounds(298, 277, 55, 14);
		panel.add(lblMath);
		
		JLabel lblMath_1 = new JLabel("Math");
		lblMath_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMath_1.setBounds(298, 335, 55, 14);
		panel.add(lblMath_1);
		
		JLabel lblEnglish_1 = new JLabel("English");
		lblEnglish_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEnglish_1.setBounds(290, 388, 79, 14);
		panel.add(lblEnglish_1);
		
		JLabel lblHistory_1 = new JLabel("History");
		lblHistory_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHistory_1.setBounds(290, 460, 79, 14);
		panel.add(lblHistory_1);
		
		JLabel lblScience_1 = new JLabel("Science");
		lblScience_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblScience_1.setBounds(290, 527, 79, 14);
		panel.add(lblScience_1);
		
		JLabel lblScience_2 = new JLabel("Science");
		lblScience_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblScience_2.setBounds(290, 598, 79, 14);
		panel.add(lblScience_2);
		
		JLabel lblClassId = new JLabel("Class ID");
		lblClassId.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblClassId.setBounds(723, 22, 89, 14);
		panel.add(lblClassId);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_17.setBackground(Color.DARK_GRAY);
		panel_17.setBounds(811, 11, 6, 630);
		panel.add(panel_17);
		
		JLabel label_10 = new JLabel("9021");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_10.setBounds(733, 69, 55, 14);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("9021");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_11.setBounds(733, 118, 55, 14);
		panel.add(label_11);
		
		JLabel label_12 = new JLabel("1017");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_12.setBounds(733, 168, 55, 14);
		panel.add(label_12);
		
		JLabel label_13 = new JLabel("7575");
		label_13.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_13.setBounds(733, 222, 55, 14);
		panel.add(label_13);
		
		JLabel label_14 = new JLabel("1337");
		label_14.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_14.setBounds(733, 277, 55, 14);
		panel.add(label_14);
		
		JLabel label_15 = new JLabel("1337");
		label_15.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_15.setBounds(733, 335, 55, 14);
		panel.add(label_15);
		
		JLabel label_16 = new JLabel("9021");
		label_16.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_16.setBounds(733, 391, 55, 14);
		panel.add(label_16);
		
		JLabel label_17 = new JLabel("1017");
		label_17.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_17.setBounds(733, 463, 55, 14);
		panel.add(label_17);
		
		JLabel label_18 = new JLabel("7575");
		label_18.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_18.setBounds(733, 530, 55, 14);
		panel.add(label_18);
		
		JLabel label_19 = new JLabel("7575");
		label_19.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_19.setBounds(733, 601, 55, 14);
		panel.add(label_19);
		
		JLabel lblUsernaem = new JLabel("Username");
		lblUsernaem.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUsernaem.setBounds(842, 477, 148, 14);
		panel.add(lblUsernaem);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPassword.setBounds(842, 535, 148, 14);
		panel.add(lblPassword);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(954, 526, 130, 32);
		panel.add(passwordField_1);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(954, 477, 130, 32);
		panel.add(formattedTextField);
	}
}
