package com.dom.colare.data.repository.atos_de_pessoal;

import com.dom.colare.core.entidades.atos_de_pessoal.pessoal_vida_funcional_lotacao.PessoalVidaFuncionalLotacao;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoalVidaFunLotacaoRepository extends PagingAndSortingRepository<PessoalVidaFuncionalLotacao,Long> {
}
