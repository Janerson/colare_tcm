
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.dois;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * habilitacao
 * <p>
 * Habilitação do licitante
 * 
 */
@Entity(name = "HABILIT_FASE2")
@Data
public class Habilitacao extends BaseEntityID {

    /**
     * Informar se foi registrado em ata a presença do preposto do licitante
     * (Required)
     * 
     */
    @NotNull
    private Boolean registrouEmAtaPresencaPrepostoDoLicitante;
    /**
     * Informar se o licitante renunciou ao prazo recursal
     * (Required)
     * 
     */
    @NotNull
    private Boolean renunciaPrazoRecursal;
    /**
     * Status da Habilitação
     * (Required)
     * 
     */
    @NotNull
    private Integer statusHabilitacao;
    /**
     * Motivo da Inabilitação
     * 
     */
    private String motivoDaInabilitacao;

}
