package com.dom.colare.data.repository.atos_de_pessoal;

import com.dom.colare.core.entidades.atos_de_pessoal.pes_cadastro.PessoalCadastro;
import com.dom.colare.data.repository.BaseRespository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PessoalCadastroRepository extends BaseRespository<PessoalCadastro, UUID> {
}
