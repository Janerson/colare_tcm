package com.dom.colare.core.entidades.dominio;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntityDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Integer codigo;
    @Column
    private String descricao;
    @Column
    private String vigencia;


}
