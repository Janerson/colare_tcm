package com.dom.colare.core.entidades.dominio;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name="tipo_dominio")
public class TipoDominio extends BaseEntityID {


    private String nomeTipoDominio;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "TP_DOMINIO_ID")
    private List<Dominio> dominios;

}
