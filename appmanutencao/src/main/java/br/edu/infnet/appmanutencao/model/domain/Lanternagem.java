package br.edu.infnet.appmanutencao.model.domain;

public class Lanternagem extends Servico{

	private String cor;
	private String local;
	private String reparo;
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getReparo() {
		return reparo;
	}

	public void setReparo(String reparo) {
		this.reparo = reparo;
	}

	@Override
	public String toString() {
		return "Lanternagem [cor=" + cor + ", local=" + local + ", reparo=" + reparo + super.toString() + "]";
	}
}
