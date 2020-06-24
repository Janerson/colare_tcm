package com.dom.colare.data.repository.lic;

import com.dom.colare.core.entidades.lic.situacao_proced.SituacaoProcedimento;
import com.dom.colare.data.repository.BaseRespository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SituacaoProcedimentoRepository extends BaseRespository<SituacaoProcedimento, UUID> {
}
