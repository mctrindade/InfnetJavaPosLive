package br.edu.infnet.appmanutencao.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appmanutencao.model.domain.Cliente;
import br.edu.infnet.appmanutencao.model.test.AppImpressao;

@Controller
public class ClienteController {
	
	private static Map<Integer, Cliente> mapCliente = new HashMap<>();
	
	private static Integer id = 1;
	
	public static void incluir(Cliente cliente) {
		cliente.setId(id++);
		
		mapCliente.put(cliente.getId(), cliente);
		
		AppImpressao.relatorio("Inclusao cliente "+ cliente.getNome()+ " realizada com sucesso!!", cliente);
	}
	
	public static void excluir(Integer id) {
		mapCliente.remove(id);
	}
	
	public static Collection<Cliente> obterLista(){
		return mapCliente.values();
	}
	
	@GetMapping(value = "/cliente/lista")
	public String telaHome(Model model) {
		
		model.addAttribute("listagem", obterLista());
		
		return "cliente/lista";
	}
	
	@GetMapping(value = "/cliente/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		excluir(id);
		
		return "redirect:/cliente/lista";
	}
}
