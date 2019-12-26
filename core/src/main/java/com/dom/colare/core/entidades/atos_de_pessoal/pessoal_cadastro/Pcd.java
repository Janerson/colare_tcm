
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_cadastro;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * pcd
 * <p>
 * Informar detalhes Pessoa com Deficiência
 * 
 */
public class Pcd {

    /**
     * Pessoa com Deficiencia
     * (Required)
     * 
     */
    @NotNull
    private Boolean pcD;
    /**
     * detalhamentoDeficiencia
     * <p>
     * Informa o detalhamento da deficiência.
     * 
     */
    @Valid
    private DetalhamentoDeficiencia detalhamentoDeficiencia;

    /**
     * Pessoa com Deficiencia
     * (Required)
     * 
     */
    public Boolean getPcD() {
        return pcD;
    }

    /**
     * Pessoa com Deficiencia
     * (Required)
     * 
     */
    public void setPcD(Boolean pcD) {
        this.pcD = pcD;
    }

    /**
     * detalhamentoDeficiencia
     * <p>
     * Informa o detalhamento da deficiência.
     * 
     */
    public DetalhamentoDeficiencia getDetalhamentoDeficiencia() {
        return detalhamentoDeficiencia;
    }

    /**
     * detalhamentoDeficiencia
     * <p>
     * Informa o detalhamento da deficiência.
     * 
     */
    public void setDetalhamentoDeficiencia(DetalhamentoDeficiencia detalhamentoDeficiencia) {
        this.detalhamentoDeficiencia = detalhamentoDeficiencia;
    }

}
