package com.dom.colare.core.entidades.licitacao_dispensa_adesao.dispensa_e_inexigibilidade;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity(name = "DISP_NATOBJDET")
@Data
public class NaturezaObjetoDetalhadaDispensa extends BaseEntityID {

    @NotNull
    @NotBlank
    private Integer codNaturezaObjetoDetalhada;

    private String descricaoNaturezaObjetoOutros;
}
