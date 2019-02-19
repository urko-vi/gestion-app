package com.urkovillanueva.gestion.common.dominio.bienes;

import com.urkovillanueva.gestion.common.dominio.personas.PersonaJuridicaDto;
import lombok.Data;

@Data
public class ProductoDto {
    private String numeroReferencia;
    private PersonaJuridicaDto fabricante;
}
