package com.proyecto.ong.Repository.EntitiesDTO;


import java.sql.Date;

import com.proyecto.ong.Repository.Entities.Socio;
import com.proyecto.ong.Repository.Entities.Cuota.tipoCuota;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CuotaDTO {


    private Long id;

    @Pattern(regexp = "\\d+", message = "El valor debe ser numérico")
    @NotEmpty(message = "no puede estar vacio")
    private Long valor;

    @NotEmpty(message = "no puede estar vacio")
    private Date fechaPago;

    @NotEmpty(message = "no puede estar vacio")
    private tipoCuota tipoCuota;

    @NotEmpty(message = "no puede estar vacio")
    private Socio socio;
}
