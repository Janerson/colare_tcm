
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_admissao;

import javax.validation.constraints.NotNull;


/**
 * municipioGoiano
 * <p>
 * Informar os dados do município goiano quando a acumulação de cargo for na esfera municipal.
 * 
 */
public class MunicipioGoiano {

    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * (Required)
     * 
     */
    @NotNull
    private Integer idUnidadeGestora;
    /**
     * Informa o nome do Departamento ou Setor onde o servidor acumula cargo
     * (Required)
     * 
     */
    @NotNull
    private String nomeDepartamentoSetor;
    /**
     * ID do Cargo 
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalCargo;

    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * (Required)
     * 
     */
    public Integer getIdUnidadeGestora() {
        return idUnidadeGestora;
    }

    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * (Required)
     * 
     */
    public void setIdUnidadeGestora(Integer idUnidadeGestora) {
        this.idUnidadeGestora = idUnidadeGestora;
    }

    /**
     * Informa o nome do Departamento ou Setor onde o servidor acumula cargo
     * (Required)
     * 
     */
    public String getNomeDepartamentoSetor() {
        return nomeDepartamentoSetor;
    }

    /**
     * Informa o nome do Departamento ou Setor onde o servidor acumula cargo
     * (Required)
     * 
     */
    public void setNomeDepartamentoSetor(String nomeDepartamentoSetor) {
        this.nomeDepartamentoSetor = nomeDepartamentoSetor;
    }

    /**
     * ID do Cargo 
     * (Required)
     * 
     */
    public Integer getIdPessoalCargo() {
        return idPessoalCargo;
    }

    /**
     * ID do Cargo 
     * (Required)
     * 
     */
    public void setIdPessoalCargo(Integer idPessoalCargo) {
        this.idPessoalCargo = idPessoalCargo;
    }

}
