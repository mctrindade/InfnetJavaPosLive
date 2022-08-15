package br.edu.infnet.appmanutencao;

import java.time.LocalDate;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmanutencao.model.domain.Manutencao;
import br.edu.infnet.appmanutencao.model.test.AppImpressao;

@Component
public class ManutencaoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Manutencao");
		
		Manutencao m1 = new Manutencao();
		m1.setBox(1);
		m1.setPlaca("JKO-0001");
		m1.setData(LocalDate.now());
		AppImpressao.relatorio("Inclusão manutencao 1", m1);
		
		Manutencao m2 = new Manutencao();
		m2.setBox(2);
		m2.setPlaca("JKO-0002");
		m1.setData(LocalDate.now());
		AppImpressao.relatorio("Inclusão manutencao 21", m2);
		
		Manutencao m3 = new Manutencao();
		m3.setBox(3);
		m3.setPlaca("JKO-0003");
		m1.setData(LocalDate.now());
		AppImpressao.relatorio("Inclusão manutencao 3", m3);
	}

}
