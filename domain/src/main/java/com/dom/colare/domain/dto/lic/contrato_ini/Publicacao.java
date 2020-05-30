
package com.dom.colare.domain.dto.lic.contrato_ini;

import lombok.Data;


/**
 * publicacao
 * <p>
 * Publicação do contrato.
 * 
 */
@Data
public class Publicacao {

    /**
     * Data da Publicação
     * (Required)
     * 
     */
    private String dataPublicacao;
    /**
     * Código do veículo da Publicação
     * (Required)
     * 
     */
    private int codVeiculoPublicacao;
    /**
     * Descrição
     * 
     */
    private String descricao;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    private String idDocumentoPDF;


}
