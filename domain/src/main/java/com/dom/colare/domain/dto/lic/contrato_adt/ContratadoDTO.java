
package com.dom.colare.domain.dto.lic.contrato_adt;

import lombok.Data;

import java.util.Set;


/**
 * contratado
 * <p>
 * Dados do contratado
 * 
 */
@Data
public class ContratadoDTO {

    /**
     * Número da Certidão de Regularidade do INSS
     * 
     */
    private String numeroCertidaoRegularidadeINSS;
    /**
     * Número da Certidão de Regularidade do FGTS
     * 
     */
    private String numeroCertidaoRegularidadeFGTS;
    /**
     * Número da Certidão negativa de Débitos Trabalhistas
     * 
     */
    private String numeroCNDT;
    /**
     * 
     * (Required)
     * 
     */
    private Set<ItemAditivadoDTO> itemAditivado = null;
    private Set<QuadroSocietarioDTO> quadroSocietario = null;


}
