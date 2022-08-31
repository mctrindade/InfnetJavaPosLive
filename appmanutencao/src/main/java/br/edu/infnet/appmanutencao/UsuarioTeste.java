package br.edu.infnet.appmanutencao;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmanutencao.controller.UsuarioController;
import br.edu.infnet.appmanutencao.model.domain.Usuario;

@Component
public class UsuarioTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) {

		Usuario u1 = new Usuario();
		u1.setEmail("marcos@gmail.com");
		u1.setNome("Marcos");
		u1.setSenha("123456");
		UsuarioController.incluir(u1);

	}

}
