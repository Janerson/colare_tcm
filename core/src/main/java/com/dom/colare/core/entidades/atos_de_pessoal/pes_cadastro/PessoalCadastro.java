
package com.dom.colare.core.entidades.atos_de_pessoal.pes_cadastro;

import com.dom.colare.core.entidades.shared.Arquivo;
import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Set;


/**
 * pessoalCadastro
 * <p>
 * Dados Cadastrais
 * 
 */
@Entity(name = "PES_CADASTRO")
@Data
public class PessoalCadastro extends BaseEntityID {

    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoEnvio;
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
    private Integer escolaridadeServidor;
    /**
     * Informa Cor ou Raça de acordo com o informado na RAIS
     * (Required)
     * 
     */
    @NotNull
    private Integer corRaca;
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
    @OneToOne
    @JoinColumn(name = "PES_CAD_PCD_ID")
    private Pcd pcd;


    @Valid
    @OneToMany
    @JoinColumn(name = "PES_CADASTRO_ID")
    private Set<RegistroProfissional> registroProfissional = null;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ARQUIVO_ID")
    private Arquivo arquivo;

}
