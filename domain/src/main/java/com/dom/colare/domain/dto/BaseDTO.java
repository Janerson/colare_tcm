package com.dom.colare.domain.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class BaseDTO {
    /**
     * ID TCM
     */
    private Long id;
    /**
     * ID BASE DE DADOS
     */
    private UUID codigo;
}
