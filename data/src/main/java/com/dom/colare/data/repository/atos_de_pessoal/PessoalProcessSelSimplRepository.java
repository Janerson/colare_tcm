package com.dom.colare.data.repository.atos_de_pessoal;

import com.dom.colare.core.entidades.atos_de_pessoal.pessoal_processo_seletivo_simplificado.PessoalEditalProcessoSeletivoSimplificado;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoalProcessSelSimplRepository extends PagingAndSortingRepository<PessoalEditalProcessoSeletivoSimplificado,Long> {
}
