package com.dom.colare.domain.dto.lic.licitacao_faseum;

import com.dom.colare.domain.dto.BaseDTO;
import lombok.Data;

/**
 * Cadastro de Itens do Processo Licitatório
 */
@Data
public class ItemDTO extends BaseDTO {
    private Long codigoUnicoMercadoriaOuServico;
    private long codOrigemValorReferencia;
    private long codUnidadeMedida;
    private String descricao;
    private String descricaoOrigemValorReferencia;
    private long numeroItem;
    private boolean precoMaximo;
    private double quantidade;
    private Double quantidadeDesdobraUnidade;
    private double valorDeReferencia;
}
