package com.dom.colare.domain.services.lic.faseum;

import com.dom.colare.core.entidades.lic.licitacao_fase1.EditalEAnexoFase1;
import com.dom.colare.data.repository.lic.faseum.EditalEAnexosFaseUmRepositoty;
import com.dom.colare.domain.services.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EditalEAnexosFaseUmService extends BaseService<UUID, EditalEAnexoFase1> {

    private final EditalEAnexosFaseUmRepositoty repository;

    public EditalEAnexosFaseUmService(EditalEAnexosFaseUmRepositoty repository) {
        super(repository);
        this.repository = repository;
    }
    public Page<EditalEAnexoFase1> listarByLicitacaoID(Pageable pageable, UUID uuid, String src){
        return repository.findBy(pageable,uuid,src);
    }


}
