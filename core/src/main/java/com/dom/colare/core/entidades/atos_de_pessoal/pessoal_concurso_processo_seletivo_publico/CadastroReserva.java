
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Set;


/**
 * cadastroReserva
 * <p>
 * Informar dados sobre cadastro de reserva.
 * 
 */
@Entity(name = "PES_CON_CADRES")
@Data
public class CadastroReserva extends BaseEntityID {

    /**
     * Existe Cadastro de Reserva
     * (Required)
     * 
     */
    @NotNull
    public Boolean haCadastroReserva;

    @Valid
    @OneToMany
    @JoinColumn(name = "PES_CON_CADRES_ID")
    public Set<DetalhamentoCadastroReserva> detalhamentoCadastroReserva = null;

}
