package com.dom.colare.domain.tabelas;

import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.Data;

import javax.persistence.Entity;

@Entity(name = "TIPO_FORMALIZACAO_CONTRATO")
@Data
public class TipoDeFormalizacaContrato extends Serializers.Base {
}