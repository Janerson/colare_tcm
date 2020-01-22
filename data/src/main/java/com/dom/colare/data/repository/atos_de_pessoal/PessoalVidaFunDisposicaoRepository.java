package com.dom.colare.data.repository.atos_de_pessoal;

import com.dom.colare.core.entidades.atos_de_pessoal.pessoal_vida_funcional_disposicao.PessoalVidaFuncionalDisposicao;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoalVidaFunDisposicaoRepository extends PagingAndSortingRepository<PessoalVidaFuncionalDisposicao, Long> {
}
