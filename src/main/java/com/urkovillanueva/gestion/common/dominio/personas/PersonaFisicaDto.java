package com.urkovillanueva.gestion.common.dominio.personas;

import com.urkovillanueva.gestion.common.dominio.personas.datospersonas.DireccionDto;
import com.urkovillanueva.gestion.common.dominio.personas.datospersonas.MailDto;
import com.urkovillanueva.gestion.common.dominio.personas.datospersonas.TelefonoDto;
import lombok.Data;

import java.util.List;

@Data
public class PersonaFisicaDto extends PersonaDto {

    private String apellidos;
    private List<DireccionDto> direcciones;
    private List<MailDto> emails;
    private List<TelefonoDto> telefonos;
}
