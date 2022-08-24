package br.edu.infnet.appmanutencao;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmanutencao.controller.LanternagemController;
import br.edu.infnet.appmanutencao.model.domain.Lanternagem;
import br.edu.infnet.appmanutencao.model.domain.exceptions.ValorReparoZeradoException;

@Component
public class LanternagemTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) {
		System.out.println("#Lanternagem");
		try {
			Lanternagem l1 = new Lanternagem();
			l1.setDescricao("Servico 1");
			l1.setSituacao(1);
			l1.setValor(101);
			l1.setCor("azul");
			l1.setLocal("porta do motorista");
			l1.setValorReparo(23);
			System.out.println("Calculo de venda: " + l1.calcularVenda());
			LanternagemController.incluir(l1);
		} catch (ValorReparoZeradoException e) {
			System.out.println("[ERROR - LANTERNAGEM] " + e.getMessage());
		}

		try {
			Lanternagem l2 = new Lanternagem();
			l2.setDescricao("Servico 2");
			l2.setSituacao(2);
			l2.setValor(102);
			l2.setCor("vermelho");
			l2.setLocal("capuz");
			l2.setValorReparo(12);
			System.out.println("Calculo de venda: " + l2.calcularVenda());
			LanternagemController.incluir(l2);
		} catch (ValorReparoZeradoException e) {
			System.out.println("[ERROR - LANTERNAGEM] " + e.getMessage());
		}

		try {
			Lanternagem l3 = new Lanternagem();
			l3.setDescricao("Servico 3");
			l3.setSituacao(3);
			l3.setValor(103);
			l3.setCor("verde");
			l3.setLocal("porta mala");
			l3.setValorReparo(-1);
			System.out.println("Calculo de venda: " + l3.calcularVenda());
			LanternagemController.incluir(l3);
		} catch (ValorReparoZeradoException e) {
			System.out.println("[ERROR - LANTERNAGEM] " + e.getMessage());
		}
		
		try {
			Lanternagem l4 = new Lanternagem();
			l4.setDescricao("Servico 4");
			l4.setSituacao(3);
			l4.setValor(103);
			l4.setCor("verde");
			l4.setLocal("porta mala");
			l4.setValorReparo(-3);
			System.out.println("Calculo de venda: " + l4.calcularVenda());
			LanternagemController.incluir(l4);
		} catch (ValorReparoZeradoException e) {
			System.out.println("[ERROR - LANTERNAGEM] " + e.getMessage());
		}
	}

}
