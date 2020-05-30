package com.dom.colare.data.repository.lic;

import com.dom.colare.core.entidades.lic.adesao_reg_prec.AdesaoARegistroDePrecos;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdesaoARegistroDePrecosRepository extends PagingAndSortingRepository<AdesaoARegistroDePrecos ,Long> {
}
