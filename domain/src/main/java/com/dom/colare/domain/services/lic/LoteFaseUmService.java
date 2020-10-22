package com.dom.colare.domain.services.lic;

import com.dom.colare.core.entidades.lic.licitacao_fase1.LoteFaseUm;
import com.dom.colare.data.repository.lic.LoteFaseUmRepository;
import com.dom.colare.domain.dto.lic.licitacao_faseum.LoteDTO;
import com.dom.colare.domain.services.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class LoteFaseUmService extends BaseService<LoteDTO, UUID, LoteFaseUm> {

    private final LoteFaseUmRepository repository;

    public LoteFaseUmService(LoteFaseUmRepository repository) {
        super(repository, LoteDTO.class, LoteFaseUm.class);
        this.repository = repository;
    }
    public Page<LoteDTO> listarByLicitacaoID(Pageable pageable, UUID uuid, String src){
        return repository.findBy(pageable,uuid,src)
                .map(entity -> mapToDTO(entity, LoteDTO.class));
    }


}
