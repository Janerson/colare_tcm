
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_admissao;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * admissaoAPartirDe2020
 * <p>
 * Informar dados da admissão se ocorridas a partir de 2020
 * 
 */
@Entity
@Data
public class AdmissaoAPartirDe2020 extends BaseEntityID {

    /**
     * Informa o ID da Homologação
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalHomologacao;
    /**
     * Tipo de Lista de Classificacao
     * (Required)
     * 
     */
    @NotNull
    private Integer tipoListaClassificacao;
    /**
     * Informar a numero da classificação do candidato
     * (Required)
     * 
     */
    @NotNull
    private Integer numeroOrdemClassificacao;


}
