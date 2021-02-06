package com.dom.colare.api.endpoints.dominio;


import com.dom.colare.api.endpoints.BaseController;
import com.dom.colare.core.entidades.api.inav.INavData;
import com.dom.colare.domain.services.api.InavDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("${dominio.menu-link}")
public class INavDataController extends BaseController<INavData, UUID> {

    private InavDataService service;

    @Autowired
    public INavDataController(InavDataService service) {
        super(service);
        this.service = service;
    }

    @GetMapping(path = "SPC/{layout}")
    public INavData listarPorUrl(@PathVariable("layout") String layout){
        return service.listarPorLayout(layout);
    }

    @GetMapping(path = "LISTAR")
    public Page<INavData> listarTitulos(Pageable pageable){
        return service.listar(pageable);
    }

    @GetMapping(path = "LISTAR/URL-START/{path}")
    public Page<INavData> listarTitulos(Pageable pageable, @PathVariable("path") String path, @RequestParam("search") String search){
        return service.listarPorUrlIniciandoCom(pageable, "/"+path+"/", search);
    }

    @PutMapping(path ="/{id}/LISTA/ADC" )
    public ResponseEntity<INavData> adicionarNaLista(@PathVariable("id") UUID uuid,  @Valid @RequestBody INavData inavDataDTO){
        INavData dto = service.buscarPeloId(uuid);
        dto.getChildren().add(inavDataDTO);
        return new ResponseEntity<>(service.gravar(dto), HttpStatus.OK);
    }

    @GetMapping(path = "LISTAR/STATUS")
    public ResponseEntity<?> listarPorStaus(@RequestParam("show") boolean show ) {
        List<INavData> listEntity = service.listarPorStatus(show);
        return listEntity.isEmpty() ?
                new ResponseEntity<>(listEntity, HttpStatus.NO_CONTENT):
                new ResponseEntity<>(listEntity, HttpStatus.OK);
    }
}
