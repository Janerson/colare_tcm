
package com.dom.colare.core.entidades.lic.contrato_adt;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * contratoAditivo
 * <p>
 * Dados do contrato aditivo
 * 
 */
@Entity(name = "CONTRATO_ADT")
@Data
public class ContratoAditivo extends BaseEntityID {

    /**
     * ID do contrato original previamente informado.
     * (Required)
     * 
     */
    @NotNull
    @Column
    private Integer idContratoOriginal;

    /**
     * Número do contrato
     * (Required)
     * 
     */
    @NotNull
    @Column
    private String numeroContrato;

    /**
     * Ano do contrato
     * (Required)
     * 
     */
    @DecimalMin("2010")
    @DecimalMax("2050")
    @NotNull
    @Column
    private Integer anoContrato;

    /**
     * Tipo de contrato aditivo
     * (Required)
     * 
     */
    @NotNull
    @Column
    private Integer codTipoAditivo;

    /**
     * Data da firmatura do documento
     * (Required)
     * 
     */
    @NotNull
    @Column
    private String dataFirmatura;

    /**
     * Prazo a ser adicionado ao original
     * 
     */
    @DecimalMin("0")
    @Column
    private Integer prazoAdicional;

    /**
     * Unidade de medida do prazo para entrega do objeto ou execução do contrato
     * 
     */
    @Column
    private Integer codUnidadeMedidaPrazoExecucao;

    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    @Column
    private String idDocumentoPDF;

    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoEnvio;

    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    @Column
    private String motivoAtualizacaoCorrecao;

    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "CONTRATO_ADT_ID")
    private Set<PublicacaoAditivo> publicacaoAditivo = new HashSet<>();

    @Valid
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "CONTRATO_ADT_ID")
    private Set<EmpenhoAditivo> empenhoAditivo = new HashSet<>();

    /**
     * contratado
     * <p>
     * Dados do contratado
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "CONTRATADO_ADT_ID")
    private ContratadoAditivo contratadoAditivo;

    /**
     * contratoOriginal
     * <p>
     * Preencher exclusivamente e obrigatoriamente quando idContratoOriginal for igual a -1, com os dados do contrato original que está sendo aditivado.
     * 
     */
    @Valid
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "ADTV_CONTR_ORIG_ID")
    private ContratoOriginalAditivo contratoOriginalAditivo;

}
