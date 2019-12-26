
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import javax.validation.constraints.NotNull;


/**
 * detalhamentoArredondamentoPcd
 * <p>
 * Informar clausulas de arredondamento do numero de vagas para PCD, quando do calculo percentual de vagas destinadas a PCD.
 * 
 */
public class DetalhamentoArredondamentoPcd {

    /**
     * Número do Item do Edital
     * (Required)
     * 
     */
    @NotNull
    public String numeroItemDoEdital;
    /**
     * Descrição
     * (Required)
     * 
     */
    @NotNull
    public String descricao;

}
