package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.recisao;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * contratoRescisao
 * <p>
 * Dados da rescisão contratual.
 */
@Entity(name = "CONTRATO_RESC")
@Data
public class ContratoRecisao extends BaseEntityID {

    /**
     * ID do contrato original previamente informado.
     * (Required)
     */
    @NotNull
    @Column
    public Integer idContratoOriginal;
    /**
     * Motivo da rescisão
     * (Required)
     */
    @NotNull
    @Column

    public Integer codMotivoRescisao;
    /**
     * Tipo da rescisão
     * (Required)
     */
    @NotNull
    @Column
    public Integer codTipoRescisao;
    /**
     * Data do evento
     * (Required)
     */
    @NotNull
    @Column
    public String data;

    /**
     * Saldo final executado do contrato
     */
    @DecimalMin("0")
    @Column
    public Double saldoFinalExecutadoContrato;

    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     */
    @NotNull
    @Column
    public String idDocumentoPDF;

    /**
     * Código do Tipo de Envio
     * (Required)
     */
    @NotNull
    @Column
    public Integer codTipoEnvio;

    /**
     * Descreve o motivo da Atualização ou Correção
     */
    @Column
    public String motivoAtualizacaoCorrecao;

    /**
     * (Required)
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "CONTRATO_RESC_ID")
    public Set<PublicacaoRecisao> publicacao = new HashSet<>();


    @Valid
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "CONTRATO_RESC_ID")
    public Set<EmpenhoAnulado> empenhoAnulado = new HashSet<>();
    /**
     * contratoOriginal
     * <p>
     * Preencher exclusivamente e obrigatoriamente quando idContratoOriginal for igual a -1, com os dados do contrato original que está sendo rescindido.
     */
    @Valid
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "RESC_CONTR_ORIG_ID")
    public ContratoOriginalRecisao contratoOriginal;


}
