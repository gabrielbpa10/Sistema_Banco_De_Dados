package Pacote_01;

public class Materia {

	private int id_materia;
	private String curso;
	private double valor;
	
	
	@Override
	public String toString() {
		return "Materia [id_materia=" + id_materia + ", curso=" + curso + ", valor=" + valor + "]";
	}
	public int getId_materia() {
		return id_materia;
	}
	public void setId_materia(int id_materia) {
		this.id_materia = id_materia;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
