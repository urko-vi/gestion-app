package com.urkovillanueva.gestion.common.dominio.personas;

import com.urkovillanueva.gestion.common.dominio.personas.datospersonas.DireccionDto;
import com.urkovillanueva.gestion.common.dominio.personas.datospersonas.MailDto;
import com.urkovillanueva.gestion.common.dominio.personas.datospersonas.TelefonoDto;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public abstract class PersonaDto {


    private String identificador;
    @NotNull
    @NotEmpty
    private String nombre;
    private List<DireccionDto> direcciones;
    private List<MailDto> emails;
    private List<TelefonoDto> telefonos;

}
