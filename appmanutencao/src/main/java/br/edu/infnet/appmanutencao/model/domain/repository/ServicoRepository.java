package br.edu.infnet.appmanutencao.model.domain.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appmanutencao.model.domain.Servico;

@Repository
public interface ServicoRepository extends CrudRepository<Servico, Integer> {
	
	@Query("from Servico s where s.usuario.id = :idUsuario")
	Collection<Servico> findAll(Integer idUsuario);
}
