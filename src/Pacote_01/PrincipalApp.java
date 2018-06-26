package Pacote_01;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import Pacote_02_Teste.GuiBotao;
import Pacote_02_Teste.GuiMenuPrincipal;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PrincipalApp extends JFrame {
	private Container contentPane;
	private JMenuBar mnBarra;
	private JMenu mnAluno,mnFacilitador,mnMateria,mnAssunto,mnResposta,mnPergunta;
	private JMenuItem miCadastrarAluno, miEditarAluno,miListarAluno,miExcluirAluno,miFacilitadorCadastro,
	miFacilitadorEditar,miFacilitadorListar,miFacilitadorExcluir,miCadastrarMateria,miEditarMateria,miListarMateria,
	miExcluirMateria,miCadastrarAssunto,miEditarAssunto,miListarAssunto,miExcluirAssunto,miCadastrarResposta,miEditarResposta,
	miListarResposta,miExcluirResposta,miCadastrarPergunta,miEditarPergunta;
	
	public PrincipalApp() {
		
		inicializarComponentes();
		definirEventos();
		
	}
	private void inicializarComponentes() {
		// TODO Auto-generated method stub
		
		setTitle("Menu Principal");
		setBounds(0,0,800,600);
		contentPane = getContentPane();
		mnBarra = new JMenuBar();
		mnAluno = new JMenu("Alunos");
		//mnArquivo.setMnemonic('A');
		mnFacilitador = new JMenu("Facilitadores");
		mnMateria = new JMenu("Materias");
		mnAssunto = new JMenu("Assuntos");
		mnResposta = new JMenu("Respostas");
		mnPergunta = new JMenu("Perguntas");
		//mnExemplos.setMnemonic('E');
		
		//miSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.ALT_MASK));
		miFacilitadorCadastro = new JMenuItem("Cadastrar Facilitador",new ImageIcon("Cadastrar.jpg"));
		miFacilitadorEditar = new JMenuItem("Editar Facilitador",new ImageIcon("Editar.jpg"));
		miFacilitadorListar = new JMenuItem("Listar Facilitadores",new ImageIcon("Listar.jpg"));
		miFacilitadorExcluir = new JMenuItem("Excluir Facilitador",new ImageIcon("Excluir.jpg"));
		miCadastrarAluno = new JMenuItem("Cadastrar Aluno",new ImageIcon("Cadastrar.jpg"));
		miEditarAluno = new JMenuItem("Editar Aluno", new ImageIcon("Editar.jpg"));
		miListarAluno = new JMenuItem("Listar Alunos", new ImageIcon("Listar.jpg"));
		miExcluirAluno = new JMenuItem("Excluir Aluno", new ImageIcon("Excluir.jpg"));
		miCadastrarMateria = new JMenuItem("Cadastrar Materia", new ImageIcon("Cadastrar.jpg"));
		miEditarMateria = new JMenuItem("Editar Materia",new ImageIcon("Alterar.jpg"));
		miListarMateria = new JMenuItem("Listar Materias", new ImageIcon("Listar.jpg"));
		miExcluirMateria = new JMenuItem("Excluir Materia", new ImageIcon("Excluir.jpg"));
		miCadastrarAssunto = new JMenuItem("Cadastrar Assunto", new ImageIcon("Cadastrar.jpg"));
		miEditarAssunto = new JMenuItem("Editar Assunto", new ImageIcon("Editar.jpg"));
		miListarAssunto = new JMenuItem("Listar Assuntos", new ImageIcon("Listar.jpg"));
		miExcluirAssunto = new JMenuItem("Excluir Assunto", new ImageIcon("Excluir.jpg"));
		miCadastrarResposta = new JMenuItem("Cadastrar Resposta",new ImageIcon("Cadastrar.jpg"));
		miEditarResposta = new JMenuItem("Editar Resposta",new ImageIcon("Editar.jpg"));
		miListarResposta = new JMenuItem("Listar Resposta",new ImageIcon("Listar.jpg"));
		miExcluirResposta = new JMenuItem("Excluir Resposta",new ImageIcon("Excluir.jpg"));
		miCadastrarPergunta = new JMenuItem("Cadastrar Pergunta",new ImageIcon("Cadastrar.jpg"));
		miEditarPergunta = new JMenuItem("Editar Pergunta",new ImageIcon("Editar.jpg"));
		
		
		mnAluno.add(miExcluirAluno);
		mnAluno.add(miCadastrarAluno);
		mnAluno.add(miEditarAluno);
		mnAluno.add(miListarAluno);
		mnFacilitador.add(miFacilitadorExcluir);
		mnFacilitador.add(miFacilitadorListar);
		mnFacilitador.add(miFacilitadorEditar);
		mnFacilitador.add(miFacilitadorCadastro);
		mnMateria.add(miCadastrarMateria);
		mnMateria.add(miEditarMateria);
		mnMateria.add(miListarMateria);
		mnMateria.add(miExcluirMateria);
		mnAssunto.add(miCadastrarAssunto);
		mnAssunto.add(miEditarAssunto);
		mnAssunto.add(miListarAssunto);
		mnAssunto.add(miExcluirAssunto);
		mnResposta.add(miCadastrarResposta);
		mnResposta.add(miEditarResposta);
		mnResposta.add(miListarResposta);
		mnResposta.add(miExcluirResposta);
		mnPergunta.add(miCadastrarPergunta);
		mnPergunta.add(miEditarPergunta);
		
		mnBarra.add(mnAluno);
		mnBarra.add(mnFacilitador);
		mnBarra.add(mnMateria);
		mnBarra.add(mnAssunto);
		mnBarra.add(mnResposta);
		mnBarra.add(mnPergunta);
		setJMenuBar(mnBarra);
	}
	private void definirEventos() {
		// TODO Auto-generated method stub
		miCadastrarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			AlunoApp.abrir();
				//System.exit(0);
	}});
		miEditarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
	}});
		miListarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
	}});
		miExcluirAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
	}});
	miFacilitadorCadastro.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {	
			System.exit(0);
		}});
	miFacilitadorEditar.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {	
			System.exit(0);
		}});
	miFacilitadorListar.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {	
			System.exit(0);
		}});
	miFacilitadorExcluir.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {	
			System.exit(0);
		}});
	miCadastrarMateria.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {	
			System.exit(0);
		}});
	miEditarMateria.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {	
			System.exit(0);
		}});
	miListarMateria.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {	
			System.exit(0);
		}});
	miExcluirMateria.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {	
			System.exit(0);
		}});
	miCadastrarAssunto.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {	
			System.exit(0);
		}});
	miEditarAssunto.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {	
			System.exit(0);
		}});
	miListarAssunto.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {	
			System.exit(0);
		}});
	miExcluirAssunto.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {	
			System.exit(0);
		}});
	miCadastrarResposta.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {	
			System.exit(0);
		}});
	miEditarResposta.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {	
			System.exit(0);
		}});
	miListarResposta.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {	
			System.exit(0);
		}});
	miExcluirResposta.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {	
			System.exit(0);
		}});
	miCadastrarPergunta.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {	
			System.exit(0);
		}});
	miEditarPergunta.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {	
			System.exit(0);
		}});
}
	

	public static void main(String[] args) {

				
			PrincipalApp frame = new PrincipalApp();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
			frame.setLocation((tela.width - frame.getSize().width)/2,(tela.height - frame.getSize().height)/2
					);
			frame.setVisible(true);
		
		
		
	}
	
}
