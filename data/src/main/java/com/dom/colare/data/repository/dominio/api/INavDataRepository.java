package com.dom.colare.data.repository.dominio.api;

import com.dom.colare.core.entidades.api.inav.INavData;
import com.dom.colare.data.repository.BaseRespository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface INavDataRepository extends BaseRespository<INavData, UUID> {

    @Query(value = "SELECT  * from colare.inav_data where menu_id is null and show =:show order by seq asc" , nativeQuery = true)
    List<INavData> listarTodos(@Param("show")  boolean show);

    List<INavData> findAllByUrlEndingWith(String layout);

    @Query(value = "SELECT  * from colare.inav_data where menu_id is null order by seq asc" , nativeQuery = true)
    Page<INavData> listar(Pageable pageable);

    Page<INavData> getAllByUrlContainingAndNameContaining(Pageable pageable, String url, String name);

    /**@
     * Consulta Layouts pela Sigla da Prestação de Contas
     * @param spc
     * @return INavData
     */
    INavData getByUrlEndingWith(String spc);

}
