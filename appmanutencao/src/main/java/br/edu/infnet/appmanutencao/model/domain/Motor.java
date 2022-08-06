package br.edu.infnet.appmanutencao.model.domain;

public class Motor{
	
	public String cilindro;
	public double tamanho;
	public String combustivel;
	
	@Override
	public String toString() {
		return "Motor [cilindro=" + cilindro + ", tamanho=" + tamanho + ", combustivel=" + combustivel + "]";
	}
	
	
}
