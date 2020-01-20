package com.dom.colare.data.repository.licitacao_dispensa_adesao;

import com.dom.colare.core.entidades.licitacao_dispensa_adesao.adesao_registro_de_preco.AdesaoARegistroDePrecos;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdesaoARegistroDePrecosRepository extends PagingAndSortingRepository<AdesaoARegistroDePrecos ,Long> {
}
