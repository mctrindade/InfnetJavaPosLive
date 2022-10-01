package br.edu.infnet.appmanutencao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appmanutencao.model.domain.Cliente;
import br.edu.infnet.appmanutencao.model.domain.Lanternagem;
import br.edu.infnet.appmanutencao.model.domain.Manutencao;
import br.edu.infnet.appmanutencao.model.domain.Motor;
import br.edu.infnet.appmanutencao.model.domain.Servico;
import br.edu.infnet.appmanutencao.model.domain.Suspensao;
import br.edu.infnet.appmanutencao.model.domain.Usuario;
import br.edu.infnet.appmanutencao.model.domain.exceptions.ClienteNuloException;
import br.edu.infnet.appmanutencao.model.domain.exceptions.CpfInvalidoException;
import br.edu.infnet.appmanutencao.model.domain.exceptions.ManutencaoSemServicosException;
import br.edu.infnet.appmanutencao.service.ManutencaoService;

@Component
@Order(6)
public class ManutencaoTeste implements ApplicationRunner {

	@Autowired
	private ManutencaoService manutencaoService;

	@Override
	public void run(ApplicationArguments args) {
		try {
			Usuario usuario = new Usuario();
			usuario.setId(1);
			
			Cliente c1 = new Cliente();
			c1.setId(1);
			
			List<Servico> listaServicos = new ArrayList<>();
			Motor mo1 = new Motor();
			mo1.setId(1);
			listaServicos.add(mo1);
			Motor mo2 = new Motor();
			mo2.setId(2);
			listaServicos.add(mo2);
			Motor mo3 = new Motor();
			mo3.setId(3);
			listaServicos.add(mo3);
			
			Manutencao manutencao = new Manutencao(c1, listaServicos);
			manutencao.setBox(1);
			manutencao.setPlaca("JEA0000");
			manutencao.setUsuario(usuario);
			
			manutencaoService.incluir(manutencao);
			
		} catch (ClienteNuloException | ManutencaoSemServicosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*String dir = "d:/Temp/";
		String arq = "manutecao.txt";

		try {
			FileReader fileReader = new FileReader(dir + arq);
			BufferedReader leitura = new BufferedReader(fileReader);
			List<Servico> listaServicos = null;
			List<Manutencao> manutencoes = new ArrayList<>();
			
			String linha = leitura.readLine();
			while (linha != null) {
				String[] campos = linha.split(";");
				switch (campos[0]) {
				case "M":
					try {
						listaServicos = new ArrayList<>();

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
		}*/
	}

}
