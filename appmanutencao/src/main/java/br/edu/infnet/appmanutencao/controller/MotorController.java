package br.edu.infnet.appmanutencao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MotorController {
	
	@GetMapping(value = "/motor/lista")
	public String telaHome() {
		return "motor/lista";
	}
		
}
