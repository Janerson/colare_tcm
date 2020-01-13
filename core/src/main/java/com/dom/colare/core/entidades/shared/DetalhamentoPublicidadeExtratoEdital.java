
package com.dom.colare.core.entidades.shared;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoPublicidadeExtratoEdital
 * <p>
 * Detalhamento da Publicidade do  Extrato do Edital
 * 
 */
@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class DetalhamentoPublicidadeExtratoEdital extends BaseEntityID {

    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    private String idDocumentoPDF;
    /**
     * Descrição
     * 
     */
    private String descricao;
    /**
     * Data da Publicação
     * (Required)
     * 
     */
    @NotNull
    private String dataPublicacao;
    /**
     * Código do veículo da Publicação
     * (Required)
     * 
     */
    @NotNull
    private Integer codVeiculoPublicacao;

}
