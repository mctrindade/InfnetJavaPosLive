package br.edu.infnet.appmanutencao.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.edu.infnet.appmanutencao.model.domain.exceptions.ValorReparoZeradoException;

@Entity
@Table
public class Lanternagem extends Servico{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String cor;
	private String local;
	private float valorReparo;
	
	@Override
	public float calcularVenda() throws ValorReparoZeradoException {
		System.out.println("calcular venda - lanternagem");
		if(valorReparo < 0f) {
			throw new ValorReparoZeradoException("Valor do reparo ("+ valorReparo + ") não pode ser menor que 0");
		}
		float valorLanternagem = valorReparo * 2;
		
		return getValor() + valorLanternagem;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
	public float getValorReparo() {
		return valorReparo;
	}

	public void setValorReparo(float valorReparo) {
		this.valorReparo = valorReparo;
	}

	@Override
	public String toString() {
		return "Lanternagem [id="+ id+", cor=" + cor + ", local=" + local + ", valorReparo=" + valorReparo + super.toString() + "]";
	}

	@Override
	public void impressao() {
		System.out.println("#lanternagem");
		System.out.println(this);
	}
}
