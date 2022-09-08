package br.edu.infnet.appmanutencao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmanutencao.model.domain.Cliente;
import br.edu.infnet.appmanutencao.service.ClienteService;

@Component
public class ClienteTeste implements ApplicationRunner {
	
	@Autowired
	private ClienteService clienteService;
	
	@Override
	public void run(ApplicationArguments args) {
		String dir = "d:/Temp/";
		String arq = "cliente.txt";
		
		try {
			FileReader fileReader= new FileReader(dir+arq);
			BufferedReader leitura = new BufferedReader(fileReader);

			String linha = leitura.readLine();
			while(linha != null) {
				try {
					String[] campos = linha.split(";");
					Cliente m1 = new Cliente(campos[0],campos[1],campos[2]);
					clienteService.incluir(m1);
				} catch (Exception e) {
					System.out.println("[ERRO - CLIENTE] " + e.getMessage());
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
			Cliente m2 = new Cliente("Cliente2", "12345678911", "32170001");
			ClienteController.incluir(m2);
		} catch (Exception e) {
			System.out.println("[ERRO - CLIENTE] " + e.getMessage());
		}
		try {
			Cliente m3 = new Cliente("Cliente3", "12345678912", "32170002");
			ClienteController.incluir(m3);
		} catch (Exception e) {
			System.out.println("[ERRO - CLIENTE] " + e.getMessage());
		}
		try {
			Cliente m4 = new Cliente("Cliente4", "", "32170002");
			ClienteController.incluir(m4);
		} catch (Exception e) {
			System.out.println("[ERRO - CLIENTE] " + e.getMessage());
		}
		try {
			Cliente m5 = new Cliente("Cliente5", null, "32170002");
			ClienteController.incluir(m5);
		} catch (Exception e) {
			System.out.println("[ERRO - CLIENTE] " + e.getMessage());
		}
		*/
	}

}
