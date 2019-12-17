package com.dom.colare.core.entidades.dominio;


import com.dom.colare.core.entidades.BaseEntityID;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntityDomain extends BaseEntityID {

    @Column
    private Integer codigo;
    @Column
    private String descricao;
    @Column
    private String vigenciaInicio;
    @Column
    private String vigenciaFim;
}
