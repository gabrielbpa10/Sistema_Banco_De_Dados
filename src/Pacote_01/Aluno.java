package Pacote_01;

public class Aluno {

	private Integer id_aluno;
	private String nome;
	private String cpf;
	private String data_nascimento;
	private int curso1;
	private String email;
	private int nota_curso1;

	
	
	
	@Override
	public String toString() {
		return "Aluno [id_aluno=" + id_aluno + ", nome=" + nome + ", cpf=" + cpf + ", data_nascimento="
				+ data_nascimento + ", curso1=" + curso1 + ", email=" + email + ", nota_curso1="
				+ nota_curso1 + "]";
	}
	public int getNota_curso1() {
		return nota_curso1;
	}
	public void setNota_curso1(int nota_curso1) {
		this.nota_curso1 = nota_curso1;
	}
	
	public Integer getId_aluno() {
		return id_aluno;
	}
	public void setId_aluno(Integer id_aluno) {
		this.id_aluno = id_aluno;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public int getCurso1() {
		return curso1;
	}
	public void setCurso1(int curso1) {
		this.curso1 = curso1;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}