package com.dom.colare.domain.dto.lic.licitacao_faseum;

import com.dom.colare.domain.dto.BaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

/**
 * – Cadastro de Lotes do Processo Licitatório
 */
@Data
public class LoteDTO extends BaseDTO {
    private String descricaoLote;
    private Set<ItemDTO> item;
    private long numeroLote;

   // @JsonIgnore
    @EqualsAndHashCode.Exclude
    private LicitacaoFaseUmDTO faseUm;
}
