package com.dom.colare.domain.dto.lic.licitacao_faseum;

import com.dom.colare.domain.dto.BaseDTO;
import lombok.Data;

/**
 * Detalhamento dos Recursos Orçamentários
 */
@Data
public class RecursoOrcamentarioDTO extends BaseDTO {
    private long codOrigemRecurso;
    private DotacaoDTO[] dotacao;
    private Long idConvenio;
}
