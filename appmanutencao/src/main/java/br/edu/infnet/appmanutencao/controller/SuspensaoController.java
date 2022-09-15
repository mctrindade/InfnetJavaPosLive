package br.edu.infnet.appmanutencao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appmanutencao.model.domain.Suspensao;
import br.edu.infnet.appmanutencao.service.SuspensaoService;

@Controller
public class SuspensaoController {
	
	@Autowired
	private SuspensaoService suspensaoService;
	
	@GetMapping(value = "/suspensao/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", suspensaoService.obterLista());
		
		return "suspensao/lista";
	}
	
	@GetMapping(value = "/suspensao")
	public String telaCadastro(Model model) {
		return "suspensao/cadastro";
	}
	
	@PostMapping(value = "/suspensao/incluir")
	public String incluir(Suspensao suspensao) {
		suspensaoService.incluir(suspensao);
		return "redirect:/";
	}
	
	@GetMapping(value = "/suspensao/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		suspensaoService.excluir(id);
		return "redirect:/suspensao/lista";
	}
}
