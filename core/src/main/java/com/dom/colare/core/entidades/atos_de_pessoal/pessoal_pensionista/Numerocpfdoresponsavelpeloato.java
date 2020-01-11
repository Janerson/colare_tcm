
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_pensionista;

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
@Entity
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
