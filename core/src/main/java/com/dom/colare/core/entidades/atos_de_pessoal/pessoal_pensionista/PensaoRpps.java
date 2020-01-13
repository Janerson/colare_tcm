
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_pensionista;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * pensaoRpps
 * <p>
 * Contém as informações sobre os pensionistas RPPS, (exceto Judicial e Merce)
 * 
 */
@Entity(name = "PES_PENS_P_RPPS")
@Data
public class PensaoRpps extends BaseEntityID {

    /**
     * Informa se o servidor morreu em atividade
     * (Required)
     * 
     */
    @NotNull
    private Boolean morreuEmAtividade;
    /**
     * Informa o tipo de Situação Funcional do Instituidor da Pensão.
     * (Required)
     * 
     */
    @NotNull
    private Integer tipoSituacaoFuncionalInstituidor;
    /**
     * Informa qual era a situação funcional Instituidor da Pensão, caso seja ATIVO idPessoalAdmissão, inativo idPessoalAposentadoria, conforme previsto em tabela.
     * (Required)
     * 
     */
    @NotNull
    private Integer idSituacaoFuncionalInstituidorCorrespondente;
    /**
     * Informa o Óbito do servidor, via ID do Layout Desligamento Inatividade.
     * (Required)
     * 
     */
    @NotNull
    private Integer idVidaFuncionalDesligamentoInatividade;
    /**
     * requisitosAtoAdministrativo
     * <p>
     * Contém os dados do requerimento inicial.
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "PES_PENS_REQ_ID")
    private RequisitosAtoAdministrativo requisitosAtoAdministrativo;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "PES_PENS_P_RPPS_ID")
    private Set<Dependente> dependentes = new HashSet<>();


}
