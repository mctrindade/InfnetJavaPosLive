package br.edu.infnet.appmanutencao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmanutencao.model.domain.Suspensao;
import br.edu.infnet.appmanutencao.model.domain.exceptions.TamanhoPneuInvalidoException;
import br.edu.infnet.appmanutencao.service.SuspensaoService;

@Component
public class SuspensaoTeste implements ApplicationRunner {
	
	@Autowired
	private SuspensaoService suspensaoService;
	
	@Override
	public void run(ApplicationArguments args) {
		
		String dir = "d:/Temp/";
		String arq = "servico.txt";
		//String arq = "suspensao.txt";
		
		try {
			FileReader fileReader= new FileReader(dir+arq);
			BufferedReader leitura = new BufferedReader(fileReader);

			String linha = leitura.readLine();
			while(linha != null) {
				String[] campos = linha.split(";");
				if("S".equalsIgnoreCase(campos[0])) {
					try {
						Suspensao s1 = new Suspensao();
						s1.setPneu(Integer.valueOf(campos[1]));
						s1.setAmortecedor(campos[2]);
						s1.setMola(campos[3]);
						s1.setDescricao(campos[4]);
						s1.setSituacao(Integer.valueOf(campos[5]));
						s1.setValor(Float.valueOf(campos[6]));
						System.out.println("Calculo de venda: " + s1.calcularVenda());
						suspensaoService.incluir(s1);
					} catch (TamanhoPneuInvalidoException e) {
						System.out.println("[ERROR - SUSPENSAO] " + e.getMessage());
					}
				}
					
				linha = leitura.readLine();
			}
			
			leitura.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("[ERRO] o arquivo não existe");
		} catch (IOException e) {
			System.out.println("[ERRO] o arquivo não existe");
			e.printStackTrace();
		} finally {
			System.out.println("Terminou!!");
		}
		
		/*
		try {
			Suspensao s2 = new Suspensao();
			s2.setDescricao("Servico 2");
			s2.setSituacao(2);
			s2.setValor(102);
			s2.setAmortecedor("traseiro");
			s2.setMola("flexão");
			s2.setPneu(13);
			System.out.println("Calculo de venda: " + s2.calcularVenda());
			SuspensaoController.incluir(s2);
		} catch (TamanhoPneuInvalidoException e) {
			System.out.println("[ERROR - SUSPENSAO] " + e.getMessage());
		}
		
		try {
			Suspensao s3 = new Suspensao();
			s3.setDescricao("Servico 3");
			s3.setSituacao(3);
			s3.setValor(103);
			s3.setAmortecedor("dianteiro");
			s3.setMola("dianteiflexora");
			s3.setPneu(18);
			System.out.println("Calculo de venda: " + s3.calcularVenda());
			SuspensaoController.incluir(s3);
		} catch (TamanhoPneuInvalidoException e) {
			System.out.println("[ERROR - SUSPENSAO] " + e.getMessage());
		}
		
		try {
			Suspensao s4 = new Suspensao();
			s4.setDescricao("Servico 4");
			s4.setSituacao(3);
			s4.setValor(103);
			s4.setAmortecedor("dianteiro");
			s4.setMola("dianteiflexora");
			s4.setPneu(13);
			System.out.println("Calculo de venda: " + s4.calcularVenda());
			SuspensaoController.incluir(s4);
		} catch (TamanhoPneuInvalidoException e) {
			System.out.println("[ERROR - SUSPENSAO] " + e.getMessage());
		}*/
	}

}
