
package com.dom.colare.domain.dto.licitacao.contrato.recisao;

import lombok.Data;


/**
 * privateacao
 * <p>
 * Publicação da rescisão contratual
 */
@Data
public class PublicacaoDTO  {

    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     */
    private String idDocumentoPDF;
    /**
     * Data da Publicação
     * (Required)
     */
    private String dataPublicacao;
    /**
     * Código do veículo da Publicação
     * (Required)
     */
    private int codVeiculoPublicacao;
    /**
     * Descrição
     */
    private String descricao;


}
