package br.edu.infnet.appmanutencao.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appmanutencao.model.domain.Motor;
import br.edu.infnet.appmanutencao.model.domain.repository.MotorRepository;
import br.edu.infnet.appmanutencao.model.test.AppImpressao;

@Service
public class MotorService {

	@Autowired
	private MotorRepository motorRepository;
	
	public void incluir(Motor motor) {
		motorRepository.save(motor);
		
		AppImpressao.relatorio("Inclusao motor "+ motor.getDescricao()+ " realizada com sucesso!!", motor);
	}
	
	public void excluir(Integer id) {
		motorRepository.deleteById(id);
	}
	
	public Collection<Motor> obterLista(){
		return (Collection<Motor>) motorRepository.findAll();
	}
}
