package com.dom.colare.domain.services;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import com.dom.colare.data.repository.BaseRespository;
import org.modelmapper.TypeMap;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @param <D>  Pojo DTO
 * @param <PK> Tipo chave PK
 * @param <T>  Entidade de Persistência
 */
public abstract class BaseService<D, PK, T extends BaseEntityID> implements IBaseService<T, D> {

    /*private final PagingAndSortingRepository<T, PK> repository;*/
    private final BaseRespository<T, PK> repository;

    private final Class<D> dtoClass;
    private final Class<T> entityClass;

//    private T entity;
//    private D dto;

    public TypeMap<T,D> typeMap(){
       return modelMapper().createTypeMap(entityClass,dtoClass);
    }

    public BaseService(BaseRespository<T, PK> repository, Class<D> dtoClass, Class<T> entityClass) {
        this.repository = repository;
        this.dtoClass = dtoClass;
        this.entityClass = entityClass;
    }

    public D gravar(D d) {
        T t = mapFromDTO(d, entityClass);
        return mapToDTO(repository.save(t), dtoClass);
    }

    public List<D> gravarTodos(List<D> list){
        return mapAllToDTO(repository.saveAll(mapAllToEntity(list,entityClass)),dtoClass);
    }

    public D buscarPeloId(PK pk) {
        return repository.findById(pk)
                .map(x  -> mapToDTO(x, dtoClass))
                .orElse(null);
    }

    public D atualizar(PK id, D d) {
        D saved = buscarPeloId(id);
        //BeanUtils.copyProperties(d, saved, "uuid");
        modelMapper().map(saved,d);
        return gravar(saved);
    }

    public void apagarPorId(PK pk) {
        repository.deleteById(pk);
    }

    public List<D> listar() {
        return mapAllToDTO(repository.findAll(), dtoClass);
    }

    public Page<D> paginado(Pageable pageable, String searchTerm) {
        //Pageable page = PageRequest.of(pageable.getPageNumber(),pageable.getPageSize(), Sort.by("seq").ascending());

        return repository.findAll(Specifications.allColumnsLike(searchTerm),pageable)
                .map(entity -> mapToDTO(entity, dtoClass));
    }

}

