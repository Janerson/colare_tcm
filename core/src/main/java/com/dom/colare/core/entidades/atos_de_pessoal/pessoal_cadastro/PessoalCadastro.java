
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_cadastro;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * pessoalCadastro
 * <p>
 * Dados Cadastrais
 * 
 */
public class PessoalCadastro {

    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    private PessoalCadastro.CodTipoEnvio codTipoEnvio;
    /**
     * Número do CPF
     * (Required)
     * 
     */
    @NotNull
    private String numeroCpf;
    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    private String motivoAtualizacaoCorrecao;
    /**
     * Informa o numero do Titulo de Eleitor
     * 
     */
    private String numeroTituloEleitor;
    /**
     * Informa o numero do PIS PASEP ou NIT ou NIS
     * 
     */
    private String numeroPisPasepNITNIS;
    /**
     * Informar o Nível Escolar do Servidor
     * (Required)
     * 
     */
    @NotNull
    private PessoalCadastro.EscolaridadeServidor escolaridadeServidor;
    /**
     * Informa Cor ou Raça de acordo com o informado na RAIS
     * (Required)
     * 
     */
    @NotNull
    private PessoalCadastro.CorRaca corRaca;
    /**
     * Informa o Local de Nascimento
     * 
     */
    private String naturalidade;
    /**
     * Informa ID do documento de imagem Foto 3x4
     * (Required)
     * 
     */
    @NotNull
    private String idDocumentoFoto3x4;
    /**
     * Informa o numero da Carteira de Trabalho
     * 
     */
    private String numeroCTPS;
    /**
     * Informa o numero da série da CTPS
     * 
     */
    private String numeroSerieCTPS;
    /**
     * pcd
     * <p>
     * Informar detalhes Pessoa com Deficiência
     * (Required)
     * 
     */
    @Valid
    @NotNull
    private Pcd pcd;
    @Valid
    private Set<RegistroProfissional> registroProfissional = null;

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
     * Número do CPF
     * (Required)
     * 
     */
    public String getNumeroCpf() {
        return numeroCpf;
    }

    /**
     * Número do CPF
     * (Required)
     * 
     */
    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
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
     * Informa o numero do Titulo de Eleitor
     * 
     */
    public String getNumeroTituloEleitor() {
        return numeroTituloEleitor;
    }

    /**
     * Informa o numero do Titulo de Eleitor
     * 
     */
    public void setNumeroTituloEleitor(String numeroTituloEleitor) {
        this.numeroTituloEleitor = numeroTituloEleitor;
    }

    /**
     * Informa o numero do PIS PASEP ou NIT ou NIS
     * 
     */
    public String getNumeroPisPasepNITNIS() {
        return numeroPisPasepNITNIS;
    }

    /**
     * Informa o numero do PIS PASEP ou NIT ou NIS
     * 
     */
    public void setNumeroPisPasepNITNIS(String numeroPisPasepNITNIS) {
        this.numeroPisPasepNITNIS = numeroPisPasepNITNIS;
    }

    /**
     * Informar o Nível Escolar do Servidor
     * (Required)
     * 
     */
    public EscolaridadeServidor getEscolaridadeServidor() {
        return escolaridadeServidor;
    }

    /**
     * Informar o Nível Escolar do Servidor
     * (Required)
     * 
     */
    public void setEscolaridadeServidor(EscolaridadeServidor escolaridadeServidor) {
        this.escolaridadeServidor = escolaridadeServidor;
    }

    /**
     * Informa Cor ou Raça de acordo com o informado na RAIS
     * (Required)
     * 
     */
    public CorRaca getCorRaca() {
        return corRaca;
    }

    /**
     * Informa Cor ou Raça de acordo com o informado na RAIS
     * (Required)
     * 
     */
    public void setCorRaca(CorRaca corRaca) {
        this.corRaca = corRaca;
    }

    /**
     * Informa o Local de Nascimento
     * 
     */
    public String getNaturalidade() {
        return naturalidade;
    }

    /**
     * Informa o Local de Nascimento
     * 
     */
    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    /**
     * Informa ID do documento de imagem Foto 3x4
     * (Required)
     * 
     */
    public String getIdDocumentoFoto3x4() {
        return idDocumentoFoto3x4;
    }

    /**
     * Informa ID do documento de imagem Foto 3x4
     * (Required)
     * 
     */
    public void setIdDocumentoFoto3x4(String idDocumentoFoto3x4) {
        this.idDocumentoFoto3x4 = idDocumentoFoto3x4;
    }

    /**
     * Informa o numero da Carteira de Trabalho
     * 
     */
    public String getNumeroCTPS() {
        return numeroCTPS;
    }

    /**
     * Informa o numero da Carteira de Trabalho
     * 
     */
    public void setNumeroCTPS(String numeroCTPS) {
        this.numeroCTPS = numeroCTPS;
    }

    /**
     * Informa o numero da série da CTPS
     * 
     */
    public String getNumeroSerieCTPS() {
        return numeroSerieCTPS;
    }

    /**
     * Informa o numero da série da CTPS
     * 
     */
    public void setNumeroSerieCTPS(String numeroSerieCTPS) {
        this.numeroSerieCTPS = numeroSerieCTPS;
    }

    /**
     * pcd
     * <p>
     * Informar detalhes Pessoa com Deficiência
     * (Required)
     * 
     */
    public Pcd getPcd() {
        return pcd;
    }

    /**
     * pcd
     * <p>
     * Informar detalhes Pessoa com Deficiência
     * (Required)
     * 
     */
    public void setPcd(Pcd pcd) {
        this.pcd = pcd;
    }

    public Set<RegistroProfissional> getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(Set<RegistroProfissional> registroProfissional) {
        this.registroProfissional = registroProfissional;
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

    public enum CorRaca {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5),
        _6(6);
        private final Integer value;
        private final static Map<Integer, CorRaca> CONSTANTS = new HashMap<Integer, CorRaca>();

        static {
            for (CorRaca c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CorRaca(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CorRaca fromValue(Integer value) {
            CorRaca constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum EscolaridadeServidor {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5),
        _6(6),
        _7(7);
        private final Integer value;
        private final static Map<Integer, EscolaridadeServidor> CONSTANTS = new HashMap<Integer, EscolaridadeServidor>();

        static {
            for (EscolaridadeServidor c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private EscolaridadeServidor(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static EscolaridadeServidor fromValue(Integer value) {
            EscolaridadeServidor constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
