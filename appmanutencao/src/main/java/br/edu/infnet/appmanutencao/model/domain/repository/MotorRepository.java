package br.edu.infnet.appmanutencao.model.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appmanutencao.model.domain.Motor;

@Repository
public interface MotorRepository extends CrudRepository<Motor, Integer> {

}
