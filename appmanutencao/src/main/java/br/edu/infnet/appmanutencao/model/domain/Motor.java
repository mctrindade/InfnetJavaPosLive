package br.edu.infnet.appmanutencao.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.edu.infnet.appmanutencao.model.domain.exceptions.TamanhoMotorFracoException;

@Entity
@Table
public class Motor extends Servico{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	public float calcularVenda() throws TamanhoMotorFracoException {
		
		if(tamanho < 1.4f) {
			throw new TamanhoMotorFracoException("Tamanho do motor ("+ tamanho + ") não pode ser menor que 1.4");
		}
		Double tamanhoDobrado = tamanho * 2d;
		return getValor() * 2 + tamanhoDobrado.floatValue();
	}
	
	
}
