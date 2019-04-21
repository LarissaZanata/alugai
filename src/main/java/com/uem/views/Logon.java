package com.uem.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;

public class Logon {

	private JFrame frmAluga;
	private JTextField textField;
	private JPasswordField passwordField;

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
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(textField.getText().equals("admin") && passwordField.getText().equals("admin1")) {
					JOptionPane.showMessageDialog(null, "Bem vindo à locadora!");
					Alugai window1 = new Alugai();
					window1.frame.setVisible(true);
					frmAluga.setVisible(false);						
				}
				else {
					JOptionPane.showMessageDialog(null, "Dados inválidos!");
				}
			}
		});
		btnEntrar.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		btnEntrar.setBounds(281, 175, 75, 23);
		frmAluga.getContentPane().add(btnEntrar);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(137, 119, 219, 20);
		frmAluga.getContentPane().add(passwordField);
	}
}
