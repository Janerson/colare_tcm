package com.dom.colare.domain.tabelas;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntityDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private Integer codigo;
    @Column
    private String descricao;
    @Column
    private String vigenciaInicio;
    @Column
    private String vigenciaFim;
}
