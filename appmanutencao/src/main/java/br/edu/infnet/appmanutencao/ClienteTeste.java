package br.edu.infnet.appmanutencao;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmanutencao.model.domain.Cliente;
import br.edu.infnet.appmanutencao.model.test.AppImpressao;

@Component
public class ClienteTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Cliente");
		
		Cliente m1 = new Cliente("Cliente1","12345678910","32170000");
		AppImpressao.relatorio("Inclusão cliente 1", m1);
		
		Cliente m2 = new Cliente("Cliente2","12345678911","32170001");
		AppImpressao.relatorio("Inclusão cliente 2", m2);
		
		Cliente m3 = new Cliente("Cliente3","12345678912","32170002");
		AppImpressao.relatorio("Inclusão cliente 3", m3);
	}

}
