
package com.dom.colare.core.entidades.shared;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;


/**
 * editalEAnexos
 * <p>
 * Edital do Credenciamento / Chamada Pública - Preenchimento exclusivo e obrigatório se tipoProcesso = 1 ou 3 (Credenciamento ou chamada pública). Arquivos PDF do Edital e seus Anexos.
 * 
 */
@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class EditalEAnexo extends BaseEntityID {

    /**
     * Código do tipo de documento enviado - Edital e Anexos, conforme tabela
     * (Required)
     * 
     */
    @NotNull
    public Integer codTipoEditalAnexos;
    /**
     * Descrição
     * (Required)
     * 
     */
    @NotNull
    public String descricao;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String idDocumentoPDF;


}
