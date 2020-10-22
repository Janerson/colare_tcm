package com.dom.colare.domain.services.lic;

import com.dom.colare.core.entidades.lic.licitacao_fase1.LicitacaoFaseUm;
import com.dom.colare.data.repository.lic.LicitacaoFaseUmRepository;
import com.dom.colare.domain.dto.lic.licitacao_faseum.LicitacaoFaseUmDTO;
import com.dom.colare.domain.services.BaseService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class LicitacaoFaseUmService extends BaseService<LicitacaoFaseUmDTO, UUID, LicitacaoFaseUm> {
    private LicitacaoFaseUmRepository repository;

    public LicitacaoFaseUmService(LicitacaoFaseUmRepository repository) {
        super(repository, LicitacaoFaseUmDTO.class, LicitacaoFaseUm.class);
        this.repository = repository;
    }

/*    @Override
    public LicitacaoFaseUmDTO atualizar(UUID id, LicitacaoFaseUmDTO licitacaoFaseUmDTO) {
        String[] IGNORE_FIELDS = {"uuid", "lote"};
        LicitacaoFaseUmDTO saved = buscarPeloId(id);
        modelMapper().getConfiguration().setPropertyCondition(skipProperty(IGNORE_FIELDS));
        modelMapper().map(saved, licitacaoFaseUmDTO);
        return gravar(licitacaoFaseUmDTO);
    }*/

}
