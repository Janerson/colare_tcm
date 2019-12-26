
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * cadastroReserva
 * <p>
 * Informar dados sobre cadastro de reserva.
 * 
 */
public class CadastroReserva {

    /**
     * Existe Cadastro de Reserva
     * (Required)
     * 
     */
    @NotNull
    public Boolean haCadastroReserva;
    @Valid
    public Set<DetalhamentoCadastroReserva> detalhamentoCadastroReserva = null;

}
