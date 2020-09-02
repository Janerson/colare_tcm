package com.dom.colare.data.repository.lic;

import com.dom.colare.core.entidades.lic.retificacao_lic.RetificaHomolog;
import com.dom.colare.data.repository.BaseRespository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RetificaHomologRepository extends BaseRespository<RetificaHomolog, UUID> {

    //@Query(value = "select  r from RETIFICAHOMOLOG r, Arquivo a where r.idProcedimentoOuContrato =:idProcedimento and a.statusEnvio = :statusEnvio")
    @Query(value = "select  r from RETIFICAHOMOLOG r where r.idProcedimentoOuContrato =:idProcedimento and r.arquivo.statusEnvio = :statusEnvio")
    RetificaHomolog getByIdProcedimentoAndSatusEnvio(@Param("idProcedimento") Integer idProcedimento, @Param("statusEnvio") String statusEnvio);



}
