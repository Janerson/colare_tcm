package com.dom.colare.domain.services.lic;

import com.dom.colare.core.entidades.lic.retificacao_lic.RetificaHomolog;
import com.dom.colare.data.repository.lic.RetificaHomologRepository;
import com.dom.colare.domain.dto.lic.retifica_homolog.RetificaHomologDTO;
import com.dom.colare.domain.services.BaseService;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class RetificaHomoloService extends BaseService<RetificaHomologDTO, UUID, RetificaHomolog> {

    private RetificaHomologRepository repository;

    public RetificaHomoloService(RetificaHomologRepository repository) {
        super(repository, RetificaHomologDTO.class, RetificaHomolog.class);
        this.repository = repository;
    }

    public Optional<RetificaHomologDTO> getByIdProcedimentoAndSatusEnvio(Integer id, String statusEnvio) {
        RetificaHomolog retifica = repository.getByIdProcedimentoAndSatusEnvio(id, statusEnvio);
        RetificaHomologDTO dto = new RetificaHomologDTO();
        if (retifica != null) mapToDTO(retifica, dto);
        return Optional.of(dto);
    }
}
