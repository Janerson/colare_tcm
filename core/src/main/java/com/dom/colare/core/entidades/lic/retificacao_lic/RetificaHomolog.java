package com.dom.colare.core.entidades.lic.retificacao_lic;

import com.dom.colare.core.entidades.shared.Arquivo;
import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity(name = "RETIFICAHOMOLOG")
@Data
public class RetificaHomolog extends BaseEntityID {

    @NotNull
    private Integer codTipoRetificacao;
    @NotNull
    private Integer idProcedimentoOuContrato;
    @NotNull
    private String motivoRetificacao;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ARQUIVO_ID")
    private Arquivo arquivo;
}
