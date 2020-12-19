package com.dom.colare.domain.services.lic.faseum;

import com.dom.colare.core.entidades.lic.licitacao_fase1.NaturezaObjetoDetalhadaFase1;
import com.dom.colare.data.repository.lic.faseum.NaturezaObjDetFaseUmRepositoty;
import com.dom.colare.domain.services.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class NaturezaObjDetFaseUmService extends BaseService<UUID, NaturezaObjetoDetalhadaFase1> {

    private final NaturezaObjDetFaseUmRepositoty repository;

    public NaturezaObjDetFaseUmService(NaturezaObjDetFaseUmRepositoty repository) {
        super(repository);
        this.repository = repository;
    }
    public Page<NaturezaObjetoDetalhadaFase1> listarByLicitacaoID(Pageable pageable, UUID uuid, String src){
        return repository.findBy(pageable,uuid,src);
    }


}
