package br.edu.infnet.appmanutencao.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appmanutencao.model.domain.Lanternagem;
import br.edu.infnet.appmanutencao.model.test.AppImpressao;

@Controller
public class LanternagemController {
	
	private static Map<Integer, Lanternagem> mapLanternagem = new HashMap<>();
	private static Integer id = 1;
	
	public static void incluir(Lanternagem lanternagem) {
		lanternagem.setId(id++);
		
		mapLanternagem.put(lanternagem.getId(), lanternagem);
		
		AppImpressao.relatorio("Inclusao lanternagem "+ lanternagem.getDescricao()+ " realizada com sucesso!!", lanternagem);
	}
	
	public static void excluir(Integer id) {
		mapLanternagem.remove(id);
	}
	
	public static Collection<Lanternagem> obterLista(){
		return mapLanternagem.values();
	}
	
	@GetMapping(value = "/lanternagem/lista")
	public String telaHome(Model model) {
		
		model.addAttribute("listagem", obterLista());
		
		return "lanternagem/lista";
	}
	
	@GetMapping(value = "/lanternagem/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		excluir(id);
		
		return "redirect:/lanternagem/lista";
	}
}
