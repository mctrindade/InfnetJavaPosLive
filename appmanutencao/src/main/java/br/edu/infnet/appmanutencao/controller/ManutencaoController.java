package br.edu.infnet.appmanutencao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ManutencaoController {
	
	@GetMapping(value = "/manutencao/lista")
	public String telaHome() {
		return "manutencao/lista";
	}
		
}
