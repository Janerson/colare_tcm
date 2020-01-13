
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_vida_funcional_disposicao;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * destino
 * <p>
 * Informar o destino da disposição
 * 
 */
@Entity(name = "PES_VF_DISP_DST")
@Data
public class Destino extends BaseEntityID {

    /**
     * Informar a esfera de disposição do servidor, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    private Integer codEsferaDisposicao;
    /**
     * Codificação IBGE do Ente Federado
     * (Required)
     * 
     */
    @NotNull
    private String codIBGE;
    /**
     * Informa o tipo de entidade que recepcionara o servidor.
     * (Required)
     * 
     */
    @NotNull
    private Integer tipoEntidade;
    /**
     * Informar o nome do Órgão Ou Entidade que recepcionara o servidor a disposição.
     * (Required)
     * 
     */
    @NotNull
    private String nomeOrgaoOuEntidade;
    /**
     * Informa o numero do CNPJ do Órgão ou entidade que recepcionara o servidor a disposição.
     * (Required)
     * 
     */
    @NotNull
    private String numeroCNPJ;
    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * 
     */
    private Integer idUnidadeGestora;

}
