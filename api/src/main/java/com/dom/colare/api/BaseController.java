package com.dom.colare.api;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class BaseController<T , ID, R extends PagingAndSortingRepository<T,ID>> {

    private R repository;

    public BaseController(R repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<T> gravar(@RequestBody T t){
        return new ResponseEntity<>(repository.save(t), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> buscarPeloID(@PathVariable("id") ID id){

        return new ResponseEntity<>(repository.findById(id).get(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void apagarPorId(@PathVariable("id") ID id){
        repository.deleteById(id);
    }

    @GetMapping("/all")
    public ResponseEntity<List<T>> listar(){
        return new ResponseEntity(repository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/paging")
    public Page<T> paginado(Pageable pageable){
        return repository.findAll(pageable);
    }
}
