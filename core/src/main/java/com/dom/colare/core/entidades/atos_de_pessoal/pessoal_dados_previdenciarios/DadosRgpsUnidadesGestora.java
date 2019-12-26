
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_dados_previdenciarios;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * dadosRgpsUnidadesGestoras
 * <p>
 * Informa os dados previdenciários do RGPS
 * 
 */
public class DadosRgpsUnidadesGestora {

    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * (Required)
     * 
     */
    @NotNull
    public Integer idUnidadeGestora;
    /**
     * Informa o numero do CNAE
     * (Required)
     * 
     */
    @NotNull
    public Integer numeroCNAE;
    /**
     * Informa a aliquota RAT
     * (Required)
     * 
     */
    @DecimalMin("1")
    @DecimalMax("3")
    @NotNull
    public Double aliquotaRAT;
    /**
     * Informa a aliquota FAP
     * (Required)
     * 
     */
    @NotNull
    public Double aliquotaFAP;

}
