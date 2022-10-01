package br.edu.infnet.appmanutencao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appmanutencao.model.domain.Manutencao;
import br.edu.infnet.appmanutencao.model.domain.Usuario;
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
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("listagem", manutencaoService.obterLista(usuario));
		
		return "manutencao/lista";
	}
	
	@GetMapping(value = "/manutencao")
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("clientes", clienteService.obterLista(usuario));
		model.addAttribute("servicos", servicoService.obterLista(usuario));
		return "manutencao/cadastro";
	}
	
	@PostMapping(value = "/manutencao/incluir")
	public String incluir(Manutencao manutencao, @SessionAttribute("user") Usuario usuario) {
		manutencao.setUsuario(usuario);
		manutencaoService.incluir(manutencao);
		return "redirect:/manutencao/lista";
	}
	
	@GetMapping(value = "/manutencao/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		try {
			manutencaoService.excluir(id);
		} catch (Exception ex) {
			System.out.println("[ERRO] " + ex.getMessage());
		}
		return "redirect:/manutencao/lista";
	}	
}
