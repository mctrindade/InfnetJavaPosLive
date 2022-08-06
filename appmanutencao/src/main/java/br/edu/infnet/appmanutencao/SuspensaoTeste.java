package br.edu.infnet.appmanutencao;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmanutencao.model.domain.Suspensao;

@Component
public class SuspensaoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Suspensao");
		
		Suspensao s1 = new Suspensao();
		s1.amortecedor = "dianteiro";
		s1.mola = "helicoidais";
		s1.pneu = 15;
		System.out.println(s1);
		
		Suspensao s2 = new Suspensao();
		s2.amortecedor = "traseiro";
		s2.mola = "flexão";
		s2.pneu = 16;
		System.out.println(s2);
		
		Suspensao s3 = new Suspensao();
		s3.amortecedor = "dianteiro";
		s3.mola = "dianteiflexãora";
		s3.pneu = 18;
		System.out.println(s3);
	}

}
