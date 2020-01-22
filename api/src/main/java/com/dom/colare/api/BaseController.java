package com.dom.colare.api;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @param <T> Tipo Objeto
 * @param <ID> Tipo Chave primaria
 * @param <R> Repository
 */
public abstract class BaseController<T , ID, R extends PagingAndSortingRepository<T,ID>> {

    private R repository;

    public BaseController(R repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<T> gravar(@RequestBody T t){
        return new ResponseEntity<>(repository.save(t), HttpStatus.OK);
    }

    @GetMapping("/{ID}")
    public ResponseEntity<T> buscarPeloID(@PathVariable("ID") ID id){

        return new ResponseEntity<>(repository.findById(id).get(), HttpStatus.OK);
    }

    @DeleteMapping("/{ID}")
    public void apagarPorId(@PathVariable("ID") ID id){
        repository.deleteById(id);
    }

    @GetMapping("/ALL")
    public ResponseEntity<List<T>> listar(){
        return new ResponseEntity(repository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/PAGING")
    public Page<T> paginado(Pageable pageable){
        return repository.findAll(pageable);
    }
}
