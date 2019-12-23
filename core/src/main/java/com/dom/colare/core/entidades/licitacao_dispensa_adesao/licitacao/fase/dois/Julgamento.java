
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.dois;

import javax.validation.constraints.NotNull;


/**
 * julgamento
 * <p>
 * Julgamento das propostas, por licitante
 * 
 */
public class Julgamento {

    /**
     * Informar se foi registrado em ata a presença do preposto do licitante
     * (Required)
     * 
     */
    @NotNull
    public Boolean registrouEmAtaPresencaPrepostoDoLicitante;
    /**
     * Informar se o licitante renunciou ao prazo recursal
     * (Required)
     * 
     */
    @NotNull
    public Boolean renunciaPrazoRecursal;

}
