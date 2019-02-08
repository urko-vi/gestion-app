package com.urkovillanueva.gestion.common.dominio.personas.datospersonas;

import lombok.Data;

import javax.validation.constraints.Email;

@Data
public class MailDto {
    @Email
    private String correoElectronico;
    private boolean isPrincipal;
}
