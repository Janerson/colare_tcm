
package com.dom.colare.core.entidades.atos_de_pessoal.pes_admissao;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoAdmissaoTemporarioSemProcessoSeletivo
 * <p>
 * Informa os detalhamentos do ingresso do servidor temporário sem processo seletivo 
 * 
 */
@Entity(name = "PES_ADM_TEMPSEM")
@Data
public class DetalhamentoAdmissaoTemporarioSemProcessoSeletivo extends BaseEntityID {

    /**
     * Identificação (ID) da legislação anteriormente enviada
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalLegislacao;
    /**
     * Informa os detalhamentos da excepcionalidade do servidor ingressar o serviço público sem Processo Seletivo
     * (Required)
     * 
     */
    @NotNull
    private String detalhamentoExcepcionalidade;

}
