
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal.homologacao;

import com.dom.colare.core.entidades.shared.Publicacao;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * publicacao
 * <p>
 * Informa a Publicação da Homologação da Seleção
 * 
 */
@Entity(name = "PES_HOMOLOG_PUB")
@Data
public class PublicacaoPessoalHomologacao extends Publicacao {

    /**
     * Endereço do site do Veículo de Publicação
     * (Required)
     * 
     */
    @NotNull
    private String urlVeiculoPublicacao;



}
