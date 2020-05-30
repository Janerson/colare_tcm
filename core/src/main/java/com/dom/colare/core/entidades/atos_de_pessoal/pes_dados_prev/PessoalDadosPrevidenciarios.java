
package com.dom.colare.core.entidades.atos_de_pessoal.pes_dados_prev;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * pessoalDadosPrevidenciarios
 * <p>
 * Dados Previdenciários
 * 
 */
@Entity(name = "PES_DADOS_PREV")
@Data
public class PessoalDadosPrevidenciarios extends BaseEntityID {

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
     * Data de Inicio
     * (Required)
     * 
     */
    @NotNull
    private String dataInicio;
    /**
     * dadosPrevidenciariosRpps
     * <p>
     * Informa os dados previdenciários do RPPS
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PES_DADOSRPPS_ID")
    private DadosPrevidenciariosRpps dadosPrevidenciariosRpps = new DadosPrevidenciariosRpps();
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "PES_DADOS_PREV_ID")
    private Set<DadosRgpsUnidadesGestora> dadosRgpsUnidadesGestoras = new HashSet<>();

   
}
