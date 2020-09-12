package com.dom.colare.api;

import com.dom.colare.domain.dto.BaseDTO;
import com.dom.colare.domain.services.BaseService;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

/**
 * @param <T>  Objeto DTO
 * @param <PK> Tipo chave primária
 */
public abstract class BaseController<T extends BaseDTO, PK> {

    private final BaseService<T, PK, ?> service;

    public BaseController(BaseService<T, PK, ?> service) {
        this.service = service;
    }

    @ApiOperation(value = "Gravar entidade")
    @PostMapping(produces = "application/json")
    public ResponseEntity<T> gravar(@Valid @RequestBody T t) {
        T t1 = service.gravar(t);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}")
                .buildAndExpand(t1.getUuid()).toUri();
        return ResponseEntity.created(uri).body(t1);
    }

    @GetMapping(path = "/{ID}", produces = "application/json")
    public ResponseEntity<T> buscarPeloID(@PathVariable("ID") PK id) {
        Optional<T> optionalT = Optional.ofNullable(service.buscarPeloId(id));

        return optionalT.map(t -> new ResponseEntity<>(t, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NO_CONTENT));
    }

    @PutMapping("/{ID}")
    public ResponseEntity<T> atualizar(@PathVariable("ID") PK id, @RequestBody T t) {
        return ResponseEntity.ok(service.atualizar(id, t));
    }

    @DeleteMapping("/{ID}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void apagarPorId(@PathVariable("ID") PK id) {
        service.apagarPorId(id);
    }

    @GetMapping("/ALL")
    public ResponseEntity<?> listar() {
        List<T> listEntity = service.listar();
        return listEntity.isEmpty() ?
                new ResponseEntity<>(listEntity, HttpStatus.NO_CONTENT) :
                new ResponseEntity<>(listEntity, HttpStatus.OK);
    }

    @GetMapping("/PAGED")
    public Page<T> paginado(Pageable pageable) {
        return service.paginado(pageable);
    }

    @GetMapping("/PAGINADO")
    public Page<T> listaPaginada(@RequestParam("search") String search, Pageable pageable) {
        return service.listaPaginada(pageable, search);
    }
}
