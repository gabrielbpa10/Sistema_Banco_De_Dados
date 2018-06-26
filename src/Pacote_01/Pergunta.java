package Pacote_01;

public class Pergunta {

	private Integer id_pergunta;
	private String pergunta;
	private int fk_resposta;
	
	
	@Override
	public String toString() {
		return "Pergunta [id_pergunta=" + id_pergunta + ", pergunta=" + pergunta + ", fk_resposta=" + fk_resposta + "]";
	}
	public String toString2() {
		return "Pergunta [ pergunta=" + pergunta + "]";
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
	public int getFk_resposta() {
		return fk_resposta;
	}
	public void setFk_resposta(int fk_resposta) {
		this.fk_resposta = fk_resposta;
	}
	
}
