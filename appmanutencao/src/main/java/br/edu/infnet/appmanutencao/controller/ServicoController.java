package br.edu.infnet.appmanutencao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServicoController {
	
	@GetMapping(value = "/servico/lista")
	public String telaHome() {
		return "servico/lista";
	}
		
}
