
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_admissao;

import javax.validation.constraints.NotNull;


/**
 * admissaoAte2019
 * <p>
 * Informar admissões até 2019
 * 
 */
public class AdmissaoAte2019 {

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

    /**
     * Informa o numero de protocolo do Processo Admissão autuado no TCMGO, numero do processo composto por 5 dígitos + e ano em 4 dígitos.
     * (Required)
     * 
     */
    public String getNumeroProcessoAdmissao() {
        return numeroProcessoAdmissao;
    }

    /**
     * Informa o numero de protocolo do Processo Admissão autuado no TCMGO, numero do processo composto por 5 dígitos + e ano em 4 dígitos.
     * (Required)
     * 
     */
    public void setNumeroProcessoAdmissao(String numeroProcessoAdmissao) {
        this.numeroProcessoAdmissao = numeroProcessoAdmissao;
    }

    /**
     * Inserir o numero do Acordão do TCM
     * (Required)
     * 
     */
    public String getNumeroAcordaoTCM() {
        return numeroAcordaoTCM;
    }

    /**
     * Inserir o numero do Acordão do TCM
     * (Required)
     * 
     */
    public void setNumeroAcordaoTCM(String numeroAcordaoTCM) {
        this.numeroAcordaoTCM = numeroAcordaoTCM;
    }

    /**
     * Informa o nome do cargo conforme registrado no TCMGO.
     * (Required)
     * 
     */
    public String getNomeDoCargoRegistrado() {
        return nomeDoCargoRegistrado;
    }

    /**
     * Informa o nome do cargo conforme registrado no TCMGO.
     * (Required)
     * 
     */
    public void setNomeDoCargoRegistrado(String nomeDoCargoRegistrado) {
        this.nomeDoCargoRegistrado = nomeDoCargoRegistrado;
    }

}
