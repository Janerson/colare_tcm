
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.inicial;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * adesaoARegistroDePrecos
 * <p>
 * Preencher exclusivamente e obrigatoriamente quando codTipoProcedimento for igual a "3-Adesão a registro de preços", com os dados da adesão da qual resultou o contrato.
 * 
 */
public class AdesaoARegistroDePrecos {

    /**
     * Exercício em que foi iniciado o procedimento de adesão
     * (Required)
     * 
     */
    @DecimalMin("1990")
    @DecimalMax("2018")
    @NotNull
    private Integer exercicioAdesao;
    /**
     * Código da esfera governamental do órgão gerenciador
     * (Required)
     * 
     */
    @NotNull
    private int codEsferaOrgaoGerenciador;
    /**
     * Número do documento
     * (Required)
     * 
     */
    @NotNull
    private String numeroDocumento;
    /**
     * Código IBGE do ente federativo ao qual pertence o órgão gerenciador
     * (Required)
     * 
     */
    @NotNull
    private String codIBGEEnteGerenciador;
    /**
     * Data da Ata de Registro de Preços
     * (Required)
     * 
     */
    @NotNull
    private String dataAtaRegistroPreco;
    /**
     * Data de validade
     * (Required)
     * 
     */
    @NotNull
    private String dataValidade;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    private Set<Documento> documentos = new HashSet<>();

    

}
