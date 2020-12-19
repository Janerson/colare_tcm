package com.dom.colare.domain.services.lic.faseum;

import com.dom.colare.core.entidades.lic.licitacao_fase1.PublicacaoFaseUm;
import com.dom.colare.data.repository.lic.faseum.PublicacaoFaseUmRepositoty;
import com.dom.colare.domain.services.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PublicacaoFaseUmService extends BaseService<UUID, PublicacaoFaseUm> {

    private final PublicacaoFaseUmRepositoty repository;

    public PublicacaoFaseUmService(PublicacaoFaseUmRepositoty repository) {
        super(repository);
        this.repository = repository;
    }
    public Page<PublicacaoFaseUm> listarByLicitacaoID(Pageable pageable, UUID uuid, String src){
        return repository.findBy(pageable,uuid,src);
    }


}
