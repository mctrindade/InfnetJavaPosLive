package br.edu.infnet.appmanutencao.model.domain;

public class Lanternagem extends Servico{

	private String cor;
	private String local;
	private float valorReparo;
	
	@Override
	public float calcularVenda() {
		System.out.println("calcular venda - lanternagem");
		
		float valorLanternagem = valorReparo * 2;
		
		return getValor() + valorLanternagem;
	}
	
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
	
	public float getValorReparo() {
		return valorReparo;
	}

	public void setValorReparo(float valorReparo) {
		this.valorReparo = valorReparo;
	}

	@Override
	public String toString() {
		return "Lanternagem [cor=" + cor + ", local=" + local + ", valorReparo=" + valorReparo + super.toString() + "]";
	}

	@Override
	public void impressao() {
		System.out.println("#lanternagem");
		System.out.println(this);
	}
}
