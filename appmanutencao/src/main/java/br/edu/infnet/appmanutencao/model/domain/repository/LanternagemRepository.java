package br.edu.infnet.appmanutencao.model.domain.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appmanutencao.model.domain.Lanternagem;

@Repository
public interface LanternagemRepository extends CrudRepository<Lanternagem, Integer> {

	@Query("from Lanternagem l where l.usuario.id = :idUsuario")
	Collection<Lanternagem> findAll(Integer idUsuario);
}
