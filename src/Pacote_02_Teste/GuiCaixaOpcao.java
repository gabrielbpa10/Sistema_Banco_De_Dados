package Pacote_02_Teste;

import java.awt.event.*;
import javax.swing.*;

public class GuiCaixaOpcao extends JPanel {

	private JButton btVerificar,btMarcar,btDesmarcar;
	private JCheckBox ckIngles,ckInformatica;
	
	public GuiCaixaOpcao() {
		inicializarComponentes();
		defenirEventos();
	}

	private void inicializarComponentes() {
		// TODO Auto-generated method stub
	
		btVerificar = new JButton("Verificar");
		ckIngles = new JCheckBox("Ingl�s");
		ckInformatica = new JCheckBox("Inform�tica");
		btMarcar = new JButton("Marcar");
		btDesmarcar = new JButton("Desmarcar");
		setLayout(null);
		add(btVerificar);
		add(ckIngles);
		add(ckInformatica);
		add(btMarcar);
		add(btDesmarcar);
		btVerificar.setBounds(20,70,100,20);
		ckIngles.setBounds(15,15,100,25);
		ckInformatica.setBounds(15,40,100,25);
		btMarcar.setBounds(20,100,100,20);
		btDesmarcar.setBounds(20,130,100,20);
		
	}

	private void defenirEventos() {
		btMarcar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ckInformatica.setSelected(true);
				ckIngles.setSelected(true);
			}
		});
		btDesmarcar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ckInformatica.setSelected(false);
				ckIngles.setSelected(false);
			}
		});
		
		btVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String selecao = "Selecionado: ";
				if(ckIngles.isSelected()) {
					selecao +="\nIngl�s";
				}
				if(ckInformatica.isSelected()) {
					selecao += "\nInform�tica";
				}
				JOptionPane.showMessageDialog(null, selecao);
			}
		});
	}
	
}
