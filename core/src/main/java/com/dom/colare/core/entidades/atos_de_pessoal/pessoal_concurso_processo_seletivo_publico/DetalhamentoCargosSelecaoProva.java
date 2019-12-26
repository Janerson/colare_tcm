
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * detalhamentoCargosSelecaoProva
 * <p>
 * Informar os Cargos vagas e provas vinculados a eles.
 * 
 */
public class DetalhamentoCargosSelecaoProva {

    /**
     * ID do Cargo 
     * (Required)
     * 
     */
    @NotNull
    public Integer idPessoalCargo;
    /**
     * Requisitos do Cargo no Edital
     * (Required)
     * 
     */
    @NotNull
    public String requisitosCargoEdital;
    /**
     * Quantidade de Vagas Ampla Concorrência
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    public Integer qtdVagasAmplaConcorrencia;
    /**
     * Quantidade de Vagas Cadastro de Reserva
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    public Integer qtdVagasCadastroReserva;
    /**
     * Quantidade de Vagas Cotas
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    public Integer qtdVagasCotas;
    /**
     * Quantidade de Vagas destinadas a PCD.
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    public Integer qtdPcD;
    /**
     * Carga Horária Semanal prevista Edital
     * (Required)
     * 
     */
    @NotNull
    public Integer cargaHorariaEdital;
    /**
     * Atribuições do cargo prevista no Edital.
     * (Required)
     * 
     */
    @NotNull
    public String atribuicoesEdital;
    /**
     * Caso o cargo seja ACS, O edital oferta de vagas por Micro áreas?
     * (Required)
     * 
     */
    @NotNull
    public Boolean ofertaVagasPorMicroAreasParaACS;
    /**
     * Exige Registro em algum Conselho ou Ordem Profissional.
     * (Required)
     * 
     */
    @NotNull
    public Boolean exigeRegistroConselhoOuOrdem;
    /**
     * Código Conselho o Ordem, conforme tabela.
     * 
     */
    public CodConselhoOrdem codConselhoOrdem;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<DetalhamentoProva> detalhamentoProva = null;

    public enum CodConselhoOrdem {

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
        _19(19);
        private final Integer value;
        private final static Map<Integer, CodConselhoOrdem> CONSTANTS = new HashMap<Integer, CodConselhoOrdem>();

        static {
            for (CodConselhoOrdem c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodConselhoOrdem(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodConselhoOrdem fromValue(Integer value) {
            CodConselhoOrdem constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
