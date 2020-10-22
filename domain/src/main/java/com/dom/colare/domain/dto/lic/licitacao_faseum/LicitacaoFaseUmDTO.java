package com.dom.colare.domain.dto.lic.licitacao_faseum;

import com.dom.colare.domain.dto.BaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashSet;
import java.util.Set;

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
    private Set<ComissaoDTO> comissao = new HashSet<>();
    private boolean criterioDesempateMEEPP;
    private String dataPrevistaAberturaSessao;
    private String descricaoPremioOuRemuneracaoConcurso;
    private boolean destinacaoExclusivaMEEPP;
    private Set<EditalEAnexosDTO> editalEAnexos = new HashSet<>();
    private long exercicioLicitacao;
    private String idDocumentoPDF;
    private long idUnidadeGestora;
    private boolean limitePercObjetoContratacaoMEEPP;
    @EqualsAndHashCode.Exclude
    private Set<LoteDTO> lote = new HashSet<>();
    private String motivoAtualizacaoCorrecao;
    private Set<NaturezaDoObjetoDetalhadaDTO> naturezaDoObjetoDetalhada = new HashSet<>();
    private Integer numeroDeConvidados;
    private long numeroLicitacao;
    private String numeroProcessoAdministrativo;
    private String objeto;
    private Set<ParecerDTO> parecer = new HashSet<>();
    private boolean processoPorLote;
    private Set<PublicacaoDTO> publicacao = new HashSet<>();
    private Set<RecursoOrcamentarioDTO> recursoOrcamentario = new HashSet<>();
    private Set<ResponsaveisDTO> responsaveis = new HashSet<>();
    private boolean servicoContinuo;
    private boolean subcontratacaoMEEPP;

    public void setNumeroDeConvidados(Integer numeroDeConvidados) {
        if (codModalidadeLicitacao == 1) this.numeroDeConvidados = numeroDeConvidados;
        else this.numeroDeConvidados = null;
    }

    public void setDescricaoPremioOuRemuneracaoConcurso(String descricaoPremioOuRemuneracaoConcurso) {
        if (codModalidadeLicitacao == 1)
            this.descricaoPremioOuRemuneracaoConcurso = descricaoPremioOuRemuneracaoConcurso;
        else this.descricaoPremioOuRemuneracaoConcurso = null;
    }

    public void addLote(LoteDTO loteDTO){
        lote.add(loteDTO);
        loteDTO.setFaseUm(this);
    }


}
