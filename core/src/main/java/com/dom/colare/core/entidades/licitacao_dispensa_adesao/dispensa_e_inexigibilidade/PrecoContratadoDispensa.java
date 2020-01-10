
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.dispensa_e_inexigibilidade;

import com.dom.colare.core.entidades.shared.PrecoContratado;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * precoContratado
 * <p>
 * Preço contratado mediante dispensa de licitação
 * 
 */
@Entity
@Data
@PrimaryKeyJoinColumn(name = "id")
public class PrecoContratadoDispensa extends PrecoContratado {


}
