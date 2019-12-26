
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_cargos;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * dedicacaoExclusiva
 * <p>
 * Informar se o cargo é de dedicação exclusiva
 * 
 */
public class DedicacaoExclusiva {

    /**
     * Informa se o cargo possui regime de dedicação exclusiva
     * (Required)
     * 
     */
    @NotNull
    private Boolean cargoDedicacaoExclusiva;
    /**
     * detalhamentoDedicacaoExclusiva
     * <p>
     * Informar os detalhes da dedicação exclusiva
     * 
     */
    @Valid
    private DetalhamentoDedicacaoExclusiva detalhamentoDedicacaoExclusiva;

    /**
     * Informa se o cargo possui regime de dedicação exclusiva
     * (Required)
     * 
     */
    public Boolean getCargoDedicacaoExclusiva() {
        return cargoDedicacaoExclusiva;
    }

    /**
     * Informa se o cargo possui regime de dedicação exclusiva
     * (Required)
     * 
     */
    public void setCargoDedicacaoExclusiva(Boolean cargoDedicacaoExclusiva) {
        this.cargoDedicacaoExclusiva = cargoDedicacaoExclusiva;
    }

    /**
     * detalhamentoDedicacaoExclusiva
     * <p>
     * Informar os detalhes da dedicação exclusiva
     * 
     */
    public DetalhamentoDedicacaoExclusiva getDetalhamentoDedicacaoExclusiva() {
        return detalhamentoDedicacaoExclusiva;
    }

    /**
     * detalhamentoDedicacaoExclusiva
     * <p>
     * Informar os detalhes da dedicação exclusiva
     * 
     */
    public void setDetalhamentoDedicacaoExclusiva(DetalhamentoDedicacaoExclusiva detalhamentoDedicacaoExclusiva) {
        this.detalhamentoDedicacaoExclusiva = detalhamentoDedicacaoExclusiva;
    }

}
