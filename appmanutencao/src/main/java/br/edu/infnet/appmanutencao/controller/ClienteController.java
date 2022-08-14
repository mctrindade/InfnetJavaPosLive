package br.edu.infnet.appmanutencao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {
	
	@GetMapping(value = "/cliente/lista")
	public String telaHome() {
		return "cliente/lista";
	}
		
}
