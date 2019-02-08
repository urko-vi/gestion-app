package com.urkovillanueva.gestion.common.dominio.personas.datospersonas;

import lombok.Data;

import javax.validation.constraints.Pattern;

@Data
public class TelefonoDto {
    @Pattern(regexp = "(^$|[0-9]{10})")
    private String numero;
    private boolean isMovil;
    private boolean isPrincipal;
}
