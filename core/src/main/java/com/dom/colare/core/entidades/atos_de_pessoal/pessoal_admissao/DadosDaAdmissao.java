
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_admissao;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * dadosDaAdmissao
 * <p>
 * informar dados da admissão de acordo com o período
 * 
 */
public class DadosDaAdmissao {

    /**
     * Informar se a admissão é anterior a 2020
     * (Required)
     * 
     */
    @NotNull
    private Boolean admissaoAnteriorA2020;
    /**
     * admissaoAte2019
     * <p>
     * Informar admissões até 2019
     * 
     */
    @Valid
    private AdmissaoAte2019 admissaoAte2019;
    /**
     * admissaoAPartirDe2020
     * <p>
     * Informar dados da admissão se ocorridas a partir de 2020
     * 
     */
    @Valid
    private AdmissaoAPartirDe2020 admissaoAPartirDe2020;

    /**
     * Informar se a admissão é anterior a 2020
     * (Required)
     * 
     */
    public Boolean getAdmissaoAnteriorA2020() {
        return admissaoAnteriorA2020;
    }

    /**
     * Informar se a admissão é anterior a 2020
     * (Required)
     * 
     */
    public void setAdmissaoAnteriorA2020(Boolean admissaoAnteriorA2020) {
        this.admissaoAnteriorA2020 = admissaoAnteriorA2020;
    }

    /**
     * admissaoAte2019
     * <p>
     * Informar admissões até 2019
     * 
     */
    public AdmissaoAte2019 getAdmissaoAte2019() {
        return admissaoAte2019;
    }

    /**
     * admissaoAte2019
     * <p>
     * Informar admissões até 2019
     * 
     */
    public void setAdmissaoAte2019(AdmissaoAte2019 admissaoAte2019) {
        this.admissaoAte2019 = admissaoAte2019;
    }

    /**
     * admissaoAPartirDe2020
     * <p>
     * Informar dados da admissão se ocorridas a partir de 2020
     * 
     */
    public AdmissaoAPartirDe2020 getAdmissaoAPartirDe2020() {
        return admissaoAPartirDe2020;
    }

    /**
     * admissaoAPartirDe2020
     * <p>
     * Informar dados da admissão se ocorridas a partir de 2020
     * 
     */
    public void setAdmissaoAPartirDe2020(AdmissaoAPartirDe2020 admissaoAPartirDe2020) {
        this.admissaoAPartirDe2020 = admissaoAPartirDe2020;
    }

}
