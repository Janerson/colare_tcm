
package com.dom.colare.domain.dto.lic.contrato_adt;

import com.dom.colare.domain.dto.BaseDTO;
import lombok.Data;

/**
 * publicacao
 * <p>
 * Publicação do contrato aditivo
 * 
 */
@Data
public class PublicacaoDTO extends BaseDTO {

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
    private Long codVeiculoPublicacao;
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
