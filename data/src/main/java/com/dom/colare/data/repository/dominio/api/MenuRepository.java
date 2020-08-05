package com.dom.colare.data.repository.dominio.api;

import com.dom.colare.core.entidades.api.Menu;
import com.dom.colare.data.repository.BaseRespository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface MenuRepository extends BaseRespository<Menu, UUID> {

    @Query(value = "SELECT * FROM MENU where MENU_ID is NULL", nativeQuery = true)
    public List<Menu> listarTodos();
}
