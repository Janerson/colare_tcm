package com.dom.colare.core.entidades.shared;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@MappedSuperclass
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public abstract class BaseEntityID implements Serializable {

    @Id
    @GeneratedValue
    @Column(columnDefinition = "BINARY(16)")
    private UUID uuid ;//= UuidCreator.getTimeOrdered()

    @Column(insertable = false, updatable = false, columnDefinition = "BIGINT(20) NOT NULL AUTO_INCREMENT UNIQUE KEY")
    protected long seq = 0;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date insertedAt;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date alteredAt;
}
