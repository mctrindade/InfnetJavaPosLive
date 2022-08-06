package br.edu.infnet.appmanutencao.model.domain;

public class Cliente {
	
	public String nome;
	public String cpf;
	public String telefone;
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + "]";
	}
}
