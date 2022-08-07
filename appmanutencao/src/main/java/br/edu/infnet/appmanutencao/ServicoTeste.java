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
		s1.setDescricao("Servico 1");
		s1.setTipo(1);
		s1.setValor(new BigDecimal("101"));
		System.out.println(s1);
		
		Servico s2 = new Servico();
		s2.setDescricao("Servico 2");
		s2.setTipo(2);
		s2.setValor(new BigDecimal("102"));
		System.out.println(s2);
		
		Servico s3 = new Servico();
		s3.setDescricao("Servico 3");
		s3.setTipo(3);
		s3.setValor(new BigDecimal("1032"));
		System.out.println(s3);
	}

}
