package br.edu.infnet.appmanutencao.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.edu.infnet.appmanutencao.model.domain.exceptions.TamanhoPneuInvalidoException;

@Entity
@Table
public class Suspensao extends Servico{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private int pneu;
	private String amortecedor;
	private String mola;
	
	@Override
	public float calcularVenda() throws TamanhoPneuInvalidoException {
		System.out.println("calcular venda - suspensao");
		
		if(pneu < 15) {
			throw new TamanhoPneuInvalidoException("Tamanho do pneu ("+ pneu + ") não pode ser menor que 15");
		}
		
		float valorAmortecedor = pneu == 18 ? 10:15;
		
		return getValor() * 2 +valorAmortecedor ;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getPneu() {
		return pneu;
	}

	public void setPneu(int pneu) {
		this.pneu = pneu;
	}

	public String getAmortecedor() {
		return amortecedor;
	}

	public void setAmortecedor(String amortecedor) {
		this.amortecedor = amortecedor;
	}

	public String getMola() {
		return mola;
	}

	public void setMola(String mola) {
		this.mola = mola;
	}

	@Override
	public String toString() {
		return "Suspensao [id= "+id+", pneu=" + pneu + ", amortecedor=" + amortecedor + ", mola=" + mola + super.toString() +"]";
	}
	
	@Override
	public void impressao() {
		System.out.println("#suspensao");
		System.out.println(this);
	}
}
