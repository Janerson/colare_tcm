package com.dom.colare.core.entidades.shared;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.UUID;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntityID  implements Serializable {

    @Id
//    @GeneratedValue(generator = "uuid")
//    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
//    @Column(columnDefinition = "BINARY(16)")
    @GeneratedValue
    @Column(columnDefinition = "BINARY(16)")
    private UUID codigo;

    /**
     * ID DE RETORNO DO TCM - COLARE
     */
    @Column
    private Long id;
}
