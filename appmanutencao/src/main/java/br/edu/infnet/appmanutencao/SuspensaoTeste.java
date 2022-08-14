package br.edu.infnet.appmanutencao;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmanutencao.model.domain.Suspensao;
import br.edu.infnet.appmanutencao.model.test.AppManutencao;

@Component
public class SuspensaoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Suspensao");
		
		Suspensao s1 = new Suspensao();
		s1.setDescricao("Servico 1");
		s1.setTipo(1);
		s1.setValor(101);
		s1.setAmortecedor("dianteiro");
		s1.setMola("helicoidais");
		s1.setPneu(15);
		
		new AppManutencao("Inclusao suspensão 1").relatorio(s1);
		
		Suspensao s2 = new Suspensao();
		s2.setDescricao("Servico 2");
		s2.setTipo(2);
		s2.setValor(102);
		s2.setAmortecedor("traseiro");
		s2.setMola("flexão");
		s2.setPneu(16);
		
		new AppManutencao("Inclusao suspensão 2").relatorio(s2);
		
		Suspensao s3 = new Suspensao();
		s3.setDescricao("Servico 3");
		s3.setTipo(3);
		s3.setValor(103);
		s3.setAmortecedor("dianteiro");
		s3.setMola("dianteiflexora");
		s3.setPneu(18);
		
		new AppManutencao("Inclusao suspensão 3").relatorio(s3);
	}

}
