package com.dom.colare.data.repository.dominio.api;

import com.dom.colare.core.entidades.api.Menu;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends PagingAndSortingRepository<Menu,Long> {

    @Query(value = "SELECT * FROM MENU where MENU_ID is NULL", nativeQuery = true)
    public List<Menu> listarTodos();
}
