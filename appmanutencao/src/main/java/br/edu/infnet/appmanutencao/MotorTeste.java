package br.edu.infnet.appmanutencao;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmanutencao.controller.MotorController;
import br.edu.infnet.appmanutencao.model.domain.Motor;
import br.edu.infnet.appmanutencao.model.domain.exceptions.TamanhoMotorFracoException;

@Component
public class MotorTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) {
		System.out.println("#Motor");
		try {
			Motor m1 = new Motor();
			m1.setDescricao("Servico 1");
			m1.setSituacao(1);
			m1.setValor(101);
			m1.setCilindro("em linha");
			m1.setTamanho(1.4d);
			m1.setCombustivel("gasolina");
			System.out.println("Calculo de venda: " + m1.calcularVenda());
			MotorController.incluir(m1);
		} catch (TamanhoMotorFracoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Motor m2 = new Motor();
			m2.setDescricao("Servico 2");
			m2.setSituacao(2);
			m2.setValor(102);
			m2.setCilindro("em V");
			m2.setTamanho(1.8d);
			m2.setCombustivel("alcool");
			System.out.println("Calculo de venda: " + m2.calcularVenda());
			MotorController.incluir(m2);
		} catch (TamanhoMotorFracoException e) {
			System.out.println("[ERROR - MOTOR] " + e.getMessage());
		}

		try {
			Motor m3 = new Motor();
			m3.setDescricao("Servico 3");
			m3.setSituacao(3);
			m3.setValor(103);
			m3.setCilindro("radial");
			m3.setTamanho(2.0d);
			m3.setCombustivel("gasolina/alcool");
			System.out.println("Calculo de venda: " + m3.calcularVenda());
			MotorController.incluir(m3);
		} catch (TamanhoMotorFracoException e) {
			System.out.println("[ERROR - MOTOR] " + e.getMessage());
		}
		
		try {
			Motor m4 = new Motor();
			m4.setDescricao("Servico 4");
			m4.setSituacao(3);
			m4.setValor(104);
			m4.setCilindro("radial");
			m4.setTamanho(1.0d);
			m4.setCombustivel("gasolina/alcool");
			System.out.println("Calculo de venda: " + m4.calcularVenda());
			MotorController.incluir(m4);
		} catch (TamanhoMotorFracoException e) {
			System.out.println("[ERROR - MOTOR] " + e.getMessage());
		}
	}

}
