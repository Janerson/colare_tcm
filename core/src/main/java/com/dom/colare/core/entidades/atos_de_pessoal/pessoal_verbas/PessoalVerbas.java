
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_verbas;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;


/**
 * pessoalVerbas
 * <p>
 * Dados das Verbas, seja remuneração ou descontos.
 * 
 */
public class PessoalVerbas {

    /**
     * Identificação (ID) da legislação anteriormente enviada
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalLegislacao;
    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    private String motivoAtualizacaoCorrecao;
    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    private PessoalVerbas.CodTipoEnvio codTipoEnvio;
    /**
     * Nome da Verba, seja ela remuneração ou desconto.
     * (Required)
     * 
     */
    @NotNull
    private String nomeVerba;
    /**
     * Codigo do Vinculo por Tipo de Cargo
     * (Required)
     * 
     */
    @NotNull
    private PessoalVerbas.CodVinculoTipoQuadroCargo codVinculoTipoQuadroCargo;
    /**
     * Tipo de Verba
     * (Required)
     * 
     */
    @NotNull
    private PessoalVerbas.CodTipoVerba codTipoVerba;
    /**
     * Categoria Remuneracao
     * 
     */
    private CodCategoriaRemuneracao codCategoriaRemuneracao;
    /**
     * Categoria Desconto
     * 
     */
    private CodCategoriaDesconto codCategoriaDesconto;
    /**
     * Incidencia Previdenciaria
     * (Required)
     * 
     */
    @NotNull
    private Boolean incidenciaPrevidenciaria;
    /**
     * Verba Transitoria
     * (Required)
     * 
     */
    @NotNull
    private Boolean verbaTransitoria;
    /**
     * Natureza da Remuneracao
     * 
     */
    private CodNaturezaRemuneracao codNaturezaRemuneracao;
    /**
     * Natureza Desconto
     * 
     */
    private CodNaturezaDesconto codNaturezaDesconto;
    /**
     * Data de Inicio
     * (Required)
     * 
     */
    @NotNull
    private String dataInicio;
    /**
     * Data fim
     * (Required)
     * 
     */
    @NotNull
    private String dataFinal;
    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * (Required)
     * 
     */
    @NotNull
    private Integer idUnidadeGestora;
    /**
     * vinculoCargoEspecifico
     * <p>
     * Informa se a verba é vinculada a algum cargo em especifico.
     * (Required)
     * 
     */
    @Valid
    @NotNull
    private VinculoCargoEspecifico vinculoCargoEspecifico;
    /**
     * formaDeCalculo
     * <p>
     * Informar a Forma De Calculo
     * (Required)
     * 
     */
    @Valid
    @NotNull
    private FormaDeCalculo formaDeCalculo;
    /**
     * codificacaoNaturezaDespesa
     * <p>
     * Informa os Dados da Codificação Natureza Despesa
     * (Required)
     * 
     */
    @Valid
    @NotNull
    private CodificacaoNaturezaDespesa codificacaoNaturezaDespesa;

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
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    public String getMotivoAtualizacaoCorrecao() {
        return motivoAtualizacaoCorrecao;
    }

    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    public void setMotivoAtualizacaoCorrecao(String motivoAtualizacaoCorrecao) {
        this.motivoAtualizacaoCorrecao = motivoAtualizacaoCorrecao;
    }

    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    public CodTipoEnvio getCodTipoEnvio() {
        return codTipoEnvio;
    }

    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    public void setCodTipoEnvio(CodTipoEnvio codTipoEnvio) {
        this.codTipoEnvio = codTipoEnvio;
    }

    /**
     * Nome da Verba, seja ela remuneração ou desconto.
     * (Required)
     * 
     */
    public String getNomeVerba() {
        return nomeVerba;
    }

    /**
     * Nome da Verba, seja ela remuneração ou desconto.
     * (Required)
     * 
     */
    public void setNomeVerba(String nomeVerba) {
        this.nomeVerba = nomeVerba;
    }

    /**
     * Codigo do Vinculo por Tipo de Cargo
     * (Required)
     * 
     */
    public CodVinculoTipoQuadroCargo getCodVinculoTipoQuadroCargo() {
        return codVinculoTipoQuadroCargo;
    }

