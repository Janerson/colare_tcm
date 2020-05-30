
package com.dom.colare.core.entidades.atos_de_pessoal.pes_cadastro;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * registroProfissional
 * <p>
 * Informa Registro Profissional
 * 
 */
@Entity(name = "PES_CAD_REGPROF")
@Data
public class RegistroProfissional extends BaseEntityID {

    /**
     * Código Conselho o Ordem, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    private Integer codConselhoOrdem;
    /**
     * Número do Registro
     * (Required)
     * 
     */
    @NotNull
    private String numeroRegistro;
}
