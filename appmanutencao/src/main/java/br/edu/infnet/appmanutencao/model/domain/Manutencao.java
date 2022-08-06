package br.edu.infnet.appmanutencao.model.domain;

import java.math.BigDecimal;

public class Manutencao {
	
	public int box;
	public String placa;
	public BigDecimal valor= BigDecimal.ZERO;
	
	@Override
	public String toString() {
		return "Manutencao [box=" + box + ", placa=" + placa + ", valor=" + valor + "]";
	}
}
