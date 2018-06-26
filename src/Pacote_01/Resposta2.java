package Pacote_01;

public class Resposta2 {
	
	private Integer id_auxiliar;
	private String resposta1;
	private String resposta2;
	
	
	
	@Override
	public String toString() {
		return "Resposta2 [resposta1=" + resposta1 + ", resposta2=" + resposta2 + "]";
	}
	public Integer getId_auxiliar() {
		return id_auxiliar;
	}
	public void setId_auxiliar(Integer id_auxiliar) {
		this.id_auxiliar = id_auxiliar;
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
