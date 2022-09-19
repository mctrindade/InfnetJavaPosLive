package br.edu.infnet.appmanutencao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
		/*Lanternagem la = new Lanternagem();
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
		*/

		String dir = "d:/Temp/";
		String arq = "manutecao.txt";

		try {
			FileReader fileReader = new FileReader(dir + arq);
			BufferedReader leitura = new BufferedReader(fileReader);
			Set<Servico> listaServicos = null;
			List<Manutencao> manutencoes = new ArrayList<>();
			
			String linha = leitura.readLine();
			while (linha != null) {
				String[] campos = linha.split(";");
				switch (campos[0]) {
				case "M":
					try {
						listaServicos = new HashSet<>();

						Cliente c1 = new Cliente(campos[4], campos[5], campos[6]);
						Manutencao m1 = new Manutencao(c1, listaServicos);
						m1.setBox(Integer.valueOf(campos[1]));
						m1.setPlaca(campos[2]);
						manutencoes.add(m1);
					} catch (CpfInvalidoException | ClienteNuloException | ManutencaoSemServicosException e) {
						System.out.println("[ERRO] - CLIENTE " + e.getMessage());
					}
					break;
				case "S":
					Suspensao su = new Suspensao();
					su.setPneu(Integer.valueOf(campos[1]));
					su.setAmortecedor(campos[2]);
					su.setMola(campos[3]);
					su.setDescricao(campos[4]);
					su.setSituacao(Integer.valueOf(campos[5]));
					su.setValor(Float.valueOf(campos[6]));
					listaServicos.add(su);
					break;
				case "L":
					Lanternagem la = new Lanternagem();
					la.setCor(campos[1]);
					la.setLocal(campos[2]);
					la.setValorReparo(Float.valueOf(campos[3]));
					la.setDescricao(campos[4]);
					la.setSituacao(Integer.valueOf(campos[5]));
					la.setValor(Float.valueOf(campos[6]));
					listaServicos.add(la);
					break;
				case "MO":
					Motor mo = new Motor();
					mo.setCilindro(campos[1]);
					mo.setTamanho(Double.valueOf(campos[2]));
					mo.setCombustivel(campos[3]);
					mo.setDescricao(campos[4]);
					mo.setSituacao(Integer.valueOf(campos[5]));
					mo.setValor(Float.valueOf(campos[6]));
					listaServicos.add(mo);
					break;
				default:
					break;
				}
				linha = leitura.readLine();
			}

			for(Manutencao m: manutencoes) {
				manutencaoService.incluir(m);
				System.out.println(">>>>>>>>>>>> "+ m.getId());
				System.out.println(">>>>>>>>>> "+ m.getCliente().getNome());
				System.out.println(">>>>>>>> "+ m.getServicos().size());
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
	}

}
