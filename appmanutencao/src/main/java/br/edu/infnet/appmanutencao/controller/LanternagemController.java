package br.edu.infnet.appmanutencao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LanternagemController {
	
	@GetMapping(value = "/lanternagem/lista")
	public String telaHome() {
		return "lanternagem/lista";
	}
		
}
