
package com.dom.colare.core.entidades.atos_de_pessoal.pes_pensionist;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * numerocpfdoresponsavelpeloato
 * <p>
 * Informar o(s) CPF(s) do(s) responsáveis que assinaram o ato administrativo da concessão da pensão.
 * 
 */
@Entity(name = "PES_PENS_RESPAT")
@Data
public class Numerocpfdoresponsavelpeloato extends BaseEntityID {

    /**
     * Número do CPF
     * (Required)
     * 
     */
    @NotNull
    private String numeroCpf;

}
