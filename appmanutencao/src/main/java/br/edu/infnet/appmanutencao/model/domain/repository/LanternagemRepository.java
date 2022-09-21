package br.edu.infnet.appmanutencao.model.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appmanutencao.model.domain.Lanternagem;

@Repository
public interface LanternagemRepository extends CrudRepository<Lanternagem, Integer> {

}
