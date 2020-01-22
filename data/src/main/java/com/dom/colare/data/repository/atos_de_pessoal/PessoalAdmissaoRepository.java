package com.dom.colare.data.repository.atos_de_pessoal;

import com.dom.colare.core.entidades.atos_de_pessoal.pessoal_admissao.PessoalAdmissao;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoalAdmissaoRepository  extends PagingAndSortingRepository<PessoalAdmissao,Long> {
}
