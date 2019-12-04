package com.dom.colare.core.entidades;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
@Getter @Setter
public abstract class BaseEntityID implements Serializable {
    private long id;
}
