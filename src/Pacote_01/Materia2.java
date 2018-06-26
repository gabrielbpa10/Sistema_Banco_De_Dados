package Pacote_01;

public class Materia2 {
	
	private int id_materia;
	private String curso;
	
	@Override
	public String toString() {
		return "Materia2 [id_materia=" + id_materia + ", curso=" + curso + "]";
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
	
}
