package com.urkovillanueva.gestion.common.dominio;

import com.urkovillanueva.gestion.common.dominio.personas.PersonaDto;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EmailDataDto {

    private PersonaDto sender;
    private LocalDateTime sent;
    private PersonaDto reciver;
}
