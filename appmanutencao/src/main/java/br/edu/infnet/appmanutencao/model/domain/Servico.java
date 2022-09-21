package br.edu.infnet.appmanutencao.model.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import br.edu.infnet.appmanutencao.interfaces.IPrinter;
import br.edu.infnet.appmanutencao.model.domain.exceptions.TamanhoMotorFracoException;
import br.edu.infnet.appmanutencao.model.domain.exceptions.TamanhoPneuInvalidoException;
import br.edu.infnet.appmanutencao.model.domain.exceptions.ValorReparoZeradoException;

@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Servico implements IPrinter{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private int situacao;
	private float valor;
	
	public abstract float calcularVenda() throws TamanhoPneuInvalidoException, TamanhoMotorFracoException, ValorReparoZeradoException;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getSituacao() {
		return situacao;
	}

	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(descricao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Servico)) {
			return false;
		}
		Servico other = (Servico) obj;
		return Objects.equals(descricao, other.descricao);
	}

	@Override
	public String toString() {
		return "Servico [descricao=" + descricao + ", situacao=" + situacao + ", valor=" + valor + "]";
	}
}
