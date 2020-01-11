
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_admissao;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * municipioGoiano
 * <p>
 * Informar os dados do município goiano quando a acumulação de cargo for na esfera municipal.
 * 
 */
@Entity
@Data
public class MunicipioGoiano extends BaseEntityID {

    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * (Required)
     * 
     */
    @NotNull
    private Integer idUnidadeGestora;
    /**
     * Informa o nome do Departamento ou Setor onde o servidor acumula cargo
     * (Required)
     * 
     */
    @NotNull
    private String nomeDepartamentoSetor;
    /**
     * ID do Cargo 
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalCargo;

}
