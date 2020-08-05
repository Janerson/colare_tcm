package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_vida_funcional_lotacao;

import com.dom.colare.core.entidades.shared.Arquivo;
import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * pessoalVidaFuncionalLotacao
 * <p>
 * Dados de Lotação (Movimentação Interna)
 */
@Entity(name = "PES_VF_LOTACAO")
@Data
public class PessoalVidaFuncionalLotacao extends BaseEntityID {

    /**
     * Código do Tipo de Envio
     * (Required)
     */
    @NotNull
    private Integer codTipoEnvio;
    /**
     * Descreve o motivo da Atualização ou Correção
     */
    private String motivoAtualizacaoCorrecao;
    /**
     * ID da Admissão Previamente Informada
     * (Required)
     */
    @NotNull
    private Integer idPessoalAdmissao;
    /**
     * Data de Inicio
     * (Required)
     */
    @NotNull
    private String dataInicio;
    /**
     * Data fim
     * (Required)
     */
    @NotNull
    private String dataFinal;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     */
    @NotNull
    private String idDocumentoPDF;
    /**
     * detalhamentoLotacao
     * <p>
     * Detalhamento da lotação do servidor
     * (Required)
     */
    @Valid
    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PES_LOTACAO_DET_ID")
    private DetalhamentoLotacao detalhamentoLotacao;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ARQUIVO_ID")
    private Arquivo arquivo;
}
