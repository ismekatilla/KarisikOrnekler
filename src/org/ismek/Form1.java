package org.ismek;

import java.awt.EventQueue;
import java.awt.TrayIcon.MessageType;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form1 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form1 window = new Form1();
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
	public Form1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(141, 42, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int girilenSayi = Integer.parseInt(textField.getText());
				String title = "Sayı %s in katıdır";
				if (girilenSayi < 0 || girilenSayi > 50) {
					title = "0-50 arasında bir sayı girmelisiniz";
				} else {
					if (girilenSayi % 5 == 0) {
						title = String.format(title, 5);
					} else if (girilenSayi % 4 == 0) {
						title = String.format(title, 4);
					} else if (girilenSayi % 3 == 0) {
						title = String.format(title, 3);
					} else if (girilenSayi % 2 == 0) {
						title = String.format(title, 2);
					} else {
						title = "Sayı kalansız bölünemedi.";
					}
				}
				JOptionPane.showMessageDialog(frame, title);
			}
		});
		btnNewButton.setBounds(138, 73, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
