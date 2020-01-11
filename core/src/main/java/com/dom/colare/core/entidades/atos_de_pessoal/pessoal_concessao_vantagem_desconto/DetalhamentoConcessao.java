
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concessao_vantagem_desconto;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoConcessao
 * <p>
 * Contém o Detalhamento da Concessão
 * 
 */
@Entity
@Data
public class DetalhamentoConcessao extends BaseEntityID {

    /**
     * Informa o tipo de concessão
     * (Required)
     * 
     */
    @NotNull
    private Integer tipoConcessao;
    /**
     * posicaoVencimentoCarreira
     * <p>
     * Contém as informações sobre o posicionamento vencimental do servidor na carreira.
     * 
     */
    @Valid
    @OneToOne
    @JoinColumn(name = "detalhamento_concessao_id")
    private PosicaoVencimentoCarreira posicaoVencimentoCarreira;
    /**
     * verba
     * <p>
     * Contém as Informações referente a Verba (Remuneração Desconto) aplicada ao Servidor Ativo, Inativo ou o Pensionista.
     * 
     */
    @Valid
    @OneToOne
    @JoinColumn(name = "detalhamento_concessao_id")
    private Verba verba;

}
