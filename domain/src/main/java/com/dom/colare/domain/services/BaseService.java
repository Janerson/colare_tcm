package com.dom.colare.domain.services;

import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * @param <D> Pojo DTO
 * @param <PK>  Classe de Entidade
 * @param <T>   Entidade de Persistência
 */
@Data
public abstract class BaseService<D, PK, T> implements IBaseService<T,D> {

    private PagingAndSortingRepository<T, PK> repository;

    private Class<D> dtoClass;
    private Class<T> entityClass;

    @Autowired
    private ModelMapper mapper;

    public BaseService(PagingAndSortingRepository<T, PK> repository, Class<D>  dtoClass, Class<T> entityClass) {
        this.repository = repository;
        this.dtoClass = dtoClass;
        this.entityClass = entityClass;
    }

    public D gravar(D D) {
        T t = mapFromDTO(D,entityClass);
        return mapToDTO(repository.save(t),dtoClass);
    }

    public D buscarPeloId(PK pk) throws Exception {
        return mapToDTO(repository.findById(pk).
                orElseThrow(() -> new NoSuchElementException("No value present for id:"+pk)),dtoClass);
    }

    public D atualizar(PK id, D d) throws Exception {
        D saved = buscarPeloId(id);
        BeanUtils.copyProperties(d,saved,"seqID");
        return gravar(saved);
    }

    public D apagarPorId(PK pk) throws Exception {
        D D = buscarPeloId(pk);
        repository.deleteById(pk);
        return D;
    }

    public List<D> listar() {
        return mapAll(repository.findAll(),dtoClass);
    }

    public Page<D> paginado(Pageable pageable) {
        return repository.findAll(pageable)
                .map(entity -> mapToDTO(entity,dtoClass));
    }


}

