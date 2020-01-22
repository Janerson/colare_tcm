package com.dom.colare.data.repository.dominio;

import com.dom.colare.core.entidades.atos_de_pessoal.pessoal_legislacao.AssuntosDaNorma;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssuntoDaNormaRepository extends PagingAndSortingRepository<AssuntosDaNorma,Long> {
}
