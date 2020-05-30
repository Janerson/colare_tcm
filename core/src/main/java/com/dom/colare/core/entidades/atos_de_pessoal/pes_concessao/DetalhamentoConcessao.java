
package com.dom.colare.core.entidades.atos_de_pessoal.pes_concessao;

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
@Entity(name = "PES_CONCESSAODT")
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
    @JoinColumn(name = "PES_POS_VNCT_CR_ID")
    private PosicaoVencimentoCarreira posicaoVencimentoCarreira;
    /**
     * verba
     * <p>
     * Contém as Informações referente a Verba (Remuneração Desconto) aplicada ao Servidor Ativo, Inativo ou o Pensionista.
     * 
     */
    @Valid
    @OneToOne
    @JoinColumn(name = "PES_CONCS_VERBA")
    private Verba verba;

}
