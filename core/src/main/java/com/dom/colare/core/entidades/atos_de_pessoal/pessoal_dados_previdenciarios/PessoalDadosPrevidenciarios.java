
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_dados_previdenciarios;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Entity
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
    @OneToOne
    @JoinColumn(name = "pessoal_dados_prev_id")
    private DadosPrevidenciariosRpps dadosPrevidenciariosRpps;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "pessoal_dados_prev_id")
    private Set<DadosRgpsUnidadesGestora> dadosRgpsUnidadesGestoras = new HashSet<>();

   
}
