
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.aditivo;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;


/**
 * contratado
 * <p>
 * Dados do contratado
 * 
 */
public class Contratado {

    /**
     * Número da Certidão de Regularidade do INSS
     * 
     */
    public String numeroCertidaoRegularidadeINSS;
    /**
     * Número da Certidão de Regularidade do FGTS
     * 
     */
    public String numeroCertidaoRegularidadeFGTS;
    /**
     * Número da Certidão negativa de Débitos Trabalhistas
     * 
     */
    public String numeroCNDT;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<ItemAditivado> itemAditivado = null;
    @Valid
    public Set<QuadroSocietario> quadroSocietario = null;

}
