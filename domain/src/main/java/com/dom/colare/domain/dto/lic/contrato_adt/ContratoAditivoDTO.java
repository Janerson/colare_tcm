
package com.dom.colare.domain.dto.lic.contrato_adt;

import com.dom.colare.domain.dto.BaseDTO;
import lombok.Data;

import java.util.Set;


/**
 * contratoAditivo
 * <p>
 * Dados do contrato aditivo
 * 
 */
@Data
public class ContratoAditivoDTO extends BaseDTO {

    /**
     * ID do contrato original previamente informado.
     * (Required)
     * 
     */
    private Integer idContratoOriginal;
    /**
     * Número do contrato
     * (Required)
     * 
     */
    private String numeroContrato;
    /**
     * Ano do contrato
     * (Required)
     * 
     */
    private Integer anoContrato;
    /**
     * Tipo de contrato aditivo
     * (Required)
     * 
     */
    private Integer codTipoAditivo;
    /**
     * Data da firmatura do documento
     * (Required)
     * 
     */
    private String dataFirmatura;
    /**
     * Prazo a ser adicionado ao original
     * 
     */
    private Integer prazoAdicional;
    /**
     * Unidade de medida do prazo para entrega do objeto ou execução do contrato
     * 
     */
    private Integer codUnidadeMedidaPrazoExecucao;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    private String idDocumentoPDF;
    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    private Integer codTipoEnvio;
    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    private String motivoAtualizacaoCorrecao;
    /**
     * 
     * (Required)
     * 
     */
    private Set<PublicacaoDTO> publicacao = null;
    private Set<EmpenhoDTO> empenho = null;
    /**
     * contratado
     * <p>
     * Dados do contratado
     * (Required)
     * 
     */
    private ContratadoDTO contratado;
    /**
     * contratoOriginal
     * <p>
     * Preencher exclusivamente e obrigatoriamente quando idContratoOriginal for igual a -1, com os dados do contrato original que está sendo aditivado.
     * 
     */
    private ContratoOriginalDTO contratoOriginal;
    private Set<AnulacaoEmpenhoDTO> anulacaoEmpenho = null;

}
