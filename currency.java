package graphics;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class currency extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					currency frame = new currency();
					frame.setTitle("Currency Converter");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
public currency() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		String[] currencies = {"USD","INR","EUR","CAD"};
		JComboBox comboBox = new JComboBox(currencies);
		comboBox.setBackground(UIManager.getColor("CheckBox.background"));
		comboBox.setBounds(31, 33, 73, 22);
		contentPane.add(comboBox);
		SpinnerModel model = new SpinnerNumberModel(0, 1, 15, 0.1);     
		JSpinner spinner = new JSpinner(model);
		spinner.setBounds(114, 34, 86, 20);
		contentPane.add(spinner);
		
		JComboBox comboBox_1 = new JComboBox(currencies);
		comboBox_1.setBounds(276, 33, 73, 22);
		contentPane.add(comboBox_1);
		
		JLabel lblTo = new JLabel("TO");
		lblTo.setBounds(233, 37, 23, 14);
		contentPane.add(lblTo);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.setFont(new Font("Simplified Arabic Fixed", Font.PLAIN, 15));
		btnConvert.setBounds(157, 94, 99, 32);
		contentPane.add(btnConvert);
		
	}
}

	
	
	
	
	/**
	 * Create the frame.
	 */
