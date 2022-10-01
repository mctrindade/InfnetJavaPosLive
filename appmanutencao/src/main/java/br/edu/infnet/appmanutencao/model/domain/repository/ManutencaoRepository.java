package br.edu.infnet.appmanutencao.model.domain.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appmanutencao.model.domain.Manutencao;

@Repository
public interface ManutencaoRepository extends CrudRepository<Manutencao, Integer> {
	
	@Query("from Manutencao m where m.usuario.id = :idUsuario")
	Collection<Manutencao> findAll(Integer idUsuario);

}
