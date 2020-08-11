package com.dom.colare.data.repository;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

@NoRepositoryBean
public interface BaseRespository<T extends BaseEntityID , PK> extends PagingAndSortingRepository<T , PK> {

}
