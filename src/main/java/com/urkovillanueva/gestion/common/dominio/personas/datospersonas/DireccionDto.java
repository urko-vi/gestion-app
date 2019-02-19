package com.urkovillanueva.gestion.common.dominio.personas.datospersonas;

import lombok.Data;

@Data
public class DireccionDto {

    private String nombre;
    private String numeroPortal;
    private String numeroPiso;
    private String planta;
    private String seccion;
    private String ciudad;
    private String codigoPostal;
    private String provincia;
    private String region;
    private String pais;
}
