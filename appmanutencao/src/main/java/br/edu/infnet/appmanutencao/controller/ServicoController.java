package br.edu.infnet.appmanutencao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appmanutencao.model.domain.Usuario;
import br.edu.infnet.appmanutencao.service.ServicoService;

@Controller
public class ServicoController {
	
	@Autowired
	private ServicoService servicoService;
		
	@GetMapping(value = "/servico/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("listagem", servicoService.obterLista(usuario));
		
		return "servico/lista";
	}
	
	@GetMapping(value = "/servico")
	public String telaCadastro(Model model) {
		return "servico/cadastro";
	}
	
	@GetMapping(value = "/servico/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		servicoService.excluir(id);
		
		return "redirect:/servico/lista";
	}
	
	/*
	@PostMapping(value = "/motor/incluir")
	public String incluir(Motor motor, @SessionAttribute("user") Usuario usuario) {
		motor.setUsuario(usuario);
		servicoService.incluir(motor);
		return "redirect:/";
	}
	
	
		
	*/
}
