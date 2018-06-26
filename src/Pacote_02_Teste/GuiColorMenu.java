package Pacote_02_Teste;

import java.awt.*;
import javax.swing.*;

public class GuiColorMenu extends JPanel {
	private ImageIcon imageIcon1;
	
	public GuiColorMenu() {
		inicializarComponentes();
	}

	private void inicializarComponentes() {
		// TODO Auto-generated method stub
		setLayout(new GridLayout(4,1));
		imageIcon1 = new ImageIcon("java.jpg");
		setBackground(new Color(100,220,100));
	}

	
	
}
