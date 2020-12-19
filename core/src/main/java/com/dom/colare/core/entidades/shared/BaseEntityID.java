package com.dom.colare.core.entidades.shared;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@MappedSuperclass
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "uuid")
public abstract class BaseEntityID implements Serializable {

    @Id
    @GeneratedValue
    @Column(columnDefinition = "BINARY(16)")
    private UUID uuid ;//= UuidCreator.getTimeOrdered()

    @JsonIgnore
    @Column(insertable = false, updatable = false, columnDefinition = "BIGINT NOT NULL IDENTITY")
    private long seq = 0;

    @JsonIgnore
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, updatable = false)
    private Date insertedAt;

    @JsonIgnore
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date alteredAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseEntityID)) return false;

        BaseEntityID that = (BaseEntityID) o;

        if (getSeq() != that.getSeq()) return false;
        if (!getUuid().equals(that.getUuid())) return false;
        if (!getInsertedAt().equals(that.getInsertedAt())) return false;
        return getAlteredAt().equals(that.getAlteredAt());
    }

    @Override
    public int hashCode() {
        int result = getUuid().hashCode();
        result = 31 * result + (int) (getSeq() ^ (getSeq() >>> 32));
        result = 31 * result + getInsertedAt().hashCode();
        result = 31 * result + getAlteredAt().hashCode();
        return result;
    }
}
