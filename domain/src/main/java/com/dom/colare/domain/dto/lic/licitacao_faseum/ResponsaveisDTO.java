package com.dom.colare.domain.dto.lic.licitacao_faseum;

import com.dom.colare.domain.dto.BaseDTO;
import lombok.Data;

/**
 * Detalhamento dos Responsáveis pela licitação
 */
@Data
public class ResponsaveisDTO extends BaseDTO {
    private long codTipoResponsabilidade;
    private String numeroCpf;
    private LicitacaoFaseUmDTO faseUm;
}
