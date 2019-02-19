package com.urkovillanueva.gestion.common.dominio.personas;

import lombok.Data;

@Data
public class PersonaJuridicaDto extends PersonaDto {

    private PersonaFisicaDto personaContacto;
}
