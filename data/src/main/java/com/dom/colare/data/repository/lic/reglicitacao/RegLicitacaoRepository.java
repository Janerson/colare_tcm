package com.dom.colare.data.repository.lic.reglicitacao;

import com.dom.colare.core.entidades.lic.reg_licitacao.RegLicitacao;
import com.dom.colare.data.repository.BaseRespository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RegLicitacaoRepository extends BaseRespository<RegLicitacao, UUID> {

}
