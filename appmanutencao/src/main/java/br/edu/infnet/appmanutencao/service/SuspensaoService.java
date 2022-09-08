package br.edu.infnet.appmanutencao.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appmanutencao.model.domain.Suspensao;
import br.edu.infnet.appmanutencao.model.test.AppImpressao;

@Service
public class SuspensaoService {

	private static Map<Integer, Suspensao> mapSuspensao = new HashMap<>();
	private static Integer id = 1;
	
	public void incluir(Suspensao suspensao) {
		suspensao.setId(id++);
		
		mapSuspensao.put(suspensao.getId(), suspensao);
		
		AppImpressao.relatorio("Inclusao suspensão "+ suspensao.getDescricao()+ " realizada com sucesso!!", suspensao);
	}
	
	public void excluir(Integer id) {
		mapSuspensao.remove(id);
	}
	
	public Collection<Suspensao> obterLista(){
		return mapSuspensao.values();
	}
}
