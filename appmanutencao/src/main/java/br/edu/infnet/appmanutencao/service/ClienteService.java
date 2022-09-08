package br.edu.infnet.appmanutencao.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appmanutencao.model.domain.Cliente;
import br.edu.infnet.appmanutencao.model.test.AppImpressao;

@Service
public class ClienteService {
	
private static Map<Integer, Cliente> mapCliente = new HashMap<>();
	
	private static Integer id = 1;
	
	public void incluir(Cliente cliente) {
		cliente.setId(id++);
		
		mapCliente.put(cliente.getId(), cliente);
		
		AppImpressao.relatorio("Inclusao cliente "+ cliente.getNome()+ " realizada com sucesso!!", cliente);
	}
	
	public void excluir(Integer id) {
		mapCliente.remove(id);
	}
	
	public Collection<Cliente> obterLista(){
		return mapCliente.values();
	}
	
}
