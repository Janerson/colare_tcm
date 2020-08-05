package com.dom.colare.domain.services;

import com.dom.colare.core.entidades.dominio.Dominio;
import com.dom.colare.core.entidades.dominio.TipoDominio;
import com.dom.colare.data.repository.dominio.tcm.TipoDominioRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TipoDominioService extends BaseService<TipoDominio, UUID,TipoDominio> {

    private TipoDominioRepository repository;

    @Autowired
    public TipoDominioService(TipoDominioRepository repository) {
        super(repository, TipoDominio.class, TipoDominio.class);
        this.repository = repository;
    }

    @Override
    public TipoDominio gravar(TipoDominio tipoDominio) {
        TipoDominio tpDominio = repository.findByNomeTipoDominioEquals(tipoDominio.getNomeTipoDominio());
        if(tpDominio == null) tpDominio = new TipoDominio();
        BeanUtils.copyProperties(tipoDominio, tpDominio, "id");
        return super.gravar(tpDominio);

    }

    public Page<Dominio> paginado(Pageable pageable, String nome) {
        return repository.findByNomeTipoDominioEquals(pageable,nome)
                .map(entity -> modelMapper().map(entity,Dominio.class));
    }

    public List<Dominio> listar(String tabela,Boolean status){
        return repository.listar(tabela,status);
    }
}
