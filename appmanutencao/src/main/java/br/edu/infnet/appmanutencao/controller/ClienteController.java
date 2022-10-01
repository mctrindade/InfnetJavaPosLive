package br.edu.infnet.appmanutencao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appmanutencao.model.domain.Cliente;
import br.edu.infnet.appmanutencao.model.domain.Usuario;
import br.edu.infnet.appmanutencao.service.ClienteService;

@Controller
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	private String msg;
	
	private String tipo;
	
	@GetMapping(value = "/cliente/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("listagem", clienteService.obterLista(usuario));
		
		model.addAttribute("mensagem", msg);
		
		model.addAttribute("tipo", tipo);
		
		return "cliente/lista";
	}
	
	@GetMapping(value = "/cliente")
	public String telaCadastro(Model model) {
		return "cliente/cadastro";
	}
	
	@PostMapping(value = "/cliente/incluir")
	public String incluir(Cliente cliente, @SessionAttribute("user") Usuario usuario) {
		cliente.setUsuario(usuario);
		clienteService.incluir(cliente);
		msg = "Inclusão de cliente "+ cliente.getNome() + " realizado com sucesso!!";
		tipo = "alert-success";
		return "redirect:/cliente/lista";
	}
	
	@GetMapping(value = "/cliente/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		try {
			clienteService.excluir(id);
			tipo = "alert-success";
			msg = "Exclusao de cliente "+ id + " realizado com sucesso!!";
		} catch (Exception ex) {
			tipo = "alert-danger";
			msg = "Impossível realizar a exclusao de cliente "+ id + "!!";
		}
		
		return "redirect:/cliente/lista";
	}
}
