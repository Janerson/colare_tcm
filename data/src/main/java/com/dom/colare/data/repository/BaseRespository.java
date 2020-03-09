package com.dom.colare.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

public abstract class BaseRespository<T, PK> implements PagingAndSortingRepository<T,PK> {


}
