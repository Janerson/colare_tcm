package com.dom.colare.core.entidades.dipensaE;

import com.dom.colare.core.entidades.shared.Item;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Data
@PrimaryKeyJoinColumn(name = "ID")
public class ItemDispensa extends Item {
}
