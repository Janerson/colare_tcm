
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_vida_funcional_disposicao;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * pessoalVidaFuncionalDisposicao
 * <p>
 * Dados de Disposição (Movimentação Externa)
 * 
 */
@Entity
@Data
public class PessoalVidaFuncionalDisposicao extends BaseEntityID {

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
    private String motivoAtualizacaoCorrecao;
    /**
     * ID da Admissão Previamente Informada
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalAdmissao;
    /**
     * Data de Inicio
     * (Required)
     * 
     */
    @NotNull
    private String dataInicio;
    /**
     * Data fim
     * (Required)
     * 
     */
    @NotNull
    private String dataFinal;
    /**
     * Informa o tipo de disposição
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoDisposicao;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    private String idDocumentoPDF;
    /**
     * destino
     * <p>
     * Informar o destino da disposição
     * (Required)
     * 
     */
    @Valid
    @NotNull
    private Destino destino;

  
}
