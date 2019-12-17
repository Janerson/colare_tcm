package com.dom.colare.core.entidades.dominio;

import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.Data;

import javax.persistence.Entity;

@Entity(name = "SIUACAO_INCIDENTES")
@Data
public class SituacaoIncidentes extends Serializers.Base {
}
