package br.edu.infnet.appmanutencao.model.domain;

import java.math.BigDecimal;

public class Servico {
	
	private String descricao;
	private int tipo;
	private BigDecimal valor = BigDecimal.ZERO;
	
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

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Servico [descricao=" + descricao + ", tipo=" + tipo + ", valor=" + valor + "]";
	}
	
	
}
