package com.dom.colare.data.repository.lic;

import com.dom.colare.core.entidades.lic.contrato_resc.ContratoRecisao;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratoRecisaoRepository extends PagingAndSortingRepository<ContratoRecisao, Long> {
}
