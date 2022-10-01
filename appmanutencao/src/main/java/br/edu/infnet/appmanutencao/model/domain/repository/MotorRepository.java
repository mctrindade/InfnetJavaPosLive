package br.edu.infnet.appmanutencao.model.domain.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appmanutencao.model.domain.Motor;

@Repository
public interface MotorRepository extends CrudRepository<Motor, Integer> {
	
	@Query("from Motor m where m.usuario.id = :idUsuario")
	Collection<Motor> findAll(Integer idUsuario);
}
