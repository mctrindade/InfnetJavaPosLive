package br.edu.infnet.appmanutencao.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appmanutencao.model.domain.Usuario;
import br.edu.infnet.appmanutencao.model.test.AppImpressao;

@Controller
public class UsuarioController {
	
	private static Map<String, Usuario> mapUsuario = new HashMap<>();
	
	public static Usuario validar(String email, String senha) {
		Usuario usuario = mapUsuario.get(email);
		
		if(usuario != null && senha.equals(usuario.getSenha())) {
			return usuario;
		}
		
		return null;
	}
	
	public static void incluir(Usuario usuario) {
		
		mapUsuario.put(usuario.getEmail(), usuario);
		
		AppImpressao.relatorio("Inclusao usuario "+ usuario.getNome()+ " realizada com sucesso!!", usuario);
	}
	
	public static void excluir(String email) {
		mapUsuario.remove(email);
	}
	
	public static Collection<Usuario> obterLista(){
		return mapUsuario.values();
	}
	
	@GetMapping(value = "/usuario/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", obterLista());
		
		return "usuario/lista";
	}
	
	@GetMapping(value = "/usuario")
	public String telaCadastro(Model model) {
		return "usuario/cadastro";
	}
	
	@PostMapping(value = "/usuario/incluir")
	public String incluisao(Usuario usuario) {
		incluir(usuario);
		return "redirect:/";
	}
	
	@GetMapping(value = "/usuario/{email}/excluir")
	public String exclusao(@PathVariable String email) {
		
		excluir(email);
		
		return "redirect:/usuario/lista";
	}

}
