package br.edu.infnet.appmanutencao.model.test;

import br.edu.infnet.appmanutencao.model.domain.Servico;

public class AppManutencao {
	
	private String mensagem;
	
	public AppManutencao(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public void relatorio(Servico servico) {
		System.out.println(mensagem);
		
		servico.impressao();
	}
	
}
