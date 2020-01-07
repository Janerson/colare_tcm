
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.adesao_registro_de_preco;

import com.dom.colare.core.entidades.shared.Responsavel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


/**
 * responsaveis
 * <p>
 * Responsáveis pela adesão ao registro de preços
 * 
 */
@Entity
@Data
public class ResponsavelAdesao extends Responsavel {

    @ManyToOne
    private AdesaoARegistroDePrecos adesaoARegistroDePrecos;
}
