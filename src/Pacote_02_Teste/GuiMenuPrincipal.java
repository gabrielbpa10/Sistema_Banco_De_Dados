package Pacote_02_Teste;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuiMenuPrincipal extends JFrame {

	private Container contentPane;
	private JMenuBar mnBarra,miGuiColor;
	private JMenu mnArquivo,mnExemplos;
	private JMenuItem miSair,miBotao,miCaixaOpcao,miGuiRadio,miGuiLabel;
	private ImageIcon imageIcon1;
	
	public GuiMenuPrincipal() {
		
		inicializarComponentes();
		definirEventos();
		
	}
	
	
	private void definirEventos() {
		// TODO Auto-generated method stub
		miSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
	}});
	
	miBotao.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {	
	GuiBotao botao = new GuiBotao();
	contentPane.removeAll();
	contentPane.add(botao);
	contentPane.validate();
		}});
	miCaixaOpcao.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			GuiCaixaOpcao guiCaixaOpcao = new GuiCaixaOpcao();
			contentPane.removeAll();
			contentPane.add(guiCaixaOpcao);
			contentPane.validate();
		}
	});
	miGuiRadio.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			GuiRadio guiRadio = new GuiRadio();
			contentPane.removeAll();
			contentPane.add(guiRadio);
			contentPane.validate();
		}
	});
	miGuiLabel.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			GuiLabel guiLabel = new GuiLabel();
			contentPane.removeAll();
			contentPane.add(guiLabel);
			contentPane.validate();
		}
	});

}

	


	private void inicializarComponentes() {
		// TODO Auto-generated method stub
		
		setTitle("Menu Principal");
		setBounds(0,0,800,600);
		contentPane = getContentPane();
		mnBarra = new JMenuBar();
		miGuiColor = new JMenuBar();
		mnArquivo = new JMenu("Aluno");
		//mnArquivo.setMnemonic('A');
		mnExemplos = new JMenu("Exemplos");
		//mnExemplos.setMnemonic('E');
		miSair = new JMenuItem("Sair",new ImageIcon("sair.jpg"));
		//miSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.ALT_MASK));
		miBotao = new JMenuItem("Botao");
		miCaixaOpcao = new JMenuItem("Caixa de Opção");//Criando o botão
		miGuiRadio = new JMenuItem("Caixa de Radio");
		miGuiLabel = new JMenuItem("Imagens");
		mnArquivo.add(miSair);
		mnExemplos.add(miGuiLabel);
		mnExemplos.add(miBotao);//Adicionando o botão no menu
		mnExemplos.add(miCaixaOpcao);
		mnExemplos.add(miGuiRadio);
		mnBarra.add(mnArquivo);
		mnBarra.add(mnExemplos);
		
		setJMenuBar(mnBarra);
	}


	public static void abrir() {
		// TODO Auto-generated method stub
		
		
		GuiMenuPrincipal frame = new GuiMenuPrincipal();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((tela.width - frame.getSize().width)/2,(tela.height - frame.getSize().height)/2
				);
		frame.setVisible(true);
}}
