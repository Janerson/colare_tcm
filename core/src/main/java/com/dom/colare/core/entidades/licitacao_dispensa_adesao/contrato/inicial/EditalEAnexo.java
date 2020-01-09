
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.inicial;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;


/**
 * editalEAnexos
 * <p>
 * Edital do Credenciamento / Chamada Pública - Preenchimento exclusivo e obrigatório se tipoProcesso = 1 ou 3 (Credenciamento ou chamada pública). Arquivos PDF do Edital e seus Anexos.
 * 
 */
@Entity
@Data
public class EditalEAnexo extends BaseEntityID {

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

    @ManyToOne
    private LicitacaoInicial licitacaoInicial;

    @ManyToOne
    private DispensaEInexigibilidadeAte2018 dispensaEInexigibilidade;

}
