
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_vida_funcional_disposicao;

import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;


/**
 * destino
 * <p>
 * Informar o destino da disposição
 * 
 */
public class Destino {

    /**
     * Informar a esfera de disposição do servidor, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    public Destino.CodEsferaDisposicao codEsferaDisposicao;
    /**
     * Codificação IBGE do Ente Federado
     * (Required)
     * 
     */
    @NotNull
    public String codIBGE;
    /**
     * Informa o tipo de entidade que recepcionara o servidor.
     * (Required)
     * 
     */
    @NotNull
    public Destino.TipoEntidade tipoEntidade;
    /**
     * Informar o nome do Órgão Ou Entidade que recepcionara o servidor a disposição.
     * (Required)
     * 
     */
    @NotNull
    public String nomeOrgaoOuEntidade;
    /**
     * Informa o numero do CNPJ do Órgão ou entidade que recepcionara o servidor a disposição.
     * (Required)
     * 
     */
    @NotNull
    public String numeroCNPJ;
    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * 
     */
    public Integer idUnidadeGestora;

    public enum CodEsferaDisposicao {

        _1(1),
        _2(2),
        _3(3);
        private final Integer value;
        private final static Map<Integer, CodEsferaDisposicao> CONSTANTS = new HashMap<Integer, CodEsferaDisposicao>();

        static {
            for (CodEsferaDisposicao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodEsferaDisposicao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodEsferaDisposicao fromValue(Integer value) {
            CodEsferaDisposicao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum TipoEntidade {

        _1(1),
        _2(2),
        _3(3),
        _4(4);
        private final Integer value;
        private final static Map<Integer, TipoEntidade> CONSTANTS = new HashMap<Integer, TipoEntidade>();

        static {
            for (TipoEntidade c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TipoEntidade(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static TipoEntidade fromValue(Integer value) {
            TipoEntidade constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
