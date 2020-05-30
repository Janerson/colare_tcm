
package com.dom.colare.core.entidades.atos_de_pessoal.pes_pensionist;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * dadosDaPensao
 * <p>
 * Informa os dados da instituição Pensão de servidores anteriores a 2020.
 * 
 */
@Entity(name = "PES_PENS_DADOS")
@Data
public class DadosDaPensao extends BaseEntityID {

    /**
     * Informa o numero de protocolo do Processo Pe autuado no TCMGO, numero do processo composto por 5 dígitos + e ano em 4 dígitos.
     * (Required)
     * 
     */
    @NotNull
    private String numeroProcessoConcessaoPensao;
    /**
     * Inserir o numero do Acordão do TCM
     * (Required)
     * 
     */
    @NotNull
    private String numeroAcordaoTCM;
    /**
     * Informa o nome do cargo paradigma registrado no TCMGO.
     * (Required)
     * 
     */
    @NotNull
    private String nomeDoCargoParadigmaRegistrado;
    /**
     * Informa o numero ato concedeu a pensão.
     * (Required)
     * 
     */
    @NotNull
    private Integer numeroAtoConcedeuPensao;
    /**
     * informa a data do ato que concedeu a pensão.
     * (Required)
     * 
     */
    @NotNull
    private String dataAtoConcedeuPensao;

}
