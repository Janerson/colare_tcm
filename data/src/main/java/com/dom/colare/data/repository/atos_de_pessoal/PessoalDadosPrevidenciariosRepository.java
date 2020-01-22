package com.dom.colare.data.repository.atos_de_pessoal;

import com.dom.colare.core.entidades.atos_de_pessoal.pessoal_dados_previdenciarios.PessoalDadosPrevidenciarios;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoalDadosPrevidenciariosRepository extends PagingAndSortingRepository<PessoalDadosPrevidenciarios,Long> {
}
