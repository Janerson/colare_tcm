package com.dom.colare.data.repository.lic;

import com.dom.colare.core.entidades.lic.contrato_resc.ContratoRecisao;
import com.dom.colare.data.repository.BaseRespository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ContratoRecisaoRepository extends BaseRespository<ContratoRecisao, UUID> {
}
