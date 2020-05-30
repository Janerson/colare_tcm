
package com.dom.colare.core.entidades.atos_de_pessoal.pes_dados_prev;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * dadosRgpsUnidadesGestoras
 * <p>
 * Informa os dados previdenciários do RGPS
 * 
 */
@Entity(name = "PES_DADOSRGPS")
@Data
public class DadosRgpsUnidadesGestora extends BaseEntityID {

    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * (Required)
     * 
     */
    @NotNull
    private Integer idUnidadeGestora;
    /**
     * Informa o numero do CNAE
     * (Required)
     * 
     */
    @NotNull
    private Integer numeroCNAE;
    /**
     * Informa a aliquota RAT
     * (Required)
     * 
     */
    @DecimalMin("1")
    @DecimalMax("3")
    @NotNull
    private Double aliquotaRAT;
    /**
     * Informa a aliquota FAP
     * (Required)
     * 
     */
    @NotNull
    private Double aliquotaFAP;

}
