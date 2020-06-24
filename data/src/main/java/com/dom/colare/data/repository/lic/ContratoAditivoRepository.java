package com.dom.colare.data.repository.lic;

import com.dom.colare.core.entidades.lic.contrato_adt.ContratoAditivo;
import com.dom.colare.data.repository.BaseRespository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ContratoAditivoRepository extends BaseRespository<ContratoAditivo, UUID> {
}
