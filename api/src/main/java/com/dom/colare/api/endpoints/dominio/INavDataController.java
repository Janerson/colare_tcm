package com.dom.colare.api.endpoints.dominio;

import com.dom.colare.api.BaseController;
import com.dom.colare.domain.dto.api.InavDataDTO;
import com.dom.colare.domain.services.api.InavDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("${dominio.menu-link}")
public class INavDataController extends BaseController<InavDataDTO, UUID> {

    private InavDataService service;

    @Autowired
    public INavDataController(InavDataService service) {
        super(service);
        this.service = service;
    }

    @GetMapping(path = "SPC/{layout}")
    public InavDataDTO listarPorUrl(@PathVariable("layout") String layout){
        return service.listarPorLayout(layout);
    }

    @GetMapping(path = "LISTAR")
    public Page<InavDataDTO> listarTitulos(Pageable pageable){
        return service.listar(pageable);
    }

    @PutMapping(path ="/{id}/LISTA/ADC" )
    public ResponseEntity<InavDataDTO> adicionarNaLista(@PathVariable("id") UUID uuid,  @Valid @RequestBody InavDataDTO inavDataDTO){
        InavDataDTO dto = service.buscarPeloId(uuid);
        dto.getChildren().add(inavDataDTO);
        return new ResponseEntity<>(service.gravar(dto), HttpStatus.OK);
    }

}
