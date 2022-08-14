package br.edu.infnet.appmanutencao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SuspensaoController {
	
	@GetMapping(value = "/suspensao/lista")
	public String telaHome() {
		return "suspensao/lista";
	}
		
}
