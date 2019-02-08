package com.urkovillanueva.gestion.common.dominio.facturacion;

import com.urkovillanueva.gestion.common.dominio.bienes.ProductoDto;
import com.urkovillanueva.gestion.common.dominio.personas.ClienteDto;
import lombok.Data;

import java.util.List;
@Data
public class FacturaDto {

    private ClienteDto cliente;
    private List<ProductoDto> productos;
}
