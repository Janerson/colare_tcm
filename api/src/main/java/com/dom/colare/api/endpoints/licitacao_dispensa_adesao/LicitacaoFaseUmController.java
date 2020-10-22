package com.dom.colare.api.endpoints.licitacao_dispensa_adesao;

import com.dom.colare.api.BaseController;
import com.dom.colare.domain.dto.lic.licitacao_faseum.LicitacaoFaseUmDTO;
import com.dom.colare.domain.dto.lic.licitacao_faseum.LoteDTO;
import com.dom.colare.domain.services.lic.LicitacaoFaseUmService;
import com.dom.colare.domain.services.lic.LoteFaseUmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;


@RestController
@RequestMapping("${lic.licitacao-fase-um}")
public class LicitacaoFaseUmController extends BaseController<LicitacaoFaseUmDTO, UUID> {

    private final LicitacaoFaseUmService service;
    private final LoteFaseUmService loteService;

    @Autowired
    public LicitacaoFaseUmController(LicitacaoFaseUmService service , LoteFaseUmService loteFaseUmService) {
        super(service);
        this.service = service;
        loteService = loteFaseUmService;
    }

    @PostMapping(path ="/{id}/LOTE/ADD" )
    public ResponseEntity<LoteDTO> adicionarLote(@PathVariable("id") UUID uuid, @Valid @RequestBody LoteDTO lote){
        LicitacaoFaseUmDTO lic = service.buscarPeloId(uuid);
        lote.setFaseUm(lic);
        return new ResponseEntity<>(loteService.gravar(lote),HttpStatus.OK);
    }

    @DeleteMapping(path ="/{id}/LOTE/DEL/{loteID}" )
    public void removerLote(@PathVariable("id") UUID uuid, @PathVariable("loteID") UUID loteUUID){
        loteService.apagarPorId(loteUUID);
    }

    @GetMapping("/{id}/LOTE/LIST")
    public Page<LoteDTO> listarLote(Pageable pageable, @PathVariable("id") UUID uuid, @RequestParam("search") String search) {
        return loteService.listarByLicitacaoID(pageable, uuid,search);
    }


}
