package br.edu.infnet.appmanutencao.model.domain;

public class Suspensao {
	
	public int pneu;
	public String amortecedor;
	public String mola;
	
	@Override
	public String toString() {
		return "Suspensao [pneu=" + pneu + ", amortecedor=" + amortecedor + ", mola=" + mola + "]";
	}
}
