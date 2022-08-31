package br.edu.infnet.appmanutencao.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appmanutencao.model.domain.Usuario;
import br.edu.infnet.appmanutencao.model.test.AppImpressao;

@Controller
public class UsuarioController {
	
	private static Map<String, Usuario> mapUsuario = new HashMap<>();
	
	public static void incluir(Usuario usuario) {
		
		mapUsuario.put(usuario.getEmail(), usuario);
		
		AppImpressao.relatorio("Inclusao usuario "+ usuario.getNome()+ " realizada com sucesso!!", usuario);
	}
	
	public static Collection<Usuario> obterLista(){
		return mapUsuario.values();
	}
	
	@GetMapping(value = "/usuario/lista")
	public String telaHome(Model model) {
		
		model.addAttribute("listagem", obterLista());
		
		return "usuario/lista";
	}

}
