package br.edu.infnet.appmanutencao;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmanutencao.model.domain.Lanternagem;

@Component
public class LanternagemTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Lanternagem");
		
		Lanternagem l1 = new Lanternagem();
		l1.cor ="azul";
		l1.local = "porta do motorista";
		l1.reparo = "pintura";
		System.out.println(l1);
		
		Lanternagem l2 = new Lanternagem();
		l1.cor ="vermelho";
		l1.local = "capuz";
		l1.reparo = "verniz";
		System.out.println(l2);
		
		Lanternagem l3 = new Lanternagem();
		l1.cor ="verde";
		l1.local = "porta mala";
		l1.reparo = "alinhar";
		System.out.println(l3);
		
		
	}

}
