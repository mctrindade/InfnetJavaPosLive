package br.edu.infnet.appmanutencao.model.domain;

import br.edu.infnet.appmanutencao.interfaces.IPrinter;

public abstract class Servico implements IPrinter{
	
	private String descricao;
	private int situacao;
	private float valor;
	
	public abstract float calcularVenda();
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getSituacao() {
		return situacao;
	}

	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Servico [descricao=" + descricao + ", situacao=" + situacao + ", valor=" + valor + calcularVenda()+ "]";
	}
}
