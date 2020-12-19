package com.dom.colare.data.repository.lic.faseum;

import com.dom.colare.core.entidades.lic.licitacao_fase1.LicitacaoFaseUm;
import com.dom.colare.data.repository.BaseRespository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LicitacaoFaseUmRepository extends BaseRespository<LicitacaoFaseUm, UUID> {
}
