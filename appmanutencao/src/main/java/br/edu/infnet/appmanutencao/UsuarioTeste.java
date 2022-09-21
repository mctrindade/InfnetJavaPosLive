package br.edu.infnet.appmanutencao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmanutencao.model.domain.Usuario;
import br.edu.infnet.appmanutencao.service.UsuarioService;

@Component
@Order(1)
public class UsuarioTeste implements ApplicationRunner {

	@Autowired
	private UsuarioService usuarioService;

	private Usuario usuario;
	
	@Override
	public void run(ApplicationArguments args) {
		usuario = new Usuario();
		usuario.setEmail("marcos@gmail.com");
		usuario.setNome("Marcos");
		usuario.setSenha("123456");
		usuarioService.incluir(usuario);

		String dir = "d:/Temp/";
		String arq = "usuario.txt";

		try {
			FileReader fileReader = new FileReader(dir + arq);
			BufferedReader leitura = new BufferedReader(fileReader);

			String linha = leitura.readLine();
			while (linha != null) {
				String[] campos = linha.split(";");
				usuario = new Usuario();
				usuario.setEmail(campos[0]);
				usuario.setNome(campos[1]);
				usuario.setSenha(campos[2]);
				usuarioService.incluir(usuario);
				linha = leitura.readLine();
			}
			leitura.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("[ERRO] o arquivo não existe");
		} catch (IOException e) {
			System.out.println("[ERRO] o arquivo não existe");
			e.printStackTrace();
		} finally {
			System.out.println("Terminou!!");
		}
	}

}
