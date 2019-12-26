
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_pensionista;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * pensaoRpps
 * <p>
 * Contém as informações sobre os pensionistas RPPS, (exceto Judicial e Merce)
 * 
 */
public class PensaoRpps {

    /**
     * Informa se o servidor morreu em atividade
     * (Required)
     * 
     */
    @NotNull
    public Boolean morreuEmAtividade;
    /**
     * Informa o tipo de Situação Funcional do Instituidor da Pensão.
     * (Required)
     * 
     */
    @NotNull
    public PensaoRpps.TipoSituacaoFuncionalInstituidor tipoSituacaoFuncionalInstituidor;
    /**
     * Informa qual era a situação funcional Instituidor da Pensão, caso seja ATIVO idPessoalAdmissão, inativo idPessoalAposentadoria, conforme previsto em tabela.
     * (Required)
     * 
     */
    @NotNull
    public Integer idSituacaoFuncionalInstituidorCorrespondente;
    /**
     * Informa o Óbito do servidor, via ID do Layout Desligamento Inatividade.
     * (Required)
     * 
     */
    @NotNull
    public Integer idVidaFuncionalDesligamentoInatividade;
    /**
     * requisitosAtoAdministrativo
     * <p>
     * Contém os dados do requerimento inicial.
     * (Required)
     * 
     */
    @Valid
    @NotNull
    public RequisitosAtoAdministrativo requisitosAtoAdministrativo;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<Dependente> dependentes = null;

    public enum TipoSituacaoFuncionalInstituidor {

        _1(1),
        _2(2);
        private final Integer value;
        private final static Map<Integer, TipoSituacaoFuncionalInstituidor> CONSTANTS = new HashMap<Integer, TipoSituacaoFuncionalInstituidor>();

        static {
            for (TipoSituacaoFuncionalInstituidor c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TipoSituacaoFuncionalInstituidor(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static TipoSituacaoFuncionalInstituidor fromValue(Integer value) {
            TipoSituacaoFuncionalInstituidor constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
