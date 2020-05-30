
package com.dom.colare.domain.dto.lic.contrato_ini;

import lombok.Data;

/**
 * responsaveis
 * <p>
 * Responsáveis pelo contrato
 * 
 */
@Data
public class Responsavel {

    /**
     * Número do CPF
     * (Required)
     * 
     */
    private String numeroCpf;
    /**
     * Código do tipo de responsabilidade
     * (Required)
     * 
     */
    private int codTipoResponsabilidade;


}
