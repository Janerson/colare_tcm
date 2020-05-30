
package com.dom.colare.domain.dto.lic.contrato_ini;

import lombok.Data;

import java.util.Set;


/**
 * adesaoARegistroDePrecos
 * <p>
 * Preencher exclusivamente e obrigatoriamente quando codTipoProcedimento for igual a "3-Adesão a registro de preços", com os dados da adesão da qual resultou o contrato.
 * 
 */
@Data
public class AdesaoARegistroDePrecos {

    /**
     * Exercício em que foi iniciado o procedimento de adesão
     * (Required)
     * 
     */
    private Integer exercicioAdesao;
    /**
     * Código da esfera governamental do órgão gerenciador
     * (Required)
     * 
     */
    private int codEsferaOrgaoGerenciador;
    /**
     * Número do documento
     * (Required)
     * 
     */
    private String numeroDocumento;
    /**
     * Código IBGE do ente federativo ao qual pertence o órgão gerenciador
     * (Required)
     * 
     */
    private String codIBGEEnteGerenciador;
    /**
     * Data da Ata de Registro de Preços
     * (Required)
     * 
     */
    private String dataAtaRegistroPreco;
    /**
     * Data de validade
     * (Required)
     * 
     */
    private String dataValidade;
    /**
     * 
     * (Required)
     * 
     */
    private Set<Documento> documentos = null;

}
