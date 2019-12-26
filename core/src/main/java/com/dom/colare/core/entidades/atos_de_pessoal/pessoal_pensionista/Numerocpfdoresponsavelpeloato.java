
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_pensionista;

import javax.validation.constraints.NotNull;


/**
 * numerocpfdoresponsavelpeloato
 * <p>
 * Informar o(s) CPF(s) do(s) responsáveis que assinaram o ato administrativo da concessão da pensão.
 * 
 */
public class Numerocpfdoresponsavelpeloato {

    /**
     * Número do CPF
     * (Required)
     * 
     */
    @NotNull
    public String numeroCpf;

}
