package Pacote_01;

public class Pergunta2 {
	private Integer id_pergunta;
	private String pergunta;
	
	@Override
	public String toString() {
		return "Pergunta2 ["+ "pergunta=" + pergunta + "]";
	}
	public Integer getId_pergunta() {
		return id_pergunta;
	}
	public void setId_pergunta(Integer id_pergunta) {
		this.id_pergunta = id_pergunta;
	}
	public String getPergunta() {
		return pergunta;
	}
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	
	
}
