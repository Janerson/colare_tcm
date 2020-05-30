package com.dom.colare.data.repository.lic;

import com.dom.colare.core.entidades.lic.contrato_adt.ContratoAditivo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratoAditivoRepository extends PagingAndSortingRepository<ContratoAditivo, Long> {
}
