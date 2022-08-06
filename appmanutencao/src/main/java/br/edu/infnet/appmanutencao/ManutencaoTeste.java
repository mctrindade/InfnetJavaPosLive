package br.edu.infnet.appmanutencao;

import java.math.BigDecimal;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmanutencao.model.domain.Manutencao;

@Component
public class ManutencaoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Manutencao");
		
		Manutencao m1 = new Manutencao();
		m1.box = 1;
		m1.placa = "JKO-0001";
		m1.valor = BigDecimal.ONE;
		System.out.println(m1);
		
		Manutencao m2 = new Manutencao();
		m2.box = 2;
		m2.placa = "JKO-0002";
		m2.valor = BigDecimal.ONE;
		System.out.println(m2);
		
		Manutencao m3 = new Manutencao();
		m3.box = 3;
		m3.placa = "JKO-0003";
		m3.valor = BigDecimal.ONE;
		System.out.println(m3);
	}

}
