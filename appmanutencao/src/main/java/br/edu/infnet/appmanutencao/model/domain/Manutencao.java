package br.edu.infnet.appmanutencao.model.domain;

import java.time.LocalDate;
import java.util.Set;

import br.edu.infnet.appmanutencao.interfaces.IPrinter;

public class Manutencao implements IPrinter {
	
	private Integer id;
	private int box;
	private String placa;
	private LocalDate data;
	private Cliente cliente;
	private Set<Servico> servicos;
	
	public Manutencao(Cliente cliente) {
		this.data = LocalDate.now();
		this.cliente  = cliente;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
	
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Set<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(Set<Servico> servicos) {
		this.servicos = servicos;
	}

	@Override
	public String toString() {
		return "Manutencao [id="+id+", box=" + box + ", placa=" + placa + ", data=" + data +" "+ cliente + servicos.size()+ "]";
	}

	@Override
	public void impressao() {
		System.out.println("#manutencao");
		System.out.println(this);
	}
}
