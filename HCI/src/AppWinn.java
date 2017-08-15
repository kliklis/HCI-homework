

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import org.eclipse.wb.swing.Car;
import org.eclipse.wb.swing.CarList;
import org.eclipse.wb.swing.ClientList;

import com.jgoodies.forms.factories.DefaultComponentFactory;

public class AppWinn {

	private JFrame frame;
	private JTextField name;
	private JTextField phone;
	private JTextField cost;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField owner;
	private JTextField todo;
	private JTextField id;
	private JTextField brand;
	private JTextField textField_11;
	private JTextField textField_13;
	private JTextField owner2;
	private JTextField textField_15;
	private JTextField del_name;
	private JTextField car_com;
	private ClientList clients;
	private CarList cars;
	private JTextField del_id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppWinn window = new AppWinn();
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
	public AppWinn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		clients=new ClientList();
		cars=new CarList();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		frame.setTitle("Διεπαφή Εφαρμογής Συνεργείου Αυτοκινήτων");
		
		JPanel parent = new JPanel();
		frame.getContentPane().add(parent, "name_2442462443125");
		CardLayout cl=new CardLayout(0, 0);
		parent.setLayout(cl);
		parent.setBackground(Color.WHITE);
		
		JPanel Menu = new JPanel();
		Menu.setBackground(Color.WHITE);
		parent.add(Menu, "name_2628397270027");
		Menu.setLayout(null);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBounds(10, 11, 424, 249);
		panel_18.setLayout(null);
		panel_18.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Menu", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		Menu.add(panel_18);
		
		JPanel panel_19 = new JPanel();
		panel_19.setLayout(null);
		panel_19.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u03A0\u03B5\u03BB\u03AC\u03C4\u03B7\u03C2", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_19.setBackground(Color.WHITE);
		panel_19.setBounds(10, 21, 177, 177);
		panel_18.add(panel_19);
		
		JButton button_9 = new JButton("\u0395\u03B9\u03C3\u03B1\u03B3\u03C9\u03B3\u03AE \u03A0\u03B5\u03BB\u03AC\u03C4\u03B7");
		button_9.setToolTipText("\u03A3\u03B1\u03C2 \u03BC\u03B5\u03C4\u03B1\u03C6\u03AD\u03C1\u03B5\u03B9 \u03C3\u03C4\u03B7\u03BD \u03BF\u03B8\u03CC\u03BD\u03B7 \u03B5\u03B9\u03C3\u03B1\u03B3\u03C9\u03B3\u03AE\u03C2 \u03BD\u03AD\u03BF\u03C5 \u03C0\u03B5\u03BB\u03AC\u03C4\u03B7.");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.next(parent);
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_9.setBounds(6, 16, 161, 41);
		panel_19.add(button_9);
		
		JButton button_10 = new JButton("\u0395\u03B9\u03C3\u03B1\u03B3\u03C9\u03B3\u03AE \u039F\u03C7\u03AE\u03BC\u03B1\u03C4\u03BF\u03C2");
		button_10.setToolTipText("\u03A3\u03B1\u03C2 \u03BC\u03B5\u03C4\u03B1\u03C6\u03AD\u03C1\u03B5\u03B9 \u03C3\u03C4\u03B7\u03BD \u03BF\u03B8\u03CC\u03BD\u03B7 \u03B5\u03B9\u03C3\u03B1\u03B3\u03C9\u03B3\u03AE\u03C2 \u03BD\u03AD\u03BF\u03C5 \u03BF\u03C7\u03AE\u03BC\u03B1\u03C4\u03BF\u03C2");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.next(parent);
				cl.next(parent);
				cl.next(parent);
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_10.setBounds(6, 68, 161, 45);
		panel_19.add(button_10);
		
		JButton button_11 = new JButton("Πορεία Επισκευής(*)");
		button_11.setToolTipText("\u03A3\u03B1\u03C2 \u03BC\u03B5\u03C4\u03B1\u03C6\u03AD\u03C1\u03B5\u03B9 \u03C3\u03C4\u03B7\u03BD \u03BF\u03B8\u03CC\u03BD\u03B7 \u03C0\u03B1\u03C1\u03B1\u03BA\u03BF\u03BB\u03BF\u03CD\u03B8\u03B7\u03C3\u03B7\u03C2 \u03C4\u03B7\u03C2 \u03C0\u03BF\u03C1\u03B5\u03AF\u03B1\u03C2 \u03B5\u03C0\u03B9\u03C3\u03BA\u03B5\u03C5\u03CE\u03BD.");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.next(parent);
				cl.next(parent);
				cl.next(parent);
				cl.next(parent);
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_11.setBounds(6, 124, 161, 41);
		panel_19.add(button_11);
		
