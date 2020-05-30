
package com.dom.colare.core.entidades.atos_de_pessoal.pes_admissao;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * admissaoAte2019
 * <p>
 * Informar admissões até 2019
 * 
 */
@Entity(name = "PES_ADM_ATE2019")
@Data
public class AdmissaoAte2019 extends BaseEntityID {

    /**
     * Informa o numero de protocolo do Processo Admissão autuado no TCMGO, numero do processo composto por 5 dígitos + e ano em 4 dígitos.
     * (Required)
     * 
     */
    @NotNull
    private String numeroProcessoAdmissao;
    /**
     * Inserir o numero do Acordão do TCM
     * (Required)
     * 
     */
    @NotNull
    private String numeroAcordaoTCM;
    /**
     * Informa o nome do cargo conforme registrado no TCMGO.
     * (Required)
     * 
     */
    @NotNull
    private String nomeDoCargoRegistrado;


}
