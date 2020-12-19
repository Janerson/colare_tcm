package com.dom.colare.core.entidades.shared;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Data
public abstract class Publicacao extends BaseEntityID {

    @NotNull(message = "Informar data de publicação")
    @Column
    private String dataPublicacao;
    @NotNull(message = "Informar veículode de publicação")
    @Column
    private Integer codVeiculoPublicacao;
    @Column
    private String descricao;
    //@NotNull(message = "Informar documento pdf da publicação")
    @Column
    private String idDocumentoPDF;

}
