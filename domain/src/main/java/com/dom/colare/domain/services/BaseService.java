package com.dom.colare.domain.services;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import com.dom.colare.data.repository.BaseRespository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * @param <PK> Tipo chave PK
 * @param <T>  Entidade de Persistência
 */
public abstract class BaseService<PK, T extends BaseEntityID> {

    private final BaseRespository<T, PK> repository;

    public BaseService(BaseRespository<T, PK> repository) {
        this.repository = repository;

    }

    public T gravar(T t) {
        return repository.save(t);
    }

    public List<T> gravarTodos(List<T> list) {
        return StreamSupport.stream(repository.saveAll(list).spliterator(), false)
                .collect(Collectors.toList());

    }

    public T buscarPeloId(PK pk) {
        return repository.findById(pk)
                .orElse(null);
    }

    public T atualizar(PK id, T t) {
        return gravar(t);
    }

    public void apagarPorId(PK pk) {
        repository.deleteById(pk);
    }

    public List<T> listar() {
        return StreamSupport.stream(repository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public Page<T> paginado(Pageable pageable, String searchTerm) {
        return repository.findAll(Specifications.allColumnsLike(searchTerm), pageable);

    }
}

