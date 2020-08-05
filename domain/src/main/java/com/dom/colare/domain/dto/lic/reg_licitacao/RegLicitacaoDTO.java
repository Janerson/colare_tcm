
package com.dom.colare.domain.dto.lic.reg_licitacao;

import com.dom.colare.domain.dto.ArquivoDTO;
import com.dom.colare.domain.dto.BaseDTO;
import lombok.Data;

/**
 * regulamentacaoDosProcedimentosLicitatorios
 * <p>
 * Informações sobre a regulamentação municipal do pregão, registro de preços e LC 123/06
 * 
 */
@Data
public class RegLicitacaoDTO extends BaseDTO {

    /**
     * Tipo de regulamentação
     * (Required)
     * 
     */
    private int codTipoRegulamentacao;
    /**
     * Informa a existência ou não de regulamentação municipal
     * (Required)
     * 
     */
    private Boolean existeRegulamentacaoMunicipal;
    /**
     * Número do Decreto Municipal Regulamentador do Pregão, Registro de Preços ou da LC 123-06
     * 
     */
    private String numeroDecretoMunicipal;
    /**
     * Data do Decreto Municipal
     * 
     */
    private String dataDecretoMunicipal;
    /**
     * Data da Publicação
     * 
     */
    private String dataPublicacao;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * 
     */
    private String idDocumentoPDF;
    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    private int codTipoEnvio;
    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    private String motivoAtualizacaoCorrecao;
    /**
     * detalhamentoLc123
     * <p>
     * Detalhamento da regulamentação do Artigo 47 da Lei Complementar 123/06
     * 
     */
    private DetalhamentoLc123DTO detalhamentoLc123;

    private ArquivoDTO arquivo;


}
