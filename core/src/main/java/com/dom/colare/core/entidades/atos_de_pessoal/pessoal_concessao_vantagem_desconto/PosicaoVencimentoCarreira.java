
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concessao_vantagem_desconto;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * posicaoVencimentoCarreira
 * <p>
 * Contém as informações sobre o posicionamento vencimental do servidor na carreira.
 * 
 */
public class PosicaoVencimentoCarreira {

    /**
     * ID do Cargo 
     * (Required)
     * 
     */
    @NotNull
    public Integer idPessoalCargo;
    /**
     * Codificação, interna do sistema de gestão, para a Classe
     * (Required)
     * 
     */
    @NotNull
    public Integer codClasse;
    /**
     * Codificação, interna do sistema de gestão, para a Padrão ou Nível
     * (Required)
     * 
     */
    @NotNull
    public Integer codPadraoNivel;
    /**
     * Valor do Vencimento/Subsídio do Cargo para o referido Classe e Padrão
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    public Double valorVencimentoOuSubsidio;
    /**
     * Data de Inicio
     * (Required)
     * 
     */
    @NotNull
    public String dataInicio;
    /**
     * Data fim
     * 
     */
    public String dataFinal;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String idDocumentoPDF;

}