		JPanel panel_20 = new JPanel();
		panel_20.setLayout(null);
		panel_20.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u03A0\u03C1\u03BF\u03BC\u03B7\u03B8\u03B5\u03C5\u03C4\u03AE\u03C2", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_20.setBackground(Color.WHITE);
		panel_20.setBounds(197, 21, 217, 77);
		panel_18.add(panel_20);
		
		JButton button_12 = new JButton("Εισαγωγή Υλικού(*)");
		button_12.setToolTipText("\u03A3\u03B1\u03C2 \u03BC\u03B5\u03C4\u03B1\u03C6\u03AD\u03C1\u03B5\u03B9 \u03C3\u03C4\u03B7\u03BD \u03BF\u03B8\u03CC\u03BD\u03B7 \u03B5\u03B9\u03C3\u03B1\u03B3\u03C9\u03B3\u03AE\u03C2 \u03BD\u03AD\u03BF\u03C5 \u03C5\u03BB\u03B9\u03BA\u03BF\u03CD.");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.next(parent);
				cl.next(parent);
			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_12.setBounds(6, 16, 201, 50);
		panel_20.add(button_12);
		
		JPanel panel_21 = new JPanel();
		panel_21.setLayout(null);
		panel_21.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u03A4\u03AD\u03BB\u03BF\u03C2", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_21.setBackground(Color.WHITE);
		panel_21.setBounds(197, 104, 217, 94);
		panel_18.add(panel_21);
		
		JButton button_13 = new JButton("\u0395\u03BE\u03B1\u03B3\u03C9\u03B3\u03AE & \u039A\u03BF\u03C3\u03C4\u03BF\u03BB\u03CC\u03B3\u03B7\u03C3\u03B7");
		button_13.setToolTipText("\u03A3\u03B1\u03C2 \u03BC\u03B5\u03C4\u03B1\u03C6\u03AD\u03C1\u03B5\u03B9 \u03C3\u03C4\u03B7\u03BD \u03C4\u03B5\u03BB\u03B9\u03BA\u03AE \u03BF\u03B8\u03CC\u03BD\u03B7 \u03BA\u03BF\u03C3\u03C4\u03BF\u03BB\u03CC\u03B3\u03B7\u03C3\u03B7\u03C2.");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.next(parent);
				cl.next(parent);
				cl.next(parent);
				cl.next(parent);
				cl.next(parent);
				
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_13.setBounds(10, 21, 197, 59);
		panel_21.add(button_13);
		
		JLabel label_1 = DefaultComponentFactory.getInstance().createTitle("\u0391\u03BD\u03AC\u03C0\u03C4\u03C5\u03BE\u03B7 \u039B\u03BF\u03B3\u03B9\u03C3\u03BC\u03B9\u03BA\u03BF\u03CD: \u039A\u03C9\u03BD\u03C3\u03C4\u03B1\u03BD\u03C4\u03AF\u03BD\u03BF\u03C2 \u039A\u03BB\u03B7\u03BC\u03B1\u03BD\u03C4\u03AC\u03BA\u03B7\u03C2");
		label_1.setToolTipText("Η διεπαφή αυτή δημιουργήθηκε από τον προπτυχιακό φοιτητή Κωνσταντίνο Κλημαντάκη στα πλαίσια της 6ης εργασίας του μαθήματος \"Επικοινωνία Ανθρώπου - Υπολογιστή\".");
		label_1.setFont(new Font("Tahoma", Font.ITALIC, 10));
		label_1.setBounds(163, 224, 251, 14);
		panel_18.add(label_1);
		
		JPanel Eisagwgh_Pelath = new JPanel();
		Eisagwgh_Pelath.setLayout(null);
		Eisagwgh_Pelath.setBackground(Color.WHITE);
		parent.add(Eisagwgh_Pelath, "name_2680398432394");
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u0395\u03B9\u03C3\u03B1\u03B3\u03C9\u03B3\u03AE \u03A0\u03B5\u03BB\u03AC\u03C4\u03B7", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(16, 16, 397, 234);
		Eisagwgh_Pelath.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u03A3\u03C4\u03BF\u03B9\u03C7\u03B5\u03AF\u03B1 \u03A0\u03B5\u03BB\u03AC\u03C4\u03B7", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(10, 22, 144, 167);
		panel_1.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u039F\u03BD\u03BF\u03BC\u03B1\u03C4\u03B5\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(19, 22, 114, 43);
		panel_2.add(panel_3);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(6, 16, 98, 20);
		panel_3.add(name);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u03A4\u03B7\u03BB\u03AD\u03C6\u03C9\u03BD\u03BF", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(19, 68, 114, 43);
		panel_2.add(panel_4);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(6, 16, 98, 20);
		panel_4.add(phone);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u039A\u03CC\u03C3\u03C4\u03BF\u03C2", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5.setBounds(19, 113, 115, 43);
		panel_2.add(panel_5);
		
