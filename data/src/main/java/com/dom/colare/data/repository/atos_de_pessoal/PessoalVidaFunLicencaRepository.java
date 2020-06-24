package com.dom.colare.data.repository.atos_de_pessoal;

import com.dom.colare.core.entidades.atos_de_pessoal.pessoal_vida_funcional_licenca.PessoalVidaFuncionalLicenca;
import com.dom.colare.data.repository.BaseRespository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PessoalVidaFunLicencaRepository extends BaseRespository<PessoalVidaFuncionalLicenca, UUID> {
}
