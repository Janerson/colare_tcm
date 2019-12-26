
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_admissao;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;


/**
 * vinculoAdmissao
 * <p>
 * Informar o Vinculo da Admissão
 * 
 */
public class VinculoAdmissao {

    /**
     * Informa o tipo de vinculo admissional do servidor, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    private VinculoAdmissao.TipoVinculoAdmissao tipoVinculoAdmissao;
    /**
     * ID do Cargo 
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalCargo;
    /**
     * Codificação, interna do sistema de gestão, para a Classe
     * (Required)
     * 
     */
    @NotNull
    private Integer codClasse;
    /**
     * Codificação, interna do sistema de gestão, para a Padrão ou Nível
     * (Required)
     * 
     */
    @NotNull
    private Integer codPadraoNivel;

    /**
     * Informa o tipo de vinculo admissional do servidor, conforme tabela.
     * (Required)
     * 
     */
    public TipoVinculoAdmissao getTipoVinculoAdmissao() {
        return tipoVinculoAdmissao;
    }

    /**
     * Informa o tipo de vinculo admissional do servidor, conforme tabela.
     * (Required)
     * 
     */
    public void setTipoVinculoAdmissao(TipoVinculoAdmissao tipoVinculoAdmissao) {
        this.tipoVinculoAdmissao = tipoVinculoAdmissao;
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

    /**
     * Codificação, interna do sistema de gestão, para a Classe
     * (Required)
     * 
     */
    public Integer getCodClasse() {
        return codClasse;
    }

    /**
     * Codificação, interna do sistema de gestão, para a Classe
     * (Required)
     * 
     */
    public void setCodClasse(Integer codClasse) {
        this.codClasse = codClasse;
    }

    /**
     * Codificação, interna do sistema de gestão, para a Padrão ou Nível
     * (Required)
     * 
     */
    public Integer getCodPadraoNivel() {
        return codPadraoNivel;
    }

    /**
     * Codificação, interna do sistema de gestão, para a Padrão ou Nível
     * (Required)
     * 
     */
    public void setCodPadraoNivel(Integer codPadraoNivel) {
        this.codPadraoNivel = codPadraoNivel;
    }

    public enum TipoVinculoAdmissao {

        _100(100),
        _101(101),
        _102(102),
        _103(103),
        _200(200),
        _300(300),
        _400(400),
        _401(401),
        _500(500),
        _501(501),
        _600(600);
        private final Integer value;
        private final static Map<Integer, TipoVinculoAdmissao> CONSTANTS = new HashMap<Integer, TipoVinculoAdmissao>();

        static {
            for (TipoVinculoAdmissao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TipoVinculoAdmissao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static TipoVinculoAdmissao fromValue(Integer value) {
            TipoVinculoAdmissao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
