package br.edu.infnet.appmanutencao.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appmanutencao.model.domain.Motor;
import br.edu.infnet.appmanutencao.model.test.AppImpressao;

@Controller
public class MotorController {
	
	private static Map<Integer, Motor> mapMotor = new HashMap<>();
	private static Integer id = 1;
	
	public static void incluir(Motor motor) {
		motor.setId(id++);
		
		mapMotor.put(motor.getId(), motor);
		
		AppImpressao.relatorio("Inclusao motor "+ motor.getDescricao()+ " realizada com sucesso!!", motor);
	}
	
	public static void excluir(Integer id) {
		mapMotor.remove(id);
	}
	
	public static Collection<Motor> obterLista(){
		return mapMotor.values();
	}
	
	@GetMapping(value = "/motor/lista")
	public String telaHome(Model model) {
		
		model.addAttribute("listagem", obterLista());
		
		return "motor/lista";
	}
	
	@GetMapping(value = "/motor/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		excluir(id);
		
		return "redirect:/motor/lista";
	}
}
