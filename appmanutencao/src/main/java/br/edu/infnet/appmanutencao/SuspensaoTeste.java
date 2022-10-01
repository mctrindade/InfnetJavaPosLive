package br.edu.infnet.appmanutencao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmanutencao.model.domain.Suspensao;
import br.edu.infnet.appmanutencao.model.domain.Usuario;
import br.edu.infnet.appmanutencao.model.domain.exceptions.TamanhoPneuInvalidoException;
import br.edu.infnet.appmanutencao.service.SuspensaoService;

@Component
@Order(5)
public class SuspensaoTeste implements ApplicationRunner {
	
	@Autowired
	private SuspensaoService suspensaoService;
	
	@Override
	public void run(ApplicationArguments args) {
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
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
						Suspensao suspensao = new Suspensao();
						suspensao.setPneu(Integer.valueOf(campos[1]));
						suspensao.setAmortecedor(campos[2]);
						suspensao.setMola(campos[3]);
						suspensao.setDescricao(campos[4]);
						suspensao.setSituacao(Integer.valueOf(campos[5]));
						suspensao.setValor(Float.valueOf(campos[6]));
						suspensao.setUsuario(usuario);
						System.out.println("Calculo de venda: " + suspensao.calcularVenda());
						suspensaoService.incluir(suspensao);
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
