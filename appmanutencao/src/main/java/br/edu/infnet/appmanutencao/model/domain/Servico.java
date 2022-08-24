package br.edu.infnet.appmanutencao.model.domain;

import java.util.Objects;

import br.edu.infnet.appmanutencao.interfaces.IPrinter;
import br.edu.infnet.appmanutencao.model.domain.exceptions.TamanhoMotorFracoException;
import br.edu.infnet.appmanutencao.model.domain.exceptions.TamanhoPneuInvalidoException;
import br.edu.infnet.appmanutencao.model.domain.exceptions.ValorReparoZeradoException;

public abstract class Servico implements IPrinter{
	
	private String descricao;
	private int situacao;
	private float valor;
	
	public abstract float calcularVenda() throws TamanhoPneuInvalidoException, TamanhoMotorFracoException, ValorReparoZeradoException;
	
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
