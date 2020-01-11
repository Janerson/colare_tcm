
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_pensionista;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * dependentes
 * <p>
 * Contém as Informações dos Dependentes do Instituidor
 * 
 */
@Entity
@Data
public class Dependente extends BaseEntityID {

    /**
     * ID do Cadastro Pessoal
     * (Required)
     * 
     */
    @NotNull
    private Integer idCadastroPessoal;
    /**
     * Informar o tipo de dependência do pensionista, conforme tabela
     * (Required)
     * 
     */
    @NotNull
    private Integer tipoDependente;
    /**
     * Informa se o dependemte possui filhos com o Instituidor da pensão
     * (Required)
     * 
     */
    @NotNull
    private Boolean dependentePossuiFIlho;
    /**
     * Informa a Data Final da Pensão
     * (Required)
     * 
     */
    @NotNull
    private String dataFinalPensao;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "dependente_id")
    private Set<DocumentosComprobatoriosDependencia> documentosComprobatoriosDependencia = new HashSet<>();



}
