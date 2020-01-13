
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_admissao;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * dadosDaAcumulacao
 * <p>
 * Informar dados de acumulação
 * 
 */
@Entity(name = "PES_ADM_DADOSAC")
@Data
public class DadosDaAcumulacao extends BaseEntityID {

    /**
     * Informa qual a esfera a qual o servidor acumula cargo.
     * (Required)
     * 
     */
    @NotNull
    private Integer codEsferaAcumulacao;
    /**
     * Informa o código do IBGE
     * (Required)
     * 
     */
    @NotNull
    private String codIBGEDoEnteOndeHaAcumulacao;
    /**
     * municipioGoiano
     * <p>
     * Informar os dados do município goiano quando a acumulação de cargo for na esfera municipal.
     * 
     */
    @Valid
    @OneToOne
    @JoinColumn(name = "PES_ADM_ACUM2_ID")
    private MunicipioGoiano municipioGoiano;


}
