
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_vida_funcional_desligamento_inatividade;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * pessoalVidaFuncionalDesligamentoInatividade
 * <p>
 * Dados de Desligamento ou Inatividade
 * 
 */
@Entity
@Data
public class PessoalVidaFuncionalDesligamentoInatividade extends BaseEntityID {

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
     * Informa o tipo de desligamento ou inatividade
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoDesligamentoInatividade;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    private String idDocumentoPDF;

}
