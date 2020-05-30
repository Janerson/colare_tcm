
package com.dom.colare.core.entidades.atos_de_pessoal.pes_con_psp;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * autorizacaoLdo
 * <p>
 * Informa dados da autorização na LDO para realização da Seleção.
 * 
 */
@Entity(name = "PES_CON_AUT_LDO")
@Data
public class AutorizacaoLdo extends BaseEntityID {

    /**
     * Identificação (ID) da legislação anteriormente enviada
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalLegislacao;
    /**
     * Artigo da Legislação ou Norma
     * (Required)
     * 
     */
    @NotNull
    private String artigo;

}
