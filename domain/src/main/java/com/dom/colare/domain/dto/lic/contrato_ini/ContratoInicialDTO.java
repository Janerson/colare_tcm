
package com.dom.colare.domain.dto.lic.contrato_ini;

import com.dom.colare.domain.dto.BaseDTO;
import lombok.Data;

import java.util.Set;


/**
 * contratoInicial
 * <p>
 * Dados do contrato
 * 
 */
@Data
public class ContratoInicialDTO extends BaseDTO {

    /**
     * Tipo do procedimento
     * (Required)
     * 
     */
    private int codTipoProcedimento;
    /**
     * ID do procedimento do qual decorre o contrato
     * (Required)
     * 
     */
    private Integer idProcedimento;
    /**
     * Número do contrato
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
     * Data da firmatura do documento
     * 
     */
    private String dataFirmatura;
    /**
     * Data do início da vigência
     * 
     */
    private String inicioVigencia;
    /**
     * Data do fim da vigência
     * 
     */
    private String fimVigencia;
    /**
     * Código da Natureza do Objeto
     * (Required)
     * 
     */
    private int codNaturezaObjeto;
    /**
     * Objeto
     * (Required)
     * 
     */
    private String objeto;
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
     * Tipo de formalização do contrato
     * (Required)
     * 
     */
    private int codTipoFormalizacaoContrato;
    /**
     * Descrição da forma de pagamento
     * (Required)
     * 
     */
    private String formaPagamento;
    /**
     * Unidade de medida do prazo para entrega do objeto ou execução do contrato
     * (Required)
     * 
     */
    private int codUnidadeMedidaPrazoExecucao;
    /**
     * Prazo para entrega do objeto ou execução do contrato
     * (Required)
     * 
     */
    private Integer prazoExecucao;
    /**
     * 
     * (Required)
     * 
     */
    private Set<Publicacao> publicacao = null;
    /**
     * contratado
     * <p>
     * Dados do contratado
     * (Required)
     * 
     */
    private Contratado contratado;
    private Set<Empenho> empenho = null;
    /**
     * 
     * (Required)
     * 
     */
    private Set<Responsavel> responsaveis = null;
    /**
     * procedimentoDeContratacao
     * <p>
     * Preencher exclusivamente e obrigatoriamente quando idProcedimento for igual a "-1", com os dados do Procedimento de contratação (Licitação, Dispensa/Inexigibilidade ou Adesão a Registro de Preços).
     * 
     */
    private ProcedimentoDeContratacao procedimentoDeContratacao;
    /**
     * 
     * (Required)
     * 
     */
    private Set<NaturezaDoObjetoDetalhada> naturezaDoObjetoDetalhada = null;
}
