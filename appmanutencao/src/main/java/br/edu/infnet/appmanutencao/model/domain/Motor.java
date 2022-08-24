package br.edu.infnet.appmanutencao.model.domain;

public class Motor extends Servico{
	
	private Integer id;
	private String cilindro;
	private double tamanho;
	private String combustivel;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCilindro() {
		return cilindro;
	}

	public void setCilindro(String cilindro) {
		this.cilindro = cilindro;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	@Override
	public String toString() {
		return "Motor [id= "+ id +", cilindro=" + cilindro + ", tamanho=" + tamanho + ", combustivel=" + combustivel + super.toString() + "]";
	}

	@Override
	public void impressao() {
		System.out.println("#motor");
		System.out.println(this);
	}

	@Override
	public float calcularVenda() {
		return getValor() *2;
	}
	
	
}
