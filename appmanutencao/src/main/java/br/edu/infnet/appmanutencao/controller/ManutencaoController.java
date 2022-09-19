package br.edu.infnet.appmanutencao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appmanutencao.model.domain.Manutencao;
import br.edu.infnet.appmanutencao.service.ClienteService;
import br.edu.infnet.appmanutencao.service.ManutencaoService;
import br.edu.infnet.appmanutencao.service.ServicoService;

@Controller
public class ManutencaoController {
	
	@Autowired
	private ManutencaoService manutencaoService;
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private ServicoService servicoService;
	
	@GetMapping(value = "/manutencao/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", manutencaoService.obterLista());
		
		return "manutencao/lista";
	}
	
	@GetMapping(value = "/manutencao")
	public String telaCadastro(Model model) {
		model.addAttribute("clientes", clienteService.obterLista());
		model.addAttribute("servicos", servicoService.obterLista());
		return "manutencao/cadastro";
	}
	
	@PostMapping(value = "/manutencao/incluir")
	public String incluir() {
		//manutencaoService.incluir(manutencao);
		return "redirect:/";
	}
	
	@GetMapping(value = "/manutencao/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		manutencaoService.excluir(id);
		
		return "redirect:/manutencao/lista";
	}	
}
