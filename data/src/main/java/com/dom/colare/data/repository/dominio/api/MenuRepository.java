package com.dom.colare.data.repository.dominio.api;

import com.dom.colare.domain.api.Menu;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends PagingAndSortingRepository<Menu,Long> {
}
