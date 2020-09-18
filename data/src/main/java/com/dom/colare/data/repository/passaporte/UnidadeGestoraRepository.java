package com.dom.colare.data.repository.passaporte;

import com.dom.colare.core.entidades.passaporte.UnidadeGestora;
import com.dom.colare.data.repository.BaseRespository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UnidadeGestoraRepository extends BaseRespository<UnidadeGestora, UUID> {
}
