package com.uem.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.uem.controller.ControlFilme;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CadastrarFilme {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarFilme window = new CadastrarFilme();
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
	public CadastrarFilme() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 393);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(122, 88, 229, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Filme");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(112, 25, 214, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(56, 91, 46, 14);
		frame.getContentPane().add(lblNome);
		
		JLabel lblDiretor = new JLabel("Diretor:");
		lblDiretor.setBounds(56, 137, 46, 14);
		frame.getContentPane().add(lblDiretor);
		
		JLabel lblProdutora = new JLabel("Produtora:");
		lblProdutora.setBounds(56, 188, 58, 14);
		frame.getContentPane().add(lblProdutora);
		
		textField_1 = new JTextField();
		textField_1.setBounds(122, 134, 229, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(122, 185, 229, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				boolean cadastrou;
				
				String titulo = lblNome.getText();
				String diretor = lblDiretor.getText();
				String produtora = lblProdutora.getText();
				
				ControlFilme controlFilme = new ControlFilme();
				
				cadastrou = controlFilme.cadastrarFilme(titulo, produtora, diretor);
				
				if(cadastrou == true) {
					JOptionPane.showMessageDialog(null, "Filme cadastrado");
				}
				else {
					JOptionPane.showMessageDialog(null, "Filme não cadastrado");
				}
			}
		});
		btnCadastrar.setBounds(165, 298, 104, 23);
		frame.getContentPane().add(btnCadastrar);
	}

}