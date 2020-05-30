package com.dom.colare.data.repository.lic;

import com.dom.colare.core.entidades.lic.contrato_ini.ContratoInicial;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratoInicialRepository extends PagingAndSortingRepository<ContratoInicial,Long> {
}
