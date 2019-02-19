package com.urkovillanueva.gestion.common.dominio.personas;

import lombok.Data;

@Data
public class UsuarioDto {

    private String userName;
    private String password;
    private String email;
}
