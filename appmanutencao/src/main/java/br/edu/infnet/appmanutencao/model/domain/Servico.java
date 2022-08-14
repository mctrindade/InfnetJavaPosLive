package br.edu.infnet.appmanutencao.model.domain;

public abstract class Servico {
	
	private String descricao;
	private int tipo;
	private float valor;
	
	public float calcularVenda() {
		System.out.println("calcular venda - mãe");
		
		return valor * 2;
	}
	
	public abstract void impressao();
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Servico [descricao=" + descricao + ", tipo=" + tipo + ", valor=" + valor + calcularVenda()+ "]";
	}
	
	
}
