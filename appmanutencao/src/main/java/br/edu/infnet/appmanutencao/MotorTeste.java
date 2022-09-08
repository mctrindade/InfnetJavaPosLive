package br.edu.infnet.appmanutencao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmanutencao.model.domain.Motor;
import br.edu.infnet.appmanutencao.model.domain.exceptions.TamanhoMotorFracoException;
import br.edu.infnet.appmanutencao.service.MotorService;

@Component
public class MotorTeste implements ApplicationRunner {
	
	@Autowired
	private MotorService motorService;
	
	@Override
	public void run(ApplicationArguments args) {

		String dir = "d:/Temp/";
		String arq = "motor.txt";
		
		try {
			FileReader fileReader= new FileReader(dir+arq);
			BufferedReader leitura = new BufferedReader(fileReader);

			String linha = leitura.readLine();
			while(linha != null) {
				try {
					String[] campos = linha.split(";");
					Motor m1 = new Motor();
					m1.setDescricao(campos[3]);
					m1.setSituacao(Integer.valueOf(campos[4]));
					m1.setValor(Float.valueOf(campos[5]));
					m1.setCilindro(campos[0]);
					m1.setTamanho(Double.valueOf(campos[1]));
					m1.setCombustivel(campos[2]);
					System.out.println("Calculo de venda: " + m1.calcularVenda());
					motorService.incluir(m1);
				} catch (TamanhoMotorFracoException e) {
					System.out.println("[ERROR - MOTOR] " + e.getMessage());
				}
				linha = leitura.readLine();
			}
			
			leitura.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("[ERRO] o arquivo não existe");
		} catch (IOException e) {
			System.out.println("[ERRO] o arquivo não existe");
		} finally {
			System.out.println("Terminou!!");
		}
		
		
		/*try {
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
		}*/
	}

}
