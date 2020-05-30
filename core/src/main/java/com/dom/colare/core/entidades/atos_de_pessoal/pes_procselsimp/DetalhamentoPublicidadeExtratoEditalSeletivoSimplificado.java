
package com.dom.colare.core.entidades.atos_de_pessoal.pes_procselsimp;

import com.dom.colare.core.entidades.shared.DetalhamentoPublicidadeExtratoEdital;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;


/**
 * detalhamentoPublicidadeExtratoEdital
 * <p>
 * Informa o Detalhamento Publicidade Extrato Edital
 * 
 */
@Entity(name = "PES_PSS_PUBLIC")
@Data
@PrimaryKeyJoinColumn(name = "id")
public class DetalhamentoPublicidadeExtratoEditalSeletivoSimplificado extends DetalhamentoPublicidadeExtratoEdital {
}
