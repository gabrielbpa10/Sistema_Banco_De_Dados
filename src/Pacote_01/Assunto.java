package Pacote_01;

public class Assunto {

	private int id_assunto;
	private int curso;
	private String assunto;
	
	
	@Override
	public String toString() {
		return "Assunto [id_assunto=" + id_assunto + ", curso=" + curso + ", assunto=" + assunto + "]";
	}
	public int getId_assunto() {
		return id_assunto;
	}
	public void setId_assunto(int id_assunto) {
		this.id_assunto = id_assunto;
	}
	public int getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso = curso;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	
	
}
