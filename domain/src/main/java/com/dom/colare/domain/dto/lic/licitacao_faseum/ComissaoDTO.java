package com.dom.colare.domain.dto.lic.licitacao_faseum;

import com.dom.colare.domain.dto.BaseDTO;
import lombok.Data;

import java.time.LocalDate;

/**
 * Detalhamento da composição da comissão de licitação / Pregoeiro - Equipe de Apoio
 */
@Data
public class ComissaoDTO extends BaseDTO {
    private long codTipoAtoNomeacao;
    private long codTipoComissao;
    private LocalDate dataAtoNomeacao;
    private LocalDate fimVigencia;
    private LocalDate inicioVigencia;
    private MembroDTO[] membro;
    private String numeroAtoNomeacao;
    private LicitacaoFaseUmDTO faseUm;
}
