package Pacote_01;

public class Resposta {

	private Integer id_resposta;
	private Integer id_auxiliar;
	private String resposta1;
	private String resposta2;
	private boolean correcao;
	
	@Override
	public String toString() {
		return "Resposta [id_resposta=" + id_resposta + ", id_auxiliar=" + id_auxiliar + ", resposta1=" + resposta1
				+ ", resposta2=" + resposta2 + ", correcao=" + correcao + "]";
	}
	public Integer getId_auxiliar() {
		return id_auxiliar;
	}
	public void setId_auxiliar(Integer id_auxiliar) {
		this.id_auxiliar = id_auxiliar;
	}
	public boolean getCorrecao() {
		return correcao;
	}
	public void setCorrecao(boolean correcao) {
		this.correcao = correcao;
	}
	
	
	public Integer getId_resposta() {
		return id_resposta;
	}
	public void setId_resposta(Integer id_resposta) {
		this.id_resposta = id_resposta;
	}
	public String getResposta1() {
		return resposta1;
	}
	public void setResposta1(String resposta1) {
		this.resposta1 = resposta1;
	}
	public String getResposta2() {
		return resposta2;
	}
	public void setResposta2(String resposta2) {
		this.resposta2 = resposta2;
	}
	
}
