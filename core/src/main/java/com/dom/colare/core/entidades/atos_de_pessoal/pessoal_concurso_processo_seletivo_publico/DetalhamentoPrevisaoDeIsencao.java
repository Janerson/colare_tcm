
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoPrevisaoDeIsencao
 * <p>
 * Informa os dados sobre a possibilidade de isenção do pagamento de taxa de inscrição.
 * 
 */
@Entity(name = "PES_CON_INSC2")
@Data
public class DetalhamentoPrevisaoDeIsencao extends BaseEntityID {

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
