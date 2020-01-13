
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoPrevisaoDeDevolucaoPagamentoEmDuplicidade
 * <p>
 * Informa os dados da previsão de devolução da taxa de inscrição no caso de pagamento em duplicidade.
 * 
 */
@Entity(name = "PES_CON_INSC4")
@Data
public class DetalhamentoPrevisaoDeDevolucaoPagamentoEmDuplicidade extends BaseEntityID {

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
