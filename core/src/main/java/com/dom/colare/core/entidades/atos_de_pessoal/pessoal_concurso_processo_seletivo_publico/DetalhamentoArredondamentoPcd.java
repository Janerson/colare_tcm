
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoArredondamentoPcd
 * <p>
 * Informar clausulas de arredondamento do numero de vagas para PCD, quando do calculo percentual de vagas destinadas a PCD.
 * 
 */
@Entity(name = "PES_CON_ARRDPCD")
@Data
public class DetalhamentoArredondamentoPcd extends BaseEntityID {

    /**
     * Número do Item do Edital
     * (Required)
     * 
     */
    @NotNull
    private String numeroItemDoEdital;
    /**
     * Descrição
     * (Required)
     * 
     */
    @NotNull
    private String descricao;

}
