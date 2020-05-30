
package com.dom.colare.core.entidades.atos_de_pessoal.pes_concessao;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * posicaoVencimentoCarreira
 * <p>
 * Contém as informações sobre o posicionamento vencimental do servidor na carreira.
 * 
 */
@Entity(name = "PES_POS_VNCT_CR")
@Data
public class PosicaoVencimentoCarreira extends BaseEntityID {

    /**
     * ID do Cargo 
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalCargo;
    /**
     * Codificação, interna do sistema de gestão, para a Classe
     * (Required)
     * 
     */
    @NotNull
    private Integer codClasse;
    /**
     * Codificação, interna do sistema de gestão, para a Padrão ou Nível
     * (Required)
     * 
     */
    @NotNull
    private Integer codPadraoNivel;
    /**
     * Valor do Vencimento/Subsídio do Cargo para o referido Classe e Padrão
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    private Double valorVencimentoOuSubsidio;
    /**
     * Data de Inicio
     * (Required)
     * 
     */
    @NotNull
    private String dataInicio;
    /**
     * Data fim
     * 
     */
    private String dataFinal;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    private String idDocumentoPDF;

}
