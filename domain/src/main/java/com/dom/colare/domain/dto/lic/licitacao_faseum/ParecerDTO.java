package com.dom.colare.domain.dto.lic.licitacao_faseum;

import com.dom.colare.domain.dto.BaseDTO;
import lombok.Data;

import java.time.LocalDate;

/**
 * Parecer da Licitação
 */
@Data
public class ParecerDTO extends BaseDTO {
    private long codTipoParecer;
    private long codUfRegistroOrgaoDeClasse;
    private LocalDate dataParecer;
    private String numeroCpf;
    private String numeroRegistroOrgaoDeClasse;
}
