
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_processo_seletivo_simplificado;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoPublicidadeExtratoEdital
 * <p>
 * Informa o Detalhamento Publicidade Extrato Edital
 * 
 */
@Entity
@Data
public class DetalhamentoPublicidadeExtratoEdital extends BaseEntityID {

    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    private String idDocumentoPDF;
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
    /**
     * Descrição
     * 
     */
    private String descricao;


}
