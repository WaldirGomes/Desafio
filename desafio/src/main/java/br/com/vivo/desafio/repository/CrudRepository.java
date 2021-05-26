package br.com.vivo.desafio.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public interface CrudRepository<T, ID extends Serializable> extends Repository<T, ID> {

    <S extends T> S save(S entity);
    T findById(ID primaryKey);
    List<T> findAll();
    void delete(T entity);
    Long count();


}