
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.adesao_registro_de_preco;

import com.dom.colare.core.entidades.shared.Parecer;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * parecer
 * <p>
 * Parecer da adesão a registro de preços
 * 
 */
@Entity
@Data
public class ParecerAdesao extends Parecer {

    @ManyToOne
    private AdesaoARegistroDePrecos adesaoARegistroDePrecos;
}
