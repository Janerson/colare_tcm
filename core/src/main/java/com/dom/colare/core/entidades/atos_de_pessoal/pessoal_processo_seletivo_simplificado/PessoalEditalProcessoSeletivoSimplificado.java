
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_processo_seletivo_simplificado;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * pessoalEditalProcessoSeletivoSimplificado
 * <p>
 * Dados do Edital de Processo Seletivo Simplificado
 * 
 */
public class PessoalEditalProcessoSeletivoSimplificado {

    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    public PessoalEditalProcessoSeletivoSimplificado.CodTipoEnvio codTipoEnvio;
    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    public String motivoAtualizacaoCorrecao;
    /**
     * Número do Edital
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    public Integer numeroEdital;
    /**
     * Ano do Edital
     * (Required)
     * 
     */
    @NotNull
    public Integer anoEdital;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<TextoEdital> textoEdital = null;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<DetalhamentoExcepcionalInteressePublico> detalhamentoExcepcionalInteressePublico = null;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<DetalhamentoPublicidadeExtratoEdital> detalhamentoPublicidadeExtratoEdital = null;
    /**
     * detalhamentoBancaExaminadora
     * <p>
     * Informa Detalhamento Banca Examinadora
     * (Required)
     * 
     */
    @Valid
    @NotNull
    public DetalhamentoBancaExaminadora detalhamentoBancaExaminadora;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<DetalhamentoFuncaoSelecao> detalhamentoFuncaoSelecao = null;
    /**
     * validadeProcessoSeletivo
     * <p>
     * Informa Validade Processo Seletivo
     * (Required)
     * 
     */
    @Valid
    @NotNull
    public ValidadeProcessoSeletivo validadeProcessoSeletivo;
    /**
     * duracaoMaximaContratos
     * <p>
     * Informa a Duracao Maxima dos Contratos
     * (Required)
     * 
     */
    @Valid
    @NotNull
    public DuracaoMaximaContratos duracaoMaximaContratos;
    /**
     * periodoInscricaoConcurso
     * <p>
     * Informa Periodo Inscrição da Seleção
     * (Required)
     * 
     */
    @Valid
    @NotNull
    public PeriodoInscricaoConcurso periodoInscricaoConcurso;

    public enum CodTipoEnvio {

        _1(1),
        _2(2),
        _3(3);
        private final Integer value;
        private final static Map<Integer, CodTipoEnvio> CONSTANTS = new HashMap<Integer, CodTipoEnvio>();

        static {
            for (CodTipoEnvio c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoEnvio(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoEnvio fromValue(Integer value) {
            CodTipoEnvio constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
