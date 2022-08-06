package br.edu.infnet.appmanutencao;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmanutencao.model.domain.Motor;

@Component
public class MotorTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Motor");
		
		Motor m1 = new Motor();
		m1.cilindro = "em linha";
		m1.tamanho = 1.4d;
		m1.combustivel = "gasolina";
		System.out.println(m1);
		
		Motor m2 = new Motor();
		m2.cilindro = "em V";
		m2.tamanho = 1.8d;
		m2.combustivel = "alcool";
		System.out.println(m2);
		
		Motor m3 = new Motor();
		m3.cilindro = "radial";
		m3.tamanho = 2.0d;
		m3.combustivel = "gasolina/alcool";
		System.out.println(m3);
	}

}
