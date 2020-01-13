
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concessao_vantagem_desconto;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * pessoalConcessaoVantagemDesconto
 * <p>
 * Dados das concessões de Vantagens e Descontos, que repercutirão na Folha de Pagamento.
 * 
 */
@Entity(name = "PES_CONCESSAO")
@Data
public class PessoalConcessaoVantagemDesconto extends BaseEntityID {

    /**
     * Informa o tipo  da Situação Funcional que o servidor encontra-se (Ativo ou Inativo), conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    private Integer tipoSituacaoFuncional;
    /**
     * Informa o ID do formulario correspondente (Pessoal Admissão, Aposentadoria ou Pensão) ao informado na tabela de Situação Funcional.
     * (Required)
     * 
     */
    @NotNull
    private Integer idSituacaoFuncionalCorrespondente;
    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoEnvio;
    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    private String motivoAtualizacaoCorrecao;
    /**
     * detalhamentoConcessao
     * <p>
     * Contém o Detalhamento da Concessão
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PES_CONCESSAODT_ID")
    private DetalhamentoConcessao detalhamentoConcessao;

    
}
