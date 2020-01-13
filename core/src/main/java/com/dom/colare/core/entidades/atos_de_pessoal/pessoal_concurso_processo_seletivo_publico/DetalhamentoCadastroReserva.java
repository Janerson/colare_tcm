package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoCadastroReserva
 * <p>
 * Informar o detalhamento do Cadastro de Reserva
 */
@Entity(name = "PES_CON_CADASTR")
@Data
public class DetalhamentoCadastroReserva extends BaseEntityID {

    /**
     * Número do Item do Edital
     * (Required)
     */
    @NotNull
    private String numeroItemDoEdital;
    /**
     * Descrição
     * (Required)
     */
    @NotNull
    private String descricao;

}
