package com.dom.colare.data.repository.atos_de_pessoal;

import com.dom.colare.core.entidades.atos_de_pessoal.pes_con_psp.PessoalEditalDeConcursoProcessoSeletivoPublico;
import com.dom.colare.data.repository.BaseRespository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PessoalEditalConcurProcessSelPublicoRepository
        extends BaseRespository<PessoalEditalDeConcursoProcessoSeletivoPublico, UUID> {
}
