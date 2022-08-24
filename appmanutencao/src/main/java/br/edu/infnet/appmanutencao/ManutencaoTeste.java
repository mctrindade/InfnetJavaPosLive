package br.edu.infnet.appmanutencao;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmanutencao.controller.ManutencaoController;
import br.edu.infnet.appmanutencao.model.domain.Cliente;
import br.edu.infnet.appmanutencao.model.domain.Lanternagem;
import br.edu.infnet.appmanutencao.model.domain.Manutencao;
import br.edu.infnet.appmanutencao.model.domain.Motor;
import br.edu.infnet.appmanutencao.model.domain.Servico;
import br.edu.infnet.appmanutencao.model.domain.Suspensao;

@Component
public class ManutencaoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Manutencao");
		
		Lanternagem la = new Lanternagem();
		la.setDescricao("Servico 1");
		la.setSituacao(1);
		la.setValor(101);
		la.setCor("azul");
		la.setLocal("porta do motorista");
		la.setValorReparo(23);
		
		Lanternagem la2 = new Lanternagem();
		la2.setDescricao("Servico 1");
		la2.setSituacao(2);
		la2.setValor(101);
		la2.setCor("azul");
		la2.setLocal("porta do motorista");
		la2.setValorReparo(23);
		
		Motor mo = new Motor();
		mo.setDescricao("Servico 1");
		mo.setSituacao(1);
		mo.setValor(101);
		mo.setCilindro("em linha");
		mo.setTamanho(1.4d);
		mo.setCombustivel("gasolina");
		
		Suspensao su = new Suspensao();
		su.setDescricao("Servico 1");
		su.setSituacao(1);
		su.setValor(101);
		su.setAmortecedor("dianteiro");
		su.setMola("helicoidais");
		su.setPneu(15);
		
		Set<Servico> listaServicoM1 = new HashSet<>();
		listaServicoM1.add(la2);
		listaServicoM1.add(la);
		listaServicoM1.add(mo);
		listaServicoM1.add(la2);
		listaServicoM1.add(su);
		
		Cliente c1 = new Cliente("Cliente1","12345678910","32170000");
		
		Manutencao m1 = new Manutencao(c1);
		m1.setBox(1);
		m1.setPlaca("JKO-0001");
		m1.setServicos(listaServicoM1);
		ManutencaoController.incluir(m1);
		
		Set<Servico> listaServicoM2 = new HashSet<>();
		listaServicoM2.add(su);
		
		Cliente c2 = new Cliente("Cliente2","12345678911","32170001");
		
		Manutencao m2 = new Manutencao(c2);
		m2.setBox(2);
		m2.setPlaca("JKO-0002");
		m2.setServicos(listaServicoM2);
		ManutencaoController.incluir(m2);
		
		
		Set<Servico> listaServicoM3 = new HashSet<>();
		listaServicoM3.add(la);
		listaServicoM3.add(mo);
		listaServicoM3.add(su);
		
		Cliente c3 = new Cliente("Cliente3","12345678912","32170002");
		
		Manutencao m3 = new Manutencao(c3);
		m3.setBox(3);
		m3.setPlaca("JKO-0003");
		m3.setServicos(listaServicoM3);
		ManutencaoController.incluir(m3);
	}

}
