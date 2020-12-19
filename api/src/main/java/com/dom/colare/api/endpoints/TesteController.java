package com.dom.colare.api.endpoints;

import com.dom.colare.core.entidades.lic.licitacao_fase1.LicitacaoFaseUm;
import com.dom.colare.data.repository.lic.faseum.LicitacaoFaseUmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/teste")
public class TesteController {

    @Autowired
    LicitacaoFaseUmRepository repository;

    @GetMapping(path = "/{ID}")
    public LicitacaoFaseUm faseUm(@PathVariable("ID")UUID uuid){
        return repository.findById(uuid).get();
    }
}
