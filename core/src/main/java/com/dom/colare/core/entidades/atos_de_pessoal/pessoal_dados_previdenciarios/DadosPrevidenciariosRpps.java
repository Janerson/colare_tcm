
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_dados_previdenciarios;

import javax.validation.constraints.NotNull;


/**
 * dadosPrevidenciariosRpps
 * <p>
 * Informa os dados previdenciários do RPPS
 * 
 */
public class DadosPrevidenciariosRpps {

    /**
     * Identificação (ID) da legislação anteriormente enviada
     * (Required)
     * 
     */
    @NotNull
    public Integer idPessoalLegislacao;
    /**
     * Informa alíquota da contribuição Patronal
     * (Required)
     * 
     */
    @NotNull
    public Double aliquotaContribuicaoPatronal;
    /**
     * Informa a Aliquota de Contribuicao dos Servidores
     * (Required)
     * 
     */
    @NotNull
    public Double aliquotaContribuicaoServidores;

}
