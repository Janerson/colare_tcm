package com.dom.colare.core.entidades.shared;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Data
public abstract class Publicacao extends BaseEntityID {

    @Column
    private String dataPublicacao;
    @Column
    private Integer codVeiculoPublicacao;
    @Column
    private String descricao;
    @Column
    private String idDocumentoPDF;

}
