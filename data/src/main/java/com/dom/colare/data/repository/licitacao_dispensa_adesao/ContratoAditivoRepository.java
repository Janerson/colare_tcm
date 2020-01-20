package com.dom.colare.data.repository.licitacao_dispensa_adesao;

import com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.aditivo.ContratoAditivo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratoAditivoRepository extends PagingAndSortingRepository<ContratoAditivo, Long> {
}
