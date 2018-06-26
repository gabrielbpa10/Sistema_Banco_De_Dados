package Pacote_01;

public class Facilitador {

	private Integer id_facilitador;
	private String nome;
	private String cpf;
	private double salario;
	private int fk_curso;
	private String email;
	
	
	@Override
	public String toString() {
		return "Facilitador [id_facilitador=" + id_facilitador + ", nome=" + nome + ", cpf=" + cpf + ", salario="
				+ salario + ", fk_curso=" + fk_curso + ", email=" + email + "]";
	}
	public int getId_facilitador() {
		return id_facilitador;
	}
	public void setId_facilitador(int id_facilitador) {
		this.id_facilitador = id_facilitador;
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
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getFk_curso() {
		return fk_curso;
	}
	public void setFk_curso(int fk_curso) {
		this.fk_curso = fk_curso;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
