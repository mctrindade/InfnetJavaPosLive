package br.edu.infnet.appmanutencao.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appmanutencao.model.domain.Lanternagem;
import br.edu.infnet.appmanutencao.model.test.AppImpressao;

@Service
public class LanternagemService {
	
	private static Map<Integer, Lanternagem> mapLanternagem = new HashMap<>();
	private static Integer id = 1;
	
	public void incluir(Lanternagem lanternagem) {
		lanternagem.setId(id++);
		
		mapLanternagem.put(lanternagem.getId(), lanternagem);
		
		AppImpressao.relatorio("Inclusao lanternagem "+ lanternagem.getDescricao()+ " realizada com sucesso!!", lanternagem);
	}
	
	public void excluir(Integer id) {
		mapLanternagem.remove(id);
	}
	
	public Collection<Lanternagem> obterLista(){
		return mapLanternagem.values();
	}
	
	
}
