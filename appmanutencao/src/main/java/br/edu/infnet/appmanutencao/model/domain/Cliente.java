package br.edu.infnet.appmanutencao.model.domain;

import br.edu.infnet.appmanutencao.interfaces.IPrinter;
import br.edu.infnet.appmanutencao.model.domain.exceptions.CpfInvalidoException;

public class Cliente implements IPrinter {
	
	private Integer id;
	private String nome;
	private String cpf;
	private String telefone;
	
	public Cliente(String nome, String cpf, String telefone) throws CpfInvalidoException {
		this.nome = nome;
		
		if(cpf == null) {
			throw new CpfInvalidoException("Não é possível aceitar CPF nulo");
		}
		
		if(cpf.isEmpty()) {
			throw new CpfInvalidoException("Não é possível aceitar CPF sem preenchimento");
		}
		
		
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Cliente [id="+id+", nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + "]";
	}

	@Override
	public void impressao() {
		System.out.println("#cliente");
		System.out.println(this);
		
	}
}
