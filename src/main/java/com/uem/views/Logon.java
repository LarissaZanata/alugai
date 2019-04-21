package com.uem.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

public class Logon {

	private JFrame frmAluga;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logon window = new Logon();
					window.frmAluga.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Logon() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAluga = new JFrame();
		frmAluga.setTitle("Alugaí 1.0");
		frmAluga.setBounds(100, 100, 450, 300);
		frmAluga.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAluga.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblLogin.setBounds(81, 71, 46, 14);
		frmAluga.getContentPane().add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblSenha.setBounds(81, 121, 46, 14);
		frmAluga.getContentPane().add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(137, 68, 219, 20);
		frmAluga.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(137, 118, 219, 20);
		frmAluga.getContentPane().add(textField_1);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		btnEntrar.setBounds(285, 177, 71, 23);
		frmAluga.getContentPane().add(btnEntrar);
	}

}
