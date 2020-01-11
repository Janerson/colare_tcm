
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_dados_previdenciarios;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * dadosPrevidenciariosRpps
 * <p>
 * Informa os dados previdenciários do RPPS
 * 
 */
@Entity
@Data
public class DadosPrevidenciariosRpps extends BaseEntityID {

    /**
     * Identificação (ID) da legislação anteriormente enviada
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalLegislacao;
    /**
     * Informa alíquota da contribuição Patronal
     * (Required)
     * 
     */
    @NotNull
    private Double aliquotaContribuicaoPatronal;
    /**
     * Informa a Aliquota de Contribuicao dos Servidores
     * (Required)
     * 
     */
    @NotNull
    private Double aliquotaContribuicaoServidores;

}
