package br.com.vivo.desafio.repository;

import br.com.vivo.desafio.model.Telefone;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends CrudRepository<Telefone, Long> {
    Telefone findById(Long id);
}