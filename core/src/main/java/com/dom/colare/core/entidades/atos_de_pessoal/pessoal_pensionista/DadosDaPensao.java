
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_pensionista;

import javax.validation.constraints.NotNull;


/**
 * dadosDaPensao
 * <p>
 * Informa os dados da instituição Pensão de servidores anteriores a 2020.
 * 
 */
public class DadosDaPensao {

    /**
     * Informa o numero de protocolo do Processo Pe autuado no TCMGO, numero do processo composto por 5 dígitos + e ano em 4 dígitos.
     * (Required)
     * 
     */
    @NotNull
    public String numeroProcessoConcessaoPensao;
    /**
     * Inserir o numero do Acordão do TCM
     * (Required)
     * 
     */
    @NotNull
    public String numeroAcordaoTCM;
    /**
     * Informa o nome do cargo paradigma registrado no TCMGO.
     * (Required)
     * 
     */
    @NotNull
    public String nomeDoCargoParadigmaRegistrado;
    /**
     * Informa o numero ato concedeu a pensão.
     * (Required)
     * 
     */
    @NotNull
    public Integer numeroAtoConcedeuPensao;
    /**
     * informa a data do ato que concedeu a pensão.
     * (Required)
     * 
     */
    @NotNull
    public String dataAtoConcedeuPensao;

}
