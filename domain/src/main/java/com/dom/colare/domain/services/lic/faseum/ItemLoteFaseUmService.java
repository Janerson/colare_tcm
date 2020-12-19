package com.dom.colare.domain.services.lic.faseum;

import com.dom.colare.core.entidades.lic.licitacao_fase1.ItemFaseUm;
import com.dom.colare.data.repository.lic.faseum.ItemLoteFaseUmRepository;
import com.dom.colare.domain.services.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ItemLoteFaseUmService extends BaseService<UUID, ItemFaseUm> {

    private final ItemLoteFaseUmRepository repository;

    public ItemLoteFaseUmService(ItemLoteFaseUmRepository repository) {
        super(repository);
       this.repository = repository;
    }

    public Page<ItemFaseUm> listarByLoteID(Pageable pageable, UUID uuid, String src){
        return repository.findBy(pageable,uuid,src);
    }
}
