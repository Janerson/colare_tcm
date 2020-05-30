
package com.dom.colare.domain.dto.lic.contrato_resc;

import com.dom.colare.domain.dto.BaseDTO;
import lombok.Data;

import java.util.Set;


/**
 * contratoRescisao
 * <p>
 * Dados da rescisão contratual.
 * 
 */
@Data
public class ContratoRecisaoDTO extends BaseDTO {

    /**
     * ID do contrato original previamente informado.
     * (Required)
     * 
     */
    private Integer idContratoOriginal;
    /**
     * Motivo da rescisão
     * (Required)
     * 
     */
    private int codMotivoRescisao;
    /**
     * Tipo da rescisão
     * (Required)
     * 
     */
    private int codTipoRescisao;
    /**
     * Data do evento
     * (Required)
     * 
     */
    private String data;
    /**
     * Saldo final executado do contrato
     * 
     */
    private Double saldoFinalExecutadoContrato;
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
    private int codTipoEnvio;
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
    private Set<EmpenhoAnuladoDTO> empenhoAnulado = null;
    /**
     * contratoOriginal
     * <p>
     * Preencher exclusivamente e obrigatoriamente quando idContratoOriginal for igual a -1, com os dados do contrato original que está sendo rescindido.
     * 
     */
    private ContratoOriginalDTO contratoOriginal;


}
