package Pacote_01;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Pacote_02_Teste.GuiMenuPrincipal;

public class AlunoApp extends JFrame {

	private JMenuBar mnBarra;
	public AlunoApp() {
		
		inicializarComponentes();
		definirEventos();
		
	}
	private void definirEventos() {
	// TODO Auto-generated method stub
	
}
	private void inicializarComponentes() {
		// TODO Auto-generated method stub
		
		setTitle("Menu Principal");
		setBounds(0,0,800,600);
		
		setJMenuBar(mnBarra);
}
	public static void abrir() {
		// TODO Auto-generated method stub
		
		
		AlunoApp frame = new AlunoApp();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((tela.width - frame.getSize().width)/2,(tela.height - frame.getSize().height)/2
				);
		frame.setVisible(true);
}	
}
