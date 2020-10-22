package com.dom.colare.domain.dto.lic.licitacao_faseum;

/**
 * Detalhar a natureza do objeto
 */
@lombok.Data
public class NaturezaDoObjetoDetalhadaDTO {
    private long codNaturezaObjetoDetalhada;
    private String descricaoNaturezaObjetoOutros;
    private LicitacaoFaseUmDTO faseUm;
}
