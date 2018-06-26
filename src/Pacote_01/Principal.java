package Pacote_01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno();Facilitador facilitador = new Facilitador();Pagamento pagamento = new Pagamento();
		Materia materia = new Materia();Assunto assunto = new Assunto();Resposta resposta = new Resposta(); Pergunta pergunta = new Pergunta();
		AlunoDao alunoDao = new AlunoDao();FacilitadorDao facilitadorDao = new FacilitadorDao();
		MateriaDao materiaDao = new MateriaDao();AssuntoDao assuntoDao = new AssuntoDao();RespostaDao respostaDao = new RespostaDao();
		PerguntaDao perguntaDao = new PerguntaDao();PagamentoDao pagamentoDao = new PagamentoDao();
		Scanner sc = new Scanner(System.in);
		int opcao=0;
		do
		{
			System.out.println("=============================");
			System.out.println("========  MENU TAREFA    ====");
			System.out.println("=============================");
			System.out.println(" 1 - Área Aluno ");
			System.out.println(" 2 - Área Professor ");
			System.out.println(" 3 - Área Controle Empresa");
			System.out.println(" 4 - ");
			System.out.println(" 5 - Finalizar ");
			System.out.println("=============================");
			
			opcao = sc.nextInt();
			
			if(opcao <1 || opcao>5) {
				System.out.println("Você escolheu opção inválida, tente novamente");
			}
			sc = new Scanner (System.in);
			switch(opcao) {
			
			case 1:
			 sc = new Scanner(System.in);
			
			System.out.println("1 - Cadastra-se");
			System.out.println("2 - Alterar Dados");
			System.out.println("3 - Perguntas e Respostas");
			
			int opcao2 = sc.nextInt();
			if(opcao2 == 1) { //Cadastrando o aluno no sistema
				
				sc = new Scanner (System.in);
				System.out.println("Nome:");
				String nome = sc.nextLine();
				aluno.setNome(nome);
				
				sc = new Scanner (System.in);
				System.out.println("CPF:");
				String cpf = sc.nextLine();
				aluno.setCpf(cpf);
				
				
				sc = new Scanner (System.in);
				System.out.println("Data de nascimento:");
				String data = sc.nextLine();
				aluno.setData_nascimento(data);
							
				materiaDao.getMaterias();
				sc = new Scanner (System.in);
				System.out.println("Informe o curso a estudar:");
				int curso1 = sc.nextInt();
				aluno.setCurso1(curso1);
				
				
				System.out.println("Forma de pagamento:");
				System.out.println("1 - à vista");
				System.out.println("2 - parcelado");
				int pagamento1 = sc.nextInt(); 
				// colocar a forma de pagamento no banco - passar parametro para classe
				String email;
				if(pagamento1 == 1) {
					Aluno3 a = new Aluno3();
					pagamento.setVista(true);
					pagamento.setParcelado(false);
					sc = new Scanner (System.in);
					System.out.println("Informe seu e-mail para podermos encaminhar o boleto:");
					email = sc.nextLine();
					aluno.setEmail(email);
					System.out.println("Lembrando que somente poderá assistir as aulas quando for pago o seu boleto");
					alunoDao.setCpf(cpf);
					alunoDao.salvar(aluno);
					alunoDao.getAlunos3();
					int aa = alunoDao.getId_aluno();
					pagamento.setFk_aluno(aa);
					pagamentoDao.salvar(pagamento);
				} else {
					pagamento.setVista(false);
					pagamento.setParcelado(true);
					System.out.println("Informe seu e-mail para encaminharmos seu comprovante de pagamento:");
					email = sc.nextLine();
					aluno.setEmail(email);
					alunoDao.setCpf(cpf);
					alunoDao.salvar(aluno);
					alunoDao.getAlunos3();
					int aa = alunoDao.getId_aluno();
					pagamento.setFk_aluno(aa);
					pagamentoDao.salvar(pagamento);
				}
				
				
				System.out.println(aluno);	
			}else if(opcao2 == 2) {
				alunoDao.getAlunos();
				sc = new Scanner(System.in);
				System.out.println("Informe o código a alterar:");
				int id = sc.nextInt();
				sc = new Scanner(System.in);
				System.out.println("Informe o nome:");
				String nome = sc.nextLine();
				sc = new Scanner(System.in);
				System.out.println("informe o CPF:");
				String cpf = sc.nextLine();
				sc = new Scanner(System.in);
				System.out.println("Informe a data de nascimento:");
				String data = sc.nextLine();
				materiaDao.getMaterias();
				sc = new Scanner (System.in);
				System.out.println("Informe o curso a estudar:");
				int curso1 = sc.nextInt();
			
				sc = new Scanner(System.in);
				System.out.println("Informe o e-mail:");
				String email = sc.nextLine();
				
				aluno.setId_aluno(id);
				aluno.setNome(nome);
				aluno.setCpf(cpf);
				aluno.setData_nascimento(data);
				aluno.setCurso1(curso1);
				aluno.setEmail(email);
				alunoDao.alterar(aluno);
				
			}else if(opcao2 == 3) {
				Aluno2 aluno2 = new Aluno2();
				int aux=0;
				sc = new Scanner(System.in);
				System.out.println("Informe seu CPF:");
				String cpf = sc.nextLine();
				alunoDao.setCpf(cpf);
				alunoDao.getAlunos2();
				
				
				if(cpf.equals(alunoDao.cpfAux)) {
				
				materiaDao.getMaterias2();
				sc = new Scanner(System.in);
				System.out.println("Informe em qual materia será feito os questionários:");
				aux = sc.nextInt();
				
				if(aux == 1) {
		
				int nota = 0;
				perguntaDao.setAux(1);
				perguntaDao.getPerguntas2();	
				System.out.println("");
				String item1;int aux2=1;// atributo para id_auxiliar(resposta) do Banco de Dados
				
				respostaDao.setAux(aux2);
				respostaDao.getRespostas2();	
				
				sc = new Scanner(System.in);
				System.out.println("Informe o item:");
				item1 = sc.nextLine();
				
				switch(item1) {
				
				case "c":
				nota=1;
				break;
				}
				perguntaDao.setAux(4);
				perguntaDao.getPerguntas2();	
				System.out.println("");
				String item2;int aux3=3;
				
				respostaDao.setAux(aux3);
				respostaDao.getRespostas2();	
				
				sc = new Scanner(System.in);
				System.out.println("Informe o item:");
				item2 = sc.nextLine();
				
				switch(item2) {
				
				case "b":
				nota=2;
				break;
				}
				perguntaDao.setAux(5);
				perguntaDao.getPerguntas2();	
				System.out.println("");
				String item3;int aux4=4;
				
				respostaDao.setAux(aux4);
				respostaDao.getRespostas2();	
				
				sc = new Scanner(System.in);
				System.out.println("Informe o item:");
				item3 = sc.nextLine();
				
				switch(item3) {
				
				case "c":
				nota=3;
				break;
				}
				if(nota>1) {
					System.out.println("Sua nota -> " + nota);
					System.out.println("Aprovado!!!");
				}else {
					System.out.println("Sua nota -> " + nota);
					System.out.println("Reprovado!!!");
				}
				System.out.println(nota);
				alunoDao.alterar2(nota,cpf);
				
				}else if(aux == 2) {
				
				perguntaDao.setAux(3);
				perguntaDao.getPerguntas2();	
				System.out.println("");
				
				int aux2=2;int nota=0;
				String item1;
				respostaDao.setAux(aux2);
				respostaDao.getRespostas2();	
				
				sc = new Scanner(System.in); 
				System.out.println("Informe o item:");
				item1 = sc.nextLine();
				
				switch(item1) {
				
				case "c":
				nota=1;
				break;
				}
				
				perguntaDao.setAux(6);
				perguntaDao.getPerguntas2();	
				System.out.println("");
				
				int aux3=5;
				String item2;
				respostaDao.setAux(aux3);
				respostaDao.getRespostas2();	
				
				sc = new Scanner(System.in); 
				System.out.println("Informe o item:");
				item2 = sc.nextLine();
				
				switch(item2) {
				
				case "a":
				nota=2;
				break;
				}
				perguntaDao.setAux(7);
				perguntaDao.getPerguntas2();	
				System.out.println("");
				
				int aux4=6;
				String item3;
				respostaDao.setAux(aux4);
				respostaDao.getRespostas2();	
				
				sc = new Scanner(System.in); 
				System.out.println("Informe o item:");
				item3 = sc.nextLine();
				switch(item3) {
				
				case "a":
				nota=3;
				break;
				}
				if(nota>1) {
					System.out.println("Sua nota -> " + nota);
					System.out.println("Aprovado!!!");
				}else {
					System.out.println("Sua nota -> " + nota);
					System.out.println("Reprovado!!!");
				}
				alunoDao.alterar2(nota,cpf);
				
				}else if(aux == 3) {
					
				}
				
				
				
				
				
			}}
					
			
			
			
			break;
			
			case 2:// Área Professor
				System.out.println("1 - Cadastrar Professor");
				System.out.println("2 - Alterar Dados");
				int opcao3 = sc.nextInt();
				if(opcao3 == 1) {
					sc = new Scanner (System.in);
					System.out.println("Nome:");
					String nome = sc.nextLine();
					facilitador.setNome(nome);
					
					sc = new Scanner (System.in);
					System.out.println("CPF:");
					String cpf = sc.nextLine();
					facilitador.setCpf(cpf);
					
					sc = new Scanner (System.in);
					System.out.println("Salario:");
					double salario = sc.nextDouble();
					facilitador.setSalario(salario);
					
					materiaDao.getMaterias();
					sc = new Scanner (System.in);
					System.out.println("Informe o curso a ensinar:");
					int opcao4 = sc.nextInt();
					facilitador.setFk_curso(opcao4);
					
					sc = new Scanner (System.in);
					System.out.println("E-mail:");
					String email = sc.nextLine();
					facilitador.setEmail(email);

					facilitadorDao.salvar(facilitador);
				} else if(opcao3 == 2) {
					facilitadorDao.getFacilitadores();
					
					sc = new Scanner (System.in);
					System.out.println("Informe o código a alterar:");
					int id = sc.nextInt();
					facilitador.setId_facilitador(id);
					
					sc = new Scanner (System.in);
					System.out.println("Nome:");
					String nome = sc.nextLine();
					facilitador.setNome(nome);
					
					sc = new Scanner (System.in);
					System.out.println("CPF:");
					String cpf = sc.nextLine();
					facilitador.setCpf(cpf);
					
					sc = new Scanner (System.in);
					System.out.println("Salario:");
					double salario = sc.nextDouble();
					facilitador.setSalario(salario);
					materiaDao.getMaterias();
					sc = new Scanner (System.in);
					System.out.println("Informe o curso a ensinar:");
					int opcao4 = sc.nextInt();
					facilitador.setFk_curso(opcao4);
					
					sc = new Scanner (System.in);
					System.out.println("E-mail:");
					String email = sc.nextLine();
					
					facilitadorDao.alterar(facilitador);
				}
				
				
				break;
			
			case 3:
				System.out.println("1 - Altera Tabela Pagamentos ");
				System.out.println("2 - Listar Alunos");
				System.out.println("3 - Listar Facilitadores");
				System.out.println("4 - Deletar Aluno do Banco de Dados ");
				System.out.println("5 - Deletar Facilitador do Banco de Dados");
				System.out.println("6 - Materias (Menu)");
				System.out.println("7 - Assuntos (Menu)");
				System.out.println("8 - Perguntas e Respostas (Menu)");
				System.out.println("9 - Voltar Menu Anterior");
		
				int opcao5 = sc.nextInt();
			if(opcao5 == 1) {
				alunoDao.getAlunos();
				System.out.println("------------------------------");
				
				sc = new Scanner(System.in);
				System.out.println("Código aluno:");
				int fk_aluno = sc.nextInt();
				pagamentoDao.setFk_aluno(fk_aluno);
				pagamento.setFk_aluno(fk_aluno);
				
				sc = new Scanner(System.in);
				System.out.println("Data término modelo EUA:");
				String data_termino = sc.nextLine();
				pagamento.setData_termino(data_termino);
				
				System.out.println("Pagamento à vista ou parcelado:");
				System.out.println("1 - À vista");
				System.out.println("2 - Parcelado");
				int aux = sc.nextInt();
				if(aux == 1) {
					pagamento.setVista(true);
					pagamento.setParcelado(false);
				}else if(aux == 2) {
					pagamento.setVista(false);
					pagamento.setParcelado(true);
				}
				pagamentoDao.alterar(pagamento);
			
			} else if(opcao5 == 2) {
				int aux;
				sc = new Scanner(System.in);
				System.out.println("Formas de listagem de alunos:");
				System.out.println("1 - Listar Geral");
				System.out.println("2 - Listar Por Matrícula");
				System.out.println("3 - Listar Por Nome");
				System.out.println("4 - Voltar Menu Principal");
				aux = sc.nextInt();
				if(aux==1) {
				alunoDao.getAlunos();
				}else if(aux == 2) {
					int matricula;
					sc = new Scanner (System.in);
					System.out.println("Informe o nº da matrícula:");
					matricula = sc.nextInt();
					alunoDao.setId_aluno(matricula);
					alunoDao.getAlunos4();
				}else if(aux == 3) {
					String nome;
					sc = new Scanner (System.in);
					System.out.println("Informe o nome:");
					nome = sc.nextLine();
					alunoDao.setNome(nome);
					alunoDao.getAlunos5();
				}
			}else if(opcao5 == 3) {
				int aux;
				sc = new Scanner(System.in);
				System.out.println("Formas de listagem de Facilitadores:");
				System.out.println("1 - Listar Geral");
				System.out.println("2 - Listar Por Matrícula");
				System.out.println("3 - Listar Por Nome");
				System.out.println("4 - Voltar Menu Principal");
				aux = sc.nextInt();
				if(aux == 1) {
				facilitadorDao.getFacilitadores();
				}else if(aux == 2) {
					int matricula;
					sc = new Scanner(System.in);
					System.out.println("Informe o nº da matrícula:");
					matricula = sc.nextInt();
					facilitadorDao.setMatricula(matricula);
					facilitadorDao.getFacilitadores2();
					
				}else if(aux == 3) {
					String nome;
					sc = new Scanner(System.in);
					System.out.println("Informe o nome do facilitador:");
					nome = sc.nextLine();
					facilitadorDao.setNome(nome);
					facilitadorDao.getFacilitadores3();
				}
			}else if(opcao5 == 4) { 
				alunoDao.getAlunos();
				sc = new Scanner(System.in);
			System.out.println("Informe o código que deseja deletar:");
				int id = sc.nextInt();
				alunoDao.getExcluir(id);
				
			}else  if(opcao5 == 5) {
				facilitadorDao.getFacilitadores();
				sc = new Scanner(System.in);
				System.out.println("Informe o código a deletar");
				int id = sc.nextInt();
				facilitadorDao.getExcluir(id);
			}else if(opcao5 == 6) {
				System.out.println("---------MENU MATERIA-------");
				System.out.println("1 - Cadastrar Materias");
				System.out.println("2 - Listar Materias");
				System.out.println("3 - Alterar Materias");
				System.out.println("4 - Excluir Materias do Banco de Dados");
				System.out.println("5 - Voltar Menu Principal");
				
				int aux = sc.nextInt();
				
				if(aux == 1) {
					sc = new Scanner(System.in);
					System.out.println("Materia:");
					String curso = sc.nextLine();
					sc = new Scanner(System.in);
					System.out.println("Valor da Matéria:");
					double valor = sc.nextDouble();
					
					materia.setCurso(curso);
					materia.setValor(valor);
					materiaDao.salvar(materia);
					
				}else if(aux == 2) {
					materiaDao.getMaterias();
				}else if(aux == 3) {
					materiaDao.getMaterias();
					sc = new Scanner(System.in);
					System.out.println("Informe o código da matéria a alterar:");
					int id = sc.nextInt();
					materia.setId_materia(id);
					sc = new Scanner(System.in);
					System.out.println("Nome da Matéria:");
					String curso = sc.nextLine();
					materia.setCurso(curso);
					sc = new Scanner(System.in);
					System.out.println("Valor:");
					double valor = sc.nextDouble();
					materia.setValor(valor);
					
					materiaDao.alterar(materia);
					
				}else if(aux == 4) {
					materiaDao.getMaterias();
					sc = new Scanner(System.in);
					System.out.println("Informe o código para excluir no Banco de Dados:");
					int id = sc.nextInt();
					materiaDao.getExcluir(id);
				}
			}else if(opcao5 == 7) {
				System.out.println("---------MENU ASSUNTO-------");
				System.out.println("1 - Cadastrar Assuntos");
				System.out.println("2 - Listar Assuntos");
				System.out.println("3 - Alterar Assuntos");
				System.out.println("4 - Excluir Assuntos do Banco de Dados");
				System.out.println("5 - Voltar Menu Principal");
				
				int aux = sc.nextInt();
				
				if( aux == 1) {
					materiaDao.getMaterias();
					
					System.out.println("Informe o código da matéria a ser vinculado com assunto:");
					 int curso = sc.nextInt();
					 assunto.setCurso(curso);
					 
					sc = new Scanner(System.in); 
					System.out.println("Informar o assunto da matéria específica:");
					String assuntoAux = sc.nextLine();
					assunto.setAssunto(assuntoAux);
					
					assuntoDao.salvar(assunto);
					
				}else if(aux == 2) {
					assuntoDao.getAssuntos();
				}else if(aux == 3) {
					
					assuntoDao.getAssuntos();
					sc = new Scanner(System.in);
					System.out.println("Informe o código:");
					int aux2 = sc.nextInt();
					assunto.setId_assunto(aux2);
					
					materiaDao.getMaterias();
					sc = new Scanner(System.in);
					 int curso = sc.nextInt();
					 assunto.setCurso(curso);
					 
					sc = new Scanner(System.in); 
					System.out.println("Informar o assunto da matéria específica:");
					String assuntoAux = sc.nextLine();
					assunto.setAssunto(assuntoAux);
					
					assuntoDao.alterar(assunto);
				}else if(aux == 4) {
					assuntoDao.getAssuntos();
					sc = new Scanner(System.in);
					System.out.println("Informe o código para excluir no Banco de Dados:");
					int id = sc.nextInt();
					assuntoDao.getExcluir(id);
					
				}
			}else if(opcao5 == 8) {
				System.out.println("---------MENU CADASTRO PERGUNTAS E RESPOSTAS-------");
				System.out.println("1 - Cadastrar");
				System.out.println("2 - Listar");
				System.out.println("3 - Alterar Resposta");
				System.out.println("4 - Alterar Pergunta");
				System.out.println("5 - Excluir Resposta");
				System.out.println("6 - Excluir Pergunta");
				System.out.println("7 - Voltar Menu Principal");
				
				int aux = sc.nextInt();
				
				if(aux == 1) {
					int vetor[] = new int [2];
					sc = new Scanner (System.in);
					System.out.println("Informe a pergunta a cadastrar:");
					String pergunta1 = sc.nextLine();
					pergunta.setPergunta(pergunta1);
										
					sc = new Scanner(System.in); 
					System.out.println("Informe a letra da resposta correta para cadastrar:");
					String resposta1 = sc.nextLine();
					resposta.setResposta1(resposta1);
					
					sc = new Scanner(System.in);
					System.out.println("Informe a resposta correta por escrito:");
					String resposta2 = sc.nextLine();
					resposta.setResposta2(resposta2);
					
					sc = new Scanner(System.in);
					System.out.println("Informe o código auxiliar para questionário");
					int id_auxiliar = sc.nextInt();
					resposta.setId_auxiliar(id_auxiliar);
					
					boolean correcao = true;
					resposta.setCorrecao(correcao);
					respostaDao.salvar(resposta);
					
					for(int i=0;i<vetor.length;i++) {
						sc = new Scanner(System.in);
						System.out.println("Informe a letra da resposta alternativa para cadastrar:");
						String resposta11 = sc.nextLine();
						resposta.setResposta1(resposta11);
						sc = new Scanner(System.in);
						System.out.println("Informe a resposta alternativa por escrito:");
						String resposta22 = sc.nextLine();
						resposta.setResposta2(resposta22);
						sc = new Scanner(System.in);
						System.out.println("Informe o código auxiliar para questionário");
						int id_auxiliar2 = sc.nextInt();
						resposta.setId_auxiliar(id_auxiliar2);
						correcao = false;
						resposta.setCorrecao(correcao);
						respostaDao.salvar(resposta);
					}
					
					
					respostaDao.getRespostas();
					
					sc = new Scanner (System.in);
					System.out.println("Informar o código da resposta correta para a pergunta:");
					int id1 = sc.nextInt();
					pergunta.setFk_resposta(id1);
					perguntaDao.salvar(pergunta);
					
				}else if(aux == 2){ 
					respostaDao.getRespostas();
					System.out.println("-----------------------------------");
					perguntaDao.getPerguntas();
				}else if(aux == 3) {
					respostaDao.getRespostas();
					
					sc = new Scanner(System.in);
					System.out.println("Informe o código para ser alterado:");
					int id_resposta = sc.nextInt();
					resposta.setId_resposta(id_resposta);
					
					sc = new Scanner(System.in); 
					System.out.println("Informe a letra da resposta correta para cadastrar:");
					String resposta1 = sc.nextLine();
					resposta.setResposta1(resposta1);
					
					sc = new Scanner(System.in);
					System.out.println("Informe a resposta correta por escrito:");
					String resposta2 = sc.nextLine();
					resposta.setResposta2(resposta2);
					
					sc = new Scanner(System.in);
					System.out.println("Informe o código auxiliar para questionário");
					int id_auxiliar = sc.nextInt();
					resposta.setId_auxiliar(id_auxiliar);
					
					sc = new Scanner(System.in);
					System.out.println("1 - Resposta correta");
					System.out.println("2 - Resposta incorreta");
					int aux2 = sc.nextInt();
					
					if(aux2 == 1) {
						boolean correcao = true;	
						resposta.setCorrecao(correcao);
					}else {
						boolean correcao = false;
						resposta.setCorrecao(correcao);
					}
					
					
					respostaDao.alterar(resposta);
				}else if(aux == 4) {
					perguntaDao.getPerguntas();
					sc = new Scanner (System.in);
					System.out.println("Informar o código a alterar:");
					int id1 = sc.nextInt();
					pergunta.setId_pergunta(id1);
					sc = new Scanner (System.in);
					System.out.println("Informe a pergunta a cadastrar:");
					String pergunta1 = sc.nextLine();
					pergunta.setPergunta(pergunta1);
					respostaDao.getRespostas();
					sc = new Scanner (System.in);
					System.out.println("Informar o código da resposta correta:");
					int id = sc.nextInt();
					pergunta.setFk_resposta(id);
					perguntaDao.alterar(pergunta);
				}else if(aux == 5) {
					respostaDao.getRespostas();
					System.out.println("Informe o código a excluir:");
					int id = sc.nextInt();
					respostaDao.getExcluir(id);
				}else if(aux == 6) {
					perguntaDao.getPerguntas();
					sc = new Scanner (System.in);
					System.out.println("Informar o código a excluir:");
					int id = sc.nextInt();
					perguntaDao.getExcluir(id);
				}
			
				
			}
			break;
			}}while(opcao!=5);
			
				
		
	}

}
