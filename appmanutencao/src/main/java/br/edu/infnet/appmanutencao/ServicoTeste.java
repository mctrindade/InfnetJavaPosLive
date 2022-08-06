package br.edu.infnet.appmanutencao;

import java.math.BigDecimal;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmanutencao.model.domain.Servico;


@Component
public class ServicoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Servico");
		
		Servico s1 = new Servico();
		s1.descricao = "Servico 1";
		s1.tipo = 1;
		s1.valor = new BigDecimal("101");
		System.out.println(s1);
		
		Servico s2 = new Servico();
		s2.descricao = "Servico 2";
		s2.tipo = 2;
		s2.valor = new BigDecimal("102");
		System.out.println(s2);
		
		Servico s3 = new Servico();
		s3.descricao = "Servico 3";
		s3.tipo = 3;
		s3.valor = new BigDecimal("1032");
		System.out.println(s3);
	}

}
