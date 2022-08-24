package br.edu.infnet.appmanutencao;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmanutencao.controller.ClienteController;
import br.edu.infnet.appmanutencao.model.domain.Cliente;

@Component
public class ClienteTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) {
		System.out.println("#Cliente");
		try {
			Cliente m1 = new Cliente("Cliente1", "12345678910", "32170000");
			ClienteController.incluir(m1);
		} catch (Exception e) {
			System.out.println("[ERRO - CLIENTE] " + e.getMessage());
		}
		try {
			Cliente m2 = new Cliente("Cliente2", "12345678911", "32170001");
			ClienteController.incluir(m2);
		} catch (Exception e) {
			System.out.println("[ERRO - CLIENTE] " + e.getMessage());
		}
		try {
			Cliente m3 = new Cliente("Cliente3", "12345678912", "32170002");
			ClienteController.incluir(m3);
		} catch (Exception e) {
			System.out.println("[ERRO - CLIENTE] " + e.getMessage());
		}
		try {
			Cliente m4 = new Cliente("Cliente4", "", "32170002");
			ClienteController.incluir(m4);
		} catch (Exception e) {
			System.out.println("[ERRO - CLIENTE] " + e.getMessage());
		}
		try {
			Cliente m5 = new Cliente("Cliente5", null, "32170002");
			ClienteController.incluir(m5);
		} catch (Exception e) {
			System.out.println("[ERRO - CLIENTE] " + e.getMessage());
		}
	}

}
