package com.proyecto.ong.Repository.EntitiesDTO;



import com.proyecto.ong.Repository.Entities.Persona;


import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class SocioDTO {

    private Long id;

    @NotEmpty(message = "no puede estar vacio")
    private String cuentaBancaria;


    private Persona persona;
}
