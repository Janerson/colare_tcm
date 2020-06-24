package com.dom.colare.api;

import com.dom.colare.domain.dto.BaseDTO;
import com.dom.colare.domain.services.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

/**
 * @param <T>  Objeto DTO
 * @param <PK>  Objeto DTO
 */
public abstract class BaseController<T extends BaseDTO,PK> {

    private final BaseService<T,PK,?> service;

    public BaseController(BaseService<T,PK,?> service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<T> gravar(@RequestBody T t) {
        T t1 = service.gravar(t);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}")
                .buildAndExpand(t1.getCodigo()).toUri();
        return ResponseEntity.created(uri).body(t1);
    }

    @GetMapping("/{ID}")
    public ResponseEntity<T> buscarPeloID(@PathVariable("ID") PK id) throws Exception {
        return new ResponseEntity<>(service.buscarPeloId(id), HttpStatus.OK);
    }

    @PutMapping("/{ID}")
    public ResponseEntity<T> atualizar(@PathVariable("ID") PK id, @RequestBody T t) throws Exception {
        return ResponseEntity.ok(service.atualizar(id, t));
    }

    @DeleteMapping("/{ID}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void apagarPorId(@PathVariable("ID") PK id) throws Exception {
        service.apagarPorId(id);
    }

    @GetMapping("/ALL")
    public ResponseEntity<?> listar() {
        //TODO - Retornar STATUS NO_CONTENT quando array vazio.
        return new ResponseEntity<>(service.listar(), HttpStatus.OK);
    }

    @GetMapping("/PAGED")
    public Page<T> paginado(Pageable pageable) {
        return service.paginado(pageable);
    }
}
