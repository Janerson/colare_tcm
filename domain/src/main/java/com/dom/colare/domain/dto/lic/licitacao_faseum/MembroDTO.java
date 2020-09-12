package com.dom.colare.domain.dto.lic.licitacao_faseum;

import com.dom.colare.domain.dto.BaseDTO;
import lombok.Data;

/**
 * Membros da comissão de licitação
 */
@Data
public class MembroDTO extends BaseDTO {
    private long codAtribuicao;
    private long codNaturezaCargo;
    private String numeroCpf;
}
