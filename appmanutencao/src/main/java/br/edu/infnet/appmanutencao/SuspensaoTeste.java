package br.edu.infnet.appmanutencao;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmanutencao.controller.SuspensaoController;
import br.edu.infnet.appmanutencao.model.domain.Suspensao;
import br.edu.infnet.appmanutencao.model.domain.exceptions.TamanhoPneuInvalidoException;

@Component
public class SuspensaoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) {
		System.out.println("#Suspensao");
		
		try {
			Suspensao s1 = new Suspensao();
			s1.setDescricao("Servico 1");
			s1.setSituacao(1);
			s1.setValor(101);
			s1.setAmortecedor("dianteiro");
			s1.setMola("helicoidais");
			s1.setPneu(15);
			System.out.println("Calculo de venda: " + s1.calcularVenda());
			SuspensaoController.incluir(s1);
		} catch (TamanhoPneuInvalidoException e) {
			System.out.println("[ERROR - SUSPENSAO] " + e.getMessage());
		}
		
		try {
			Suspensao s2 = new Suspensao();
			s2.setDescricao("Servico 2");
			s2.setSituacao(2);
			s2.setValor(102);
			s2.setAmortecedor("traseiro");
			s2.setMola("flexão");
			s2.setPneu(13);
			System.out.println("Calculo de venda: " + s2.calcularVenda());
			SuspensaoController.incluir(s2);
		} catch (TamanhoPneuInvalidoException e) {
			System.out.println("[ERROR - SUSPENSAO] " + e.getMessage());
		}
		
		try {
			Suspensao s3 = new Suspensao();
			s3.setDescricao("Servico 3");
			s3.setSituacao(3);
			s3.setValor(103);
			s3.setAmortecedor("dianteiro");
			s3.setMola("dianteiflexora");
			s3.setPneu(18);
			System.out.println("Calculo de venda: " + s3.calcularVenda());
			SuspensaoController.incluir(s3);
		} catch (TamanhoPneuInvalidoException e) {
			System.out.println("[ERROR - SUSPENSAO] " + e.getMessage());
		}
		
		try {
			Suspensao s4 = new Suspensao();
			s4.setDescricao("Servico 4");
			s4.setSituacao(3);
			s4.setValor(103);
			s4.setAmortecedor("dianteiro");
			s4.setMola("dianteiflexora");
			s4.setPneu(13);
			System.out.println("Calculo de venda: " + s4.calcularVenda());
			SuspensaoController.incluir(s4);
		} catch (TamanhoPneuInvalidoException e) {
			System.out.println("[ERROR - SUSPENSAO] " + e.getMessage());
		}
	}

}
