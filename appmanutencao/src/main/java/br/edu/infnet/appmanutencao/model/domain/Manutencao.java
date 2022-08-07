package br.edu.infnet.appmanutencao.model.domain;

import java.math.BigDecimal;

public class Manutencao {
	
	private int box;
	private String placa;
	private BigDecimal valor= BigDecimal.ZERO;
	
	public int getBox() {
		return box;
	}

	public void setBox(int box) {
		this.box = box;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Manutencao [box=" + box + ", placa=" + placa + ", valor=" + valor + "]";
	}
}
