
package com.dom.colare.core.entidades.lic.contrato_resc;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * empenhoAnulado
 * <p>
 * Dados dos empenhos anulados em decorrência da rescisão do contrato
 * 
 */
@Entity(name = "EMP_ANULADO_RES")
@Data
public class EmpenhoAnulado extends BaseEntityID {

    /**
     * Número do empenho
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    @Column
    private Integer numeroEmpenho;
    /**
     * Data de emissão do empenho
     * (Required)
     * 
     */
    @NotNull
    @Column
    private String dataEmpenho;
    /**
     * Data em que o empenho foi anulado.
     * (Required)
     * 
     */
    @NotNull
    @Column
    private String dataAnulacaoEmpenho;
    /**
     * Valor anulado do empenho
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    @Column
    private Double valorAnulacaoEmpenho;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    @Column
    private String idDocumentoPDF;
    


}
