package Pacote_01;

import java.util.ArrayList;
import java.util.List;

public class App {
public static void main(String[] args) {
	AlunoDao alunoDao = new AlunoDao();
	List<Aluno> aluno = alunoDao.getAlunos();
	for(Aluno a:aluno) {
		System.out.println(a);
	}
}
public static void main2(String[] args) {
FacilitadorDao facilitadorDao = new FacilitadorDao();
	List<Facilitador> f = facilitadorDao.getFacilitadores();
	for(Facilitador f1: f) {
		System.out.println(f1);
	}

}
public static void main3(String[] args) {
MateriaDao materiaDao = new MateriaDao();
	List<Materia> m = materiaDao.getMaterias();
	for(Materia m1: m) {
		System.out.println(m1);
	}

}
public static void main4(String[] args) {
AssuntoDao assuntoDao = new AssuntoDao();
	List<Assunto> a = assuntoDao.getAssuntos();
	for(Assunto a1: a) {
		System.out.println(a1);
	}}

public static void main5(String[] args) {
RespostaDao respostaDao = new RespostaDao();
	List<Resposta> a = respostaDao.getRespostas();
	for(Resposta a1: a) {
		System.out.println(a1);
	}}
public static void main6(String[] args) {
PerguntaDao perguntaDao = new PerguntaDao();
	List<Pergunta> a = perguntaDao.getPerguntas();
	for(Pergunta a1: a) {
		System.out.println(a1);
	}}
public static void main7(String[] args) {
PerguntaDao perguntaDao = new PerguntaDao();
	List<Pergunta2> a = perguntaDao.getPerguntas2();
	for(Pergunta2 a1: a) {
		System.out.println(a1);
	}}
public static void main8(String[] args) {
RespostaDao respostaDao = new RespostaDao();
	List<Resposta2> a = respostaDao.getRespostas2();
	for(Resposta2 a1: a) {
		System.out.println(a1);
	}}
public static void main9(String[] args) {
	AlunoDao alunoDao = new AlunoDao();
	List<Aluno2> aluno = alunoDao.getAlunos2();
	for(Aluno2 a:aluno) {
		System.out.println(a);
	}
}
public static void main10(String[] args) {
	AlunoDao alunoDao = new AlunoDao();
	List<Aluno3> aluno = alunoDao.getAlunos3();
	for(Aluno3 a:aluno) {
		System.out.println(a);
	}
}
public static void main11(String[] args) {
	AlunoDao alunoDao = new AlunoDao();
	List<Aluno> aluno = alunoDao.getAlunos4();
	for(Aluno a:aluno) {
		System.out.println(a);
	}
}
public static void main12(String[] args) {
	AlunoDao alunoDao = new AlunoDao();
	List<Aluno> aluno = alunoDao.getAlunos5();
	for(Aluno a:aluno) {
		System.out.println(a);
	}
}
public static void main13(String[] args) {
FacilitadorDao facilitadorDao = new FacilitadorDao();
	List<Facilitador> f = facilitadorDao.getFacilitadores2();
	for(Facilitador f1: f) {
		System.out.println(f1);
	}

}
public static void main14(String[] args) {
FacilitadorDao facilitadorDao = new FacilitadorDao();
	List<Facilitador> f = facilitadorDao.getFacilitadores3();
	for(Facilitador f1: f) {
		System.out.println(f1);
	}

}
public static void main15(String[] args) {
MateriaDao materiaDao = new MateriaDao();
	List<Materia2> m = materiaDao.getMaterias2();
	for(Materia2 m1: m) {
		System.out.println(m1);
	}

}
}
