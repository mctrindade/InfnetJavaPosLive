package br.edu.infnet.appmanutencao.model.domain;

import java.math.BigDecimal;

public class Servico {
	
	public String descricao;
	public int tipo;
	public BigDecimal valor = BigDecimal.ZERO;
	
	@Override
	public String toString() {
		return "Servico [descricao=" + descricao + ", tipo=" + tipo + ", valor=" + valor + "]";
	}
	
	
}