    /**
     * Codigo do Vinculo por Tipo de Cargo
     * (Required)
     * 
     */
    public void setCodVinculoTipoQuadroCargo(CodVinculoTipoQuadroCargo codVinculoTipoQuadroCargo) {
        this.codVinculoTipoQuadroCargo = codVinculoTipoQuadroCargo;
    }

    /**
     * Tipo de Verba
     * (Required)
     * 
     */
    public CodTipoVerba getCodTipoVerba() {
        return codTipoVerba;
    }

    /**
     * Tipo de Verba
     * (Required)
     * 
     */
    public void setCodTipoVerba(CodTipoVerba codTipoVerba) {
        this.codTipoVerba = codTipoVerba;
    }

    /**
     * Categoria Remuneracao
     * 
     */
    public CodCategoriaRemuneracao getCodCategoriaRemuneracao() {
        return codCategoriaRemuneracao;
    }

    /**
     * Categoria Remuneracao
     * 
     */
    public void setCodCategoriaRemuneracao(CodCategoriaRemuneracao codCategoriaRemuneracao) {
        this.codCategoriaRemuneracao = codCategoriaRemuneracao;
    }

    /**
     * Categoria Desconto
     * 
     */
    public CodCategoriaDesconto getCodCategoriaDesconto() {
        return codCategoriaDesconto;
    }

    /**
     * Categoria Desconto
     * 
     */
    public void setCodCategoriaDesconto(CodCategoriaDesconto codCategoriaDesconto) {
        this.codCategoriaDesconto = codCategoriaDesconto;
    }

    /**
     * Incidencia Previdenciaria
     * (Required)
     * 
     */
    public Boolean getIncidenciaPrevidenciaria() {
        return incidenciaPrevidenciaria;
    }

    /**
     * Incidencia Previdenciaria
     * (Required)
     * 
     */
    public void setIncidenciaPrevidenciaria(Boolean incidenciaPrevidenciaria) {
        this.incidenciaPrevidenciaria = incidenciaPrevidenciaria;
    }

    /**
     * Verba Transitoria
     * (Required)
     * 
     */
    public Boolean getVerbaTransitoria() {
        return verbaTransitoria;
    }

    /**
     * Verba Transitoria
     * (Required)
     * 
     */
    public void setVerbaTransitoria(Boolean verbaTransitoria) {
        this.verbaTransitoria = verbaTransitoria;
    }

    /**
     * Natureza da Remuneracao
     * 
     */
    public CodNaturezaRemuneracao getCodNaturezaRemuneracao() {
        return codNaturezaRemuneracao;
    }

    /**
     * Natureza da Remuneracao
     * 
     */
    public void setCodNaturezaRemuneracao(CodNaturezaRemuneracao codNaturezaRemuneracao) {
        this.codNaturezaRemuneracao = codNaturezaRemuneracao;
    }

    /**
     * Natureza Desconto
     * 
     */
    public CodNaturezaDesconto getCodNaturezaDesconto() {
        return codNaturezaDesconto;
    }

    /**
     * Natureza Desconto
     * 
     */
    public void setCodNaturezaDesconto(CodNaturezaDesconto codNaturezaDesconto) {
        this.codNaturezaDesconto = codNaturezaDesconto;
    }

    /**
     * Data de Inicio
     * (Required)
     * 
     */
    public String getDataInicio() {
        return dataInicio;
    }

    /**
     * Data de Inicio
     * (Required)
     * 
     */
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * Data fim
     * (Required)
     * 
     */
    public String getDataFinal() {
        return dataFinal;
    }

    /**
     * Data fim
     * (Required)
     * 
     */
    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

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
     * vinculoCargoEspecifico
     * <p>
     * Informa se a verba é vinculada a algum cargo em especifico.
     * (Required)
     * 
     */
    public VinculoCargoEspecifico getVinculoCargoEspecifico() {
        return vinculoCargoEspecifico;
    }

    /**
     * vinculoCargoEspecifico
     * <p>
     * Informa se a verba é vinculada a algum cargo em especifico.
     * (Required)
     * 
     */
    public void setVinculoCargoEspecifico(VinculoCargoEspecifico vinculoCargoEspecifico) {
        this.vinculoCargoEspecifico = vinculoCargoEspecifico;
    }

