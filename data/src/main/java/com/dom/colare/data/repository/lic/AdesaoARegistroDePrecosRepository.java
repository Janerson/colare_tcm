package com.dom.colare.data.repository.lic;

import com.dom.colare.core.entidades.lic.adesao_reg_prec.AdesaoARegistroDePrecos;
import com.dom.colare.data.repository.BaseRespository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AdesaoARegistroDePrecosRepository extends BaseRespository<AdesaoARegistroDePrecos, UUID> {
}
