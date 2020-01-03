
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.regulamentacao_procedimentos_licitatorio;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * Regulamentacao Dos Procedimentos Licitatorios
 * <p>
 * Informações sobre a regulamentação municipal do pregão, registro de preços e LC 123/06
 * 
 */
@Entity
@Data
public class Regulamentacao extends BaseEntityID {

    /**
     * Tipo de regulamentação
     * (Required)
     * 
     */
    @NotNull
    private int codTipoRegulamentacao;
    /**
     * Informa a existência ou não de regulamentação municipal
     * (Required)
     * 
     */
    @NotNull
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
    @NotNull
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
    @Valid
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "regulamentacao")
   // @JoinColumn(name = "id_detalhamentolc123", referencedColumnName = "id")
    private DetalhamentoLc123 detalhamentoLc123;




}
