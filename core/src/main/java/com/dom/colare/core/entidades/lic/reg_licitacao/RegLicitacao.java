
package com.dom.colare.core.entidades.lic.reg_licitacao;

import com.dom.colare.core.entidades.shared.Arquivo;
import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * Regulamentacao Dos Procedimentos Licitatorios
 * <p>
 * Informações sobre a regulamentação municipal do pregão, registro de preços e LC 123/06
 * 
 */
@Entity(name = "REG_LICITACAO")
@Data
public class RegLicitacao extends BaseEntityID {

    /**
     * Tipo de regulamentação
     * (Required)
     * 
     */
    @NotNull
    @Column
    private int codTipoRegulamentacao;
    /**
     * Informa a existência ou não de regulamentação municipal
     * (Required)
     * 
     */
    @NotNull
    @Column
    private Boolean existeRegulamentacaoMunicipal;
    /**
     * Número do Decreto Municipal Regulamentador do Pregão, Registro de Preços ou da LC 123-06
     * 
     */
    @Column
    private String numeroDecretoMunicipal;
    /**
     * Data do Decreto Municipal
     * 
     */
    @Column
    private String dataDecretoMunicipal;
    /**
     * Data da Publicação
     * 
     */
    @Column
    private String dataPublicacao;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * 
     */
    @Column
    private String idDocumentoPDF;
    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    @Column
    private int codTipoEnvio;
    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    @Column
    private String motivoAtualizacaoCorrecao;
    /**
     * detalhamentoLc123
     * <p>
     * Detalhamento da regulamentação do Artigo 47 da Lei Complementar 123/06
     * 
     */
    @Valid
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "DETALHALC123_ID")
    private DetalhamentoLc123 detalhamentoLc123;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ARQUIVO_ID")
    private Arquivo arquivo;

}
