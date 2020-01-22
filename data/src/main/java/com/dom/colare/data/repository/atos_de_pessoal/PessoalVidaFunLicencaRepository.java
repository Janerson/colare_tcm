package com.dom.colare.data.repository.atos_de_pessoal;

import com.dom.colare.core.entidades.atos_de_pessoal.pessoal_vida_funcional_licenca.PessoalVidaFuncionalLicenca;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoalVidaFunLicencaRepository extends PagingAndSortingRepository<PessoalVidaFuncionalLicenca,Long> {
}
