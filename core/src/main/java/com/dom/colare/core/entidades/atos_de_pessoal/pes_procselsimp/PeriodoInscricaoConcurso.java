
package com.dom.colare.core.entidades.atos_de_pessoal.pes_procselsimp;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * periodoInscricaoConcurso
 * <p>
 * Informa Periodo Inscrição da Seleção
 * 
 */
@Entity(name = "PES_PSS_PRD_INS")
@Data
public class PeriodoInscricaoConcurso extends BaseEntityID {

    /**
     * Data de Inicio
     * (Required)
     * 
     */
    @NotNull
    private String dataInicio;
    /**
     * Data fim
     * (Required)
     * 
     */
    @NotNull
    private String dataFinal;
    /**
     * Número do Item do Edital
     * (Required)
     * 
     */
    @NotNull
    private String numeroItemDoEdital;
    /**
     * Descrição
     * (Required)
     * 
     */
    @NotNull
    private String descricao;

}
