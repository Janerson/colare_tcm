
package com.dom.colare.domain.dto.licitacao.reg_licitacao;

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
    public int codTipoRegulamentacao;
    /**
     * Informa a existência ou não de regulamentação municipal
     * (Required)
     * 
     */
    public Boolean existeRegulamentacaoMunicipal;
    /**
     * Número do Decreto Municipal Regulamentador do Pregão, Registro de Preços ou da LC 123-06
     * 
     */
    public String numeroDecretoMunicipal;
    /**
     * Data do Decreto Municipal
     * 
     */
    public String dataDecretoMunicipal;
    /**
     * Data da Publicação
     * 
     */
    public String dataPublicacao;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * 
     */
    public String idDocumentoPDF;
    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    public int codTipoEnvio;
    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    public String motivoAtualizacaoCorrecao;
    /**
     * detalhamentoLc123
     * <p>
     * Detalhamento da regulamentação do Artigo 47 da Lei Complementar 123/06
     * 
     */
    public DetalhamentoLc123DTO detalhamentoLc123;


}
