package br.edu.infnet.appmanutencao.model.domain;

import java.time.LocalDate;

import br.edu.infnet.appmanutencao.interfaces.IPrinter;

public class Manutencao implements IPrinter {
	
	private int box;
	private String placa;
	private LocalDate data;
	
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

	@Override
	public String toString() {
		return "Manutencao [box=" + box + ", placa=" + placa + ", data=" + data + "]";
	}

	@Override
	public void impressao() {
		System.out.println("#manutencao");
		System.out.println(this);
		
	}
}
