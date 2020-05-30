
package com.dom.colare.domain.dto.lic.contrato_ini;

import lombok.Data;

import java.util.Set;


/**
 * dispensaEInexigibilidade
 * <p>
 * Preencher exclusivamente e obrigatoriamente quando codTipoProcedimento for igual a "2-Dispensa", com os dados da dispensa/inexigibilidade da qual resultou o contrato.
 * 
 */
@Data
public class DispensaEInexigibilidade {

    /**
     * Tipo do processo de Dispensa
     * (Required)
     * 
     */
    private int codTipoProcesso;
    /**
     * Exercício do Processo de Dispensa
     * (Required)
     * 
     */
    private Integer exercicioProcesso;
    private Set<EditalEAnexo> editalEAnexos = null;

}
