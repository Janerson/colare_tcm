
package com.dom.colare.core.entidades.atos_de_pessoal.pes_admissao;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * vinculoAdmissao
 * <p>
 * Informar o Vinculo da Admissão
 * 
 */
@Entity(name = "PES_ADM_VINCULO")
@Data
public class VinculoAdmissao extends BaseEntityID {

    /**
     * Informa o tipo de vinculo admissional do servidor, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    private Integer tipoVinculoAdmissao;
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

}
