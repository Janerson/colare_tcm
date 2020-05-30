
package com.dom.colare.domain.dto.lic.contrato_ini;

import lombok.Data;

/**
 * naturezaDoObjetoDetalhada
 * <p>
 * Detalhar a natureza do objeto
 * 
 */
@Data
public class NaturezaDoObjetoDetalhada {

    /**
     * Detalhamento da natureza do objeto
     * (Required)
     * 
     */
    private int codNaturezaObjetoDetalhada;
    /**
     * Descrição da natureza do objeto quando for selecionado a Natureza do objeto = Outros
     * 
     */
    private String descricaoNaturezaObjetoOutros;
  

}
