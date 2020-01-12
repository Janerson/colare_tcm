
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoPublicidadeExtratoEdital
 * <p>
 * Detalhamento da Publicidade do  Extrato do Edital
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
