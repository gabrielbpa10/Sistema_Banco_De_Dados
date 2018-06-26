package Pacote_01;

public class Aluno2 {
	private Integer id_aluno;
	private String cpf;
	
	
	@Override
	public String toString() {
		return "Aluno2 [cpf=" + cpf + "]";
	}
	public Integer getId_aluno() {
		return id_aluno;
	}
	public void setId_aluno(Integer id_aluno) {
		this.id_aluno = id_aluno;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
