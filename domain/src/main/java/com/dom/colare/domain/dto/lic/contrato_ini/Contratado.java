
package com.dom.colare.domain.dto.lic.contrato_ini;

import lombok.Data;

import java.util.Set;


/**
 * contratado
 * <p>
 * Dados do contratado
 * 
 */
@Data
public class Contratado {

    /**
     * Identifica o tipo do documento
     * (Required)
     * 
     */
    private int codTipoDocumento;
    /**
     * Número do documento
     * (Required)
     * 
     */
    private String numeroDocumento;
    /**
     * Número de Inscrição Estadual
     * 
     */
    private String numeroInscricaoEstadual;
    /**
     * Código IBGE do Estado onde foi realizada a inscrição
     * 
     */
    private String codIbgeInscricaoEstadual;
    /**
     * Número da Certidão de Regularidade do INSS
     * 
     */
    private String numeroCertidaoRegularidadeINSS;
    /**
     * Número da Certidão de Regularidade do FGTS
     * 
     */
    private String numeroCertidaoRegularidadeFGTS;
    /**
     * Número da Certidão negativa de Débitos Trabalhistas
     * 
     */
    private String numeroCNDT;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * 
     */
    private String idDocumentoPDF;
    /**
     * Número de inscrição no CREA/CAU
     * 
     */
    private String numeroInscricaoCREACAU;
    /**
     * Código IBGE da unidade onde foi realizada a inscrição
     * 
     */
    private String codIbgeUFInscricaoCREACAU;
    /**
     * 
     * (Required)
     * 
     */
    private Set<PrecoContratado> precoContratado = null;
    private Set<QuadroSocietario> quadroSocietario = null;

}
