package com.dom.colare.api.endpoints.licitacao_dispensa_adesao;

import com.dom.colare.api.BaseController;
import com.dom.colare.core.entidades.lic.licitacao_fase1.*;
import com.dom.colare.domain.services.lic.faseum.*;
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
public class LicitacaoFaseUmController extends BaseController<LicitacaoFaseUm, UUID> {

    private LicitacaoFaseUmService service;

    @Autowired
    private LoteFaseUmService loteService;
    @Autowired
    private ItemLoteFaseUmService itemService;
    @Autowired
    private PublicacaoFaseUmService publicacaoService;
    @Autowired
    private EditalEAnexosFaseUmService editalEAnexosFaseUmService;
    @Autowired
    private NaturezaObjDetFaseUmService naturezaObjDetFaseUmService;

    @Autowired
    public LicitacaoFaseUmController(LicitacaoFaseUmService service) {
        super(service);
        this.service = service;

    }

    // LOTE
    @PostMapping(path = "/{id}/LOTE/ADD")
    public ResponseEntity<LoteFaseUm> adicionarLote(@PathVariable("id") UUID uuid, @Valid @RequestBody LoteFaseUm lote) {
        LicitacaoFaseUm lic = service.buscarPeloId(uuid);
        lote.setFaseUm(lic);
        return new ResponseEntity<>(loteService.gravar(lote), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}/LOTE/DEL/{loteID}")
    public void removerLote(@PathVariable("loteID") UUID loteUUID) {
        loteService.apagarPorId(loteUUID);
    }

    @GetMapping("/{id}/LOTE/LIST")
    public Page<LoteFaseUm> listarLote(Pageable pageable, @PathVariable("id") UUID uuid, @RequestParam("search") String search) {
        return loteService.listarByLicitacaoID(pageable, uuid, search);
    }

    // ITEM
    @PostMapping(path = "/{uuid}/LOTE/{loteId}/ITEM/ADD")
    public ResponseEntity<ItemFaseUm> adicionarLoteItem(@PathVariable("loteId") UUID loteId, @Valid @RequestBody ItemFaseUm item) {
        LoteFaseUm lote = loteService.buscarPeloId(loteId);
        item.setLoteFaseUm(lote);
        return new ResponseEntity<>(itemService.gravar(item), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{uuid}/LOTE/{loteId}/ITEM/DEL/{itemID}")
    public void removerLoteItem(@PathVariable("itemID") UUID itemId) {
        itemService.apagarPorId(itemId);
    }

    @GetMapping("/{uuid}/LOTE/{loteId}/ITEM/LIST")
    public Page<ItemFaseUm> listarLoteItem(Pageable pageable, @PathVariable("loteId") UUID loteId, @RequestParam("search") String search) {
        return itemService.listarByLoteID(pageable, loteId, search);
    }

    /* PUBLICAÇÕES*/
    @PostMapping(path = "/{id}/PUBLICACAO/ADD")
    public ResponseEntity<PublicacaoFaseUm> adicionarPublicacao(@PathVariable("id") UUID uuid, @Valid @RequestBody PublicacaoFaseUm pub) {
        LicitacaoFaseUm lic = service.buscarPeloId(uuid);
        pub.setFaseUm(lic);
        return new ResponseEntity<>(publicacaoService.gravar(pub), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}/PUBLICACAO/DEL/{pubId}")
    public void removerPublicacao(@PathVariable("pubId") UUID loteUUID) {
        publicacaoService.apagarPorId(loteUUID);
    }

    @GetMapping("/{id}/PUBLICACAO/LIST")
    public Page<PublicacaoFaseUm> listarPublicacoes(Pageable pageable, @PathVariable("id") UUID uuid, @RequestParam("search") String search) {
        return publicacaoService.listarByLicitacaoID(pageable, uuid, search);
    }
    /* Edital e Anexos*/
    @PostMapping(path = "/{id}/EDITAL-E-ANEXOS/ADD")
    public ResponseEntity<EditalEAnexoFase1> adicionarEditalEAnexo(@PathVariable("id") UUID uuid, @Valid @RequestBody EditalEAnexoFase1 ed) {
        LicitacaoFaseUm lic = service.buscarPeloId(uuid);
        ed.setFaseUm(lic);
        return new ResponseEntity<>(editalEAnexosFaseUmService.gravar(ed), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}/EDITAL-E-ANEXOS/DEL/{pubId}")
    public void removerEdital(@PathVariable("pubId") UUID editalUUID) {
        editalEAnexosFaseUmService.apagarPorId(editalUUID);
    }

    @GetMapping("/{id}/EDITAL-E-ANEXOS/LIST")
    public Page<EditalEAnexoFase1> listarEditais(Pageable pageable, @PathVariable("id") UUID uuid, @RequestParam("search") String search) {
        return editalEAnexosFaseUmService.listarByLicitacaoID(pageable, uuid, search);
    }
    /* Natureza Objeto Detalhada*/
    @PostMapping(path = "/{id}/NATUREZA-DO-OBJETO-DETALHADA/ADD")
    public ResponseEntity<NaturezaObjetoDetalhadaFase1> adicionarNatObjDet(@PathVariable("id") UUID uuid, @Valid @RequestBody NaturezaObjetoDetalhadaFase1 nat) {
        LicitacaoFaseUm lic = service.buscarPeloId(uuid);
        nat.setFaseUm(lic);
        return new ResponseEntity<>(naturezaObjDetFaseUmService.gravar(nat), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}/NATUREZA-DO-OBJETO-DETALHADA/DEL/{uuid}")
    public void removerNatureza(@PathVariable("uuid") UUID editalUUID) {
        naturezaObjDetFaseUmService.apagarPorId(editalUUID);
    }

    @GetMapping("/{id}/NATUREZA-DO-OBJETO-DETALHADA/LIST")
    public Page<NaturezaObjetoDetalhadaFase1> listarNatureza(Pageable pageable, @PathVariable("id") UUID uuid, @RequestParam("search") String search) {
        return naturezaObjDetFaseUmService.listarByLicitacaoID(pageable, uuid, search);
    }

}
