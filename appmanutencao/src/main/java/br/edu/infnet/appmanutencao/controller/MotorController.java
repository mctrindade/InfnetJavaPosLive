package br.edu.infnet.appmanutencao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appmanutencao.model.domain.Motor;
import br.edu.infnet.appmanutencao.model.domain.Usuario;
import br.edu.infnet.appmanutencao.service.MotorService;

@Controller
public class MotorController {
	
	@Autowired
	private MotorService motorService;
	
	@GetMapping(value = "/motor/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("listagem", motorService.obterLista(usuario));
		
		return "motor/lista";
	}
	
	@GetMapping(value = "/motor")
	public String telaCadastro(Model model) {
		return "motor/cadastro";
	}
	
	@PostMapping(value = "/motor/incluir")
	public String incluir(Motor motor, @SessionAttribute("user") Usuario usuario) {
		motor.setUsuario(usuario);
		motorService.incluir(motor);
		return "redirect:/";
	}
	
	@GetMapping(value = "/motor/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		motorService.excluir(id);
		
		return "redirect:/motor/lista";
	}
}
