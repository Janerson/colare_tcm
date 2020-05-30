package com.dom.colare.data.repository.lic;

import com.dom.colare.core.entidades.lic.dispensa_inexig.DispensaEInexigibilidade;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DispensaEInexigibilidadeRepository extends PagingAndSortingRepository<DispensaEInexigibilidade,Long> {
}
