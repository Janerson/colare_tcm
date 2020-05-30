
package com.dom.colare.core.entidades.atos_de_pessoal.pes_con_psp;

import com.dom.colare.core.entidades.shared.DetalhamentoProva;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoProva
 * <p>
 * Informar o detalhamento das provas vinculadas ao cargos da seleção.
 * 
 */
@Entity(name = "PES_CON_PROVAS")
@Data
@PrimaryKeyJoinColumn(name = "id")
public class DetalhamentoProvaSeletivoPublico extends DetalhamentoProva {


    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "PES_CON_CARPROV_ID")
    private Caraterdaprova caraterdaprova;

}
