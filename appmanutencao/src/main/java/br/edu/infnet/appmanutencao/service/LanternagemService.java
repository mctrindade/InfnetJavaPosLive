package br.edu.infnet.appmanutencao.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appmanutencao.model.domain.Lanternagem;
import br.edu.infnet.appmanutencao.model.domain.Usuario;
import br.edu.infnet.appmanutencao.model.domain.repository.LanternagemRepository;
import br.edu.infnet.appmanutencao.model.test.AppImpressao;

@Service
public class LanternagemService {
	@Autowired
	private LanternagemRepository lanternagemRepository;
	
	public void incluir(Lanternagem lanternagem) {
		lanternagemRepository.save(lanternagem);
		
		AppImpressao.relatorio("Inclusao lanternagem "+ lanternagem.getDescricao()+ " realizada com sucesso!!", lanternagem);
	}
	
	public void excluir(Integer id) {
		lanternagemRepository.deleteById(id);
	}
	
	public Collection<Lanternagem> obterLista(){
		return (Collection<Lanternagem>) lanternagemRepository.findAll();
	}
	
	public Collection<Lanternagem> obterLista(Usuario usuario){
		return (Collection<Lanternagem>) lanternagemRepository.findAll(usuario.getId());
	}
	
	
}
