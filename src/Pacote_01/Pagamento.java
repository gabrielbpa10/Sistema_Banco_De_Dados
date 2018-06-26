package Pacote_01;

public class Pagamento {

	private Integer id_pagamento;
	private String data_inicio;
	private String data_termino;
	private int fk_aluno;
	private boolean vista;
	private boolean parcelado;
	
	
	@Override
	public String toString() {
		return "Pagamento [id_pagamento=" + id_pagamento + ", data_inicio=" + data_inicio + ", data_termino="
				+ data_termino + ", fk_aluno=" + fk_aluno + ", vista=" + vista + ", parcelado=" + parcelado + "]";
	}
	public int getId_pagamento() {
		return id_pagamento;
	}
	public void setId_pagamento(int id_pagamento) {
		this.id_pagamento = id_pagamento;
	}
	public String getData_inicio() {
		return data_inicio;
	}
	public void setData_inicio(String data_inicio) {
		this.data_inicio = data_inicio;
	}
	public String getData_termino() {
		return data_termino;
	}
	public void setData_termino(String data_termino) {
		this.data_termino = data_termino;
	}
	public int getFk_aluno() {
		return fk_aluno;
	}
	public void setFk_aluno(int fk_aluno) {
		this.fk_aluno = fk_aluno;
	}
	public boolean isVista() {
		return vista;
	}
	public void setVista(boolean vista) {
		this.vista = vista;
	}
	public boolean isParcelado() {
		return parcelado;
	}
	public void setParcelado(boolean parcelado) {
		this.parcelado = parcelado;
	}
}
