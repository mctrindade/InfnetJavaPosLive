package br.edu.infnet.appmanutencao;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmanutencao.controller.MotorController;
import br.edu.infnet.appmanutencao.model.domain.Motor;

@Component
public class MotorTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Motor");
		
		Motor m1 = new Motor();
		m1.setDescricao("Servico 1");
		m1.setSituacao(1);
		m1.setValor(101);
		m1.setCilindro("em linha");
		m1.setTamanho(1.4d);
		m1.setCombustivel("gasolina");
		MotorController.incluir(m1);
		
		Motor m2 = new Motor();
		m2.setDescricao("Servico 2");
		m2.setSituacao(2);
		m2.setValor(102);
		m2.setCilindro("em V");
		m2.setTamanho(1.8d);
		m2.setCombustivel("alcool");
		MotorController.incluir(m2);
		
		Motor m3 = new Motor();
		m3.setDescricao("Servico 3");
		m3.setSituacao(3);
		m3.setValor(103);
		m3.setCilindro("radial");
		m3.setTamanho(2.0d);
		m3.setCombustivel("gasolina/alcool");
		MotorController.incluir(m3);
	}

}
