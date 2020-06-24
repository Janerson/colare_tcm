package com.dom.colare.data.repository.lic;

import com.dom.colare.core.entidades.lic.dispensa_inexig.DispensaEInexigibilidade;
import com.dom.colare.data.repository.BaseRespository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DispensaEInexigibilidadeRepository extends BaseRespository<DispensaEInexigibilidade, UUID> {
}
