package br.edu.infnet.appmanutencao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmanutencao.model.domain.Cliente;
import br.edu.infnet.appmanutencao.model.domain.Lanternagem;
import br.edu.infnet.appmanutencao.model.domain.Manutencao;
import br.edu.infnet.appmanutencao.model.domain.Motor;
import br.edu.infnet.appmanutencao.model.domain.Servico;
import br.edu.infnet.appmanutencao.model.domain.Suspensao;
import br.edu.infnet.appmanutencao.model.domain.exceptions.ClienteNuloException;
import br.edu.infnet.appmanutencao.model.domain.exceptions.CpfInvalidoException;
import br.edu.infnet.appmanutencao.model.domain.exceptions.ManutencaoSemServicosException;
import br.edu.infnet.appmanutencao.service.ManutencaoService;

@Component
public class ManutencaoTeste implements ApplicationRunner {

	@Autowired
	private ManutencaoService manutencaoService;
	
	@Override
	public void run(ApplicationArguments args) {
		Lanternagem la = new Lanternagem();
		la.setDescricao("Servico 1");
		la.setSituacao(1);
		la.setValor(101);
		la.setCor("azul");
		la.setLocal("porta do motorista");
		la.setValorReparo(23);
		
		Lanternagem la2 = new Lanternagem();
		la2.setDescricao("Servico 1");
		la2.setSituacao(2);
		la2.setValor(101);
		la2.setCor("azul");
		la2.setLocal("porta do motorista");
		la2.setValorReparo(23);
		
		Motor mo = new Motor();
		mo.setDescricao("Servico 1");
		mo.setSituacao(1);
		mo.setValor(101);
		mo.setCilindro("em linha");
		mo.setTamanho(1.4d);
		mo.setCombustivel("gasolina");
		
		Suspensao su = new Suspensao();
		su.setDescricao("Servico 1");
		su.setSituacao(1);
		su.setValor(101);
		su.setAmortecedor("dianteiro");
		su.setMola("helicoidais");
		su.setPneu(15);
		
		
		String dir = "d:/Temp/";
		String arq = "manutecao.txt";
		
		try {
			FileReader fileReader= new FileReader(dir+arq);
			BufferedReader leitura = new BufferedReader(fileReader);

			String linha = leitura.readLine();
			while(linha != null) {
				try {
					String[] campos = linha.split(";");
					Set<Servico> listaServicoM1 = new HashSet<>();
					listaServicoM1.add(la2);
					listaServicoM1.add(la);
					listaServicoM1.add(mo);
					listaServicoM1.add(su);
					
					Cliente c1 = new Cliente(campos[3],campos[4],campos[5]);
					Manutencao m1 = new Manutencao(c1, listaServicoM1);
					m1.setBox(Integer.valueOf(campos[0]));
					m1.setPlaca(campos[1]);
					manutencaoService.incluir(m1);
				} catch (CpfInvalidoException | ClienteNuloException | ManutencaoSemServicosException e) {
					System.out.println("[ERRO] - CLIENTE " + e.getMessage());
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
			Set<Servico> listaServicoM2 = new HashSet<>();
			listaServicoM2.add(su);
			
			Cliente c2 = new Cliente("Cliente2", "12345678911", "32170001");
			Manutencao m2 = new Manutencao(c2, listaServicoM2);
			m2.setBox(2);
			m2.setPlaca("JKO-0002");
			ManutencaoController.incluir(m2);
		} catch (CpfInvalidoException | ClienteNuloException | ManutencaoSemServicosException e) {
			System.out.println("[ERRO] - CLIENTE " + e.getMessage());
		}
		
		try {
			Set<Servico> listaServicoM3 = new HashSet<>();
			listaServicoM3.add(la);
			listaServicoM3.add(mo);
			listaServicoM3.add(su);

			Cliente c3 = new Cliente("Cliente3", "12345678912", "32170002");
			Manutencao m3 = new Manutencao(null, listaServicoM3);
			m3.setBox(3);
			m3.setPlaca("JKO-0003");
			ManutencaoController.incluir(m3);
		} catch (CpfInvalidoException | ClienteNuloException | ManutencaoSemServicosException e) {
			System.out.println("[ERRO] - CLIENTE " + e.getMessage());
		}
		
		try {
			Set<Servico> listaServicoM4 = new HashSet<>();
			listaServicoM4.add(la);
			listaServicoM4.add(mo);
			listaServicoM4.add(su);

			Cliente c4 = new Cliente("Cliente4", "12345678913", "32170002");
			Manutencao m4 = new Manutencao(c4, listaServicoM4);
			m4.setBox(4);
			m4.setPlaca("JKO-0004");
			ManutencaoController.incluir(m4);
		} catch (CpfInvalidoException | ClienteNuloException | ManutencaoSemServicosException e) {
			System.out.println("[ERRO] - CLIENTE " + e.getMessage());
		}
		
		try {
			Set<Servico> listaServicoM5 = null;

			Cliente c5 = new Cliente("Cliente5", "12345678914", "32170002");
			Manutencao m5 = new Manutencao(c5, listaServicoM5);
			m5.setBox(5);
			m5.setPlaca("JKO-0005");
			ManutencaoController.incluir(m5);
		} catch (CpfInvalidoException | ClienteNuloException | ManutencaoSemServicosException e) {
			System.out.println("[ERRO] - CLIENTE " + e.getMessage());
		}*/
	}

}
