package com.dom.colare.api.endpoints.licitacao_dispensa_adesao;

import com.dom.colare.api.endpoints.BaseController;
import com.dom.colare.core.entidades.lic.retificacao_lic.RetificaHomolog;
import com.dom.colare.domain.services.lic.RetificaHomoloService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(path = "${lic.retifica-homolog}")
public class RetificaHomologController extends BaseController<RetificaHomolog, UUID> {

    private RetificaHomoloService service;

    public RetificaHomologController(RetificaHomoloService service) {
        super(service);
        this.service = service;
    }

    @GetMapping(path = "{idProcedimento}/{statusEnvio}")
    public ResponseEntity<?> getByIdProcedimentoAndSatusEnvio(@PathVariable("idProcedimento") Integer idProcedimento, @PathVariable("statusEnvio") String statusEnvio) {
        RetificaHomolog dto = service.getByIdProcedimentoAndSatusEnvio(idProcedimento, statusEnvio).get();
        return dto.getUuid() != null ?
                new ResponseEntity<>(dto, HttpStatus.OK):
                new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
    }

}
