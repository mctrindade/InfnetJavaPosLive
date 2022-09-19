package br.edu.infnet.appmanutencao.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appmanutencao.model.domain.Servico;

@Service
public class ServicoService {
	
	@Autowired
	private MotorService motorService;
	
	@Autowired
	private LanternagemService lanternagemService;

	public List<Servico> obterLista() {
		List<Servico> listaServicos = new ArrayList<>();
		
		listaServicos.addAll(motorService.obterLista());
		
		listaServicos.addAll(lanternagemService.obterLista());
		
		return listaServicos;
	}

}
