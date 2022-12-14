package br.edu.infnet.appmanutencao.model.domain.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appmanutencao.model.domain.Suspensao;

@Repository
public interface SuspensaoRepository extends CrudRepository<Suspensao, Integer> {
	
	@Query("from Suspensao s where s.usuario.id = :idUsuario")
	Collection<Suspensao> findAll(Integer idUsuario);

}
