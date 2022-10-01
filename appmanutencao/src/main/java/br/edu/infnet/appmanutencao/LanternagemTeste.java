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

import br.edu.infnet.appmanutencao.model.domain.Lanternagem;
import br.edu.infnet.appmanutencao.model.domain.Usuario;
import br.edu.infnet.appmanutencao.model.domain.exceptions.ValorReparoZeradoException;
import br.edu.infnet.appmanutencao.service.LanternagemService;

@Component
@Order(4)
public class LanternagemTeste implements ApplicationRunner {

	@Autowired
	private LanternagemService lanternagemService;
	
	@Override
	public void run(ApplicationArguments args) {
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		String dir = "d:/Temp/";
		String arq = "lanternagem.txt";
		
		try {
			FileReader fileReader= new FileReader(dir+arq);
			BufferedReader leitura = new BufferedReader(fileReader);

			String linha = leitura.readLine();
			while(linha != null) {
				try {
					String[] campos = linha.split(";");
					Lanternagem lanternagem = new Lanternagem();
					lanternagem.setDescricao(campos[3]);
					lanternagem.setSituacao(Integer.valueOf(campos[4]));
					lanternagem.setValor(Float.valueOf(campos[5]));
					lanternagem.setCor(campos[0]);
					lanternagem.setLocal(campos[1]);
					lanternagem.setValorReparo(Float.valueOf(campos[2]));
					lanternagem.setUsuario(usuario);
					System.out.println("Calculo de venda: " + lanternagem.calcularVenda());
					lanternagemService.incluir(lanternagem);
				} catch (ValorReparoZeradoException e) {
					System.out.println("[ERROR - LANTERNAGEM] " + e.getMessage());
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
			Lanternagem l2 = new Lanternagem();
			l2.setDescricao("Servico 2");
			l2.setSituacao(2);
			l2.setValor(102);
			l2.setCor("vermelho");
			l2.setLocal("capuz");
			l2.setValorReparo(12);
			System.out.println("Calculo de venda: " + l2.calcularVenda());
			LanternagemController.incluir(l2);
		} catch (ValorReparoZeradoException e) {
			System.out.println("[ERROR - LANTERNAGEM] " + e.getMessage());
		}

		try {
			Lanternagem l3 = new Lanternagem();
			l3.setDescricao("Servico 3");
			l3.setSituacao(3);
			l3.setValor(103);
			l3.setCor("verde");
			l3.setLocal("porta mala");
			l3.setValorReparo(-1);
			System.out.println("Calculo de venda: " + l3.calcularVenda());
			LanternagemController.incluir(l3);
		} catch (ValorReparoZeradoException e) {
			System.out.println("[ERROR - LANTERNAGEM] " + e.getMessage());
		}
		
		try {
			Lanternagem l4 = new Lanternagem();
			l4.setDescricao("Servico 4");
			l4.setSituacao(3);
			l4.setValor(103);
			l4.setCor("verde");
			l4.setLocal("para choque");
			l4.setValorReparo(-3);
			System.out.println("Calculo de venda: " + l4.calcularVenda());
			LanternagemController.incluir(l4);
		} catch (ValorReparoZeradoException e) {
			System.out.println("[ERROR - LANTERNAGEM] " + e.getMessage());
		}
		*/
	}

}
