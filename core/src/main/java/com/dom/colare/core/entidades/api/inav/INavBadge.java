package com.dom.colare.core.entidades.api.inav;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class INavBadge extends BaseEntityID {

    private String classe;
    private String text;
    private String variant;
}
