package com.dom.colare.domain.services.lic.faseum;

import com.dom.colare.core.entidades.lic.licitacao_fase1.LoteFaseUm;
import com.dom.colare.data.repository.lic.faseum.LoteFaseUmRepository;
import com.dom.colare.domain.services.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class LoteFaseUmService extends BaseService<UUID, LoteFaseUm> {

    private final LoteFaseUmRepository repository;

    public LoteFaseUmService(LoteFaseUmRepository repository) {
        super(repository);
        this.repository = repository;
    }
    public Page<LoteFaseUm> listarByLicitacaoID(Pageable pageable, UUID uuid, String src){
        return repository.findBy(pageable,uuid,src);
    }


}
