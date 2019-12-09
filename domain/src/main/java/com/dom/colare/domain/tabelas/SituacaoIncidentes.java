package com.dom.colare.domain.tabelas;

import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.Data;

import javax.persistence.Entity;

@Entity(name = "SIUACAO_INCIDENTES")
@Data
public class SituacaoIncidentes extends Serializers.Base {
}
