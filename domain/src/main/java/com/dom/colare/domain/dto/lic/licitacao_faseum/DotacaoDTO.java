package com.dom.colare.domain.dto.lic.licitacao_faseum;

import com.dom.colare.domain.dto.BaseDTO;
import lombok.Data;

/**
 * Dotação orçamentária
 */
@Data
public class DotacaoDTO extends BaseDTO {
    private long codFonteRecursos;
    private long codFuncao;
    private long codOrgao;
    private long codPrograma;
    private long codSubFuncao;
    private long codUnidadeOrcamentaria;
    private long naturezaAcao;
    private long naturezaDespesa;
    private long nroProjAtiv;
    private double saldoAtualDaDotacao;
    private Long subelemento;
    private double valorASerUtilizado;
}
