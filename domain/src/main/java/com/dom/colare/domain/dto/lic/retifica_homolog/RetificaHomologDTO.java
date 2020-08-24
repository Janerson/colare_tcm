package com.dom.colare.domain.dto.lic.retifica_homolog;

import com.dom.colare.domain.dto.ArquivoDTO;
import com.dom.colare.domain.dto.BaseDTO;
import lombok.Data;

@Data
public class RetificaHomologDTO extends BaseDTO {

    private Integer codTipoRetificacao;
    private Integer idProcedimentoOuContrato;
    private String motivoRetificacao;
    private ArquivoDTO arquivo;
}
