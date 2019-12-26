
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_admissao;

import javax.validation.constraints.NotNull;


/**
 * detalhamentoAdmissaoTemporarioSemProcessoSeletivo
 * <p>
 * Informa os detalhamentos do ingresso do servidor temporário sem processo seletivo 
 * 
 */
public class DetalhamentoAdmissaoTemporarioSemProcessoSeletivo {

    /**
     * Identificação (ID) da legislação anteriormente enviada
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalLegislacao;
    /**
     * Informa os detalhamentos da excepcionalidade do servidor ingressar o serviço público sem Processo Seletivo
     * (Required)
     * 
     */
    @NotNull
    private String detalhamentoExcepcionalidade;

    /**
     * Identificação (ID) da legislação anteriormente enviada
     * (Required)
     * 
     */
    public Integer getIdPessoalLegislacao() {
        return idPessoalLegislacao;
    }

    /**
     * Identificação (ID) da legislação anteriormente enviada
     * (Required)
     * 
     */
    public void setIdPessoalLegislacao(Integer idPessoalLegislacao) {
        this.idPessoalLegislacao = idPessoalLegislacao;
    }

    /**
     * Informa os detalhamentos da excepcionalidade do servidor ingressar o serviço público sem Processo Seletivo
     * (Required)
     * 
     */
    public String getDetalhamentoExcepcionalidade() {
        return detalhamentoExcepcionalidade;
    }

    /**
     * Informa os detalhamentos da excepcionalidade do servidor ingressar o serviço público sem Processo Seletivo
     * (Required)
     * 
     */
    public void setDetalhamentoExcepcionalidade(String detalhamentoExcepcionalidade) {
        this.detalhamentoExcepcionalidade = detalhamentoExcepcionalidade;
    }

}
