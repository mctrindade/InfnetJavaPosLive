package br.edu.infnet.appmanutencao.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appmanutencao.model.domain.Suspensao;
import br.edu.infnet.appmanutencao.model.test.AppImpressao;

@Controller
public class SuspensaoController {
	
	private static Map<Integer, Suspensao> mapSuspensao = new HashMap<>();
	private static Integer id = 1;
	
	public static void incluir(Suspensao suspensao) {
		suspensao.setId(id++);
		
		mapSuspensao.put(suspensao.getId(), suspensao);
		
		AppImpressao.relatorio("Inclusao suspensão "+ suspensao.getDescricao()+ " realizada com sucesso!!", suspensao);
	}
	
	public static void excluir(Integer id) {
		mapSuspensao.remove(id);
	}
	
	public static Collection<Suspensao> obterLista(){
		return mapSuspensao.values();
	}
	
	@GetMapping(value = "/suspensao/lista")
	public String telaHome(Model model) {
		
		model.addAttribute("listagem", obterLista());
		
		return "suspensao/lista";
	}
	
	@GetMapping(value = "/suspensao")
	public String telaCadastro(Model model) {
		return "suspensao/cadastro";
	}
	
	@PostMapping(value = "/suspensao/incluir")
	public String incluisao(Suspensao suspensao) {
		incluir(suspensao);
		return "redirect:/";
	}
	
	@GetMapping(value = "/suspensao/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:/suspensao/lista";
	}
}
