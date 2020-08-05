
package com.dom.colare.core.entidades.lic.situacao_proced;

import com.dom.colare.core.entidades.shared.Arquivo;
import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * situacaoProcedimento
 * <p>
 * Dados da situação do procedimento - Incidentes
 * 
 */
@Entity(name = "SITUACAO_PROCED")
@Data
public class SituacaoProcedimento extends BaseEntityID {

    /**
     * Identifica o fato em que ocorreu o incidente
     * (Required)
     * 
     */
    @NotNull
    @Column
    public Integer codTipoProcedimentoOuContrato;
    
    /**
     * ID do procedimento de compra ou alienação ou o contrato previamente informado
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    @Column
    public Integer idProcedimentoOuContrato;
    /**
     * Tipo de situação
     * (Required)
     * 
     */
    @NotNull
    @Column
    public Integer tipoDeSituacao;
    /**
     * Número do Processo no TCMGO
     * 
     */
    @Column
    public String numeroProcessoTCM;

    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    @Column
    public String idDocumentoPDF;
    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    @Column
    public Integer codTipoEnvio;

    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    @Column
    public String motivoAtualizacaoCorrecao;

    /**
     * Data do evento
     * 
     */
    @Column
    public String data;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ARQUIVO_ID")
    private Arquivo arquivo;
}
