
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_cargos;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * padraonivel
 * <p>
 * Informar os dados do Padrão Nível.
 * 
 */
@Entity(name = "PES_CARGO_PDR_N")
@Data
public class PadraoNivel extends BaseEntityID {

    /**
     * Codificação, interna do sistema de gestão, para a Padrão ou Nível
     * (Required)
     * 
     */
    @NotNull
    private Integer codPadraoNivel;
    /**
     * Descrição da nomenclatura do Padrão ou Nível, conforme Legislação.
     * (Required)
     * 
     */
    @NotNull
    private String descricaoPadraoNivel;
    /**
     * Valor do Vencimento/Subsídio do Cargo para o referido Classe e Padrão
     * (Required)
     * 
     */
    @NotNull
    private Double valorVencimentoOuSubsidio;
    /**
     * Informar valor Gratificação Representação Cargo em Comissão 
     * 
     */
    private Double valorRepresentacao;


}
