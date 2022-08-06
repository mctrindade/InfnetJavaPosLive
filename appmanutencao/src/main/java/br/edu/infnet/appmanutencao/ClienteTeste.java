package br.edu.infnet.appmanutencao;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmanutencao.model.domain.Cliente;

@Component
public class ClienteTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Cliente");
		
		Cliente m1 = new Cliente();
		m1.nome ="Cliente1";
		m1.cpf = "12345678910";
		m1.telefone = "32170000";
		System.out.println(m1);
		
		Cliente m2 = new Cliente();
		m2.nome ="Cliente2";
		m2.cpf = "12345678911";
		m2.telefone = "32170001";
		System.out.println(m2);
		
		Cliente m3 = new Cliente();
		m3.nome ="Cliente3";
		m3.cpf = "12345678912";
		m3.telefone = "32170001";
		System.out.println(m3);
	}

}
