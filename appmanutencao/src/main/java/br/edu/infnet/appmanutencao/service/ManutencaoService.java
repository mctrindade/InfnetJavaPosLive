package br.edu.infnet.appmanutencao.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appmanutencao.model.domain.Manutencao;
import br.edu.infnet.appmanutencao.model.test.AppImpressao;

@Service
public class ManutencaoService {
	
	private static Map<Integer, Manutencao> mapManutencao = new HashMap<>();
	private static Integer id = 1;
	
	public void incluir(Manutencao manutencao) {
		manutencao.setId(id++);
		
		mapManutencao.put(manutencao.getId(), manutencao);
		
		AppImpressao.relatorio("Inclusao manutencao "+ manutencao.getPlaca()+ " realizada com sucesso!!", manutencao);
	}
	
	public void excluir(Integer id) {
		mapManutencao.remove(id);
	}
	
	public Collection<Manutencao> obterLista(){
		return mapManutencao.values();
	}
	
}