    /**
     * formaDeCalculo
     * <p>
     * Informar a Forma De Calculo
     * (Required)
     * 
     */
    public FormaDeCalculo getFormaDeCalculo() {
        return formaDeCalculo;
    }

    /**
     * formaDeCalculo
     * <p>
     * Informar a Forma De Calculo
     * (Required)
     * 
     */
    public void setFormaDeCalculo(FormaDeCalculo formaDeCalculo) {
        this.formaDeCalculo = formaDeCalculo;
    }

    /**
     * codificacaoNaturezaDespesa
     * <p>
     * Informa os Dados da Codificação Natureza Despesa
     * (Required)
     * 
     */
    public CodificacaoNaturezaDespesa getCodificacaoNaturezaDespesa() {
        return codificacaoNaturezaDespesa;
    }

    /**
     * codificacaoNaturezaDespesa
     * <p>
     * Informa os Dados da Codificação Natureza Despesa
     * (Required)
     * 
     */
    public void setCodificacaoNaturezaDespesa(CodificacaoNaturezaDespesa codificacaoNaturezaDespesa) {
        this.codificacaoNaturezaDespesa = codificacaoNaturezaDespesa;
    }

    public enum CodCategoriaDesconto {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5),
        _6(6),
        _7(7),
        _8(8),
        _9(9),
        _10(10),
        _11(11);
        private final Integer value;
        private final static Map<Integer, CodCategoriaDesconto> CONSTANTS = new HashMap<Integer, CodCategoriaDesconto>();

        static {
            for (CodCategoriaDesconto c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodCategoriaDesconto(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodCategoriaDesconto fromValue(Integer value) {
            CodCategoriaDesconto constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum CodCategoriaRemuneracao {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5),
        _6(6),
        _7(7),
        _8(8),
        _9(9),
        _10(10),
        _11(11),
        _12(12),
        _13(13),
        _14(14),
        _15(15),
        _16(16),
        _17(17),
        _18(18),
        _19(19),
        _20(20),
        _21(21),
        _22(22),
        _23(23);
        private final Integer value;
        private final static Map<Integer, CodCategoriaRemuneracao> CONSTANTS = new HashMap<Integer, CodCategoriaRemuneracao>();

        static {
            for (CodCategoriaRemuneracao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodCategoriaRemuneracao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodCategoriaRemuneracao fromValue(Integer value) {
            CodCategoriaRemuneracao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum CodNaturezaDesconto {

        _1(1),
        _2(2);
        private final Integer value;
        private final static Map<Integer, CodNaturezaDesconto> CONSTANTS = new HashMap<Integer, CodNaturezaDesconto>();

        static {
            for (CodNaturezaDesconto c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodNaturezaDesconto(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodNaturezaDesconto fromValue(Integer value) {
            CodNaturezaDesconto constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum CodNaturezaRemuneracao {

        _1(1),
        _2(2);
        private final Integer value;
        private final static Map<Integer, CodNaturezaRemuneracao> CONSTANTS = new HashMap<Integer, CodNaturezaRemuneracao>();

        static {
            for (CodNaturezaRemuneracao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodNaturezaRemuneracao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodNaturezaRemuneracao fromValue(Integer value) {
            CodNaturezaRemuneracao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

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

    public enum CodTipoVerba {

        _1(1),
        _2(2);
        private final Integer value;
        private final static Map<Integer, CodTipoVerba> CONSTANTS = new HashMap<Integer, CodTipoVerba>();

        static {
            for (CodTipoVerba c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoVerba(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoVerba fromValue(Integer value) {
            CodTipoVerba constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum CodVinculoTipoQuadroCargo {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5),
        _6(6),
        _7(7),
        _8(8);
        private final Integer value;
        private final static Map<Integer, CodVinculoTipoQuadroCargo> CONSTANTS = new HashMap<Integer, CodVinculoTipoQuadroCargo>();

        static {
            for (CodVinculoTipoQuadroCargo c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodVinculoTipoQuadroCargo(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodVinculoTipoQuadroCargo fromValue(Integer value) {
            CodVinculoTipoQuadroCargo constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
