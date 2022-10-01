package br.edu.infnet.appmanutencao.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appmanutencao.model.domain.Suspensao;
import br.edu.infnet.appmanutencao.model.domain.Usuario;
import br.edu.infnet.appmanutencao.model.domain.repository.SuspensaoRepository;
import br.edu.infnet.appmanutencao.model.test.AppImpressao;

@Service
public class SuspensaoService {
	
	@Autowired
	private SuspensaoRepository suspensaoRepository;
	
	public void incluir(Suspensao suspensao) {
		suspensaoRepository.save(suspensao);
		
		AppImpressao.relatorio("Inclusao suspensão "+ suspensao.getDescricao()+ " realizada com sucesso!!", suspensao);
	}
	
	public void excluir(Integer id) {
		suspensaoRepository.deleteById(id);
	}
	
	public Collection<Suspensao> obterLista(){
		return (Collection<Suspensao>) suspensaoRepository.findAll();
	}
	
	public Collection<Suspensao> obterLista(Usuario usuario){
		return (Collection<Suspensao>) suspensaoRepository.findAll(usuario.getId());
	}
}
