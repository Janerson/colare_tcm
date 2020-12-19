package com.dom.colare.domain.services.api;

import com.dom.colare.core.entidades.dominio.Dominio;
import com.dom.colare.core.entidades.dominio.TipoDominio;
import com.dom.colare.data.repository.dominio.tcm.TipoDominioRepository;
import com.dom.colare.domain.services.BaseService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TipoDominioService extends BaseService<UUID,TipoDominio> {

    private TipoDominioRepository repository;

    @Autowired
    public TipoDominioService(TipoDominioRepository repository) {
        super(repository);
        this.repository = repository;
    }

    @Override
    public TipoDominio gravar(TipoDominio tipoDominio) {
        TipoDominio tpDominio = repository.findByNomeTipoDominioEquals(tipoDominio.getNomeTipoDominio());
        if(tpDominio == null) tpDominio = new TipoDominio();
        BeanUtils.copyProperties(tipoDominio, tpDominio, "uuid");
        return super.gravar(tpDominio);

    }

    /**
     *
     * @param pageable
     * @param nome Nome da Tabela de Dominio
     * @param descricao
     * @return
     */
    public Page<Dominio> paginado(Pageable pageable, String nome , String descricao) {
        return repository.findByNomeTipoDominioEquals(pageable,nome, descricao);
    }

    public List<Dominio> listar(String tabela,Boolean status){
        return repository.listar(tabela,status);
    }
}
