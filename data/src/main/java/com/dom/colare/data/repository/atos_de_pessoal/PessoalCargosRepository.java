package com.dom.colare.data.repository.atos_de_pessoal;

import com.dom.colare.core.entidades.atos_de_pessoal.pes_cargos.PessoalCargos;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoalCargosRepository extends PagingAndSortingRepository<PessoalCargos,Long> {
}
