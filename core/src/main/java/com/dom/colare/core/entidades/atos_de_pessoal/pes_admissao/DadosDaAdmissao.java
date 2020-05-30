
package com.dom.colare.core.entidades.atos_de_pessoal.pes_admissao;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * dadosDaAdmissao
 * <p>
 * informar dados da admissão de acordo com o período
 * 
 */
@Entity(name = "PES_ADM_DADOADM")
@Data
public class DadosDaAdmissao extends BaseEntityID {

    /**
     * Informar se a admissão é anterior a 2020
     * (Required)
     * 
     */
    @NotNull
    private Boolean admissaoAnteriorA2020;
    /**
     * admissaoAte2019
     * <p>
     * Informar admissões até 2019
     * 
     */
    @Valid
    @OneToOne
    @JoinColumn(name = "PES_ADM_ATE2019_ID")
    private AdmissaoAte2019 admissaoAte2019;
    /**
     * admissaoAPartirDe2020
     * <p>
     * Informar dados da admissão se ocorridas a partir de 2020
     * 
     */
    @Valid
    @OneToOne
    @JoinColumn(name = "PES_ADM_ADM2020_ID")
    private AdmissaoAPartirDe2020 admissaoAPartirDe2020;

}
