package br.edu.infnet.appmanutencao.model.domain;

import br.edu.infnet.appmanutencao.interfaces.IPrinter;

public class Cliente implements IPrinter {
	
	private String nome;
	private String cpf;
	private String telefone;
	
	public Cliente(String nome, String cpf, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + "]";
	}

	@Override
	public void impressao() {
		System.out.println("#cliente");
		System.out.println(this);
		
	}
}
