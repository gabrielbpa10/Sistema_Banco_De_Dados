package Pacote_02_Teste;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Principal extends JFrame {

	//protected static final String Toollkit = null;
	private JTextField tfLogin;
	private JLabel lbSenha;
	private JLabel lbLogin;
	private JButton btLogar;
	private JButton btCancelar;
	private JPasswordField pfSenha;
	private static GuiLogin frame; // caso não der certo, observar essa classe
	
	public void GuiLogin() {
		inicializarComponentes();
		definirEventos();
	}
	
	
	private void definirEventos() {
		// TODO Auto-generated method stub
		
		btLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String senha = String.valueOf(pfSenha.getPassword());
				if(tfLogin.getText().equals("java8") && senha.equals("java8")) {
					frame.setVisible(false);
				}else {
					JOptionPane.showMessageDialog(null, "Login ou Senha incorretas!");
					
				}}
			
		
		
	});
		
		btCancelar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}});
		}


	private void inicializarComponentes() {
		// TODO Auto-generated method stub
		
		setTitle("Login no Sistema");
		setBounds(0,0,250,200);
		setLayout(null);
		tfLogin = new JTextField(5);
		pfSenha = new JPasswordField(5);
		lbSenha =  new JLabel("Senha:");
		lbLogin = new JLabel("Login:");
		btLogar = new JButton("Logar");
		btCancelar = new JButton("Cancelar");
		tfLogin.setBounds(100,30,120,25);
		lbLogin.setBounds(30,30,80,25);
		lbSenha.setBounds(30,75,80,25);
		pfSenha.setBounds(100, 75, 120, 25);
		btLogar.setBounds(20,120,100,25);
		btCancelar.setBounds(125,120,100,25);
		
		add(tfLogin);
		add(lbSenha);
		add(lbLogin);
		add(btLogar);
		add(btCancelar);
		add(pfSenha);
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwingUtilities.invokeLater
		(
				new Runnable() {
			public void run() {
				 JFrame frame = new JFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
				frame.setLocation((tela.width - frame.getSize().width)/2,
			(tela.height - frame.getSize().height/2));
	
				frame.setVisible(true);
			}
		});
		
	}

}
