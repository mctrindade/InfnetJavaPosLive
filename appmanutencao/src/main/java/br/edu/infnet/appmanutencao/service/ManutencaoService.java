package br.edu.infnet.appmanutencao.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appmanutencao.model.domain.Manutencao;
import br.edu.infnet.appmanutencao.model.domain.Usuario;
import br.edu.infnet.appmanutencao.model.domain.repository.ManutencaoRepository;
import br.edu.infnet.appmanutencao.model.test.AppImpressao;

@Service
public class ManutencaoService {
	
	@Autowired
	private ManutencaoRepository manutencaoRepository;
	
	public void incluir(Manutencao manutencao) {
		manutencaoRepository.save(manutencao);
		
		AppImpressao.relatorio("Inclusao manutencao "+ manutencao.getPlaca()+ " realizada com sucesso!!", manutencao);
	}
	
	public void excluir(Integer id) {
		manutencaoRepository.deleteById(id);
	}
	
	public List<Manutencao> obterLista(){
		return (List<Manutencao>) manutencaoRepository.findAll();
	}
	
	public List<Manutencao> obterLista(Usuario usuario){
		return (List<Manutencao>) manutencaoRepository.findAll(usuario.getId());
	}
	
}
