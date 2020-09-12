package com.dom.colare.domain.dto.lic.licitacao_faseum;

import com.dom.colare.domain.dto.BaseDTO;
import lombok.Data;

import java.time.LocalDate;

/**
 * Envio inicial dos dados da licitação - Abertura da licitação
 */
@Data
public class LicitacaoFaseUmDTO extends BaseDTO {
    private long codModalidadeLicitacao;
    private long codNaturezaObjeto;
    private long codNaturezaProcedimento;
    private Long codRegimeExecucao;
    private long codTipoEnvio;
    private Long codTipoLicitacaoCriterioJulgamento;
    private ComissaoDTO[] comissao;
    private boolean criterioDesempateMEEPP;
    private LocalDate dataPrevistaAberturaSessao;
    private String descricaoPremioOuRemuneracaoConcurso;
    private boolean destinacaoExclusivaMEEPP;
    private EditalEAnexosDTO[] editalEAnexos;
    private long exercicioLicitacao;
    private String idDocumentoPDF;
    private long idUnidadeGestora;
    private boolean limitePercObjetoContratacaoMEEPP;
    private LoteDTO[] lote;
    private String motivoAtualizacaoCorrecao;
    private NaturezaDoObjetoDetalhadaDTO[] naturezaDoObjetoDetalhada;
    private Long numeroDeConvidados;
    private long numeroLicitacao;
    private String numeroProcessoAdministrativo;
    private String objeto;
    private ParecerDTO[] parecer;
    private boolean processoPorLote;
    private PublicacaoDTO[] publicacao;
    private RecursoOrcamentarioDTO[] recursoOrcamentario;
    private ResponsaveisDTO[] responsaveis;
    private boolean servicoContinuo;
    private boolean subcontratacaoMEEPP;
}
