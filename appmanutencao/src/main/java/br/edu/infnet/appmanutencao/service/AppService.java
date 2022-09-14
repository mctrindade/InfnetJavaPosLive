package br.edu.infnet.appmanutencao.service;

import org.springframework.stereotype.Service;

import br.edu.infnet.appmanutencao.model.domain.app.Projeto;
import br.edu.infnet.appmanutencao.model.test.AppImpressao;

@Service
public class AppService {
	
	private Projeto projeto;
	
	public void incluir(Projeto projeto) {
		this.projeto = projeto;
		
		AppImpressao.relatorio("Exibição do projeto "+ projeto.getNome()+" realizado com sucesso!!", projeto);
	}
	
	public Projeto obterProjeto() {
		return projeto;
	}
	
}
