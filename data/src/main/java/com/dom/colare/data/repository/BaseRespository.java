package com.dom.colare.data.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

@NoRepositoryBean
public interface BaseRespository<T , PK> extends PagingAndSortingRepository<T, PK> {

}
