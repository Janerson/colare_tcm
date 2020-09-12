package com.dom.colare.domain.dto.lic.licitacao_faseum;

import com.dom.colare.domain.dto.BaseDTO;
import lombok.Data;

/**
 * – Cadastro de Lotes do Processo Licitatório
 */
@Data
public class LoteDTO extends BaseDTO {
    private String descricaoLote;
    private ItemDTO[] item;
    private long numeroLote;
}
