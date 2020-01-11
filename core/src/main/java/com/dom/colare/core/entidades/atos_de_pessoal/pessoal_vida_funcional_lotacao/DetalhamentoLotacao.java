
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_vida_funcional_lotacao;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoLotacao
 * <p>
 * Detalhamento da lotação do servidor
 * 
 */
@Entity
@Data
public class DetalhamentoLotacao extends BaseEntityID {

    /**
     * Informa o tipo de local de locação do servidor.
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoLotacao;
    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * (Required)
     * 
     */
    @NotNull
    private Integer idUnidadeGestora;
    /**
     * Informa o Nome do Local de Lotação. Exemplo: "Gerência de Recursos Humanos e Folha de Pagamento"
     * (Required)
     * 
     */
    @NotNull
    private String nomeLocalLotacao;
    /**
     * Informa o nome do Departamento ou Setor (se existir)  no qual o servidor foi lotado. Exemplo : "Setor de Folha de Pagamento"
     * (Required)
     * 
     */
    @NotNull
    private String nomeDepartamentoSetorLotacao;

}
