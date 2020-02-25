package com.dom.colare.core.entidades.shared;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntityID extends Object implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_seq")
    private long seqID;

    /**
     * ID DE RETORNO DO TCM - COLARE
     */
    @Column
    private Long id;
}
