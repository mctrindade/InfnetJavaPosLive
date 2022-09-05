package br.edu.infnet.appmanutencao.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appmanutencao.model.domain.Manutencao;
import br.edu.infnet.appmanutencao.model.test.AppImpressao;

@Controller
public class ManutencaoController {
	
	private static Map<Integer, Manutencao> mapManutencao = new HashMap<>();
	private static Integer id = 1;
	
	public static void incluir(Manutencao manutencao) {
		manutencao.setId(id++);
		
		mapManutencao.put(manutencao.getId(), manutencao);
		
		AppImpressao.relatorio("Inclusao manutencao "+ manutencao.getPlaca()+ " realizada com sucesso!!", manutencao);
	}
	
	public static void excluir(Integer id) {
		mapManutencao.remove(id);
	}
	
	public static Collection<Manutencao> obterLista(){
		return mapManutencao.values();
	}
	
	@GetMapping(value = "/manutencao/lista")
	public String telaHome(Model model) {
		
		model.addAttribute("listagem", obterLista());
		
		return "manutencao/lista";
	}
	
	@GetMapping(value = "/manutencao")
	public String telaCadastro(Model model) {
		return "manutencao/cadastro";
	}
	
	@PostMapping(value = "/manutencao/incluir")
	public String incluisao(Manutencao manutencao) {
		incluir(manutencao);
		return "redirect:/";
	}
	
	@GetMapping(value = "/manutencao/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		excluir(id);
		
		return "redirect:/manutencao/lista";
	}	
}
