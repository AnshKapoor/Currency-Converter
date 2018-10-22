package Classes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class currencyGraphics extends JFrame implements ActionListener {
String[] currencies = {"IND","CAD","AUS","EURO","KD"};
	private JPanel contentPane;
	private JTextField txtTo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					currencyGraphics frame = new currencyGraphics();
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
	public currencyGraphics() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox(currencies);
		comboBox.setBounds(110, 71, 117, 20);
		contentPane.add(comboBox);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(26, 71, 74, 20);
		contentPane.add(spinner);
		
		txtTo = new JTextField();
		txtTo.setEditable(false);
		txtTo.setText("To");
		txtTo.setBounds(237, 71, 30, 20);
		contentPane.add(txtTo);
		txtTo.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox(currencies);
		comboBox_1.setBounds(296, 71, 104, 20);
		contentPane.add(comboBox_1);
		JButton btnConvert = new JButton("Convert");
		btnConvert.setBounds(146, 131, 104, 23);
		contentPane.add(btnConvert);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(179, 180, 6, 20);
		contentPane.add(textPane);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCurrencyConverter.setBounds(110, 11, 214, 29);
		contentPane.add(lblCurrencyConverter);
		
		comboBox.addActionListener(this);
		comboBox_1.addActionListener(this);
		btnConvert.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg) {
		// TODO Auto-generated method stub
		
	}
}
