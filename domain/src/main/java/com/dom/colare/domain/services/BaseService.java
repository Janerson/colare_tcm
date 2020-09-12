package com.dom.colare.domain.services;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import com.dom.colare.data.repository.BaseRespository;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @param <D>  Pojo DTO
 * @param <PK> Tipo chave PK
 * @param <T>  Entidade de Persistência
 */
@Data
public abstract class BaseService<D, PK, T extends BaseEntityID> implements IBaseService<T, D> {

    /*private final PagingAndSortingRepository<T, PK> repository;*/
    private final BaseRespository<T, PK> repository;

    private final Class<D> dtoClass;
    private final Class<T> entityClass;

//    private T entity;
//    private D dto;

    public BaseService(BaseRespository<T, PK> repository, Class<D> dtoClass, Class<T> entityClass) {
        this.repository = repository;
        this.dtoClass = dtoClass;
        this.entityClass = entityClass;
    }

    public D gravar(D d) {
        T t = mapFromDTO(d, entityClass);
        return mapToDTO(repository.save(t), dtoClass);
    }

    public D buscarPeloId(PK pk) {
        return repository.findById(pk)
                .map(x  -> mapToDTO(x, dtoClass))
                .orElse(null);
    }

    public D atualizar(PK id, D d) {
        D saved = buscarPeloId(id);
        BeanUtils.copyProperties(d, saved, "uuid");
        return gravar(saved);
    }

    public D apagarPorId(PK pk) {
        D d = buscarPeloId(pk);
        repository.deleteById(pk);
        return d;
    }

    public List<D> listar() {
        return mapAll(repository.findAll(), dtoClass);
    }

    public Page<D> paginado(Pageable pageable) {
        return repository.findAll(pageable)
                .map(entity -> mapToDTO(entity, dtoClass));
    }

    public Page<D> listaPaginada(Pageable pageable , String searchTerm) {
        return repository.findAll(Specifications.allColumnsLike(searchTerm),pageable)
                .map(entity -> mapToDTO(entity, dtoClass));
    }

}

