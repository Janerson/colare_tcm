
package com.dom.colare.core.entidades.licitacaofase1;

import com.dom.colare.core.entidades.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import java.util.Set;


/**
 * comissao
 * <p>
 * Detalhamento da composição da comissão de licitação / Pregoeiro - Equipe de Apoio
 * 
 */
@Entity
@Data
public class Comissao extends BaseEntityID {

    /**
     * Código que identifica o tipo da comissão
     * (Required)
     * 
     */
    public int codTipoComissao;
    /**
     * Tipo do ato de nomeação da comissão
     * (Required)
     * 
     */
    public int codTipoAtoNomeacao;
    /**
     * Número do Ato de Nomeação
     * (Required)
     * 
     */
    public String numeroAtoNomeacao;
    /**
     * Data do Ato de Nomeação
     * (Required)
     * 
     */
    public String dataAtoNomeacao;
    /**
     * Data do início da vigência
     * (Required)
     * 
     */
    public String inicioVigencia;
    /**
     * Data do fim da vigência
     * (Required)
     * 
     */
    public String fimVigencia;
    /**
     * 
     * (Required)
     * 
     */
    public Set<Membro> membro = null;



}
