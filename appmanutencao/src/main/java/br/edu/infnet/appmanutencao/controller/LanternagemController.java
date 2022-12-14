package br.edu.infnet.appmanutencao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appmanutencao.model.domain.Lanternagem;
import br.edu.infnet.appmanutencao.model.domain.Usuario;
import br.edu.infnet.appmanutencao.service.LanternagemService;

@Controller
public class LanternagemController {
	
	@Autowired
	private LanternagemService lanternagemService;
	
	@GetMapping(value = "/lanternagem/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("listagem", lanternagemService.obterLista(usuario));
		
		return "lanternagem/lista";
	}
	
	@GetMapping(value = "/lanternagem")
	public String telaCadastro(Model model) {
		return "lanternagem/cadastro";
	}
	
	@PostMapping(value = "/lanternagem/incluir")
	public String incluir(Lanternagem lanternagem, @SessionAttribute("user") Usuario usuario) {
		lanternagem.setUsuario(usuario);
		lanternagemService.incluir(lanternagem);
		return "redirect:/";
	}
	
	@GetMapping(value = "/lanternagem/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		lanternagemService.excluir(id);
		
		return "redirect:/lanternagem/lista";
	}
}
