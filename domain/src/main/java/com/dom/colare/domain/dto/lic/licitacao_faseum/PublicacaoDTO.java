package com.dom.colare.domain.dto.lic.licitacao_faseum;

import com.dom.colare.domain.dto.BaseDTO;
import lombok.Data;

import java.time.LocalDate;

/**
 * Informação de todas as publicações do Edital ou Convite
 */
@Data
public class PublicacaoDTO extends BaseDTO {
    private long codVeiculoPublicacao;
    private LocalDate dataPublicacao;
    private String descricao;
    private String idDocumentoPDF;
    private LicitacaoFaseUmDTO faseUm;
}
