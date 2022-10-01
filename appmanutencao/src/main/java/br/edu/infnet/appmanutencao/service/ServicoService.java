package br.edu.infnet.appmanutencao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appmanutencao.model.domain.Servico;
import br.edu.infnet.appmanutencao.model.domain.Usuario;
import br.edu.infnet.appmanutencao.model.domain.repository.ServicoRepository;

@Service
public class ServicoService {

	@Autowired
	ServicoRepository servicoRepository;
	
	public List<Servico> obterLista() {
		return (List<Servico>) servicoRepository.findAll();
	}

	public List<Servico> obterLista(Usuario usuario) {
		return (List<Servico>) servicoRepository.findAll(usuario.getId());
	}

	public void excluir(Integer id) {
		servicoRepository.existsById(id);
	}
}
