package br.com.vivo.desafio.repository;

import br.com.vivo.desafio.model.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    Cliente findById(Long id);
    void deleteById(Long id);
    Long count();
}