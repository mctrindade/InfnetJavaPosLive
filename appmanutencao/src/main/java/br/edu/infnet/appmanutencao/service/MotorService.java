package br.edu.infnet.appmanutencao.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appmanutencao.model.domain.Motor;
import br.edu.infnet.appmanutencao.model.test.AppImpressao;

@Service
public class MotorService {

	private static Map<Integer, Motor> mapMotor = new HashMap<>();
	private static Integer id = 1;
	
	public void incluir(Motor motor) {
		motor.setId(id++);
		
		mapMotor.put(motor.getId(), motor);
		
		AppImpressao.relatorio("Inclusao motor "+ motor.getDescricao()+ " realizada com sucesso!!", motor);
	}
	
	public void excluir(Integer id) {
		mapMotor.remove(id);
	}
	
	public Collection<Motor> obterLista(){
		return mapMotor.values();
	}
}
