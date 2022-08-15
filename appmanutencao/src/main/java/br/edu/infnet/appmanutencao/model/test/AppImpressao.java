package br.edu.infnet.appmanutencao.model.test;

import br.edu.infnet.appmanutencao.interfaces.IPrinter;

public class AppImpressao {
	
	public static void relatorio(String mensagem, IPrinter printer) {
		System.out.println(mensagem);
		
		printer.impressao();
	}
	
}
