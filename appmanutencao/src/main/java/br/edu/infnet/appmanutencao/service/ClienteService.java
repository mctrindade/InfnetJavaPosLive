package br.edu.infnet.appmanutencao.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appmanutencao.model.domain.Cliente;
import br.edu.infnet.appmanutencao.model.domain.Usuario;
import br.edu.infnet.appmanutencao.model.domain.repository.ClienteRepository;
import br.edu.infnet.appmanutencao.model.test.AppImpressao;

@Service
public class ClienteService {
	
	@Autowired				
	private ClienteRepository clienteRepository;
	
	public void incluir(Cliente cliente) {
		
		clienteRepository.save(cliente);
		
		AppImpressao.relatorio("Inclusao cliente " + cliente.getNome() + " realizada com sucesso!!", cliente);
	}

	public void excluir(Integer id) {
		
		clienteRepository.deleteById(id);
	}

	public Collection<Cliente> obterLista() {
		return (Collection<Cliente>) clienteRepository.findAll();
	}
	
	public Collection<Cliente> obterLista(Usuario usuario) {
		return clienteRepository.obterLista(usuario.getId());
	}

}