		cost = new JTextField();
		cost.setColumns(10);
		cost.setBounds(6, 16, 99, 20);
		panel_5.add(cost);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u03A3\u03C7\u03CC\u03BB\u03B9\u03B1", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_6.setBounds(164, 26, 223, 89);
		panel_1.add(panel_6);
		
		JTextArea client_com = new JTextArea();
		client_com.setToolTipText("\u0395\u03B9\u03C3\u03AC\u03B3\u03B5\u03C4\u03B1\u03B9 \u03BA\u03AC\u03C0\u03BF\u03B9\u03BF \u03C3\u03C7\u03CC\u03BB\u03B9\u03BF \u03C3\u03C7\u03B5\u03C4\u03B9\u03BA\u03AC \u03BC\u03B5 \u03C4\u03B7\u03BD \u03B5\u03C0\u03B9\u03C3\u03BA\u03B5\u03C5\u03AE \u03C4\u03BF\u03C5 \u03C0\u03B5\u03BB\u03AC\u03C4\u03B7 \u03B1\u03C5\u03C4\u03BF\u03CD.");
		client_com.setBackground(Color.WHITE);
		client_com.setBounds(6, 16, 207, 62);
		panel_6.add(client_com);
		
		JButton button = new JButton("\u03A0\u03AF\u03C3\u03C9");
		button.setToolTipText("Σας μεταφέρει στο Menu.");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.previous(parent);
			}
		});
		button.setBounds(270, 200, 117, 23);
		panel_1.add(button);
		
		JButton button_1 = new JButton("\u0391\u03C0\u03BF\u03B8\u03AE\u03BA\u03B5\u03C5\u03C3\u03B7");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clients.newClient(name.getText(),phone.getText(),cost.getText(),client_com.getText());
				name.setText("");
				phone.setText("");
				cost.setText("");
				client_com.setText("");
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_1.setBounds(10, 196, 250, 27);
		panel_1.add(button_1);
		
		JButton button_20 = new JButton("Διαγραφή Πελάτη");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.next(parent);
				cl.next(parent);
				cl.next(parent);
				cl.next(parent);
				cl.next(parent);
				cl.next(parent);
			}
		});
		button_20.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_20.setBounds(164, 158, 223, 31);
		panel_1.add(button_20);
		
		JButton button_15 = new JButton("Προβολή Πελατών");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.next(parent);
				cl.next(parent);
				cl.next(parent);
				cl.next(parent);
				cl.next(parent);
			
			}
		});
		button_15.setBounds(164, 120, 223, 31);
		panel_1.add(button_15);
		button_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JPanel Eisagwgh_Ylikou = new JPanel();
		Eisagwgh_Ylikou.setLayout(null);
		Eisagwgh_Ylikou.setBackground(Color.WHITE);
		parent.add(Eisagwgh_Ylikou, "name_2681873210667");
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u0395\u03B9\u03C3\u03B1\u03B3\u03C9\u03B3\u03AE \u03A5\u03BB\u03B9\u03BA\u03BF\u03CD", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panel_8.setBounds(16, 8, 389, 249);
		Eisagwgh_Ylikou.add(panel_8);
		
		JButton button_2 = new JButton("\u0391\u03C0\u03BF\u03B8\u03AE\u03BA\u03B5\u03C5\u03C3\u03B7");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_2.setBounds(169, 186, 210, 33);
		panel_8.add(button_2);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u03A3\u03C4\u03BF\u03B9\u03C7\u03B5\u03AF\u03B1 \u03A0\u03C1\u03BF\u03BC\u03B7\u03B8\u03B5\u03C5\u03C4\u03AE", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(21, 27, 138, 211);
		panel_8.add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u03A0\u03C1\u03BF\u03BC\u03B7\u03B8\u03B5\u03C5\u03C4\u03AE\u03C2", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_10.setBounds(20, 20, 98, 43);
		panel_9.add(panel_10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(6, 16, 86, 20);
		panel_10.add(textField_3);
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u039A\u03CC\u03C3\u03C4\u03BF\u03C2 \u03A5\u03BB\u03B9\u03BA\u03BF\u03CD", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_11.setBounds(18, 161, 98, 43);
		panel_9.add(panel_11);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(6, 16, 86, 20);
		panel_11.add(textField_4);
		
		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u03A4\u03B7\u03BB\u03AD\u03C6\u03C9\u03BD\u03BF", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_12.setBounds(19, 67, 98, 43);
		panel_9.add(panel_12);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(6, 16, 86, 20);
		panel_12.add(textField_5);
		
		JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "E-mail", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_13.setBounds(18, 113, 98, 43);
		panel_9.add(panel_13);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(6, 16, 86, 20);
		panel_13.add(textField_6);
		
		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u03A3\u03C7\u03CC\u03BB\u03B9\u03B1", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_14.setBounds(169, 27, 210, 156);
		panel_8.add(panel_14);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setToolTipText("\u0395\u03B9\u03C3\u03AC\u03B3\u03B5\u03C4\u03B1\u03B9 \u03BA\u03AC\u03C0\u03BF\u03B9\u03BF \u03C3\u03C7\u03CC\u03BB\u03B9\u03BF \u03C3\u03C7\u03B5\u03C4\u03B9\u03BA\u03AC \u03BC\u03B5 \u03C4\u03B7\u03BD \u03B1\u03C0\u03CC\u03BA\u03C4\u03B7\u03C3\u03B7 \u03C4\u03BF\u03C5 \u03BD\u03AD\u03BF\u03C5 \u03C5\u03BB\u03B9\u03BA\u03BF\u03CD.");
		textArea_1.setBounds(6, 16, 194, 129);
		panel_14.add(textArea_1);
		
		JButton button_3 = new JButton("\u03A0\u03AF\u03C3\u03C9");
		button_3.setToolTipText("\u03A3\u03B1\u03C2 \u03BC\u03B5\u03C4\u03B1\u03C6\u03AD\u03C1\u03B5\u03B9 \u03C3\u03C4\u03BF Menu.");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.previous(parent);
				cl.previous(parent);
			}
		});
		button_3.setBounds(272, 219, 107, 23);
		panel_8.add(button_3);
		
		JPanel Eisagwgh_Oximatos = new JPanel();
		Eisagwgh_Oximatos.setToolTipText("\u03A3\u03B1\u03C2 \u03BC\u03B5\u03C4\u03B1\u03C6\u03AD\u03C1\u03B5\u03B9 \u03C3\u03C4\u03BF Menu.");
		Eisagwgh_Oximatos.setBackground(Color.WHITE);
		parent.add(Eisagwgh_Oximatos, "name_2683810342298");
		Eisagwgh_Oximatos.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u0395\u03B9\u03C3\u03B1\u03B3\u03C9\u03B3\u03AE \u039F\u03C7\u03AE\u03BC\u03B1\u03C4\u03BF\u03C2", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panel.setBounds(21, 11, 389, 249);
		Eisagwgh_Oximatos.add(panel);
		
		JButton button_4 = new JButton("\u0391\u03C0\u03BF\u03B8\u03AE\u03BA\u03B5\u03C5\u03C3\u03B7");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cars.newCar(owner.getText(),id.getText(),brand.getText(),todo.getText(),car_com.getText() );
				owner.setText("");
				id.setText("");
				brand.setText("");
				todo.setText("");
				car_com.setText("");
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_4.setBounds(169, 209, 116, 31);
		panel.add(button_4);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u03A3\u03C4\u03BF\u03B9\u03C7\u03B5\u03AF\u03B1 \u039F\u03C7\u03AE\u03BC\u03B1\u03C4\u03BF\u03C2", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(21, 27, 138, 211);
		panel.add(panel_7);
		
		JPanel panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u0399\u03B4\u03B9\u03BF\u03BA\u03C4\u03AE\u03C4\u03B7\u03C2", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_15.setBounds(12, 20, 116, 43);
		panel_7.add(panel_15);
		
		owner = new JTextField();
		owner.setColumns(10);
		owner.setBounds(6, 16, 102, 20);
		panel_15.add(owner);
		
		JPanel panel_16 = new JPanel();
		panel_16.setLayout(null);
		panel_16.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u03A4\u03CD\u03C0\u03BF\u03C2 \u0395\u03C0\u03B9\u03C3\u03BA\u03B5\u03C5\u03AE\u03C2", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_16.setBounds(10, 161, 118, 43);
		panel_7.add(panel_16);
		
		todo = new JTextField();
		todo.setColumns(10);
		todo.setBounds(6, 16, 102, 20);
		panel_16.add(todo);
		
		JPanel panel_17 = new JPanel();
		panel_17.setLayout(null);
		panel_17.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u0391\u03C1. \u039A\u03C5\u03BA\u03BB\u03BF\u03C6\u03BF\u03C1\u03AF\u03B1\u03C2", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_17.setBounds(12, 67, 116, 43);
		panel_7.add(panel_17);
		
		id = new JTextField();
		id.setColumns(10);
		id.setBounds(6, 16, 102, 20);
		panel_17.add(id);
		
		JPanel panel_22 = new JPanel();
		panel_22.setLayout(null);
		panel_22.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u039C\u03AC\u03C1\u03BA\u03B1", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_22.setBounds(10, 113, 118, 43);
		panel_7.add(panel_22);
		
		brand = new JTextField();
		brand.setColumns(10);
		brand.setBounds(6, 16, 102, 20);
		panel_22.add(brand);
		
		JPanel panel_23 = new JPanel();
		panel_23.setLayout(null);
		panel_23.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u03A3\u03C7\u03CC\u03BB\u03B9\u03B1", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_23.setBounds(169, 27, 210, 123);
		panel.add(panel_23);
		
		car_com = new JTextField();
		car_com.setBounds(10, 22, 190, 90);
		panel_23.add(car_com);
		car_com.setColumns(10);
		
		JButton button_5 = new JButton("\u03A0\u03AF\u03C3\u03C9");
		button_5.setToolTipText("Σας μεταφέρει στο Menu.");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.previous(parent);
				cl.previous(parent);
				cl.previous(parent);
			}
		});
		button_5.setBounds(295, 218, 84, 22);
		panel.add(button_5);
		
		JButton button_21 = new JButton("Διαγραφή Οχήματος");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.next(parent);
				cl.next(parent);
				cl.next(parent);
				cl.next(parent);
				cl.next(parent);
				
			}
		});
		button_21.setBounds(169, 184, 210, 23);
		panel.add(button_21);
		
		JButton button_26 = new JButton("Προβολή Οχημάτων");
		button_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.next(parent);
				cl.next(parent);
				cl.next(parent);
				cl.next(parent);
				cl.next(parent);
				cl.next(parent);
			}
			
		});
		button_26.setBounds(169, 150, 211, 31);
		panel.add(button_26);
		
		JPanel Poreia_Episkeuhs = new JPanel();
		Poreia_Episkeuhs.setToolTipText("\u03A3\u03B1\u03C2 \u03BC\u03B5\u03C4\u03B1\u03C6\u03AD\u03C1\u03B5\u03B9 \u03C3\u03C4\u03BF Menu.");
		Poreia_Episkeuhs.setBackground(Color.WHITE);
		parent.add(Poreia_Episkeuhs, "name_2683929065335");
		Poreia_Episkeuhs.setLayout(null);
		
		JPanel panel_24 = new JPanel();
		panel_24.setLayout(null);
		panel_24.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u03A0\u03BF\u03C1\u03B5\u03AF\u03B1 \u0395\u03C0\u03B9\u03C3\u03BA\u03B5\u03C5\u03AE\u03C2", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panel_24.setBounds(24, 11, 389, 250);
		Poreia_Episkeuhs.add(panel_24);
		
		JButton button_6 = new JButton("\u0391\u03C0\u03BF\u03B8\u03AE\u03BA\u03B5\u03C5\u03C3\u03B7");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_6.setBounds(169, 186, 210, 33);
		panel_24.add(button_6);
		
		JPanel panel_25 = new JPanel();
		panel_25.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u03A3\u03C4\u03BF\u03B9\u03C7\u03B5\u03AF\u03B1 \u0395\u03C0\u03B9\u03C3\u03BA\u03B5\u03C5\u03AE\u03C2", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_25.setBackground(Color.WHITE);
		panel_25.setBounds(21, 21, 138, 217);
		panel_24.add(panel_25);
		panel_25.setLayout(null);
		
		JPanel panel_26 = new JPanel();
		panel_26.setBounds(10, 25, 116, 43);
		panel_26.setLayout(null);
		panel_26.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u0399\u03B4\u03B9\u03BF\u03BA\u03C4\u03AE\u03C4\u03B7\u03C2", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_25.add(panel_26);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(6, 16, 102, 20);
		panel_26.add(textField_11);
		
		JPanel panel_28 = new JPanel();
		panel_28.setBounds(10, 70, 116, 43);
		panel_28.setLayout(null);
		panel_28.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u0391\u03C1. \u039A\u03C5\u03BA\u03BB\u03BF\u03C6\u03BF\u03C1\u03AF\u03B1\u03C2", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_25.add(panel_28);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(6, 16, 102, 20);
		panel_28.add(textField_13);
		
		JRadioButton radioButton = new JRadioButton("\u03A3\u03B5 \u0395\u03BE\u03AD\u03BB\u03B9\u03BE\u03B7");
		radioButton.setBounds(10, 161, 116, 23);
		panel_25.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("\u0388\u03C7\u03B5\u03B9 \u039E\u03B5\u03BA\u03B9\u03BD\u03AE\u03C3\u03B5\u03B9");
		radioButton_1.setBounds(10, 135, 116, 23);
		panel_25.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("\u0388\u03C7\u03B5\u03B9 \u039F\u03BB\u03BF\u03BA\u03BB\u03B7\u03C1\u03C9\u03B8\u03B5\u03AF");
		radioButton_2.setBounds(10, 187, 116, 23);
		panel_25.add(radioButton_2);
		
		JLabel label = DefaultComponentFactory.getInstance().createTitle("\u039A\u03B1\u03C4\u03AC\u03C3\u03C4\u03B1\u03C3\u03B7 \u0395\u03C0\u03B9\u03C3\u03BA\u03B5\u03C5\u03AE\u03C2:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label.setBounds(10, 115, 116, 23);
		panel_25.add(label);
		
		JPanel panel_30 = new JPanel();
		panel_30.setLayout(null);
		panel_30.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u03A3\u03C7\u03CC\u03BB\u03B9\u03B1", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_30.setBounds(169, 27, 210, 156);
		panel_24.add(panel_30);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setToolTipText("\u0395\u03B9\u03C3\u03AC\u03B3\u03B5\u03C4\u03B1\u03B9 \u03BA\u03AC\u03C0\u03BF\u03B9\u03BF \u03C3\u03C7\u03CC\u03BB\u03B9\u03BF \u03C3\u03C7\u03B5\u03C4\u03B9\u03BA\u03AC \u03BC\u03B5 \u03C4\u03B7\u03BD \u03B5\u03BE\u03AD\u03BB\u03B9\u03BE\u03B7 \u03C4\u03B7\u03C2 \u03B5\u03C0\u03B9\u03C3\u03BA\u03B5\u03C5\u03AE\u03C2.");
		textArea_3.setBounds(6, 16, 194, 129);
		panel_30.add(textArea_3);
		
		JButton button_7 = new JButton("\u03A0\u03AF\u03C3\u03C9");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.previous(parent);
				cl.previous(parent);
				cl.previous(parent);
				cl.previous(parent);
			}
		});
		button_7.setBounds(277, 219, 102, 23);
		panel_24.add(button_7);
		
		JPanel E3agwgh_Kostologhsh = new JPanel();
		E3agwgh_Kostologhsh.setToolTipText("\u03A3\u03B1\u03C2 \u03BC\u03B5\u03C4\u03B1\u03C6\u03AD\u03C1\u03B5\u03B9 \u03C3\u03C4\u03BF Menu.");
		E3agwgh_Kostologhsh.setBackground(Color.WHITE);
		parent.add(E3agwgh_Kostologhsh, "name_2684065754281");
		E3agwgh_Kostologhsh.setLayout(null);
		
		JPanel panel_27 = new JPanel();
		panel_27.setLayout(null);
		panel_27.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u0395\u03BE\u03B1\u03B3\u03C9\u03B3\u03AE \u039F\u03C7\u03AE\u03BC\u03B1\u03C4\u03BF\u03C2 & \u039A\u03BF\u03C3\u03C4\u03BF\u03BB\u03CC\u03B3\u03B7\u03C3\u03B7", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panel_27.setBounds(24, 11, 389, 249);
		E3agwgh_Kostologhsh.add(panel_27);
		
		JButton button_8 = new JButton("\u0391\u03C0\u03BF\u03B8\u03AE\u03BA\u03B5\u03C5\u03C3\u03B7");
		button_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_8.setBounds(215, 186, 164, 33);
		panel_27.add(button_8);
		
		JPanel panel_29 = new JPanel();
		panel_29.setLayout(null);
		panel_29.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u03A3\u03C4\u03BF\u03B9\u03C7\u03B5\u03AF\u03B1 ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_29.setBackground(Color.WHITE);
		panel_29.setBounds(21, 27, 138, 122);
		panel_27.add(panel_29);
		
		JPanel panel_31 = new JPanel();
		panel_31.setLayout(null);
		panel_31.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u0399\u03B4\u03B9\u03BF\u03BA\u03C4\u03AE\u03C4\u03B7\u03C2", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_31.setBounds(12, 20, 116, 43);
		panel_29.add(panel_31);
		
		owner2 = new JTextField();
		owner2.setColumns(10);
		owner2.setBounds(6, 16, 102, 20);
		panel_31.add(owner2);
		
		JPanel panel_33 = new JPanel();
		panel_33.setLayout(null);
		panel_33.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u0391\u03C1. \u039A\u03C5\u03BA\u03BB\u03BF\u03C6\u03BF\u03C1\u03AF\u03B1\u03C2", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_33.setBounds(12, 67, 116, 43);
		panel_29.add(panel_33);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(6, 16, 102, 20);
		panel_33.add(textField_15);
		
		JPanel panel_35 = new JPanel();
		panel_35.setLayout(null);
		panel_35.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u03A3\u03C7\u03CC\u03BB\u03B9\u03B1", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_35.setBounds(69, 170, 128, 53);
		panel_29.add(panel_35);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setBounds(6, 16, 159, 129);
		panel_35.add(textArea_5);
		
		JButton button_14 = new JButton("\u03A0\u03AF\u03C3\u03C9");
		button_14.setToolTipText("\u03A3\u03B1\u03C2 \u03BC\u03B5\u03C4\u03B1\u03C6\u03AD\u03C1\u03B5\u03B9 \u03C3\u03C4\u03BF Menu.");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.previous(parent);
				cl.previous(parent);
				cl.previous(parent);
				cl.previous(parent);
				cl.previous(parent);
			}
		});
		button_14.setBounds(290, 219, 89, 23);
		panel_27.add(button_14);
		
		JPanel panel_32 = new JPanel();
		panel_32.setLayout(null);
		panel_32.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u039A\u03CC\u03C3\u03C4\u03BF\u03C2", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_32.setBackground(Color.WHITE);
		panel_32.setBounds(169, 27, 210, 158);
		panel_27.add(panel_32);
		
		JPanel panel_34 = new JPanel();
		panel_34.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_34.setBounds(10, 27, 190, 76);
		panel_32.add(panel_34);
		panel_34.setLayout(null);
		
		JTextArea cost_display = new JTextArea();
		cost_display.setBounds(10, 11, 166, 54);
		panel_34.add(cost_display);
		
		JButton btnNewButton = new JButton("\u039A\u03BF\u03C3\u03C4\u03BF\u03BB\u03CC\u03B3\u03B7\u03C3\u03B7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setToolTipText("Υπολογισμός κόστους επισκευής.");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(10, 114, 188, 33);
		panel_32.add(btnNewButton);
		
		JPanel panel_36 = new JPanel();
		panel_36.setLayout(null);
		panel_36.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u03A3\u03C7\u03CC\u03BB\u03B9\u03B1", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_36.setBounds(21, 160, 138, 82);
		panel_27.add(panel_36);
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setToolTipText("\u0395\u03B9\u03C3\u03AC\u03B3\u03B5\u03C4\u03B1\u03B9 \u03BA\u03AC\u03C0\u03BF\u03B9\u03BF \u03C3\u03C7\u03CC\u03BB\u03B9\u03BF \u03C3\u03C7\u03B5\u03C4\u03B9\u03BA\u03AC \u03BC\u03B5 \u03C4\u03B7\u03BD \u03B5\u03BE\u03B1\u03B3\u03C9\u03B3\u03AE \u03C4\u03BF\u03C5 \u03BF\u03C7\u03AE\u03BC\u03B1\u03C4\u03BF\u03C2.");
		textArea_6.setBounds(6, 16, 122, 55);
		panel_36.add(textArea_6);
		
		JPanel Provolh_Pelatwn = new JPanel();
		Provolh_Pelatwn.setLayout(null);
		Provolh_Pelatwn.setToolTipText("Σας μεταφέρει στο Menu.");
		Provolh_Pelatwn.setBackground(Color.WHITE);
		parent.add(Provolh_Pelatwn, "name_3462326325784");
		
		JPanel panel_38 = new JPanel();
		panel_38.setLayout(null);
		panel_38.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u03A0\u03C1\u03BF\u03B2\u03BF\u03BB\u03AE \u03A0\u03B5\u03BB\u03B1\u03C4\u03CE\u03BD", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panel_38.setBounds(24, 11, 389, 249);
		Provolh_Pelatwn.add(panel_38);
		
		JButton button_17 = new JButton("Πίσω");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.previous(parent);
				cl.previous(parent);
				cl.previous(parent);
				cl.previous(parent);
				cl.previous(parent);
				cl.previous(parent);
			}
		});
		button_17.setToolTipText("Σας μεταφέρει στο Menu.");
		button_17.setBounds(290, 219, 89, 23);
		panel_38.add(button_17);
		
		JTextArea display = new JTextArea();
		display.setFont(new Font("Rockwell Condensed", Font.ITALIC, 14));
		display.setBounds(10, 23, 369, 185);
		panel_38.add(display);
		
		JButton button_16 = new JButton("Προβολή");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<clients.getSize();i++){
					if(i==0)
						display.setText(clients.getItem(i).getName()+"  "+clients.getItem(i).getCost()+"$");					
					else
						display.setText(display.getText()+ System.lineSeparator() +clients.getItem(i).getName()+"  "+clients.getItem(i).getCost()+"$" );
				}
			}
		});
		button_16.setBounds(10, 219, 140, 23);
		panel_38.add(button_16);
		
		JButton button_28 = new JButton("Καθαρισμός");
		button_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText("");
			}
		});
		button_28.setBounds(160, 219, 120, 23);
		panel_38.add(button_28);
		
		JPanel Diagrafh_Pelath = new JPanel();
		Diagrafh_Pelath.setLayout(null);
		Diagrafh_Pelath.setToolTipText("Σας μεταφέρει στο Menu.");
		Diagrafh_Pelath.setBackground(Color.WHITE);
		parent.add(Diagrafh_Pelath, "name_6918316935021");
		
		JPanel panel_39 = new JPanel();
		panel_39.setLayout(null);
		panel_39.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u0394\u03B9\u03B1\u03B3\u03C1\u03B1\u03C6\u03AE", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panel_39.setBounds(24, 11, 389, 249);
		Diagrafh_Pelath.add(panel_39);
		
		JButton button_18 = new JButton("Διαγραφή");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clients.deleteClient(del_name.getText());
				del_name.setText("");
			}
		});
		button_18.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_18.setBounds(52, 125, 164, 33);
		panel_39.add(button_18);
		
		JButton button_19 = new JButton("Πίσω");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.previous(parent);
				cl.previous(parent);
				cl.previous(parent);
				cl.previous(parent);
				cl.previous(parent);
				cl.previous(parent);
				cl.previous(parent);
			}
		});
		button_19.setToolTipText("Σας μεταφέρει στο Menu.");
		button_19.setBounds(290, 219, 89, 23);
		panel_39.add(button_19);
		
		JPanel panel_40 = new JPanel();
		panel_40.setLayout(null);
		panel_40.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u038C\u03BD\u03BF\u03BC\u03B1 \u03A0\u03B5\u03BB\u03AC\u03C4\u03B7", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_40.setBounds(42, 53, 240, 61);
		panel_39.add(panel_40);
		
		del_name = new JTextField();
		del_name.setColumns(10);
		del_name.setBounds(10, 19, 220, 31);
		panel_40.add(del_name);
		
		JPanel Deiafrafh_Oxhmatos = new JPanel();
		Deiafrafh_Oxhmatos.setLayout(null);
		Deiafrafh_Oxhmatos.setToolTipText("Σας μεταφέρει στο Menu.");
		Deiafrafh_Oxhmatos.setBackground(Color.WHITE);
		parent.add(Deiafrafh_Oxhmatos, "name_42091497941234");
		
		JPanel panel_41 = new JPanel();
		panel_41.setLayout(null);
		panel_41.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u0394\u03B9\u03B1\u03B3\u03C1\u03B1\u03C6\u03AE", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panel_41.setBounds(24, 11, 389, 249);
		Deiafrafh_Oxhmatos.add(panel_41);
		
		JButton button_22 = new JButton("Διαγραφή");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cars.deleteCar(del_id.getText());				
				del_id.setText("");
			}
		});
		button_22.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_22.setBounds(52, 125, 164, 33);
		panel_41.add(button_22);
		
		JButton button_23 = new JButton("Πίσω");
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.previous(parent);
				cl.previous(parent);
				cl.previous(parent);
				cl.previous(parent);
				cl.previous(parent);
				
			}
		});
		button_23.setToolTipText("Σας μεταφέρει στο Menu.");
		button_23.setBounds(290, 219, 89, 23);
		panel_41.add(button_23);
		
		JPanel panel_42 = new JPanel();
		panel_42.setLayout(null);
		panel_42.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u0391\u03C1. \u039A\u03C5\u03BA\u03BB\u03BF\u03C6\u03BF\u03C1\u03AF\u03B1\u03C2", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_42.setBounds(42, 53, 240, 61);
		panel_41.add(panel_42);
		
		del_id = new JTextField();
		del_id.setColumns(10);
		del_id.setBounds(10, 19, 220, 31);
		panel_42.add(del_id);
		
		JPanel Provolh_Oxhmatwn = new JPanel();
		Provolh_Oxhmatwn.setLayout(null);
		Provolh_Oxhmatwn.setToolTipText("Σας μεταφέρει στο Menu.");
		Provolh_Oxhmatwn.setBackground(Color.WHITE);
		parent.add(Provolh_Oxhmatwn, "name_43097803496234");
		
		JPanel panel_43 = new JPanel();
		panel_43.setLayout(null);
		panel_43.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u03A0\u03C1\u03BF\u03B2\u03BF\u03BB\u03AE \u039F\u03C7\u03B7\u03BC\u03AC\u03C4\u03C9\u03BD", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panel_43.setBounds(24, 11, 389, 249);
		Provolh_Oxhmatwn.add(panel_43);
		
		JButton button_24 = new JButton("Πίσω");
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.previous(parent);
				cl.previous(parent);
				cl.previous(parent);
				cl.previous(parent);
				cl.previous(parent);
				cl.previous(parent);
			}
		});
		button_24.setToolTipText("Σας μεταφέρει στο Menu.");
		button_24.setBounds(290, 219, 89, 23);
		panel_43.add(button_24);
		
		JTextArea display2 = new JTextArea();
		display2.setFont(new Font("Rockwell Condensed", Font.ITALIC, 14));
		display2.setBounds(10, 23, 369, 185);
		panel_43.add(display2);
		
		JButton button_25 = new JButton("Προβολή");
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<cars.getSize();i++){
					if(i==0)
						display2.setText(cars.getItem(i).getID() );					
					else
						display2.setText(display.getText()+ System.lineSeparator() +cars.getItem(i).getID() );
				}
			}
		});
		button_25.setBounds(10, 219, 140, 23);
		panel_43.add(button_25);
		
		JButton button_27 = new JButton("Καθαρισμός");
		button_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display2.setText("");
			}
		});
		button_27.setBounds(158, 219, 122, 23);
		panel_43.add(button_27);
		
	}
}
