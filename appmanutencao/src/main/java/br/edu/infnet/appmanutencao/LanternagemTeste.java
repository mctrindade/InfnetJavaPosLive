package br.edu.infnet.appmanutencao;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmanutencao.controller.LanternagemController;
import br.edu.infnet.appmanutencao.model.domain.Lanternagem;

@Component
public class LanternagemTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Lanternagem");
		
		Lanternagem l1 = new Lanternagem();
		l1.setDescricao("Servico 1");
		l1.setSituacao(1);
		l1.setValor(101);
		l1.setCor("azul");
		l1.setLocal("porta do motorista");
		l1.setValorReparo(23);
		LanternagemController.incluir(l1);
		
		Lanternagem l2 = new Lanternagem();
		l2.setDescricao("Servico 2");
		l2.setSituacao(2);
		l2.setValor(102);
		l2.setCor("vermelho");
		l2.setLocal("capuz");
		l2.setValorReparo(12);
		LanternagemController.incluir(l2);
		
		Lanternagem l3 = new Lanternagem();
		l3.setDescricao("Servico 3");
		l3.setSituacao(3);
		l3.setValor(103);
		l3.setCor("verde");
		l3.setLocal("porta mala");
		l3.setValorReparo(3);
		LanternagemController.incluir(l3);
	}

}
