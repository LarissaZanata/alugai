package com.uem.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import java.awt.Button;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import java.awt.Canvas;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JMenu;
import java.awt.Color;

public class Alugai {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alugai window = new Alugai();
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
	public Alugai() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Alugaí 1.0");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Busca");
		lblNewLabel_2.setBounds(309, 33, 67, 19);
		frame.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1 = new JLabel("Locação");
		lblNewLabel_1.setBounds(211, 33, 88, 19);
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 16));
		
		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setBackground(Color.WHITE);
		lblCadastro.setBounds(113, 33, 88, 19);
		frame.getContentPane().add(lblCadastro);
		lblCadastro.setVerticalAlignment(SwingConstants.BOTTOM);
		lblCadastro.setFont(new Font("Arial", Font.PLAIN, 16));
		
		JLabel lblHome = new JLabel("home");
		lblHome.setBounds(44, 37, 46, 14);
		frame.getContentPane().add(lblHome);
	}
}
