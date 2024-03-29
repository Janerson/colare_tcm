package com.dom.colare.data.repository;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @param <T> Classe de Persistência
 * @param <PK> Tipo de Chave Primária UUID, int, String...
 */
@NoRepositoryBean
public interface BaseRespository<T extends BaseEntityID, PK> extends PagingAndSortingRepository<T, PK> {

    Page<T> findAll(Specification<T> spec, Pageable pageable);


}

