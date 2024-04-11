package com.proyecto.ong.Repository.EntitiesDTO;


import java.sql.Date;
import java.util.List;

import com.proyecto.ong.Repository.Entities.Refugio;
import com.proyecto.ong.Repository.Entities.Sede;
import com.proyecto.ong.Repository.Entities.Voluntario;

import lombok.Data;

@Data
public class EnvioDTO {
    private Long id;

    private Date fechaSalida; 

    private String codigo;

    private Refugio refugio;

    private List<Sede> sedes;

    private List<Voluntario> voluntarios;
}
