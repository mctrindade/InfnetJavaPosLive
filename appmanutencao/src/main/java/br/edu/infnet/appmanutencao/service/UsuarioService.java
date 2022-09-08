package br.edu.infnet.appmanutencao.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appmanutencao.model.domain.Usuario;
import br.edu.infnet.appmanutencao.model.test.AppImpressao;

@Service
public class UsuarioService {

	private static Map<String, Usuario> mapUsuario = new HashMap<>();

	public Usuario validar(String email, String senha) {
		Usuario usuario = mapUsuario.get(email);

		if (usuario != null && senha.equals(usuario.getSenha())) {
			return usuario;
		}

		return null;
	}

	public void incluir(Usuario usuario) {

		mapUsuario.put(usuario.getEmail(), usuario);

		AppImpressao.relatorio("Inclusao usuario " + usuario.getNome() + " realizada com sucesso!!", usuario);
	}

	public void excluir(String email) {
		mapUsuario.remove(email);
	}
	
	public Collection<Usuario> obterLista(){
		return mapUsuario.values();
	}

}
